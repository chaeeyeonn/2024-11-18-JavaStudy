package com.sist.exception;
import java.util.*;
import java.sql.*;
/*
 *   클래스의 구성요소
 *   이후
 *   - 라이브러리
 *    => 어떤 라이브러리 사용 여부
 *       : 네트워크: java.net
 *       : 오라클: java.sql
 *       : 파일: java.io
 *       : 전체적으로 사용: String, Object => java.lang
 *                                     => import문 생략 (자동 추가)
 *       => 자동 추가
 *         1) import java.lang.*;
 *         2) class ClassName extends Object
 *                                    ------객체 생성 / 객체 정보 / 객체 소멸 / 객체 비교 / 객체 복제
 *                                                   ***toString()  finalize() ***equals  ***clone
 *                                                   => 프로그램에 맞게 오버라이딩 사용
 *         3) 생성자가 없는 경우 => default 생성자 생성(매개변수 없음)
 *            => 생성자: 시작과 동시에 처리 / 초기화(파일, 데이터베이스)
 *               -----초기화블록(인스턴스 블록, 정적(static)블록)
 *            => 다른 클래스에서 연결해서 사용: public
 *         4) 메소드: 한 가지 기능 수행 / 반복이 많은 경우 / 재사용 목적
 *           *** 메소드 필요시 에러 방지 위해 예외처리
 *              -----------------------------
 *              라이브러리 중 CheckException => 반드시 예외처리
 *              => try~catch를 주로 사용
 *           *** static 메소드 / static 블록
 *              => static만 사용 가능
 *              => 인스턴스 사용시 반드시 객체 생성 후 사용
 *              => static은 컴파일 시 자동 저장
 *                 인스턴스는 객체 생성해야 저장
 *                        
 *   - 사용자 변수: 클래스 전체 / 다른 클래스
 *     => 벤치마킹
 *     
 *   - 초기화 방법: 생성자, 초기화블록
 *   
 *   - 기능 설정: 무슨 기능을 가지고 있는 지 여부
 *     => 어떤 기능 "메뉴, 버튼 클릭, ..."
 *     => 결과화면 => **리턴형
 *     => **매개변수 확인
 *     
 *     => 라이브러리 사용 => 예외처리가 필요한 경우
 *        1) 메소드 안에서 예외처리
 *        [접근지정어] 리턴형 메소드명(사용자 요청값)
 *        {
 *            리턴할 변수 선언
 *            try
 *            {
 *            }
 *            catch()
 *            {
 *            }
 *            finally
 *            {
 *            }
 *        }
 *        => 전체적으로 사용 => 멤버변수
 *           일회적 사용 => 지역변수
 *           
 *        JDBC: 원시소스
 *        |
 *        DBCP: 미리 연결 => 속도 up
 *        |
 *        ****MyBatis: google 제공
 *        |
 *        JPA
 */
public class MemberDAO {
	//멤버변수 => 클래스 전체적으로 사용하는 변수
	private Connection conn;//오라클 연결 => null 초기화
	private PreparedStatement ps;//오라클에 명령문 전송 / 결과값 읽기
	private final String URL="jdbc:oracle:thin:@211.238.142.124:1521:XE";
	//오라클은 공유된 데이터 => static 변수와 같음
	//초기화
	public MemberDAO()//throws 할 시 호출하는 클래스에서 다시 예외처리를 해야함
	{
		//드라이버 등록
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");//반드시 예외처리	
		}catch(ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
			//에러 발생 시 확인하는 것 중요
			//getMessage(): 에러 내용 서술 / printStackTrace(): 에러 위치 확인
		}
		
	}
	// 오라클 연결 => 오라클 연결 : 문장전송 : 결과값 읽기 : 오라클 닫기 => 오라클 열기, 닫기는 항상 중복
	// => 공통 모듈
	// => 오라클 연결, 오라클 닫기 => 메소드로 만들어 둠
	public void getConnection()
	{
		
	}
	public void disConnection()
	{
		
	}

}
