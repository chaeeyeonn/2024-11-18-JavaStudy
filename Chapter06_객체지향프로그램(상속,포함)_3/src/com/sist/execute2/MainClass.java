package com.sist.execute2;
class Sub
{

	@Override //=> 재정의
	public String toString() {
	System.out.println("Sub...");
	return "";
	}
	//이미 Object의 모든 메소드 사용 가능 => Object obj=new Sub()
//	int a=10;
//	public void display()
//	{
//		System.out.println("Sub...");
//	}
	//해당 메소드를 Object는 가지고 있지 않아 코딩 불가 => 재정의 필요
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new Sub();
		//한 개로 묶어서 관리
		/*
		 *   상위클래스는 하위 클래스의 추가된 메소드, 변수에 접근 불가
		 */

	}

}
