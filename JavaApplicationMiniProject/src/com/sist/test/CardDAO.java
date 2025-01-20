package com.sist.test;
import java.sql.*;

import com.sist.dao.ReplyBoardDAO;

public class CardDAO {
	private Connection conn;
	private PreparedStatement ps;
	private static CardDAO dao;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	public CardDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 리플랙션 => 클래스 이름으로 메모리 할당 / 메소드 제어
			// new 역할 => 메소드명을 모르는 경우에도 호출 가능
		}catch(Exception ex) {}
	}
	// 싱글턴 만들기
	public static CardDAO newInstance()
	{
		if(dao==null)
			dao=new CardDAO();
		return dao;
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null)
				ps.close();
			if(conn!=null)
				conn.close();
		}catch(Exception ex) {}
	}
	public void cardInsert(String id,int price)
	{
		try
		{
			getConnection();
			conn.setAutoCommit(false);//commit 해제
			String sql="INSERT INTO myCard "
					 +"VALUES(?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setInt(2, price);
			ps.executeUpdate();
			
			sql="INSERT INTO myPoint "
				+"VALUES(1,?,?)";
			//(SELECT NVL(MAX(no)+1,1) FROM myPoint)
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setInt(2, price);
			ps.executeUpdate();
			
			conn.commit();// 안 할 시 오라클에서는 저장이 안 된다
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			try
			{
				conn.rollback();
			}catch(Exception e) {}
		}
		finally
		{
			try
			{
				conn.setAutoCommit(true);
			}catch(Exception ex) {}
			disConnection();
		}
	}
	public static void main(String[] args) {
		CardDAO dao=CardDAO.newInstance();
		dao.cardInsert("park", 3000);
	}
}
