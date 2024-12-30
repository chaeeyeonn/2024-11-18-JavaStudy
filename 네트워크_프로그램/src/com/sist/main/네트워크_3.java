package com.sist.main;
/*
 *   네트워크 서버
 *   ----------
 *   1. 접속을 받는 클래스: 접속처리(대기소켓)
 *   2. 통신 담당 클래스: 각 클라이언트 따로 통신 => 
 *      => 쓰레드 이용: 접속을 받는 클래스의 모든 데이터 공유
 *      class Server
 *      {
 *        // 사용자 정보 => ip/port
 *        class Client extends Thread
 *        {
 *           ip/port 이용해서 통신
 *        }
 *      }
 *      사용자 한 명당 new client 생성
 *      
 *      => 서버 동작
 *        => bind() => 개통(ip+port): ip, port는 반드시 고정 => AWS 이용
 *        => listen() => 접속 대기
 *        => accept() => 접속 후 client 정보 저장
 *        => 통신 => 통신 되도록 Thread 연결(Socket)
 *        
 *      서버           클라이언트
 *       |               |
 *      read()         write()
 *       |               |
 *      write()        read()
 *          ==> 교차 진행 
 *          ==> TCP
 *      서버: ServerSocket: 대기 소켓 => 접속자 관리 => 서버에만 존재
 *      통신: Socket => 서버에서는 클라이언트의 정보
 *                     클라이언트에서는 서버정보를 가지고 있다
 *                     ==> 반드시 클래이언트당 1개
 *                     => 쓰레드 이용
 *        
 */
public class 네트워크_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
