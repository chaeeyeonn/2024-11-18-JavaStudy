package com.sist.exception;
/*
 *  try~catch 절 안에 쓴 변수들은 {} 밖에선 사라짐 => 지역변수
 *  남기려면 try~catch 절 밖에 미리 선언하고 이용
 *  
 */
import java.util.Scanner;
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[2];// 배열 범위 , 0
		try {
			System.out.print("첫 번째 점수 입력:");
			String s1=scan.next();
			System.out.print("두 번째 점수 입력:");
			String s2=scan.next();//배열 범위 초과 => catch로 이동
			
			arr[0]=Integer.parseInt(s1);//정수 변환
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];//0일 경우 비정상 종료
			System.out.println("result"+result);
		}catch(NumberFormatException e)
		{
			//System.out.println(e.getMessage());//java가 제공하는 에러 메시지
			e.printStackTrace();//에러 위치 찾기
		}
		catch(RuntimeException e)//제일 상위 클래스 => 3개를 모두 실행하면 제일 큰 상위 클래스가 있기에 오류 발생 => 맨 마지막에 두면 가능
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("배열 범위 초과");
		}
		catch(ArithmeticException ex)//catch는 하나만 수행
		{
			System.out.println("0으로 나눌 수 없다");
		}*/
		System.out.println("정상 수행");
		//정상 수행 => catch 수행 x
		

	}

}
