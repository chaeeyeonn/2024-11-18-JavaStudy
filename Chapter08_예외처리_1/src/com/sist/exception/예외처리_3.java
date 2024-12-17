package com.sist.exception;

public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장 1");
		System.out.println("문장 2");
		System.out.println("문장 3");
		try {
			System.out.println("문장 4");
			System.out.println(10/0);//catch로 이동 => try 밑 문장 수행 x
			System.out.println("문장 6");
		}catch(Exception e) 
		{
			System.out.println("문장 7");//제외
		}
		System.out.println("문장 8");
		System.out.println("문장 9");

	}

}
