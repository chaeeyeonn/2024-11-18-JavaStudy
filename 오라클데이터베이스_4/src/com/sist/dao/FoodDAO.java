package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
public class FoodDAO {
	private Connection conn;
	private PreparedStatement ps;
	private DataBase db=new DataBase();
	private static FoodDAO dao;
	
	public static FoodDAO newInstance()
	{
		if(dao==null)
			dao=new FoodDAO();
		return dao;
	}
	
	//목록 출력
	public List<FoodVO> foodListData(int page)
	{
		List<FoodVO> list=new ArrayList<FoodVO>();
		try
		{
			//연결
			conn=db.getConnection();
			//페이지 나누기
			int rowSize=20;// 한 페이지에 20개씩
			int start=(rowSize*page)-(rowSize-1);
			int end=rowSize*page;
			/*
			 *  WHERE num BETWEEN start AND end
			 *  1페이지             1         20
			 *  => rownum은 1페이지부터~
			 */
			String sql="SELECT fno,name,num FROM(SELECT fno,name,rownum as num FROM(SELECT fno,name FROM food_house ORDER BY fno)) "
					  +"WHERE num BETWEEN "+start+"AND "+end;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				FoodVO vo=new FoodVO();
				vo.setFno(rs.getInt(1));
				vo.setName(rs.getString(2));
				list.add(vo);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
			
		}
		finally
		{
			db.disConnection(conn, ps);
		}
		return list;
	}
}
