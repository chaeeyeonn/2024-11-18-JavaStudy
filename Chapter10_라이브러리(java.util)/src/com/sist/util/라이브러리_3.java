package com.sist.util;
import java.util.*;
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red|yellow|green|pink|magenta|blue|black|cyan";
		StringTokenizer st=new StringTokenizer(color,"|");
		//String[] colors=color.split("\\|");
		System.out.println("컬러 개수:"+st.countTokens());
		//개수 초과 불가
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());		
		}
		/*
		 *  hasmoreTokens
		 *  
		 */

	}

}
