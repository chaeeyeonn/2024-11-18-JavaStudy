//
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

//5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성
//import java.util.Arrays;
//import java.util.Scanner;
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		int[] score=new int[5];
//		int[] rank=new int[5];
//		
//		for(int i=0;i<score.length;i++)
//		{
//			System.out.println((i+1)+"번 학생 점수 입력:");
//			score[i]=scan.nextInt();
//		}
//		System.out.println(Arrays.toString(score));
//		for(int i=0;i<score.length;i++)
//		{
//			rank[i]=1;
//			for(int j=0;j<score.length;j++) {
//			if(score[i]<score[j])
//			{
//				rank[i]++;
//			}
//			}
//		}
//		System.out.println(Arrays.toString(rank));
//
//	}
//
//	}

//10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성

import java.util.Arrays;

//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] num=new int[10];
//		int max=0;
//		int min=100;
//		for(int i=0;i<num.length;i++)
//		{
//		  num[i]=(int)(Math.random()*10)+1;
//		}
//		System.out.println(Arrays.toString(num));
//		  for(int i:num)
//		  {
//			  if(max<i)
//			  {
//				  max=i;
//			  }
//			  if(min>i)
//			  {
//				  min=i;
//			  }
//			  
//		  } System.out.print(max+" "+min);
//			 
//	
//
//	}
//
//}

//10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오
//import java.util.Arrays;
//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//
//int[] arr=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10)+1;
//			if(i!=3)
//			{
//
//				System.out.print(arr[i]+" ");
//			}
//		}
//
//	}
//
//}

//char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오

//public class 연습 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		char[] a=new char[26];
//		char c='A';
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=c++;
//			
//		}
//
//	}
//}

//