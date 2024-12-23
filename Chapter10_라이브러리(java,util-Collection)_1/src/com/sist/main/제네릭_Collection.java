package com.sist.main;
/*
 *   제네릭
 *   1. 목적
 *   1) 데이터형을 변경해서 사용을 쉽게 만든다
 *     => 리턴형 / 매개변수 => Object => 원하는 데이터형으로 변경
 *   2) 한 번에 데이터형 통일 가능
 *   3) 형변환없이 사용 가능 => 소스 간결 / 가독성이 좋다
 *   4) Object 단점
 *     => 데이터 읽기가 어렵다
 *     ArrayList list=new ArrayList();
 *     list.add(1);
 *     list.add(10.5);
 *     list.add('A');
 *     list.add("AAA");
 *     list.add(new A());
 *     list.add(2);
 *     list.add(new B());
 *     => if문, for문 쓰기가 힘듦 => 특정 패턴(데이터 통일성)이 없음
 *       => 데이터형을 한 개로 통일 => 제네릭 등장
 *       => 배열과 동일시
 *     => 사용자 정의가 없다 => 표준화
 *     => 사용법 <클래스형>
 *             <int> (x) => <Integer>, <Double>, ... => Wrapper 클래스
 *     => 임시 데이터형: T / E / K / V
 *       => T / E: 클래스
 *        type/element
 *       => K / V: Map
 *        key/value
 *   
 *   => 객체의 데이터형 안정성 => 제어문 사용 편리
 *   => 형변환을 하지 않기 때문에 소스가 간결
 *   => 명시적으로 코딩 => 유지보수시 어떤 데이터가 첨부되었는지 확인 가능
 *     - 사용법
 *     => ArrayList<String>
 *        ArrayList<Integer>
 *        ArrayList<Sawon>
 *        ...
 */
class Box<T>//=>T를 모두 String으로 바꾸어라 => 원래는 Object
{
	T t;//String t
	public void setT(T t)//String t
	{
		this.t=t;
	}
	public T get()//String
	{
		return t;
	}
}
public class 제네릭_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> b=new Box<String>();
		b.setT("Hello");
		String s=b.get();

	}

}
