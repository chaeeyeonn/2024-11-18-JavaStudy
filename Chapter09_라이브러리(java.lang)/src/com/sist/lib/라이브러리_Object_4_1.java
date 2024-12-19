package com.sist.lib;
class Sawon2
{
	private int sabun;
	private String name;
	
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//초기화
	public Sawon2(int sabun,String n)
	{
		this.sabun=sabun;//this => 구분자
		name=n;
	}
	//오버라이딩
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Sawon2 s=(Sawon2)obj;//클래스 형변환
		return name.equals(s.name) && sabun==s.sabun;
		//     s1          s2          s1     s2
		
	}
	
	
}
public class 라이브러리_Object_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1=new Sawon2(1,"홍길동");
		Sawon2 s2=new Sawon2(1,"홍길동");
		
		if(s1.equals(s2))//주소값 비교 => 오버라이딩(재정의) 통한 equals로 멤버 변수값 비교 => String
		{
			System.out.println("같은 사원이다");
		}
		else
		{
			System.out.println("다른 사원이다");
		}

	}

}
