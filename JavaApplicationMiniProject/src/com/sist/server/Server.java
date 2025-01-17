package com.sist.server;
import java.util.*;

import com.sist.commons.Function;

import java.net.*;
import java.io.*;
/*
 *  서버
 *   - 접속 담당
 *     => 접속한 클라이언트의 정보 저장
 *   - 통신 담당: 각 클라이언트들과 따로 통신
 *     -------쓰레드 이용
 *     => 저장된 클라이언트의 정보 이용 => 멤버클래스(내부클래스)
 *     
 *     class Server
 *     {
 *         Vector waitVC;
 *         
 *          class Client entends Thread
 *          {
 *            //클래스간의 공유가 많다(변수,메소드)
 *            //내부클래스를 이용
 *          }
 *          
 *     }
 *     --------------------------------서버/빅데이터
 */
public class Server implements Runnable{
	// 클라이언트 정보 저장
	Vector<Client> waitVc=new Vector<Server.Client>();
	// 동기화, ArrayList: 비동기화 => 데이터베이스
	// 접속을 받는다
	ServerSocket ss;
	// 클라이언트 => 서버 연결 => 연결선(숫자 구분)
	final int PORT=3050;
	//0~1023은 알려진 포트로 사용 불가
	//1521(오라클),3306(MySQL),...
	// 1. 서버 구동
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT); // 핸드폰 느낌
			// 자동 => IP 인식
			// 연결 => IP+PORT 매칭 // 유심역할 => bind()
			// 대기상태: listen()
			// 단점: 50명만 접근 가능
			// new ServerSocket(1000,PORT)
			System.out.println("Server Start");
 		}catch(Exception ex) 
		{
 			ex.printStackTrace();
		}
	}
	// Thread 메소드 => 동작
	// 접속시마다 처리
	public void run()
	{
		while(true)
		{
			try
			{
				Socket s=ss.accept();//대기상태
				//       사용자 접속 => 클라이언트가 접속시에 호풀되는 특수메소드
		   // 발신자 정보 => 접속된 클라이언트의 IP/PORT
				// => 통신 시작
				Client client=new Client(s);
				client.start();
			}catch(Exception ex) {}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시작점
		Server server=new Server();
		new Thread(server).start();//접속 처리 => run() 메소드 호출 
	}
	// 같은 서버에서 같은 PORT면 서버는 한 번만 수행 => 두 번 하면 오류
	// 통신 담당 클래스
    class Client extends Thread
    {
    	//Client의 모든 정보
    	String id,name,sex;
    	//Client 연결
    	Socket s;
    	//송신
    	OutputStream out;
    	//수신
    	BufferedReader in;
    	
    	public Client(Socket s)
    	{
    		try
    		{
    			this.s=s;
    			//클라이언트 컴퓨터 메모리
    			out=s.getOutputStream();
    			// 접속한 클라이언트로 요청 처리값 보내기
    			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
    			// 클라이언트로부터 요청을 받을 경우
    			//bufferedReader: 한글 안 깨지도록 => 한글: 2byte / inputStream: 1byte
    			// 웹에서 전송: 1byte / 받는 경우: 2byte로 변경
    			// => Encoding        => Decoding(UTF-8)
    		}catch(Exception ex) {}
    	}
    	//통신 => Thread로 처리
    	public void run()//start => run 호출
    	{
    		try
    		{
    			while(true)
    			{
    				// 사용자가 전송한 메시지 받기
    				String msg=in.readLine();
    				System.out.println("Client=>"+msg);
    				StringTokenizer st=new StringTokenizer(msg,"|");//msg를 | 단위로 자름
    				int protocol=Integer.parseInt(st.nextToken());// 맨 처음 숫자를 자름
    				switch(protocol)
    				{
    				  //로그인 요청시 처리
    				  case Function.LOGIN: 
    				  {
    					id=st.nextToken();// 남은 것 중 다음 자름
    					name=st.nextToken();
    					sex=st.nextToken();
    					// 1. 전체적으로 로그인 정보 전송
    					messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
    					// 2. 입장 메시지 발송
    					messageAll(Function.WAITCHAT+"|[알림]"+name+"님이 입장하셨습니다");
    					// 3. waitVc에 저장
    					waitVc.add(this);
    					// => 메인화면으로 이동
    					messageTo(Function.MYLOG+"|"+id);
    					// 4. 먼저 접속한 이용자의 정보 전체 보내기
    					for(Client client:waitVc)
    					{
    						messageTo(Function.LOGIN+"|"+client.id+"|"+client.name+"|"+client.sex);
    					}
    				  }
    				  break;
    				  case Function.WAITCHAT:
    				  {
    					  messageAll(Function.WAITCHAT+"|["+name+"] "+st.nextToken());
    				  }
    				  break;
    				  case Function.EXIT:
    				  {
    					  messageAll(Function.EXIT+"|"+id);
    					  messageAll(Function.WAITCHAT+"|[알림]"+name+"님이 퇴장하였습니다");
    					  for(int i=0;i<waitVc.size();i++)// 나간 사람 없애기
    					  {
    						  Client c=waitVc.get(i);
    						  if(c.id.equals(id))
    						  {
    							  messageTo(Function.MYEXIT+"|");
    							  waitVc.remove(i);//접속자 명단 제거
    							  try
    							  {
    								  in.close();
    								  out.close();//통신 중단
    							  }catch(Exception ex) {}
    						  }
    					  }
    				  }
    				  break;
    				}
    			}
    		}catch(Exception ex) {}
    	}
    	//=> 개인별 전송
    	//synchronized => 동기화 => 신뢰성 향상
    	// => async function => AJAX / sync function
    	// => 안정성 but 느림
    	// => SMTP/FTP 프로그램 존재
    	public synchronized void messageTo(String msg)
    	{
    		try
    		{
    			out.write((msg+"\n").getBytes());
    		}catch(Exception ex) {}
    	}
    	//=> 접속자 전체 전송
    	public synchronized void messageAll(String msg)
    	{
    		try
    		{
    			for(Client client:waitVc)
    			{
    				client.messageTo(msg);
    			}
    		}catch(Exception ex) {}
    	}
    }

}
