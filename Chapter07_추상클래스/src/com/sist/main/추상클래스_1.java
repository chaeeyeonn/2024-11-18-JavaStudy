package com.sist.main;
/*
 *   추상 클래스
 *     = 미완성 클래스: 자신이 메모리 할당을 할 수 없다
 *       ---------
 *       abstract class A => A a=new A(); ==> 오류
 *       => 상속을 내려서 상속받은 클래스를 미완성된 메소드를 구현 해냄
 *       => 사용 방법
 *          abstract class A
 *          class B extends A
 *          ------------------A a=new B(); : 묵시적 형변환, 자동 형변환
 *          => 미구현 => 구현 => 오버라이딩: 생성자 타입을 따라 감
 *          => 추상 클래스의 기능이 여러 가지인 이유: 프로그램에 맞게 구현 
 *                      ----------------------
 *          => 데이터베이스의 모든 클래스는 추상클래스로 만들어져 있다    
 *          
           1. 클래스마다 같은 메소드 => 따라 구현향ㅎㄹ 
           2. 필요시마다 구현된 메소드 
 */
public class 추상클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
