package com.sist.dao;
// 데이터베이스 연결 클래스
import java.util.*;
import java.sql.*;
/*
 *   오라클 => SQL
 *   자바에서도 실행하는지 => 자바에서 오라클 SQL 문장 정리
 */
public class EmpdeptDAO {
	// 오라클 연결
	private Connection conn;
	// 오라클 SQL전송=결과값
	private PreparedStatement ps;
	// DAO => 사용자당 한 개만 생성 => 메모리 최소화(Connection 조절)
	private static EmpdeptDAO dao;
	// 고정 데이터: URL(오라클 주소)
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// XE: 데이터베이스명 => 모든 테이블이 들어가 있다
	// => 폴더(파일 여러 개)
	// 1. 드라이버 등록 => 한 번만 사용
	public EmpdeptDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 클래스명으로 메모리 할당
			/*
			 *   1. 생성자
			 *   2. 멤버변수
			 *   3. 메소드 => 매개변수도 처리
			 *   ==> 모두 제어 가능
			 *   => 리플렉션 => 스프링 / 메소드 자동호출 가능
			 */
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// 싱글턴 만들기 => 메모리 공간 감소 / 재사용 가능
	// newInstance() / getInstance() => 싱글턴
	// Calendar.getInstance()
	// 파싱: XML / HTML / JSON
	public static EmpdeptDAO newInstance()
	{
		if(dao==null)
			dao=new EmpdeptDAO();
		return dao;
	}
	// 오라클 연결
	public void getConnection()
	{
		try
		{
			// sqlplus과 같음
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	// 오라클 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	//일반 SQL 사용(+인라인뷰)
	public void sqlExecute()
	{
		try
		{
			getConnection();
			String sql="SELECT empno,ename,job,hiredate,sal,rank,dname,loc,grade "
					  +"FROM (SELECT empno,ename,job,hiredate,sal,"
					  +"RANK() OVER(ORDER BY sal DESC) rank,"
					  +"dname,loc,grade "
					  +"FROM emp,deptmsalgrade "
					  +"WEHRE emp.deptno=dept.deptno "
					  +"AND sal BETWEEN losal AND hisal)";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(
				  rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4).toString()+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getInt(9)		
                 );
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
	}
	//view 사용
	public void viewExecute()
	{
		try
		{
			getConnection();
			String sql="SELECT * FROM empAllData";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(
				  rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDate(4).toString()+rs.getInt(5)+" "+rs.getInt(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getInt(9)		
                 );
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
	}
}