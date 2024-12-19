package com.sist.lib;
/*
 *   finalize() => 소멸자 함수 => 객체가 메모리에서 해제 => 자동 호출
 *   
 */
class Sawon // extends Object
{
	private int sabun;
	private String name;
	
	public Sawon()
	{
		sabun=1;
		name="홍길동";
		System.out.println("객체 생성 = 초기값 완료");
	}
	public void print()
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("사원 객체 소멸:Heap에서 사라진다");
	}
	//소멸 여부 확인
}
public class 라이브러리_Object_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체 생명 주기
		Sawon sa=new Sawon();//객체 생성
		sa.print();//활용
		sa=null;//메모리 회수 => 프로그램 꺼야 회수됨
		//직접 해제
		System.gc();// 가비지 컬렉션 호출 => null, 사용하지 않는 데이터 소멸
		
//		Object o=10;// => AutoBox => 일반 데이터형과 동일 취급
//		int i=(int)o;//형변환 => UnBox
		//위와 같은 경우 => Object / String / Wrapper
		

	}

}
