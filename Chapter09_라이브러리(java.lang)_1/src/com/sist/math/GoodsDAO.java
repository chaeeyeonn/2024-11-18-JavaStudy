package com.sist.math;
import java.sql.*;
/*
 *   데이터형
 *     => 기본형
 *     => 참조형
 *        -----클래스 / 배열
 *             ----
 *             |라이브러리
 *             |사용자 정의
 *     멤버 변수 => 기본형 / 클래스 / 배열
 */
public class GoodsDAO {
	// 클래스 전체 영역에서 사용하는 변수 / 클래스 / 배열 => 멤버변수
	private Connection conn; //오라클 연결
	private PreparedStatement ps; // 오라클 명령문
	// => 변경이 되면 안 되는 값: 상수 => 오라클 주소
	// hr1 hr2 hr3 hr4 => 오라클 계정 만들 예정
	private final String URL="jdbc:oracle:thin:@211.238.142.124:1521:XE";
	/*
	 *   오라클 실행 명령 => SQL
	 *   
	 *   DQL: 데이터 검색 => 데이터 읽기
	 *        => SELECT
	 *   DML: 데이터 조작
	 *        => INSERT: 데이터를 오라클에 추가
	 *        => UPDATE: 데이터 수정
	 *        => DELETE: 데이터 삭제
	 *   DCL: 데이터 제어
	 *        => GRANT: 권한 부여
	 *        => REVOKE: 권한 해제
	 *   DDL: 저장장소, 함수, ...
	 *        => CREATE, ALTER, DROP, RENAME, TRANCATE
	 *   TCL: 트랜젝션 제어
	 *        => COMMIT: 정상 저장
	 *        => ROLLBACK: 모든 명령 취소
	 *   => JOIN / Subquery
	 */
	//오라클 연결 => 드라이버 설치 => 생성자에서 씀 => 한 번만 수행하도록 
	// => 싱글턴 => 메모리 공간이 하나 => static
	private static GoodsDAO dao;
	
	public GoodsDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //CheckException
		}catch(Exception ex) {}
	}
	//GoodsDAT dao=GoodsDAO.newInstance()
	//싱글턴 패턴
	public static GoodsDAO newInstance()
	{
		if(dao==null)
		{
			dao=new GoodsDAO();// null이 아니면 실행 안 하니 결국 싱글턴 가능
		}
		return dao;
	}
	// 공통모듈 => 메소드마다 공통으로 사용
	// => 오라클 연결
	public void getConnection()
	{
		try 
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	// => 오라클 닫기 ==> 반복 코딩 => 메소드화
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// => 자동화처리(스프링 => AOP) => 실시간처리 Task
	// 기능
	// 총페이지
	public int goodsTotalPage()
	{
		int count=0;
		try
		{
			// 1. 연결
			getConnection();
			// 2. 오라클 명령문 전송
			String sql="SELECT COUNT(*) FROM goods_all";
			// 3. 오라클로 전송
			ps=conn.prepareStatement(sql);
			// 4. 실행 결과값 읽기
			ResultSet rs=ps.executeQuery();
			// 5. 데이터가 있는 메모리 위치에 커서를 이동 => 이래야 값 받아올 수 있음
			rs.next();
			// 6. 읽어온 값을 저장
			count=rs.getInt(1);
			// 7. ResultSet 닫기
			rs.close();
		}catch(Exception ex)
		{
		   // 에러 확인
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return count;
	}
	// 목록
	// 추가
	

}
