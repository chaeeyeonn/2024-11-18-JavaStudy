package com.sist.server;
import java.util.*;// 데이터가 여러 개 => StringTokinizer
// 사용자 정보 저장 => Vector(동기화프로그램)
import com.sist.commons.*;
import java.io.*;// 송수신
//전송 => byte 단위 / 수신 => 2byte 단위
//OutputStream    / BufferedReader
import java.net.*;// 다른 컴퓨터와 연결
// ServerSocket: 접속 담당 / Socket: 클라이언트와 통신
public class Server implements Runnable{
	private ServerSocket ss;
	private final int PORT=3050;//조별 port
	private Vector<Client> waitVc=new Vector<Client>();
	//초기화
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT);
			//bind => ip/port 연결 => 유심 역할(개통)
			//listen() => 대기 상태
			/*
			 *   new ServerSocket(int count,int port); // 원하는 인원
			 *   new ServerSocket(int port); // 인원 50명
			 *   
			 *   웹: 톰캣(50명) , XE(50명)
			 */
			System.out.println("Server Start...");
		}catch(Exception ex) {}
	}
    // 접속시 처리 => 접속자 정보 저장(ip,port)
	// 발신자 ip 저장
	public void run()// 쓰레드
	{
		try
		{
			while(true)
			{
				Socket s=ss.accept();
				// 접속시에만 호출 => 발신자의 정보(ip/port)
				// => Socket(ip/port)
				// 사용자는 port 자동으로 설정
				// => 어떤 환경 위치든 상관없음
				Client client=new Client(s);// socket 각각 따로 부여
				waitVc.add(client);
				//=> s => port: 윈도우마다 다름
				// 통신 시작 명령
				client.start();// run() 호출
			}
		}catch(Exception ex) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server=new Server();
		new Thread(server).start();//run() 실행

	}
	// 클라이언트 정보 => 통신(송수신) => 클라이언트마다 따로 저장 + 내부클래스 이용
	class Client extends Thread
	{
		// 한 명만 연결
		Socket s;//ip/port 존재
		OutputStream out;// 송신
		BufferedReader in;// 수신
		
		// 초기화
		public Client(Socket s) 
		{
			try
			{
				this.s=s;// 한 명의 클라이언트 ip
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
		}
		// 통신하는 위치
		// 채팅
		public void run()
		{
			try
			{
				while(true)
				{
					// 사용자가 보낸 데이터 받기
					String msg=in.readLine();
					// 보낼 때 \n 으로 끝나야 함
					/*
					 *  요청 대상
					 *  1. 접속자 전체
					 *  2. 접속자 한 명
					 */
					messageAll(msg);
				}
			}catch(Exception ex) {}
		}
		// 전체적으로 전송 => 동기화 => 안정성 위해
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client c:waitVc)//접속한 모든 사람들에게
				{
					c.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		// 한 명에게만 전송 => 동기화
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());// getBytes: 배열 만들기 / 전송 단위: byte
			}catch(Exception ex) {}
		}
	}
	

}
