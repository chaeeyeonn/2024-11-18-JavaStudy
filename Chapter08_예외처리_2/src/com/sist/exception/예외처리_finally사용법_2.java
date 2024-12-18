package com.sist.exception;
import java.sql.*;
public class 예외처리_finally사용법_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   ==> 반복 루틴 : 메소드화
		 *   **1. 오라클 연결 가능하도록 드라이버 설정
		 *   : Class.forName("드라이버")
		 *     => ClassNotFoundException: CheckException
		 *   **2. 오라클 연동
		 *   : Connection
		 *     => SQLException: CheckException
		 *   3. 오라클로 명령어 전송
		 *             ----SQL
		 *   : PreparedStatment
		 *     => SQLException: CheckException
		 *   4. 결과값을 받는다
		 *   : ResultSet => 결과값을 메모리에 저장
		 *   ------------------------finally
		 *   **5. ResultSet 닫기
		 *      PreparedStatment 닫기
		 *      Connection 닫기
		 */
		Connection conn=null;//인터페이스 => 모든 데이터베이스 연결 가능
		//인터페이스는 관련된 클래스를 모두 모아 한 개로 제어
		PreparedStatement ps=null;//오라클 송수신
		ResultSet rs=null;//결과값 저장
		
		try
		{
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			//1. 연결 드라이버 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");//ClassNotFoundException: CheckException
			//2. 연결
			conn=DriverManager.getConnection(url,"hr","happy");
			//3. 오라클 요청
			String sql="SELECT empno,ename,job FROM emp";//해당 내용을 가져와라
			ps=conn.prepareStatement(sql);
			//실행 후 결과값 가져 옴(메모리에 저장)
			rs=ps.executeQuery();
			//결과 출력
			while(rs.next())//rs값을 맨위부터 하나씩 가져옴
				//rs.previous(): 맨뒤부터 하나씩 가져옴
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		}catch(SQLException | ClassNotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			//오라클 연결 해제
			try
			{
				if(rs!=null)
					rs.close();
				if(ps!=null)
					ps.close();
				if(conn!=null)
					conn.close();
			}catch(SQLException e)
			{
				
			}
		}

	}

}
