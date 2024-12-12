package com.sist.main;
class 사람
{
	String name,sex,address,phone;
	int age;
	public 사람()
	{
		System.out.println("사람 class 메모리 할당");
	}
}
class 회사원 extends 사람
{
	//String name,sex,address,phone;
	//int age;
	int sabun;
	String dept,job,loc;
	int pay;
	public 회사원()
	{
		System.out.println("회사원 메모리 할당");
	}
}
public class 재사용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//회사원 sa=new 회사원();
		//메모리할당 => 상속받은 클래스만 이용
		//        => 상속하는 클래스 메모리 할당
		사람 a=new 회사원();
		//묵시적 형변환
		//double d=10;과 같은 형변환
		//a=> 사람 변수, 메소드만 가짐
		//클래스형 => 변수, 메소드만 사용 가능
		회사원 b=(회사원)a;
		//강제 형변환

	}

}
