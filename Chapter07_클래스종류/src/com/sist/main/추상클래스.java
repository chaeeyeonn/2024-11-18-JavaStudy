package com.sist.main;

import java.util.Scanner;

/*
 *   추상클래스
 *   - 주목적: 관련된 클래스를 모아서 한 개의 객체명으로 관리(서로 다른 클래스 연결 사용)
 *     ex) 게시판: 글쓰기, 목록, 수정, 상세보기, 삭제, ...
 *             => 묻고답하기(+답하기) / 자료실(+다운로드, 업로드) / 댓글형 게시판(+댓글추가) / 갤러리게시판(+이미지)
 *         ==> 요구사항 분석 / 설계
 *   - 단점: 단일 상속만 가능
 *        : 미완성(메소드 구현이 안 된 경우) => new를 이용해 객체 생성 불가능 
 *        : 상속을 받아서 메소드를 구현 후에 사용
 *          new 구현된 클래스의 생성자() => 오버라이딩 기법 사용
 *        : 선언된 메소드 + 선언 안 된 메소드 공존
 *   - 형식: public abstract class ClassName
 *          {
 *            변수: 멤버변수
 *            생성자
 *            메소드: 구현 메소드
 *                : 구현 메소드 선언 -> 상속받는 클래스의 공통적인 부분
 *          }
 *      ex) public abstract class A
 *          pulic class B extends B
 *          {
 *          }
 *          A a=new B();
 *        : 추상클래스 => 공통점을 가지고 있는 클래스    
 *         ==> 유지보수가 어려운 프로그램 => 설계(예약) => 프로그램에 맞게 구현(영화 예약 / 맛집 예약 / 항공 예약 /...)
 *         => 관련된 클래스를 묶어서 처리
 *         => 다중 상속 / 구현이 안 된 메소드만 사용 / 변수 = 상수 / 다른 영향이 없게
 */

abstract class 도형 // 많은 종류의 도형들을 '도형'이라는 하나의 객체로 모음
{
	public abstract void draw();//추상 메소드
	//상속받는 클래스는 무조건 구현해서 사용
	public void colorSelect()//공통 메소드, default
	{
		System.out.println("검정색을 사용한다");
	}
}
class 네모 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}
class 삼각형 extends 도형// abstract 메소드가 있는 경우 상속 시에 무조건 구현 후 사용 => 기본 문법
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	
}
class 원 extends 도형
{
    
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	//선택 사항
	public void colorSelect()
	{
		System.out.println("파란색을 사용한다");
	}
}

public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관련된 크래스를 모아서 한 개의 객체 명으로 제어
		// 오버라이딩: 기능을 변경 사용
		/*
		 *   오버라이칭
		 *   1) 상속 => 익명의 클래스
		 *   (상속없이 사용)
		 *   2) 메소드명, 매개변수
		 *   
		 *   
		 */
//		도형 a=new 네모();
//		a.draw();
//		a.colorSelect();
//		
//		a= new 삼각형();
//		a.draw();
//		a.colorSelect();
//		
//		a= new 원();
//		a.draw();
//		a.colorSelect();
		Scanner scan=new Scanner(System.in);
		System.out.println("네모(1), 삼각형(2), 원(3):");
		int mode=scan.nextInt();
//		도형 a=null;
//		if(mode==1)
//			a=new 네모();
//		else if(mode==2)
//			a=new 삼각형();
//		else if(mode==3)
//			a=new 원();
		도형[] a= {null,new 네모(),new 삼각형(),new 원()};
		a[mode].colorSelect();
		a[mode].draw();
		
		
		
		

	}

}
