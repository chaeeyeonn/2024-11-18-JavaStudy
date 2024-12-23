package com.sist.emp;
import java.util.*;

import lombok.Data;
//클래스는 한 개에 대한 정보만을 담는다 => new를 사용해 여러 개 저장 가능
@Data
public class Emp {
	private int empno;//사번
	private String ename;
	private String job;
	private int mgr;//사수 번호
	private Date Hiredate;//입사일
	private int sal;//급여
	private int comm;//성과급
	private int deptno;//부서번호
}
