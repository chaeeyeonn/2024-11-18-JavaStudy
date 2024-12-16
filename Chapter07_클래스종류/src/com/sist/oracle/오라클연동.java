package com.sist.oracle;
import java.sql.*;
public class 오라클연동 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//오라클 드라이브 설정
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//ojdbc8.jar 설정
		//오라클 연결
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		Connection conn=DriverManager.getConnection(url,"hr","happy");
		//conn hr/happy 설정
		String sql="SELECT * FROM emp";
		//오라클 => sql 문장 전송 => 인터페이스 관련(문장은 바뀔 수 있음)
		PreparedStatement ps=conn.prepareStatement(sql);
		//실행결과
		ResultSet rs=ps.executeQuery();
		//rs에 실행된 데이터가 들어가 있다
		while(rs.next())//데이터가 시작-끝까지 읽어 옴
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}

	}

}
