package com.sist.exception;
/*
 * 
 */
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try
//		{
//			for( int i=1;i<=10;i++)
//			{
//				int r=(int)(Math.random()*3);
//				int a=i/r;//r이 0이면 오류 발생 => catch
//				System.out.println("i="+i+","+a);
//			}
//		}catch(Exception e)
//		{
//			
//		}
		for( int i=1;i<=10;i++)//무조건 10까지 반복할 수 있음 => 에러나면 스킵 => 크롤링
		{
			try
			{
				int r=(int)(Math.random()*3);
				int a=i/r;
				System.out.println("i="+i+","+a);
				
			}catch(Exception e)
			{
				
			}
		}

	}

}
