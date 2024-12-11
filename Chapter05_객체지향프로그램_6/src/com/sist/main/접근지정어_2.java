package com.sist.main;
// 메소드 = public: 다른 클래스에서 기능 사용 위해
// => 특별한 경우가 아니면 인스턴스로 만들어진다
// => 특별한 경우: static
// 웹 => 모든 메소드 적용 => 한글 변환 : static
// Footer에 데이터 전송: static
/*
 *   다른 클래스에서 메소드 호출시
 *     1. 객체 생성
 *        : 클래스명 객체명=new 생성자();
 *          ------          -------
 *     2. 메소드 호출
 *        : 객체명.메소드()
 *               ------public으로 두기
 *     3. 멤버변수 => 정보 은닉
 *                 => 사용 가능하도록 읽기/쓰기 기능 만들기
 *                            getter/setter => ex) name => getName() / setName(String n)
 *                            ==> 데이터는 은닉화(private)하고 메소드를 이용하여 접근하는 방식
 *                                ==> 캡슐화 방식
 *                                    => 상속, 캡슐화(가장 많이 씀), 다형성(오버라이딩)
 *     4. 생성자 / 클래스 => public 주로 사용
 */
public class 접근지정어_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
