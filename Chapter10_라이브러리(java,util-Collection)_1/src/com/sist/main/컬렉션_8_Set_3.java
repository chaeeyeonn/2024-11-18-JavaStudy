package com.sist.main;
/*
 *   제네릭: Collection 전제 사용 가능
 *   List / Set / Map
 *   
 *   List<String> => ArrayList (Vector,LinkedList)
 *   Set<String> => HashSet(중복제거) / TreeSet(검색)
 *              => add() , addAll() , clear() , isEmpty() , size() , iterator()
 *   Map<String,String> => HashMap / HashTable
 *                         비동기     동기
 *                         속도       안정성=>Deadlock
 */
import java.util.*;
public class 컬렉션_8_Set_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set=new TreeSet<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)//중복 데이터 들어올 시 중복을 제거하니 10개가 아닐 수 있음
		{
			set.add(r.nextInt(101));//0~100 사이 난수
		}
		//출력
		for(int score:set)
		{
			System.out.print(score+" ");
		}
		
		System.out.println();
		System.out.println("=====60점 이하======");
		System.out.println(set.headSet(60));//머리가 60 => 60이하
		System.out.println("=====60점 이상======");
		System.out.println(set.tailSet(60));//꼬리가 60 => 60이상
	}

}
