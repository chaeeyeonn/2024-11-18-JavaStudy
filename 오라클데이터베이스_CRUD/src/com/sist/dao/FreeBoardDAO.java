package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.vo.*;

public class FreeBoardDAO {
	private Connection conn; //오라클 연결 객체
	private PreparedStatement ps; //오라클과 문장 송수신 담당 객체
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; //오라클 주소
	private static FreeBoardDAO dao; //접속개체수 조절 메모리절약용 singleton 객체
	
	public FreeBoardDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
		}
	}
	
	public  void getConnection() {
		try {
			conn=DriverManager.getConnection(URL,"hr","happy"); //conn hr/happy
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disConnection() {
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close(); //객체 생성 순서 반대로 close
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//	----------------오라클 연동을 위해 공통적으로 필요한 기능-------------------
	
	public static FreeBoardDAO newInstance() {
		if(dao==null) dao=new FreeBoardDAO();
		return dao;
	}
	
//	기능 CRUD
//	1.목록 (sql에서 인라인뷰로 나눠서 가져오기)
	public List<FreeBoardVO> boardListData(int page){
		List<FreeBoardVO> list=new ArrayList<FreeBoardVO>();
		try {
			getConnection(); //sql 연결
			String sql="SELECT no,subject,name,regdate,hit,num "
					+ "FROM (SELECT no,subject,name,regdate,hit,rownum AS num "
					+ "FROM (SELECT no,subject,name,regdate,hit "
					+ "FROM freeboard ORDER BY no DESC)) "
					+ "WHERE num BETWEEN ? AND ?";
			ps=conn.prepareStatement(sql); //문장 전송 준비
			
			int rowSize=10;
			int start=(page-1)*rowSize+1;
			int end=rowSize*page;
			
			ps.setInt(1, start);
			ps.setInt(2, end); // ?값 지정
			ResultSet rs=ps.executeQuery(); //쿼리 실행 후 결과 저장
			
			while(rs.next()) {
				FreeBoardVO vo=new FreeBoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setRegdate(rs.getDate(4));
				vo.setHit(rs.getInt(5));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}

//	1-1. 총페이지 구하기
	public int boardTotalPage() {
		int total=0;
		try {
			getConnection();
			String sql="SELECT CEIL(COUNT(*)/10.0) FROM freeboard";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			total=rs.getInt(1);
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return total;
	}
//	2.상세보기 (sql where로 검색)
	public FreeBoardVO boardDetailData(int no) {
		FreeBoardVO vo=new FreeBoardVO();
		try {
			getConnection();
			String sql="UPDATE freeboard SET " //조회수 증가
					+ "hit=hit+1 WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ps.executeUpdate();
			
			sql="SELECT no,name,subject,content,regdate,hit "
					+ "FROM freeboard WHERE no="+no;
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			rs.next(); //result 가져오기
			vo.setNo(rs.getInt(1));
			vo.setSubject(rs.getString(2));
			vo.setName(rs.getString(3));
			vo.setRegdate(rs.getDate(4));
			vo.setHit(rs.getInt(5));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return vo;
	}
	
//	3.글쓰기 (insert)
	public void boardInsert(FreeBoardVO vo) {
		try {
			getConnection();
			String sql="INSERT INTO freeboard(no,name,subject,content,pwd) "
					+ "VALUES(fb_no_seq.nextval,?,?,?,?)";
			ps=conn.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getSubject());
			ps.setString(3, vo.getContent());
			ps.setString(4, vo.getPwd());
			
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
	
//	4.수정 (update) 비밀번호 검사
	public void boardUpdate(FreeBoardVO vo) {
		try {
			getConnection();
			String sql="UPDATE freeboard SET subject=? ";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
	}
//	5.삭제 (delete) 비밀번호 검사
	
//	6.찾기 (LIKE, REGEXQ_LIKE)
	public List<FreeBoardVO> boardFindData(String col, String fd){
		List<FreeBoardVO> list= new ArrayList<FreeBoardVO>();
		try {
			getConnection();
			String sql="SELECT no,subject,name,regdate,hit "
					+ "FROM freeboard WHERE REGEXP_LIKE("+col+", '%'||?||'%', 'i')";
			
//			String sql1="SELECT no,subject,name,regdate,hit,num "
//					+ "FROM (SELECT no,subject,name,regdate,hit,rownum AS num "
//					+ "FROM (SELECT no,subject,name,regdate,hit "
//					+ "FROM freeboard ORDER BY no DESC)) "
//					+ "WHERE num BETWEEN ? AND ?";
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, fd);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				FreeBoardVO vo=new FreeBoardVO();
				vo.setNo(rs.getInt(1));
				vo.setSubject(rs.getString(2));
				vo.setName(rs.getString(3));
				vo.setRegdate(rs.getDate(4));
				vo.setHit(rs.getInt(5));
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return list;
	}
	
//	6-1. 검색 결과 건수
	public int boardFindCount(String col,String fd) {
		int count=0;
		try {
			getConnection();
			String sql="SELECT COUNT(*) "
					+ "FROM freeboard WHERE REGEXP_LIKE("+col+", '%'||?||'%', 'i')";
			ps=conn.prepareStatement(sql);
			ps.setString(1, fd);
			ResultSet rs=ps.executeQuery();
			rs.next();
			count=rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return count;
	}
}