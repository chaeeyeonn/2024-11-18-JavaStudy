package com.sist.dao;
// 로그인 / 회원가입 / 회원탈퇴 / 회원수정 => 오라클 연결
import java.sql.*;
import java.util.Date;

import com.sist.vo.*;
public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private static MemberDAO dao;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; // 나중엔 IP 바꾸기
	// 1. 드라이버 등록
	public MemberDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	// WEB => JDBC => DBCP로 바뀜
	// JDBC => 연결에 시간이 오래 걸림 => 미리 연결 시키기: DBCP => 재사용(반환) 가능: 일반화
	// 2. Connection 한 개 생성
	public static MemberDAO newInstance()
	{
		if(dao==null)
			dao=new MemberDAO();
		return dao;
	}
	// 3. 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	// 4. 닫기
	public void disConnction()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// 기능
	// 1. 로그인 처리
	public MemberVO isLogin(String id,String pwd)
	{
		MemberVO vo=new MemberVO();
		try
		{
			// 1. 연결
			getConnection();
			// 2. sql문장 전송 => ID 존재여부 확인
			String sql="SELECT COUNT(*) FROM member "
					 +"WHERE id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			// 3. 실행 요청
			ResultSet rs=ps.executeQuery();
			rs.next();
			int count=rs.getInt(1);
			rs.close();
			
			if(count==0) // id가 없음
			{
				vo.setMsg("NOID");
			}
			else // id가 있음
			{
				// 비밀번호 확인
				sql="SELECT id,pwd,name,sex "
				  +"FROM member "
				  +"WHERE id=?"; // 문자열은 setString처리 후 ?로
				ps=conn.prepareStatement(sql);
				// 실행 전 ?에 값 채우기
				ps.setString(1, id);
				// 결과값
				rs=ps.executeQuery();
				rs.next(); // 데이터 한 줄(RECORD) 읽어옴
				vo.setId(rs.getString(1));
				vo.setName(rs.getString(3));
				vo.setSex(rs.getString(4));
				String db_pwd=rs.getString(2);
				
				// 비밀번호 검사
				if(db_pwd.equals(pwd))// 로그인 된다
				{
					vo.setMsg("OK");
				}
				else // 비밀번호 틀림
				{
					vo.setMsg("NOPWD");
				}
				rs.close();
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnction();
		}
		return vo;
	}
	/*
	private String id,pwd,name,sex,email,address,msg;
	private Date regdate,birthday;
	 */
	public MemberVO memberInfo(String id)
	{
		MemberVO vo=new MemberVO();
		try
		{
			getConnection();
			String sql="SELECT name,sex,email,address,regdate,birthday "
					 +"FROM member "
					 +"WHERE id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setName(rs.getString(1));
			vo.setSex(rs.getString(2));
			vo.setEmail(rs.getString(3));
			vo.setAddress(rs.getString(4));
			vo.setRegdate(rs.getDate(5));
			vo.setBirthday(rs.getDate(6));
			rs.close();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnction();
		}
		return vo;
	}
	// 2. 회원가입
	// 3. 회원수정
	// 4. 회원탈퇴
}


