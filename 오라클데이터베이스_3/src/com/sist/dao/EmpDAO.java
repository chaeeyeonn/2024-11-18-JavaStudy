package com.sist.dao;
// 데이터베이스 연결 클래스
import java.util.*;
import java.sql.*;
import com.sist.vo.*;
/*
 *   오라클 => SQL
 *   자바에서도 실행하는지 => 자바에서 오라클 SQL 문장 정리
 */
public class EmpDAO {
	// 오라클 연결
	private Connection conn;
	// 오라클 SQL전송=결과값
	private PreparedStatement ps;
	// DAO => 사용자당 한 개만 생성 => 메모리 최소화(Connection 조절)
	private static EmpDAO dao;
	// 고정 데이터: URL(오라클 주소)
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	// XE: 데이터베이스명 => 모든 테이블이 들어가 있다
	// => 폴더(파일 여러 개)
	// 1. 드라이버 등록 => 한 번만 사용
	public EmpDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 클래스명으로 메모리 할당
			/*
			 *   1. 생성자
			 *   2. 멤버변수
			 *   3. 메소드 => 매개변수도 처리
			 *   ==> 모두 제어 가능
			 *   => 리플렉션 => 스프링 / 메소드 자동호출 가능
			 */
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	// 싱글턴 만들기 => 메모리 공간 감소 / 재사용 가능
	// newInstance() / getInstance() => 싱글턴
	// Calendar.getInstance()
	// 파싱: XML / HTML / JSON
	public static EmpDAO newInstance()
	{
		if(dao==null)
			dao=new EmpDAO();
		return dao;
	}
	// 오라클 연결
	public void getConnection()
	{
		try
		{
			// sqlplus과 같음
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	// 오라클 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	//-----------------------------------------------공통사항
	/*
	 *   DAO => 테이블 한 개에 대한 제어
	 *   예) BoardDAO / ReplyDAO
	 *   Service => 관련 테이블 모두에 대한 제어
	 *   예) BoardService: Board / Reply
	 */
	// 1. 기능
	/*
	 *  사원(사번, 이름, 직위, 입사일, 급여)
	 *  부서(부서명, 근무지)
	 *  등급(등급)
	 *  ==> 테이블 3개에서 출력에 필요한 데이터 추출 => JOIN 사용
	 */
	public List<EmpVO> empJoinAllData()
	{
		List<EmpVO> list=new ArrayList<EmpVO>();
		try
		{
			//1. 연결
			getConnection();
			//2. 오라클로 SQL문장 전송
			String sql="SELECT DISTINCT empno,ename,job,hiredate,TO_CHAR(sal,'$999,999'),dname,loc,grade FROM emp,dept,salgrade "
					   +"WHERE emp.deptno=dept.deptno AND sal BETWEEN losal AND hisal";
			//2-1. 전송
			ps=conn.prepareStatement(sql);
			//3. SQL 실행 후 결과값을 메모리에 저장
			ResultSet rs=ps.executeQuery();
			//4. 커서 위치 변경 => 첫 번째 출력 위치로
			/*
			 * 현재 값 => 순서대로 1번부터 시작
			 * empno,ename,job,hiredate,sal,dname,loc,grade
			 * int  String String Date  int  String String int
			 * => getInt() / getString() / getDate()
			 */
			while(rs.next())
			{
				EmpVO vo=new EmpVO();// Record 단위 => 한 줄씩 읽는다
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				//vo.setSal(rs.getInt(5));
				vo.setStrSal(rs.getString(5));
				//dvo
				vo.getDvo().setDname(rs.getString(6));
				vo.getDvo().setLoc(rs.getString(7));
				//svo
				vo.getSvo().setGrade(rs.getInt(8));
				
				list.add(vo);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return list;
		
	}
	public EmpVO empFindData(int empno)
	{
		EmpVO vo=new EmpVO();
		try
		{
			//1. 연결
			getConnection();
			//2. 오라클로 SQL문장 전송
			String sql="SELECT DISTINCT empno,ename,job,hiredate,TO_CHAR(sal,'$999,999'),dname,loc,grade FROM emp,dept,salgrade "
					   +"WHERE emp.deptno=dept.deptno AND sal BETWEEN losal AND hisal AND empno="+empno;
			//2-1. 전송
			ps=conn.prepareStatement(sql);
			//3. SQL 실행 후 결과값을 메모리에 저장
			ResultSet rs=ps.executeQuery();
			//4. 커서 위치 변경 => 첫 번째 출력 위치로
			/*
			 * 현재 값 => 순서대로 1번부터 시작
			 * empno,ename,job,hiredate,sal,dname,loc,grade
			 * int  String String Date  int  String String int
			 * => getInt() / getString() / getDate()
			 */
			rs.next();
			
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				//vo.setSal(rs.getInt(5));
				vo.setStrSal(rs.getString(5));
				//dvo
				vo.getDvo().setDname(rs.getString(6));
				vo.getDvo().setLoc(rs.getString(7));
				//svo
				vo.getSvo().setGrade(rs.getInt(8));
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
