package com.sist.exception;
import java.util.Scanner;
// 교재 268~270~
public class 예외처리_멀티예외처리_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("첫 번째 정수 입력:");
			String num1=scan.next();
			System.out.print("두 번째 정수 입력:");
			String num2=scan.next();
			
			//정수 변환 => 윈도우, 웹 => 문자열만 받을 수 있음
			int n1=Integer.parseInt(num1);
			int n2=Integer.parseInt(num2);
			
			System.out.println(n1/n2);
			
		}catch(NumberFormatException | ArithmeticException e)//멀티 catch
		{
			System.out.println(e.getMessage());
		}
		/*catch(Exception e)// 최상위클래스 이용
		{
			System.out.println(e.getMessage());
		}*/
		/*catch(RuntimeException e)// 상위클래스 이용
		{
			System.out.println(e.getMessage());
		}*/
		/*catch(NumberFormatException e)//정수 아닐 경우
		{
			System.out.println(e.getMessage());
		}catch(ArithmeticException e)//0으로 나눌 경우
		{
			System.out.println(e.getMessage());
		}*/

	}

}
