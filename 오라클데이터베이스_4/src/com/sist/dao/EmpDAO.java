package com.sist.dao;
import java.util.*;
import com.sist.vo.*;
import java.sql.*;
public class EmpDAO {
	private Connection conn;
	private PreparedStatement ps;
	private DataBase db=new DataBase();
	private static EmpDAO dao;
	
	//싱글턴
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
	//기능: 전체 목록 출력
	public List<EmpVO> empListData()
	{
		List<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			conn=db.getConnection();
			String sql="SELECT DISTINCT empno,ename,job,hiredate,dname,loc FROM emp JOIN dept "
					   +"ON emp.deptno=dept.deptno";
			/*
			 *  오라클에서 실행 후 복붙 \r\n ; 지우기
			 *  SELECT empno,ename,job,hiredate,dname,loc FROM emp NATURAL JOIN dept;
			 *  SELECT empno,ename,job,hiredate,dname,loc FROM emp JOIN dept USING(deptno);
			 */
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.getDvo().setDname(rs.getString(5));
				vo.getDvo().setLoc(rs.getString(6));
				list.add(vo);
			}
			rs.close();
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
	//기능: 상세보기 => EmpVO(사원 한 명에 대한 모든 정보를 저장) => 여러명은 List 활용
	//     -------무조건 중복이 없는 데이터 전송
	// 게시물 번호 / 사번 / 영화번호 / ...
	// 문자열 => ID => 회원가입(아이디 중복 / 우편번호)
	public EmpVO empDetailData(int empno)
	{
		EmpVO vo=new EmpVO();
		try
		{
			conn=db.getConnection();
			String sql="SELECT DISTINCT e1.empno,e1.ename,e1.job,NVL(e2.ename,'사수없음'),e1.hiredate,e1.sal,e1.comm,dname,loc,grade "
					  +"FROM emp e1,emp e2,dept d,salgrade s "
					  +"WHERE e1.mgr=e2.empno(+) " // SELF OUTER JOIN
					  +"AND e1.deptno=d.deptno " // EUQI JOIN
					  +"AND e1.sal BETWEEN losal AND hisal "// NON EUQI JOIN
					  +"AND e1.empno="+empno; 
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			rs.next();
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMname(rs.getString(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.getDvo().setDname(rs.getString(8));
			vo.getDvo().setLoc(rs.getString(9));
			vo.getSvo().setGrade(rs.getInt(10));
			rs.close();
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			db.disConnection(conn, ps);
		}
		return vo;
	}
	//기능: 검색 => JOIN 활용
	public List<EmpVO> empFindData(String col,String fd)
	{
		//검색 방법: 이름, 입사일, 직위, 부서명, 근무지 中
		List<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			//연결
			conn=db.getConnection();
			//sql문장 전송
			String sql="SELECT DISTINCT empno,ename,job,hiredate,dname,loc "
					+ "FROM emp,dept "
					+ "WHERE emp.deptno=dept.deptno "
					+ "AND "+col+" LIKE '%'||?||'%'";// ? => 검색어 들어감 => setString(1,fd)
			// 조건이 있는 경우 항상 AND 연산자 이용
			ps=conn.prepareStatement(sql);
			//실행 요청 전 ?에 값 채우기
			ps.setString(1, fd);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				EmpVO vo=new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.getDvo().setDname(rs.getString(5));
				vo.getDvo().setLoc(rs.getString(6));
				list.add(vo);
			}
			rs.close();
					
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
