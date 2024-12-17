package com.sist.main;
/*
 *   기능 처리가 여러 개인 경우
 *   CGV / 롯데시네마 / 메가박스 => 기능 구현 X, 선언만
 */
public class 클래스종류정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new Object();
		String str="";
		StringBuffer sb=new StringBuffer();
		
		if(obj instanceof Object)
		{
			System.out.println("obj는 object 클래스 객체");
		}
		if(str instanceof Object)
		{
			System.out.println("str은 object 클래스 객체");
		}
		if(sb instanceof Object)
		{
			System.out.println("sb는 object 클래스 객체");
		}
		if(obj instanceof String)
		{
			System.out.println("str은 object 클래스 객체");//false
		}
//		if(sb instanceof String) => 크기 비교 불가
//		{
//			System.out.println("str은 object 클래스 객체");
//		}
		
	}

}
