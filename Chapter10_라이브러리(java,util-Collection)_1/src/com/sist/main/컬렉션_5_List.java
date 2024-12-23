package com.sist.main;
import java.util.*;
public class 컬렉션_5_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names=new ArrayList<String>();
//		names=new LinkedList<String>();
//		names=new Vector<String>();
		//인터페이스 => MyBatis / JPA => 리턴형 => List
		
		//데이터를 모아서 순차적으로 접근 => 크롤링
		List<String> list=new ArrayList<String>();
		list.add("Java");
		list.add("Oracle");
		list.add("HTML/CSS");
		list.add("JavaScript");
		list.add("JSP");
		
		for(String subject:list)
		{
			System.out.println(subject);
		}
		System.out.println("================================");
		//데이터 모아서 순차적 출력
//		Iterator<String> iter=list.iterator();
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		//next()로 끝나면 2번 읽지 못한다
		ListIterator<String> iter=list.listIterator();
		while(iter.hasNext())//순차
		{
			System.out.println(iter.next());
		}
		System.out.println("================================");
		while(iter.hasPrevious())//역순
		{
			System.out.println(iter.previous());//역순 출력
		}
//		while(iter.hasNext())
//		{
//			System.out.println(iter.next());
//		}
		
	}

}
