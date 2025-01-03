package com.sist.main;
/*        
 *   - 상속
 *        :기존의 클래스를 재사용(메소드 변경, 메소드 추가) => extends
 *        => 단일 상속
 *        => 객체 지향: 재사용 / 데이터 손실 방지 / 변경이 쉽게, 추가 가능
 *                   |상속    |캡슐화          |다형성(오버라이딩, 오버로딩)
 *        => 제약 조건이 많음
 *        => 소스 볼 수 없음 => 가독성
 *        => 상위 클래스에서 하위 클래스로 메모리 할당 => 실행 속도 늦음
 *        => 상속 보완: ***인터페이스(구현)
 *        => 장점: 중복 제거 / 코드 간결 / 메소드 기능 변경 가능
 *        상위 클래스: 공통 기능 => 하위 클래스를 제어할 권한 x
 *        하위 클래스: 구체적 / 상속받은 내용 변경 => 오버라이딩
 *                 => 자신 + 상위 클래스 제어 가능
 *                    ---   ---
 *                    this  super
 *                    |         |
 *                    자신 객체   상위 클래스 객체
 *                  생성자: this()     super()
 *              *** A a=new B(); ==> double d=10;
 *                 상위      하위
 *                 ---      ---    
 *                 A 변수    B 메소드
 *             변수: 클래스형  메소드: 생성자
 *             상위 클래스를 이용한다 => 관련된 클래스를 여러 개 묶어서 사용
 *                               => 한 개의 객체명으로 처리 가능
 *                               => 변수, 객체 多 => 제어 어려움
 *                                              => 한 개의 이름으로 제어
 *                                                 ---------상위 클래스 / 인터페이스(스프링 기반)    
 *        => 상속받으면 데이터형은 두 개 생김
 *        => 상속 내리는 클래스 > 상속 받는 클래스
 *        => 클래스도 사용자 정의 데이터형이 될 수 있음 / 메소드: 사용자 정의 메소드
 *          => 변경(오버라이딩): 메소드 재정의 => 덮어쓴다: 구조 동일
 *             1) 상속 존재 => 요즘 클래스에서 상속없이 재정의 가능(오버라이딩) => 익명의 클래스
 *             2) 메소드, 매개변수, 리턴형 동일
 *             3) 접근지정어 확장 가능(축소하면 오류 발생)
 *             private < default < protected < public
 *             => 메소드는 다른 클래스와 연결 => 가급적이면 public
 *             ** 클래스 / 생성자 / 메소드 => public
 *             ** 멤버변수 => private: 데이터 보호
 *                       => 필요시 사용 가능: getter / setter
 *             ** 윈도우 => 보안 x => Button, TextField, ... => default
 *        => 상속시 예외 조건
 *           : static: 공유데이터 => 사용은 가능
 *           : 생성자
 *           : 초기화 블록
 *        => 접근지정어
 *           : private => 접근 불가
 *           
 *        
 *        
 */
// 상위 클래스 => 메모리 할당
// but, 생성자에 매개변수가 있으면 메모리 할당 불가
// 하위 클래스에서 상위 클래스 매개변수 관리해야함
class A
{
	public A() {
		super();
	}

	public A(String s) {
		System.out.println(s);
	}
}
class B extends A
{
	public B(String s) {
		super(s);
	}

	public B() {
		super();// default일 경우 생략 가능 => 컴파일러가 자동 추가
	}
	// super(): 상위 클래스 생성자 호출
}
public class 상속_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
