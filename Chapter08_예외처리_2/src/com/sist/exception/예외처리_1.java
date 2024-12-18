package com.sist.exception;
/*
 *  교재 263page~
 *  
 *  - 예외: 수정이 가능한 에러(가벼운 에러)
 *       : 사전적 의미: 일반적이지 않은 상황 => 프로그램에서 문제 발생
 *                                   => 사용자의 입력이나 제어 => 유효성 검사
 *                                                          ----------자바스크립트
 *                                                                 => 자바: if
 *                                                                 => 스프링: validation
 *                                   => 개발자의 실수: 본인이 에러 => 찾기 힘듦
 *                                                => 소스 비교 x, Output 창 확인 => 디버깅
 *                                                => 실무에서 에러처리
 *                                     --------------------------------------------비정상 종료
 *                                     ==> 예외처리
 *  - 에러: 수정이 불가능(치명적인 에러) => 메모리 부족, 인터넷 문제
 *    -------------------------------------------------
 *    자바: javac => 컴파일 / java => 인터프리터(런타임)
 *         컴파일에러 => 컴파일시에 에러 => 문법 에러
 *         런타임에러 => 실행시 에러 => 사용자 입출력 에러
 *         ---------------------------------------에러가 발생할 수도, 아닐 수도
 *         논리적에러 => 웹에서 발생 => 실행은 되지만 프로그램과 다른 동작
 *         -----------------------------------------
 *         프로그램에서 가장 중요한 것
 *         ==> 다른 개발자가 분석 => 가독성(개발과 유지보수하는 사람이 다름)
 *         ==> 속도 => 최적화
 *         ==> **견고성: 에러 발생시 종료하지 않고 정상 수행 가능하도록
 *               ----
 *    1) 에러 사전 방지법 => 가장 우선시 => if문 => 처리 어려운 문장 => 예외처리
 *    2) 예외 처리 => *** 변수 초기값 우선시: 명시적 초기화
 *                      => 명시적 초기화 어려운 경우: 외부에서 읽어서 데이터 대입
 *                      => 생성자 / 초기화 블록
 *       가벼운 에러 => 수정 가능한 에러
 *       ex) FileReader fr=new FileReader("경로명/파일명")
 *                                        -----------수정 가능
 *           Document doc=Jsoup.connect("URL주소").get();
 *                                     ----------수정 가능
 *           Socket socket=new Socket("서버주소",port)
 *                                     ------------수정 가능
 *         => 웹에서 번호로 표시(브라우저) => 404 / 500 / 400 / 415 / 403 / ...
 *            => URL주소 마지막에 파일명을 지정 => 없는 경우 명령어(MVC구조)
 *       예외처리 종류
 *              : 예외복구: try~catch~finally => 가급적 예외처리의 대부분
 *                     *** 예외나 에러가 없게 프로그램 만드는 것이 제일 좋음
 *                       try
 *                       {
 *                         정상 수행 문장
 *                         => 예외 발생 가능
 *                         => 평상시 main에 들어갈 문장들
 *                         => 예외 발생시 catch로 이동
 *                       }catch(예외클래스 | 예외클래스 | ...) => 멀티, 여러 개 사용 가능
 *                                       => 예상되는 에러를 따로 잡아서 복구
 *                       {
 *                         에러 발생시 복구, 에러 확인
 *                                       --------에러메시지 출력 getMessage()
 *                                               에러 위치 확인 printStackTrace()
 *                                               -----------권장사항
 *                       }
 *                       finally
 *                       {
 *                         try / catch 상관없이 무조건 수행 문장
 *                         => 서버 연결 해제 / 오라클 닫기 / 파일 닫기 등
 *                         => 생략 가능
 *                       }
 *                       
 *                       일반적 사용
 *                       try
 *                       {
 *                       }
 *                       catch(Exception e)
 *                       {          |
 *                              모든 예외를 처리
 *                       }     
 *                       
 *                       서버/오라클 연동
 *                       try
 *                       {
 *                         오라클 연결
 *                         SQL문장 전송
 *                         결과값 받기
 *                       }catch(Exception e)
 *                       {
 *                            오류발생 => 확인
 *                       }
 *                       finally
 *                       {
 *                            오라클 닫기
 *                       }
 *                        
 *              : 자바에서 지원하는 클래스(라이브러리)
 *                => CheckException: 컴파일시에 예외처리 여부 확인
 *                  => 반드시 예외처리를 해야 사용 가능
 *                  => java.io / java.sql / java.net
 *                  => java.lang => 리플렉션
 *                  => javax.http.* => JSP => X
 *                  => jakarata.http
 *                     ------------이클립스 => 톰캣
 *                                 ------최신 10버전 => 스프링은 9버전
 *                                 => 스프링 편집기 => JDK / 톰캣 맞춰서
 *                => UnCheckException: 예외처리 의무 x
 *                  => 필요시에만 예외처리
 *                  => NullPointerException: 클래스를 메모리 할당이 없는, 선언만 한 경우 => 윈도우
 *                  => NumberFormatException: 문자열 => 정수 변환   
 *                  => ArrayIndesOutOfBoundsException
 *                  => ClassCastException
 *                  => ArithmeticException: 0으로 나누었을 때
 *                  => 한 번에 처리 => RuntimeException
 *               -------------------------------------------------------------------------
 *               ==> Exception           
 *              : 예외회피: throws => 메소드 선언 뒤에 서술 => 예약, 떠맡기기 => 다음 사용시에 예외처리 해서 사용하도록
 *                        => 라이브러리에서 주로 제공
 *              : 임의로 발생: throw => 테스트, 배포 전에 확인 => 정상상태 유지
 *                          => throw new Exception();
 *              : 사용자 정의 예외: 자바에서 지원하지 않는 예외처리가 있는 경우
 *                              class MyException extends Exception
 *                              {
 *                              }
 *                              => if문으로 사용 가능
 *                              => 비밀번호 만들기 中 대소문자+특수문자+8자 이상 ...
 *                              => length() + 정규식 ...
 *       예외처리 크기(계층) => catch => 순서지정
 *              :    Object => 최상위 클래스
 *                     |
 *                  Throwable
 *                     |
 *             -------------------
 *             |                 |
 *           Error             Exception
 *                               |
 *                          -------------
 *                          |           |
 *                       Check        UnCheck
 *                         |            |
 *                      IOException   RuntimeException
 *                      SQLException    |
 *                      ...           NullException
 *                                     ...
 *          => 상위클래스일수록 예외처리 범위가 커진다
 *           
 *           
 */
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
