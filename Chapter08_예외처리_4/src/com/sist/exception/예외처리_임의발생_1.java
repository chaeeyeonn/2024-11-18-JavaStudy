package com.sist.exception;
// 임의 발생은 한 개만 사용 => if문

import java.util.Scanner;
public class 예외처리_임의발생_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("국어 점수 입력:");
			int kor=scan.nextInt();
			if(kor<0 || kor>100)
			{
				//잘못된 입력 => 직접 처리
				//or catch 불러옴
				//throw => 예외발생 알려줌 => 테스트시 많이 사용	
				throw new IllegalArgumentException("점수는 0~100만 가능");//=>getMessege가 됨
				//catch로 이동
				//throw => 필요시에 의해 catch 호출 가능
				//아래 try문은 코딩 불가능 => 에러
			}
		}catch(IllegalArgumentException e) 
		{
			//매개 변수에 전송값이 다른 경우
			System.out.println(e.getMessage());
		}
		

	}

}
