package com.sist.dao;
import java.sql.*;
public abstract class DataBase {
	//기능 설정
	// => 같은 기능 => 구현
	public void driverConfig()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	public Connection getConnection()
	{
		Connection conn=null;
		try
		{
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			conn=DriverManager.getConnection(url,"hr","happy");
			
		}catch(Exception ex) {}
		return conn;
	}
	// => 같은 기능 but 구현 내용이 다름 => 미구현 => 선언만
	public abstract void listPrint();
	public abstract void findPrint();

}
