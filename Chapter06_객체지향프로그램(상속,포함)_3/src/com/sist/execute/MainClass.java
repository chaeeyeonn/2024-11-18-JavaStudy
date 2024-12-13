package com.sist.execute;
import java.util.Scanner;
public class MainClass {
//    public MainClass()
//    {
//    	this.
//    }
	// class에 필요한 모든 메소드 이용 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A=1, B=2, C=3, D=4
		Scanner scan=new Scanner(System.in);
		System.out.println("A(1),B(2),C(3),D(4):");
		int select=scan.nextInt();
		I[] i= {null,new A(),new B(),new C(),new D()};
		// i=new A(), i=new B, ...
		// 상속이 없는 경우 배열을 만들 수 없음 => 같은 데이터형으로 모여
		i[select].execute();
		// 데이터 혼합= => Object: 모든 데이터형을 받을 수 있음
		// 모든 클래스는 Object 상속
//		if(select==1)
//		{
//			A a=new A();
//			a.execute();
//		}
//		else if(select==2)
//		{
//			B b=new B();
//			b.execute();
//		}
//		else if(select==3)
//		{
//			C c=new C();
//			c.execute();
//		}
//		else if(select==4)
//		{
//			D d=new D();
//			d.execute();
//		}

	}

}
