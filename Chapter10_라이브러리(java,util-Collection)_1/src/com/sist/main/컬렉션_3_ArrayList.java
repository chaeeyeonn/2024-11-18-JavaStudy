package com.sist.main;
//342page~
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor//매개변수가 있는 생성자 만듦
@NoArgsConstructor//default 생성자 생성
class Student
{
	private int hakbun;
	private String name;
	private int kor,eng,math;
}
public class 컬렉션_3_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();// 배열 고정 => 가변형으로 변경
		//추가시마다 자동으로 메모리가 늘어난다
		//데이터 추가
		list.add(new Student(1,"홍길동",90,80,70));
		list.add(new Student(2,"심청이",97,88,71));
		list.add(new Student(3,"박문수",95,87,73));
		list.add(new Student(4,"이순신",93,86,75));
		list.add(new Student(5,"강감찬",91,85,77));
		//= Student[] std=new Student[5] => 데이터 추가 불가능
		//사용자 정의 클래스를 저장할 수 있다
		System.out.println("학생 인원:"+list.size());
		for(Object std:list)
		{
			Student s=(Student)std;//형변환 필수
			String ss=String.format("%.2f", (s.getKor()+s.getEng()+s.getMath())/3.0);
			System.out.println(s.getHakbun()+" "+s.getName()+" "+s.getKor()+" "+s.getEng()+" "+s.getMath()+
					          " "+(s.getKor()+s.getEng()+s.getMath())+" "+ss);
		}
		

	}

}
