package com.sist.main;
/*
 *   java.lang / java.util / java.io / java.text / java.net
 *   javax.http.servlet => JSP(웹)
 *   
 *   1. java.net
 *      => Thread
 *      => Network => WebServer(작동하는 과정)
 *         => 웹 / 오라클 관련 => 서버는 이미 제작되어 있음
 *         => URL / URLEncoder
 *            http://localhost:8080/main/main.jsp
 *            -----------------------------------URL
 *                                 --------------URI
 *                                 -----ContextPath
 *                                 -----구분자: 파일명
 *                                 -----네트워크 => 구분자
 *                                      : 내부 프로토콜을 사용
 *                                      => 서버와 클라이언트만 확인
 *                                      => 문자열 / 정수
 *           => C/S => Client / Server
 *                     ---------------Socket: 전화기와 같은 기능
 *                                    (ip(전화번호)/port(연결선))
 *                                               0~65535(0~1023 이미 사용중)
 *                                               8080 / 4000 / 1521 / 1433
 *                                               3306(MySQL)
 *                                               웹 => 80(생략 가능)
 *                                    : 서버는 지정 / 클라이언트는 자동 생성
 *     
 *    - Thread
 *      => 프로그램(프로세스)
 *               -------
 *               컴퓨터의 성능을 높이기 위해 여러 개의 어플리케이션을 동시에 실행
 *                                     ----------------------------
 *                                     메소드 이용 => run()
 *                                     : 동시에 실행되는 것이 아니다, 하나씩 실행 => 시분할
 *      => 쓰레드 동작에 필요한 데이터 X
 *        => 프로세스가 가지고 있는 데이터 공유
 *      => 쓰레드 사용 방법
 *         1) 쓰레드 상속 => 멀티 쓰레드
 *            class A extends Thread
 *         2) 인터페이스 구현 => 윈도우
 *            class a implements Runnable
 *                               --------
 *                               client => 서버로 요청 / 서버로부터 응답                
 *      => 쓰레드 생명주기
 *         new Thread()
 *         쓰레드 생성
 *         => 쓰레드 이름
 *            Thread-0
 *            => 변경 가능
 *         => 쓰레드 우선 순위
 *            0~10
 *            MIN / MAX / NORM(중간 순위 5)
 *         => 컴퓨터마다 다름
 *            | start(): 프로세스가 가지고 있는 데이터 공유
 *          Runnable : 동작
 *            => 동작 정의: run()
 *            | ==> sleep()
 *          일시정지
 *            | ==> Runnable
 *            ==> 종료 => interrupted() => DEAD
 *     1) 주요 메소드
 *       ㄱ. start(): 대기 상태 => 쓰레드 동작(run())
 *         => rum()을 호출하면 안 된다 => start() 쓰기
 *       ㄴ. run(): 쓰레드 동작을 정의하는 메소드
 *       ㄷ. sleep(): 일시정지
 *       ㄹ. interrupt(): 쓰레드 종료
 *       ㅁ. currentThred(): 현재 실행중인 쓰레드 이름 가져오기
 *       ㅂ. getName() / setName(): 쓰레드 이름 변경
 *       ㅅ. getPrioriry() / setPriority(): 우선 순위
 *           MAX_PRIORTY: 10 / 가장 빠름
 *           MIN_PRIORITY: 1 / 가장 느림
 *           NORM_PRIORITY: 5 / 중간       
 *     => 쓰레드 => 디폴트(비동기) => 동기
 *     => 네트워크 => 동기화
 */
class MyThread extends Thread
{
	//동작 => 한 가지 일만 수행
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(100);
			}catch(Exception ex) {}
			System.out.println(getName()+":"+i);
		}
	}
	
}
public class 네트워크_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		MyThread m3=new MyThread();
		MyThread m4=new MyThread();
		MyThread m5=new MyThread();
		//쓰레드 생성
		
		m1.setName("홍길동");
		m2.setName("이순신");
		m3.setName("강감찬");
		m4.setName("박문수");
		m5.setName("심청이");
		//쓰레드 이름 설정
		
		m1.setPriority(Thread.MIN_PRIORITY);
		m2.setPriority(Thread.MIN_PRIORITY);
		m3.setPriority(Thread.MAX_PRIORITY);
		m4.setPriority(Thread.MIN_PRIORITY);
		m5.setPriority(Thread.MIN_PRIORITY);
		// 쓰레드 우선순위
		
		m1.start();//run() 호출
		m2.start();
		m3.start();
		m4.start();
		m5.start();

	}

}
