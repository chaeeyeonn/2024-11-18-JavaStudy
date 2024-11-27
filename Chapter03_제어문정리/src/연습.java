//1. 구구단 중 원하는 단수 입력 받아 결과를 출력하기
//import java.util.Scanner;
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("단수를 입력:");
//		int dan=scan.nextInt();
//		
//		int i=1;
//		while(i<=9)
//		{
//			System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
//			i++;
//		}
//
//	}
//
//}

//2. 1~100사이 정수 중에서 8의 배수 출력하기
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i=1;
//		while(i<=100)
//		{
//			if(i%8==0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
//		
//
//	}
//
//}

//3.  1~100사이 정수 중에서 4의 배수이거나 7의 배수인 정수를 출력하기
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i=1;
//		while(i<=100)
//		{
//			if(i%4==0 || i%7==0)
//			{
//				System.out.println(i);
//			}
//			i++;
//		}
//	
//
//	}
//
//}

// 4. 1~100사이 정수중에서 일의 자리 수가 3 또는 6 또는 9인 정수를 
//    출력하기
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i=1;
//		while(i<=100)
//		{
//			if(i%10==3 || i%10==6 || i%10==9)// 10으로 나누면 일의 자리만 남음
//			{
//				System.out.print(i+" ");
//			}
//			i++;
//		}
//		
//	
//
//	}
//
//}

//5. 사용자에게 문자열을 입력받아 모음의 개수를 출력하기 (a, e, i, o, u)
//import java.util.Scanner;
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.print("문자열 입력:");
//		String str=scan.nextLine();
//		int j=0;
//		int a=0,e=0,k=0,o=0,u=0;
//		while(j<=str.length())
//		{
//			char c=str.charAt(j);
//			if(c=='a')
//				a++;
//			else if(c=='e')
//				e++;
//			else if(c=='i')
//				k++;
//			else if(c=='o')
//				o++;
//			else if(c=='u')
//				u++;
//			
//			j++;
//		}
//		System.out.println("모음 개수:"+(a+e+k+o+u));
//	}
//
//
//}

//6. 사용자에게 1 ~ 9사이의 정수를 입력받아 2자리의 자연수 중 각 자리수의 합이 입력값과 동일한 수 출력하기
//입출력예) 6 => 15 24 33 42 51 60
//import java.util.Scanner;
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("정수 입력(1~9):");
//		int user=scan.nextInt();
//		
//		int i=10;
//		while(i<100)
//		{
//			int a=i/10;// 앞자리
//			int b=i%10;// 뒷자리
//			if(a+b==user)
//				{
//				System.out.println(i);
//				}
//			i++;
//					
//		}
//		
//	}
//
//
//}

//7. 10부터 20까지 순서대로 출력 // 역순 출력

//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int i=20;
//		while(i>=10)
//		{
//			System.out.println(i);
//			i--;
//		}
//		
//		
//	}
//
//
//}

//9. 사용자가 입력한 5개의 정수 중 가장 큰 값을 출력하기
//import java.util.Scanner;
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int i=1;
//		int max=0;
//		while(i<=5)
//		{
//			System.out.print("정수 입력:");
//			int user=scan.nextInt();
//			
//			if(user>=max)
//				{
//				max=user;
//				}
//			i++;
//		}
//		System.out.println("최대값:"+max);
//	}
//
//
//}

//10. 사용자에게 문자열 3개를 입력받아
//   길이값의 합을 출력하고, 가장 긴 문자열을 출력하기
//import java.util.Scanner;
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int sum=0;
//		int max=0;
//		String l="";
//		int i=1;
//		while(i<=3)
//		{
//			System.out.println("문자열 입력:");
//			String user=scan.next();
//			
//			sum+=user.length();
//			
//			if(user.length()>max)
//			{
//				max=user.length();
//			    l=user;
//			}
//			i++;
//			
//		}
//		System.out.println("길이 합:"+sum);
//		System.out.println("가장 긴 문자열:"+l);
//	}
//
//
//}
//
