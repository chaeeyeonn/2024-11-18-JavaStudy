//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문)
//int x>10 && int x<20

//char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
//char ch="" && ch!=탭

//char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
//char ch='x' || char ch='X'

//char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
//char ch>=0 && char ch<=9


//public class 반복문_문제 {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
//	    출력하는 프로그램을 작성하시오
//		for(int i=1;i<=6;i++)
//		{
//			for(int j=1;j<=6;j++)
//				if(i+j==6)
//				{
//					System.out.printf("[%d,%d]\n",i,j);
//				}
//		}

//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
//끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.(while문 활용)
//import java.util.Scanner;
//public class 반복문_문제 {
//
//	public static void main(String[] args) {
//	Scanner scan=new Scanner(System.in);
//	System.out.println("첫 번째 정수 입력:");
//	int num1=scan.nextInt();
//  int num2=0;
//  while(true)
//  {
//	System.out.println("두 번째 정수 입력:");
//	int num2=scan.nextInt();
//  if(num1<num2) => num2가 num1보다 클 때까지 반복
//     break;
//  }
//	int score=1;
//	for(int i=num1;i<=num2;i++) => num2가 항상 커야함
//	{
//		score*=i;
//		
//	}
//System.out.println(num1+"~"+num2+"까지의 곱="+score);
//	
//
//	}
//
//}

//7.  5~16까지의 합을 구하시오
//public class 반복문_문제 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int sum=0;
//		for(int i=5;i<=16;i++)
//		{
//			sum+=i;
//			
//		}
//		System.out.println(sum);
//	}
//}

//8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
//public class 반복문_문제 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int sum=0;
//		for(int i=3;i<=4462;i++)
//		{
//			if(i%2==0)
//			{
//				sum+=i;
//				
//			}
//			System.out.print("sum="+sum);
//		}
//		
//	}
//}

//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
//public class 반복문_문제 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a2=1;
//		int a3=1;
//		for(int i=0;i<=12;i++)
//		{
//			if(i%2==0)
//				a2+=i;
//			if(i%3==0)
//				a3+=i;
//			
//		}
//		System.out.println(a2);
//      System.out.println(a3);
//	}
//}

//10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
//public class 반복문_문제 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a4=1;
//		for(int i=1;i<=100;i++)
//		{
//			if(i%4==0)
//				a4+=i;
//			
//		}
//      System.out.println(a4);
//	}
//}

//11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
//import java.util.Scanner;
//public class 반복문_문제 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int num=0;
//		for(int i=1;i<=10;i++)
//		{
//		System.out.print(i+"번째 정수를 입력하세요:");
//		int user=scan.nextInt();
//		if(user%2==0)
//		{
//			num++;
//		}
//	
//		}
//		System.out.println("짝수 개수:"+num);
//	}
//}

//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
//import java.util.Scanner;
//public class 반복문_문제 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int a3=0;
//		int a5=0;
//		for(int i=0;i<=10;i++)
//		{
//		System.out.print(i+"번째 정수를 입력하세요:");
//		int user=scan.nextInt();
//		if(user%3==0)
//		{
//			a3++;
//		}
//		if(user%5==0)
//		{
//			a5++;
//		}
//		}
//		System.out.println("3의 배수 개수:"+a3);
//		System.out.println("5의 배수 개수:"+a5);
//		
//	}
//}

//// 만들기
public class 반복문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{   char c='A';
			for(char j=1;j<=5;j++)
			{
			  
				System.out.print(c++);
			
				
			}
			
			System.out.println();
		
		}
	}
}

//
