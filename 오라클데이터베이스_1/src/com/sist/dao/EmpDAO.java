package com.sist.dao;
/*
 *   자바 교재 12장
 *   오라클 연결 파트
 *   1. 드라이버 설치 => 한 번만 설정, 생성자 이용
 *                 => Class.forName("드라이버명")
 *                                  ----------oracle.jdbc.driver.OracleDriver
 *                                  ----------com.mysql.cj.jdbc.Driver
 *   2. 오라클 연결
 *      Connection conn=DriverMannager.getConnection(URL,"hr","happy")
 *   3. 오라클로 SQL문장 전송
 *             ----------
 *      PreparedStatement ps.conn.preparedStatement(sql)
 *   4. 오라클에서 SQL실행하고 결과값 요청
 *      ResultSet rs=ps.executeQuery();
 *      
 *      rs
 *      ------------------
 *         id  pwd  name
 *      ------------------
 *        aaa  111  홍길동  | next() => 가장 많이 사용
 *      ------------------
 *        bbb  222  심청이
 *      ------------------
 *             ...
 *      ------------------
 *             ...        | previous()
 *      ------------------
 *      |cursor 위치 => 맨 위? 맨 아래? 결정해야 함
 *      
 *      => rs.close()
 *      => ps.close()
 *      => conn.close()
 *      
 *      *** rs.next() => 단위: record => 한 줄에 있는 모든 데이터를 읽음
 */
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
import lombok.Data;
/*
 *   SQL 문장에 ; 찍으면 안 됨
 *   변경 사항: LIKE
 *   => Oracle: LIKE '%'||문자열||'%' => 문자열 결합
 *      MySQL: LIKE CONCAT('%',문자열,'%')
 *   => JOIN => Oracle JOIN / ANSI JOIN
 */
public class EmpDAO {
	// 1. 오라클 연결
	private Connection conn;
	// 2. 오라클 SQL 송수신
	private PreparedStatement ps;
	/*
	 *   SQL문장 전송
	 *   오라클 실행 결과 읽기
	 *   -----------------
	 *   Statement: 데이터와 동시에 SQL문장 전송
	 *   PreparedStatement: SQL문장 우선 전송 후 데이터 전송(***)
	 *   CallableStament: Procedure 호출 함수 => SQL문장 노출 x
	 *                    => 보안, ERP 관리 프로그램(유명: E4NET)
	 *                    
	 */
	// 3. DAO => 오라클 연동 => 사용자 한 명당 1개만 사용하도록(싱글턴)
	private static EmpDAO dao;
	// 3-1. URL
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// => TCP => Socket을 이용해서 오라클로 SQL문장 전송
	// => 오라클 서버 => 자바 응용프로그램: Client
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.drover.OracleDriver");
			//ojdbc8.jar 등록해놓기
		}catch(Exception ex) {}
	}
	// 4. 기능 설정
	// 모든 메소드에서 공통으로 사용되는 기능
	// 4-0. 오라클 연결 / 오라클 해제
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			//conn hr/happy
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();	
		}catch(Exception ex) {}
	}
	// 4-0-1. 싱글턴 => static: 메모리 공간을 한 개만 생성
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
	// 4-1. 목록 => SELECT column_list
	public List<EmpVO> empListData(int type)
	{
		List<EmpVO> list=new ArrayList<EmpVO>();
		String order="";
		if(type==1)
			order="ORDER BY empno ASC";
		else if(type==2)
			order="ORDER BY hiredate DESC";
		else if(type==3)
			order="ORDER BY ename ASC";
		try
		{
			// 1. 오라클 연결
			getConnection();
			// 2. SQL문장 제작
			String sql="SELECT DISTINCT empno,ename,job,hiredate From emp ORDER BY empno ASC";
			// 공백 줘야 함
			// 3. 오라클 전송
			ps=conn.prepareStatement(sql);
			// 4. SQL 결과값 가져오기
			ResultSet rs=ps.executeQuery();
			// 정수일 경우 getInt() / 실수: getDouble() / 문자: getString() / 날짜: getDate()
			// => 커서를 맨 위로 올리기 => next()
			while(rs.next())// 처음부터 마지막까지 데이터 가져오기
			{
				//empno,ename,job,hiredate 순
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			//오라클 해제
			disConnection();
		}
		return list;
	}
	// 4-2. 상세보기 => WHERE
	/*
	 *   List => 여러 명
	 *   EmpVO => 한 명 => 상세보기
	 *   동명이인이 있어도 번호 부여 통해 중복되지 않는 데이터를 만듦
	 *   => 기본키 => empno
	 *   => 무결성의 원칙
	 */
	public EmpVO empDetailData(int empno)
	{
		EmpVO vo=new EmpVO();// 한 명의 정보 담기
		try
		{
			//연결
			getConnection();
			//SQL문장 제작
			String sql="SELECT * FROM emp WHERE empno="+empno;
			ps.getConnection().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();//첫 번째 위치값을 읽어와라
			// 컬럼 순서 맞추기
			// 내부변환 오류가 뜬다면 => 컬럼에 따른 데이터형이 달라 나타나는 오류
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
}
