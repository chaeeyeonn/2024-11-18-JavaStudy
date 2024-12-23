package com.sist.main;
import java.util.*;
public class 컬렉션_9_ArrayList_ETC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","박문수","이순신","강감찬","김두한","홍길동","박문수","이순신"};
		List<String> list=Arrays.asList(names);
		//배열 => List로 변경
		for(String name:list)
		{
			System.out.println(name);
		}
		System.out.println();
		Set<String> set=new HashSet<String>();
		set.addAll(list);
		for(String name:set)//순서 상관 x
		{
			System.out.println(name);
		}
		

	}

}
