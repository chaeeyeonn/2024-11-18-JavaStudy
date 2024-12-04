/*
 *   # 3개의 정수를 받아서 평균, 총점 전송하는 메소드 만들기 ==> 구조적 프로그램 만드는 것
 *   
 *   1. 입력 받기
 *   2. 처리 => 평균, 총점 => 각각 내야하니 메소드는 2개
 *      => 세분화
 *   3. 출력
 */
import java.util.Scanner;
public class 메소드_5 {
	//리턴형/매개변수 잘 선택
	//절차적 언어 => 한 번 사용하고 버림
	//입력
	static int userInput(int a)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(a+"정수 입력:");
		int c=scan.nextInt();
		return c;
	}
	//요청 처리1
	static int total(int a, int b, int c)
	{
		return a+b+c;
	}
	//요청 처리2
	static double div(int total)
	{
		return total/3.0;
	}
	//출력
	static void print(int total,double avg)
	{
		System.out.println("평균:"+avg);
		System.out.println("총점:"+total);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3개의 정수 받기
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("첫 번째 정수 입력:");
//		int a=scan.nextInt();
//		System.out.println("두 번째 정수 입력:");
//		int b=scan.nextInt();
//		System.out.println("세 번째 정수 입력:");
//		int c=scan.nextInt();
//		
//		//평균
//		double avg=(a+b+c)/3.0;
//
//		//총점
//		int total=a+b+c;
//		
//		//출력
//		System.out.println("평균:"+avg);
//		System.out.println("총점:"+total);
		
		int a=userInput(1);
		int b=userInput(2);
		int c=userInput(3);
		
		int total=total(a, b, c);
		double avg=div(total);
		
		print(total, avg);

	}

}
