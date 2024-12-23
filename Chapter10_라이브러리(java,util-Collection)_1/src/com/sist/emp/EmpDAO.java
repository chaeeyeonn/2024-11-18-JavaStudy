package com.sist.emp;
import java.sql.*;
import java.util.*;
public class EmpDAO {
	private Connection conn;//연결 객체
	private PreparedStatement ps;//SQL 전송 객체
	//=> 오라클 연결 => 오라클에서 실행 가능한 문장을 전송 => SQL => SELECT => 데이터 검색
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	//jdbc:업체명:드라이버명:@IP:PORT:데이터베이스명
	
	//1. 싱글턴 => 객체를 한 번만 생성
	private static EmpDAO dao;
	
	//2. 드라이버 등록 => 한 번 등록 => 생성자
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//클래스 정보를 읽어서 메모리 할당 => 리플렉션
			//클래스가 가지고 있는 변수, 메소드, 생성자 제어 가능
			// ==> 스프링
			// 스프링: 객체의 생명주기(컨테이너)
		}catch(Exception ex) {}
	}
	public static EmpDAO newInstance()
	{
		if(dao==null)
		{
			dao=new EmpDAO();
		}
		return dao;
	}
	//3. 반복 제거
	//1) 연결 2)닫기
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			//SQL> conn hr/happy
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			//exit
		}catch(Exception ex) {}
	}
	//검색
	public TreeSet<String> empGetNames()
	{
		TreeSet<String> set=new TreeSet<String>();
		try
		{
			getConnection();
			String sql="SELECT ename FROM emp";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				set.add(rs.getString("ename"));
				//자바 => 모든 내용이 0번부터 시작
				//오라클 => 모든 내용이 1번부터 시작 => 1번 이름이 'ename'이었음
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
		return set;
	}
	//직위 => 중복 제거
	public HashSet<String> empGetJobs()
	{
		HashSet<String> set=new HashSet<String>();
		try
		{   //1. 연결
			getConnection();
			//2. 오라클 
			String sql="SELECT job FROM emp";
			//3. 오라클 전송
			ps=conn.prepareStatement(sql);
			//4. 실행 후 데이터 읽기
			ResultSet rs=ps.executeQuery();
			//5. 데이터 저장
			while(rs.next())
			{
				set.add(rs.getString(1));
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
		return set;
	}
	//사원의 모든 정보 => 목록 => ArrayList
}
