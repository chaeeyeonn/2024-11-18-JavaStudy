package com.sist.main;

import lombok.Data;

/*
 *   교재345page~
 *   Set => 순서가 없다 / 중복 허용 x(오라클) <=> List: 웹, 중복 허용
 *       : List에서 중복 제거
 *       => 장바구니 / 장르 / 회원명 / ...
 *       => 오라클: DISTINCT => 명령어로 중복 제거 가능
 *       
 *   HashSet / TreeSet
 *   저장용      검색용
 *   |웹 채팅  
 *   
 *   주요 메소드
 *   : add() => 객체 추가(데이터 추가)
 *   : remove() => 삭제 => remove(Object ob)
 *   : isEmpty() => 데이터 저장 여부
 *   : size() => 데이터 저장 개수
 *   : iterator() => 순차적으로 데이터 읽을 경우
 *   : clear() => 모든 데이터 지울 경우
 *   
 *   List에서 중복된 데이터를 제거
 *   
 *   일반 데이터 => 중복 제거
 *   객체 => 데이터값이 같은 경우에는 데이터를 제거하지 못한다
 *   Sawon s1=new Sawon(1,"a","a");
 *   Sawon s2=new Sawon(1,"a","a");
 *   hashcode() / equals()를 재정의
 */
@Data
//hashcode, equals => 오버라이딩
class Sawon2
{
	private int sabun;
	private String name;
	private String dept;
	
	public Sawon2(int sabun, String name,String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.dept=dept;
		//지역변수, 매개번수 우선 순위
		//this.는 생략 가능 => 구분자 역할(멤버변수==지역변수)
	}
}
public class 컬렉션_6_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon2 s1=new Sawon2(1, "홍길동", "개발부");
		Sawon2 s2=new Sawon2(1, "홍길동", "개발부");
		
		System.out.println("s1="+s1.hashCode());
		System.out.println("s2="+s2.hashCode());

		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		
		if(s1.equals(s2))
		{
			System.out.println("같은 사람");
		}
		else
		{
			System.out.println("다른 사람");
		}

	}

}
