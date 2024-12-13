package com.sist.main;
/*  교재221~231page
 *   1. 상속: is-a => 동물 ani=new 개() : 개는 동물이다
 *   2. 포함: has-a: 클래스 안에 클래스 포함
 *   ==> 객체 전체가 4byte를 가지고 있다
 *   => ** 형변환
 *      - 자동 형변환(묵시적 형변환)
 *        : 상위클래스 객체=new 하위클래스생성자()
 *        == double d=10 => 10.0
 *      - 강제 형변환
 *        : 하위클래스 객체=(하위클래스)new 상위클래스()
 *        == int a=(int)10.5
 *      ==> 라이브러리는 클래스를 리턴할 경우 => Object / 매개변수가 Object => Collection은 거의 Object
 *        
 */
import java.util.*;
class Sawon
{
	String name;
	String dept;
	String loc;
	
	public void display() {
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
		System.out.println("근무지:"+loc);
	}
}
public class 재사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>();//Object 클래스를 모두 Sawon 클래스에 넣음
		Sawon s1=new Sawon();
		s1.name="홍길동";
		s1.dept="개발부";
		s1.loc="서울";
		list.add(s1);
		//Sawon s=(Sawon)list.get(0);//Object 클래스 받아오기 위한 강제 형변환
		Sawon s=list.get(0);//Object => Sawon으로 가져와서 강제 형변환 안 해도 됨
		s.display();

	}

}

