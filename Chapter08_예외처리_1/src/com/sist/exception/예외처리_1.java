package com.sist.exception;

/*
 *   변수 => 데이터형
 *   연산자 / 제어문
 *   배열 => 1차원
 *   클래스 / 객체 생성 / 메소드
 *   상속 => 오버라이딩
 *   인터페이스
 *   예외처리
 *   라이브러리 => 조립
 *   -----------------------웹
 *   + 12장 필수(오라클)
 *   
 *   
 *   교재 8장 263page~
 *   
 *   예외 처리
 *     - 목적: 사전에 에러를 방지하는 목적
 *            우선시 => if
 *            ------> 처리가 어려운 경우: 예외처리 사용
 *            => 비정상 종료를 방지하고 정상상태 유지
 *            => 예외처리: 에러 발생시 에러를 건너뛴다
 *               ------if
 *     - 에러발생
 *       : 사용자 => 잘못된 입력 => 유효성 검사 => if(javascript)
 *       : 개발자 => 실수 => 배열인덱스, 정수 변환, 형변환, ...
 *       ----------------------------------------------
 *                 컴파일          인터프리터
 *       A.java =========> A.class =====> 화면 출력
 *               javac              java
 *                 |                  |
 *            (개발자)에러          (사용자)에러
 *                            => 에러처리가 안 될 수도 => 실시간 에러(RuntimeException)
 *                            => 경우에 따라 예외처리
 *        확인) 컴파일시에 반드시 예외처리가 필요
 *        => CheckException: 필수적 예외처리
 *          => IO (파일 입출력 => IOException), 네트워크(=> MalformedURLException), SQL(데이터베이스=> SQLException), 쓰레드(=>InterruptedException)
 *        => UnCheckException: 필요에 따른 예외처리
 *          => 배열 범위 초과 / 정수 변환 / 0으로 나누는 경우 / 객체가 null / 클래스 형변환 / ...
 *          
 *     - 에러 대응
 *       : 사전에 차단(우선시 => if) => 예외처리
 *       : 에러 => 소스상에서 수정이 불가능한 에러
 *             ex) 메모리 부족, 이클립스 버그, ... => 치명적 에러 => 처리 불가능
 *       : 예외처리 => 소스상에서 수정 가능한 에러
 *             ex) 파일읽기 중 경로명 / 파일명 틀림, 데이터베이스 중 SQL 문장 틀림, 크롤링 중 URL 주소 틀림, ...
 *       : 예외처리 방법      ------예외 발생시 처리 복구
 *         1) 예외복구: try ~ catch ***
 *                    ---정상수행
 *                  => 개발자 직접 처리
 *         2) 예외회피(떠맡기기): throws
 *                  => 시스템에 맡기는 경우(간접처리)
 *                  => 라이브러리에 많이 존재
 *                  => 사용시에 예외처리 후 사용
 *         3) 임의 발생 => 견고한 프로그램 여부 확인 => throw
 *         4) 지원하지 않는 예외: 사용자 정의 예외처리
 *            -------------- public class MyException extends Exception{}
 *       : 예외처리를 하는 경우(예외가 많이 예상되는 경우)
 *         => catch를 여러 개 사용 가능 => 순서 존재
 *         # 문자열 => 정수로 변경 후에 배열에 저장, 나눈 값을 출력
 *                   ---------     --------  ----------- => 3개의 예외처리 필요
 *                => 사전에 에러 방지 => 에러 예상하며 소스 코딩   
 *                
 *     - Exception
 *       : CheckException => 반드시 예외처리 / 컴파일러가 감시
 *                : IOException: 입출력 => 파일, 메모리, 네트워크
 *                : MalformedURLException: URL
 *                : SQLException: 오라클 => SQL 문장, INSERT / UPDATE / DELETE/ SELECT(JOIN/SUBQUERY)(FUNCTION)(PROCEDURE)(TRIGGER)
 *                : ClassNotFoundException: Class.forName("패키지.클래스명") => 리플렉션 => 클래스 정보
 *                : InterruptedException: 충돌방지 => 쓰레드
 *                : IllegalArgumentException: 매개변수에 잘못된 데이터 전송
 *                  ------------------------웹 => 400(Bad Request)
 *                                               200 정상수행
 *                                               403 접근 거부
 *                                               404 파일 NotFound
 *                                               *** 500 자바 소스 오류
 *                                               415 한글 변환 코드
 *               => java.io / java.sql / java.net
 *               
 *               
 *       : UnCheckException => 필요시 예외처리 / 컴파일러가 제한 x
 *                          => 예외처리가 없을 수 있음
 *                          => 에러가 많이 발생하는 부분에서는 예외처리를 하는 것이 좋음
 *                          => 웹 / 윈도우 => 정수 입력 => " 10" => 정수형 변경 안 됨 => trim()
 *                          => 웹 => board_list.jsp?page = 10 => 오류(공백때문)
 *                          : RuntimeException
 *                            | ArrayIndexOutOfBoundsException: 배열범위 초과
		                      | NullPoniterException: 객체 주소가 지정되지 않은 경우
		                      | ArithmeticException: 0으로 나눴을 경우
		                      | ClassCastException: 클래스 캐스팅 잘못한 경우
		                      | NumberFormatException: 문자열을 정수형으로 변경시 에러
		                      
		                    : catch 여러 개인 경우
		                      => 계층 순서로 적용 => 상위클래스일수록 에러 잡는 크기가 큼(266page)
		                      => 계층도에서 위로 올라갈 수록 예외처리 범위가 커짐
		                      => 예외처리의 가장 큰 클래스는 Exception
		                      
	  - 예외처리의 기본
	    : try ~ catch: 가장 많이 사용되는 예외처리
	                  => 정상 수행 => 에러 발생하면 catch 처리 => 스킵
	                                          ----------에러처리 후 복구
	                                                    에러 위치 확인 / 어떤 에러인지
	      try
	      {
	          정상 수행 문장
	      }catch(예상되는 예외클래스)
	      {
	          예외 발생시 처리 문장
	      }
 *        => ex)
 *              문장 1
 *              문장 2 ==> 에러 발생 => 종료(비정상 종료)
 *              문장 3
 *              -----
 *              
 *              문장 1
 *              문장 2 => 에러 발생 => 일반 문장이기에 종료 => 예외처리가 안 되어 있음
 *              try
 *              {
 *                문장 3
 *                문장 4 => 에러 발생 => catch로 이동 => 1,2,3,6,7,8
 *                문장 5
 *              }catch(예상되는 클래스){
 *                문장 6 => 문장 5로 이동하라는 명령도 가능 => 복구
 *              }
 *                문장 7
 *                문장 8
 *              ===>1,2,3,4,5,7,8 순서로 진행
 *              
 *            
 *   
 */
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread.sleep(100);
		int a=10;
		int b=a/0;//에러 발생
		System.out.println(b);
		
		

	}

}
