package com.sist.main;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *   패키지: 관련된 클래스를 모아 관리하는 영역
 *   ----폴더 => com.회사명.클래스종류
 *                       --------vo: 사용자 정의 데이터형
 *                               dao: 오라클 연동
 *                               ===> 테이블당 1개
 *                               manager: Open API, 크롤링
 *                               model: 브라우저 연결 => 데이터 전송
 *                               ***commons: 공통 사용 기능
 *                               ===> 중복 제거 => static => 공통 모듈
 *                               ***service: dao + model
 *                               ***controller: 사용자 요청 => model
 *                               (윈도우 => view: 화면 UI 
 *                                        / dao, vo, controller
 *                                          client / server)
 *    
 *   접근지정어
 *     - public: 클래스, 메소드, 필드, 생성자 => 다른 클래스와 연결 => 다른 패키지 연결
 *       => 클래스 => public(다른 클래스와 연동)
 *       => 메소드 => public
 *       => 생성자 => public
 *       => 멤버변수 => 
 *       class A
 *       {
 *         void display()
 *         {
 *          B b=new B();
 *          b.display();
 *         }
 *       }
 *       class B
 *       {
 *         void display()
 *         {
 *         }
 *       }
 *          
 *     - protected: 메소드, 필드, 생성자(클래스 x)
 *                : 같은 패키지에서만 사용 가능
 *                => 다른 패키지 => 상속받은 클래스
 *                : 사용 빈도 거의 없음
 *     - default: 클래스, 메소드, 필드, 생성자
 *              : 같은 패키지에서만 사용 가능
 *     - private: 메소드, 필드, 생성자(클래스 x)'=
 *              : 자신의 클래스 영역에서만 사용 가능데이터 은닉화 => 필드는 거의 대부분 private
 *              
 *     *** 패키지가 만들어지면 => 다른 패키지에 있는 클래스 사용 시 반드시 import
 *     *** 140page
 *         메소드: 한 개의 기능을 수행하는 명령문의 집합
 *           - 인스턴스 메소드: 객체마다 따로 저장되는 메소드
 *           - static 메소드: 여러 개 객체가 공통으로 저장
 *           - abstract 메소드: 추상 클래스
 *           - final 메소드: 거의 안 씀
 *   제어어
 *     - static
 *     - abstract
 *     - final
 */
class Util
{
	//중복없는 난수 => 예약 가능 일
	/*
	 *   값 읽기 getXxx()
	 *   값 설정 setXxx()
	 *   존재여부 isXxx() => boolean
	 *   삭제 remove(), delete()
	 */
	public int[] getRand(int count)
	{
		int[] com=new int[count];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*31)+1;
			
			for(int j=0;j<i;j++)//j => 저장된 데이터
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		return com;
	}
	
	//Call By Reference
	public void getRand(int[] com)//오버 로딩
	{
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*31)+1;
			
			for(int j=0;j<i;j++)//j => 저장된 데이터
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
	}
	//정렬 ASC/DESC
	//패키지가 없는 경우 => jsp사용 X => jar x
	public void display()
	{
		System.out.println("display() 진입 2 6");
		System.out.println("display 기능 처리 3 7");
		System.out.println("display()종료 4 8");
	}
}

public class 접근지정어_1 {

 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Util util=new Util();
		int day=(int)(Math.random()*16)+5;
		int[] arr=new int[day];
		util.getRand(arr);
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
//		int day=(int)(Math.random()*16)+5;
//		int[] arr=util.getRand(day);
//		Arrays.sort(arr);		
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
//		System.out.println("main에서 display 호출 전 1");
//		util.display();
//		System.out.println("main에서 display 호출 완료 5");
//		util.display();
//		//메소드 호출 시 메소드 처음부터 끝까지 수행 후 원래 위치 복귀
//		System.out.println("main end 9");
	}

}
