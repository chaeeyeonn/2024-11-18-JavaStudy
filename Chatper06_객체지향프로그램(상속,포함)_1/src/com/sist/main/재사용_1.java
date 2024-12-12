package com.sist.main;
/*
 *   자바 기본 형식
 *   package => 1번 사용 가능 => 첫 줄 사용
 *   import => 여러 번 사용 가능
 *   public class ClassName
 *   {
 *      멤버변수 / 정적변수 => X, 여러개 가능
 *      생성자 => 필요시 사용
 *      메소드 => 필요시 사용
 *      main(){} => 반드시 1개 필요 => 프로그램 시작
 *   }
 *   
 *   제어어
 *   static: 공통적인
 *   final: 마지막인 => 상수 / 변경하지 않는 메소드
 *   abstract: 추상적인 => 공통 기반
 *   synchronized: 동기적인 => 쓰레드
 *   ----------
 *   async 비동기
 *   sync 동기
 *   ----------자바스크립트 제어
 *   
 *   *** 객체의 생명 주기
 *   설계   ==>    저장       ==>    활용       ==>    소멸
 *   class A     A a=new A()     a.메소드(), a.변수    a=null => System.gc()
 *   
 *   
 *   교재 194page~
 *   6장 상속
 *   
 *   상속(웹, 스프링 => 사용빈도 거의 없음)
 *   --------------------------------
 *   상속: 목적 / 형식 / 메모리 구조
 *      - 목적
 *       : 기존의 클래스(이미 만들어져 있는 클래스) => 신뢰성이 뛰어남
 *        - 라이브러리 클래스
 *        - 사용자 정의 클래스
 *       => 재사용 할 때 / 변경 사용, 추가 사용
 *       => 반복 제거 / 소스를 줄이는 경우
 *       => 상속 제외조건
 *        : 생성자, static, 초기화블록
 *        ** 상속은 되지만 사용 못함: private(대신 protected 씀) 
 *      - 형식
 *        class A
 *        class B extends A => A class를 확장하여 사용
 *        => 상속하는 클래스: 부모클래스, 슈퍼클래스, 베이스클래스
 *        => 상속받는 클래스: 자식클래스, 서브클래스, 파생클래스
 *       => 클래스 크기 결정: 형변환
 *          --------
 *          상속하는 클래스 > 상속받는 클래스
 *       => 자바에서 상속은 단일 상속만 지원 => 수정 가능(변수 오버라이딩, 메소드 오버라이딩)
 *       => 상속: extends => 한 개만 사용 가능
 *       => 상속을 두 개 이상 받으려면
 *          class A
 *          class B
 *          class C
 *          
 *          class A
 *          class B extends A => B, A
 *          class C extends B => C, B, A
 *          
 *       => 여러 개 받는 방법: 클래스는 기존
 *          => 인터페이스 출현
 *          
 *       - 상속하는 상쉬 클래스들이 상속받는 하위 클래스보다 클래스가 크다
 *         => 공통점이 상위 클래스가 더 많다(추상화)
 *         => 하위클래스들은 구체적이다(구체화)
 *           => 상속 받을 수록 속도가 느려진다
 *           => 영향력이 많이 존재
 *           => 공통점을 추출
 *       
 *       자동 추가
 *       import java.lang.*;
 *       class A//extends Object
 *       {
 *          a b c
 *       }
 *       class B extends A
 *       {
 *          // a b c => 따로 설정할 필요 없음
 *       }
 *       상속 기호
 *       Object
 *       ↑
 *       A: super => this(자신), super(Object)
 *       ↑   => 화살표 모양 주의
 *       B: sub => this(자신), super(상속한)
 *       *** 상속하는 클래스 => 상속받은 클래스의 변수, 메소드 제어 불가
 *           super => 자바의 모든 클래스는 Object 상속을 받음
 *       *** 상속받는 클래스 => 상속하는 클래스 제어 가능
 *      
 *      자바의 모든 라이브러리는 예외처리를 가지고 있다
 *      
 *      class A
 *      {
 *         int a;
 *         int b;
 *      }
 *      class B extends A
 *      {
 *         // int a,b;
 *         int c;
 *         int d;
 *      }
 *      
 *      //메모리 할당
 *      B bb=new B();
 *      
 */

public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
