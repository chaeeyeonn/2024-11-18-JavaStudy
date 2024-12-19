package com.sist.exception;
/*
 *  예외처리 방법
 *  
 *  1. 직접 처리(예외복구)
 *     try
 *     {
 *       정상 수행 문장
 *       => 오류 발생 가능성 있음
 *     } catch(예상되는 예외클래스)
 *     {
 *         오류발생 => 처리 복구
 *         오류내용만 확인
 *     }
 *     finally
 *     {
 *         닫기(서버,오라클,파일) => 자원(resource) 반환
 *         => 무조건 수행 문장
 *     }
 *     
 *  2. 간접 처리: throws
 *     => 예외 회피
 *     => 예상되는 예외를 선언 => 컴파일러에 전달
 *     => 해당 메소드를 사용시에는 반드시 예외처리 후 사용 가능
 *       => throws / try~catch 사용 가능
 *     => 사용자 정의는 사용 빈도 적음 / 라이브러리가 많이 존재
 *        ----------------------코딩 소스가 많은데 중간에 예외처리할 문장이 있는 경우
 *     형식)
 *         public void display() throws 예외처리클래스...
 *         => 여러 개일 경우 => ,
 *         => 순서 없음
 *         => 예상되는 예외 지정해야 함
 *         {
 *         }
 *         	
 *     
 */

public class 예외처리_1 {
//    public int div(int a,int b) throws ArithmeticException//UnCheckException
//    {
//    	return a/b;
//    }
//    public void print()
//    {
//    	int c=div(10,0);
//    }
	public void display() throws Exception,ClassNotFoundException
	{
		System.out.println("display Call...");
	}
	//CheckException => 호출 시 반드시 예외처리 필요 
	//UnCheckException => throws 문장 사용 안 함
	//1. try~catch
	public void print() {
		try
		{
			display();
		}catch(ClassNotFoundException e) {}
		catch(Exception e) {}
	}
	//2. try~catch
	public void print2()
	{
		try {
			display();
		}catch(Exception e)
		{
			
		}
		
	}
	//3. throws
	public void print3() throws Exception,ClassNotFoundException
	{
		display();
	}
	//4. throws
	public void print4() throws Exception
	{
		display();
	}
	/*
	 *   소스가 없는 경우 => 새로운 메소드를 만드는 경우
	 *   try~catch => 개발
	 *   소스 있는 경우 => 새로운 기능 추라
	 *   throws
	 *   1. 예상되는 예외를 메소드뒤에 선언 
	 *     2. 메소드 호출에 반드시 예외처리후 호출 
	 *     --------------------------------
	 *        => 직접처리 (*******) 
	 *        => 선언하고 사용할 수 있다 
             
           
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
