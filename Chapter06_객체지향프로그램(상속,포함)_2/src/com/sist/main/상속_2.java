package com.sist.main;
/*
 *   메소드 오버라이딩: 메소드 기능 변경 => 유지보수
 *   
 *   오버라이딩 조건***** => 인터페이스
 *     1) 상속: 상속받은 메소드를 변경
 *     2) 메소드명이 동일
 *     3) 매개변수 동일
 *     4) 리턴형이 동일
 *     5) 접근지정어가 확대 가능, 축소 불가능
 *     ex)
 *     class A
 *     {
 *       void display(){} ==> default 상태
 *     }
 *     class B extends A
 *     {
 *        1. void display(){}
 *        2. public void display(){}
 *        3. protected void display(){}
 *        4. private void display(){} ****=> 오류 => default 보다 작음
 *     }
 */
class Animal
{
	public void run()
	{
		System.out.println("걷는다");
	}
}
class Dog extends Animal
{
	public void run()
	{
		System.out.println("네 발로 걷는다");
	}
}
class Human extends Animal
{
	public void run()
	{
		System.out.println("두 발로 걷는다");
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관련 클래스가 여러 개 => 상위 클래스로 이용
		// 객체를 한 개만 생성해서 사용
		Animal ani=new Dog();
		ani.run();
		ani=new Human();
		ani.run();

	}

}
