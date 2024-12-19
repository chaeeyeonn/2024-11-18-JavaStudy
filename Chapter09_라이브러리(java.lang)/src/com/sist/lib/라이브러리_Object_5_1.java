package com.sist.lib;
import java.util.*;
class Movie
{
	private int mno;
	private String title;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Movie(int mno, String title)
	{
		this.mno=mno;
		this.title=title;
	}
}
public class 라이브러리_Object_5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m1=new Movie(1, "홍길동전");
		System.out.println(m1.getClass());//데이터형 출력 => class에서 Movie데이터형을 쓰고 있음
		String s="";
		System.out.println(s.getClass());//class에서 String 데이터형을 쓰고 있음
		//getClass() => 클래스 타입(패키지명 클래스명을 찾는 경우)
		// 객체 생성 => 복제 => 소멸 => 비교
		
		
//		ArrayList<Movie> list=new ArrayList<Movie>();//형변환을 Movie로 모두 변경
//		list.add(new Movie(1, "홍길동전"));
//		list.add(new Movie(2, "심청전"));
//		
//		Movie m1=(Movie)list.get(0);
//		Movie m1=list.get(0);
		

	}

}
