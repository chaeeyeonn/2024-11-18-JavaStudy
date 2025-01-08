package com.sist.vo;
// 사원 정보 => 사원 한 명에 대한 정보 저장
// => 모아서 한 번에 윈도우나 브라우저에 전송할 목적
/*
 EMPNO    NOT NULL NUMBER(4) = int
 ENAME    VARCHAR2(10) = String
 JOB      VARCHAR2(9) = String
 MGR      NUMBER(4) = int
 HIREDATE DATE = java.util.Date
 SAL      NUMBER(7,2) = int
 COMM     NUMBER(7,2) = int
 DEPTNO   NUMBER(2) = int
 -----------------------------=> 오류: 내부변환이 안 된다
 => 오라클
    문자 = CHAR / VARCHAR2 / CLOB => String
    숫자 = NUMBER => double / int
    날짜 = DATE => java.util.Date
 */
import java.util.*;
// => 테이블 연동: 다른 테이블의 컬럼 추가하면 안 됨
// => 테이블 여러 개 컬럼을 섞어서 사용하려면 => 한 개의 테이블로 변경 => View(가상테이블)
public class EmpVO {
	private int empno,mgr,sal,comm,deptno;
	private String ename,job,mname;
	private Date hiredate;
	private String strSal; // 문자열
	// TO_CHAR => 문자열 변환 => String
	// => 문자열을 받을 수 있게 String 변수 추가
	/*
	 *  1. 정수(천 단위,)
	 *  2. 날짜 변환
	 */
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getStrSal() {
		return strSal;
	}
	public void setStrSal(String strSal) {
		this.strSal = strSal;
	}
	//조인 => 포함 클래스 => List<EmpVO>를 위함
	private DeptVO dvo=new DeptVO();
	private SalGradeVO svo=new SalGradeVO();
	
	public DeptVO getDvo() {
		return dvo;
	}
	public void setDvo(DeptVO dvo) {
		this.dvo = dvo;
	}
	public SalGradeVO getSvo() {
		return svo;
	}
	public void setSvo(SalGradeVO svo) {
		this.svo = svo;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public int getMgt() {
		return mgr;
	}
	public void setMgt(int mgr) {
		this.mgr = mgr;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
}
