package com.sist.main;
import com.sist.vo.*;//패키지가 다르니 import 필요
public class SawonUserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon hong=new Sawon(1,"홍길동","개발부","대리","2021-10-10",3600);
		//변수 => 읽기 / 쓰기 => 기능 만들기
		//초기화 => 생성자 이용하면 변경 불가
		//나머지 변경 => Setter 이용
		//출력
		System.out.println("=====홍길동 사원 정보=====");
		System.out.println("사번:"+hong.getSabun());
		System.out.println("이름:"+hong.getName());
		System.out.println("부서:"+hong.getDept());
		System.out.println("직위:"+hong.getJob());
		System.out.println("입사일:"+hong.getRegdate());
		System.out.println("연봉:"+hong.getPay());
		
		//값 변경
		hong.setDept("영업부");//private 데이터의 값 변경을 위해 set으로 변경
		hong.setJob("과장");
		hong.setPay(4200);
		System.out.println("=====홍길동 사원 변경 정보=====");
		System.out.println("사번:"+hong.getSabun());
		System.out.println("이름:"+hong.getName());
		System.out.println("부서:"+hong.getDept());
		System.out.println("직위:"+hong.getJob());
		System.out.println("입사일:"+hong.getRegdate());
		System.out.println("연봉:"+hong.getPay());
		
		
		
	}

}
