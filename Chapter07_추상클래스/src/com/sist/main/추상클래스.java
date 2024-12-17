package com.sist.main;
/*
 *   - 추상클래스의 목적
 *     => 여러 개의 클래스를 한 개로 제어
 *        ------------------------
 *        데이터베이스
 *        기능 => 공통으로 설정: 모든 클래스가 공동 사용 => 구현
 *                                             => 드라이버 설정
 *                                             => 오라클 연결
 *                                             => 오라클 닫기
 *            => 공통 기능: 클래스마다 다른 내용 출력 => 미구현
 *                  |                            => 목록 / 검색 / 추가 / 삭제 / 상세보기 / ...
 *                  |                            => emp(사원정보), dept(부서정보), book(교재) => 처리방식이 모두 다름 
 *                  |
 *            1. 상속 받는다
 *            2. 미구현된 메소드를 구현해서 사용
 *            3. 추상클래스 이용해서 모든 클래스 연결
 *            4. 공통 기능이 무엇인지 / 미구현의 이유 => 처리하는 내용이 다른 경우 
 *            형식) public abstract class ClassName
 *                {
 *                  변수: 멤버변수
 *                  생성자
 *                  메소드 => 구현 메소드: 상속받은 모든 클래스가 동일한 기능
 *                       => 구현 안 된 메소드: 기능 동일, 처리하는 내용이 다른 경우
 *                }
 *            5. 반드시 오버라이딩 사용
 *            6. 반드시 상속 받는다: extends => 단일 상속만 지원
 *            *** 설계단
 *            *** 클래스 이용해 객체 생성: new 사용하지 않는다 => 추상클래스 / 인터페이스
 *            Class cls=Class.forName()
 *           
 */
abstract class Button
{
	public abstract void click(); //선언
}
class Login extends Button
{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("버튼 클릭 후 로그인 요청...");
	}
	
}
class Join extends Button
{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("버튼 클릭 후 회원가입 요청...");
	}
}
class Calc extends Button
{

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("버튼 클릭 후 계산기 요청...");
	}
	
}
public class 추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn=new Login();
		//상위           하위
		//변수: 상위클래스 => 주소값이 없다 => 선언된 클래스
		//메소드: 하위클래스 => 주소값이 있다 => 생성자
		btn.click();
		
		btn=new Join();
		btn.click();
		
		btn=new Calc();
		btn.click();
		//관련된 클래스를 여러 개 모아서 한 개의 객체명으로 처리
		//가급적이면 배열처리 하지 않음
		//추상 / 인터페이스 사용
		//=> 결합성이 낮은 프로그램 구현

	}

}
