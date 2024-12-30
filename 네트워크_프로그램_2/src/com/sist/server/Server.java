package com.sist.server;
import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.commons.*;
/*
 *   class Server
 *   {
 *     Vector saitVc=new Vector()
 *     => 접속자 저장 공간(ip)
 *     class Client
 *     {
 *       접속자마다 따르며 통신만 담당
 *                --------Thread
 *                        => 접속된 이용자만
 *                        => 멤버클래스 이용
 *     }
 *   }
 *   => port가 같은 경우 사용 불가
 *   
 */
// 접속 시 처리 =>교환 수켓, 대기 소켓
public class Server implements Runnable {
	private Vector<Client> waitVc=new Vector<Server.Client>();
	//1. 저장공간(접속자) => 동기화
	/*
	 *   Vector ==> 네트워크
	 *   ArrayList ==> 비동기화, 데이터베이스
	 *   LinkedList ==> 추가 / 수정 / 삭제가 많은 곳
	 */
	// 2. 서버 가능
	private ServerSocket ss;
	// 3. 접속 시 연결라인 => port
	private final int PORT=3050;
	// 4. 서버 가동 => Serversocket 초기화
	public Server()
	{
		try 
		{
			ss=new ServerSocket(PORT);
			System.out.println("Server Start...");
			//bind => 개통
			//listen() => 대기
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	//5. 접속시 처리 => 사용자 정보 받아 Client 클래스 전송
	// 통신
	public void run()
	{
		try
		{
			Socket s=ss.accept();
			//접속 시에 발신자 정보 받기
			Client client=new Client(s);
			//=> 각 쓰레드로 전송 => 각자 따로 통신 가능
			client.start();
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();

	}
	//클라이언트마다 통신 담당
	//Server가 가지고 있는 모든 자원 사용 가능
	// 호출 => Server.Client
	// 한 개의 프로그램 안에서 여러 개의 프로그램을 동시 실행
	// ------------프로세스 --------------쓰레드
	class Client extends Thread
	{
		Socket s;// 클라이언트 ip
		OutputStream out;// 송신
		BufferedReader in;// 수신 => 한글 2byte
		
		String id,name,sex,pos;
		//DB=> id 중복체크 => 중복 없이 => PRIMARY KEY
		public Client(Socket s)
		{
			/*
			 *   서버 => 클라이언트 ip
			 *   클라이언트 => 서버 ip
			 *   
			 *   -> readLine() <=> write
			 *   => write <=> readLint()
			 */
			try
			{
				this.s=s;
				// 클라이언트 정보
				out=s.getOutputStream();
				//클라이언트로 전송
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 클라이언트로부터 값을 수신
			}catch(Exception ex) {}
			/*
			 *   자바 프로그램에서 가장 쉬운 프로그램
			 *   => 네트워크 , 데이터베이스(패턴이 쉽다)
			 */
		}
		// 실제 통신
		public void run()
		{
			try
			{
				while(true)
				{
					//1. 사용자 요청 값 받기
					String msg=in.readLine();
					System.out.println("Client=>"+msg);
					//로그인 => 100|id|name|sex
					StringTokenizer st=new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					switch(protocol)
					{
					    case Function.LOGIN:// 로그인 요청
					    {
					    	// 로그인 => 회원가입 내용 전성
					       id=st.nextToken();
					       name=st.nextToken();
					       sex=st.nextToken();
					       pos="대기실";
					       
					       //1. 접속된 사람 => 정보 전송
					       messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex+"|"+pos);
					       //2. 입장 메시지 전송
					       messageAll(Function.WAITCHAT+"|[알림] "+name+"님 입장하셨습니다");
					       //3. waitVc 저장
					       waitVc.add(this);
					       //4-1. 화면 변경
					       messageTo(Function.MYLOG+"|"+id);
					       //4-2. 접속된 모든 정보를 로그인된 사람에게 전송
					       for(Client c:waitVc)
					       {
					    	   messageTo(Function.LOGIN+"|"+c.id+"|"+c.name+"|"+c.sex+"|"+c.pos);
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
					    	messageAll(Function.EXIT+"|"+id);// 명단에서 해당 퇴장자 삭제
					    	messageAll(Function.WAITCHAT+"|[알림]"+name+"님 퇴장하셨습니다");
					    	messageTo(Function.MYEXIT+"|");// 퇴장자 퇴장
					    	//행위자 => this
					    	for(int i=0;i<waitVc.size();i++)
					    	{
					    		Client c=waitVc.get(i);
					    		if(c.id.equals(id))
					    		{
					    			waitVc.remove(i);
					    			try//퇴장자 통신 끊기
					    			{
					    				in.close();
					    				out.close();
					    			}catch(Exception ex) {}
					    			break;
					    		}
					    	}
					    }
					    break;
					    /*
					     *   서버의 기능
					     *   1. 저장
					     *   2. 수정
					     *   3. 읽기/쓰기(송수신)
					     *   4. 검색
					     */
					    case Function.INFO:
					    {
					    	String yid=st.nextToken();//데이터는 모두 Token으로 받음 => 이미 "|"Token으로 잘라놓음
					    	for(Client c:waitVc)
					    	{
					    		if(yid.equals(c.id))
					    		{
					    			//원래는 오라클에서 데이터 읽음
					    			messageTo(Function.INFO+"|"+c.id+"|"+c.name+"|"+c.sex+"|"+c.pos);
					    			break;
					    		}
					    	}
					    }
					    break;
					}
				}
			}catch(Exception ex) {}
		}
		// 접속자 전체: 대기실
		public synchronized void messageAll(String msg)
		{
			for(int i=0;i<waitVc.size();i++)
			{
				Client c=waitVc.get(i);
				try
				{
					c.messageTo(msg);
				}catch(Exception ex) 
				{
					waitVc.remove(i);//접속이 안 될 시 제거
				}
			}
		}
		// 접속자 개인: 쪽지 보내기, 정보보기, 귓솜발
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
	}
	
			

}
