package com.sist.main;
/*
 *   교재335page~
 *   자바 컬렉션
 *   
 *   1. 프로그램 => 데이터관리(효율적)
 *                ------------
 *                1) 스프링/JSP(MVC) => 데이터관리
 *                  => 데이터베이스(오라클,MySql)
 *                2) VueJS/React/Next/Node
 *                  => 상태관리(데이터 변경시마다)
 *                  
 *   2. 데이터베이스: 데이터를 저장하는 공간
 *      ---------
 *      1) 변수/상수: 데이터 한 개 저장 후 관리 => 데이터가 많으면 관리가 어렵다
 *      2) 배열 => 고정적: 데이터가 증가하면 다른 배열을 생성해야 한다
 *      3) ***가변형: 데이터가 증가하면 자동으로 메모리 공간 확장
 *        => 컬렉션
 *     -----------------------------------------------메모리 공간 => 데이터가 사라진다
 *      4) 파일 => 종속적: 다른 파일 연결이 어려움
 *      5) ***RDBMS => 오라클(관계형 데이터베이스 => 연결성)
 *     -----------------------------------------------
 *     => 웹에서 가장 많이 사용되는 클래스: ArrayList/String/Integer
 *     => ArrayList: 데이터를 메모리에 저장 후 브라우저로 전송
 *     => 웹 대부분은 Map형식
 *        request / response / session / cookie
 *        사용자 요청   응답       서버 저장   브라우저 저장
 *        
 *   3. Collection
 *     1) 개요
 *        : 배열의 단점 보완한 클래스
 *        : 데이터를 효율적으로 저장하고 관리하기 위한 라이브러리
 *        : 표준화되어 있다(모든 개발자가 같은 메소드를 사용한다)
 *        => 개발이 쉽다
 *        => 프레임워크 => 개발 형식 통일 => 분석이 쉽다 => 가독성이 좋다
 *           -------Spring / React / JQuery / Vue / ...
 *           -------장바구니, 예약, ...
 *        : 저장은 Object만 가능하다 => 객체만 저장
 *               -------최상위 데이터형 => 형변환 중요
 *               
 *     2) 종류
 *                          Iterable
 *             --------------------------------
 *             |                  |           |
 *             List              Set         Map => interface
 *             |                  |           |
 *             ArrayList        HashSet    HashMap
 *             VectorLinkedList TreeSet    HashTable
 *                                            |
 *                                        Properties
 *                                            |
 *                                           XML
 *         - *** List: 순서가 존재 ( 자동으로 인덱스 설정)
 *         - 데이터 중복 허용
 *         - 비동기적인 방식
 *           => 데이터베이스(오라클)
 *           => 접근 속도가 빠르다
 *         - 단점: 데이터가 많은 경우 추가 / 삭제 => 속도가 늦다
 *               => 인덱스 번호 조절
 *               => 추가시에 마지막에 추가하길 권장
 *               
 *             => Vector => 보완(ArrayList)
 *               => 동기적 => 네트워크 사용자 정보
 *             => LinkedList
 *               => 데이터 접근 속도가 늦다
 *               => 추가, 삭제가 빠르다
 *               => 게시판
 *         ================================================List 인터페이스 구현(메소드 동일)
 *         *** List list=newArraylist(): 데이터 베이스 연동
 *             list=new list()
 *         
 *     3) 제네릭스(338page)
 *     4) 활용 => 크롤링 / 중복 제거 / ArrayList - LinkedList
 *                               -----------------------
 *                               1) 교집합 2) 차집합 3) 합집합
 *                                                  => 중복 제거
 *                              : Intersect : Minus : Union
 *                              => 자바 메소드로 구성
 *                  ArrayList - LinkedList
 * 데이터접근 속도      빠름           느림       
 * 데이터(추가, 삭제)   느림           빠름
 * 메모리 사용         효율적         비효율적
 * 메모리 구조         배열 기반       연결리스트 기반
 *             ArrayList의 주요 메소드 (교재341page~)
 *             1) 데이터 추가
 *                ** add(Object obj) => 마지막 추가
 *                add(int index,Object obj) => 원하는 인덱스에 차기
 *             2) 저장된 개수: int size()
 *             3) 데이터 추출: Object get(int index)
 *             4) 데이터 삭제: remove(int idex)
 *             5) 데이터 수정: set(int index,Object obj)
 *               ==> CRUD: 자료 구조(효율적으로 사용)
 *               ==> import 사용
 *                   java.util.ArrayList
 *               ==> List: 구현한 클래스 변경이 쉽게 인터페이스를 이용
 *                   ----MyBatis, JPA
 *               ==> 형변환 필요 ==> 원하는 데이터형으로 변경
 *                 ==> 데이터형을 Object가 아닌 데이터형으로 통일
 *                 ==> 제네릭스: 338page~
 *                    
 */
//ArrayList 사용법
import java.util.*;
public class 컬렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		//경고 => 제네릭스 사용해야 함(<>) => 모든 리턴형과 매개변수가 Object
		//추가
		list.add("홍길동");//0
		list.add("심청이");//1
		list.add("강감찬");//2
		list.add("박문수");//3
		list.add("춘향이");//4
		
		System.out.println("현재 등록된 인원:"+list.size());
		//출력 => size() => get()
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);//형변환
			System.out.println(i+"."+name);
		}
		System.out.println("======원하는 위치에 데이터 추가======");
		list.add(2,"이순신");//2번 위치에 이순신 넣기
		System.out.println("현재 등록된 인원:"+list.size());
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);//형변환
			System.out.println(i+"."+name);
		}
		System.out.println("=======삭제=======");
		list.remove(3);//3번 삭제
		// => 추가 / 삭제시에 자동으로 인덱스 번호 변경됨
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);//형변환
			System.out.println(i+"."+name);
		}
		//인덱스 번호는 자동 처리
		//=> 오라클은 자동 처리 불가(출력)
		System.out.println("=========수정==========");
		list.set(2, "심청이 수정");
		for(int i=0;i<list.size();i++)
		{
			String name=(String)list.get(i);//형변환
			System.out.println(i+"."+name);
		}
		System.out.println("==========전체 삭제=============");
		list.clear();
		System.out.println("현재 등록된 인원:"+list.size());
		
		System.out.println("=========데이터 존재 여부=========");
		if(list.isEmpty())//isEmpty => 장바구니 활용
		{
			System.out.println("저장 공간이 비어있다");
		}
		else
		{
			System.out.println("저장 공간에 데이터가 존재한다");
		}
		/*
		 *   메소드
		 *   1) 데이터 추가: add()
		 *   2) 데이터 개수 가져오기: size()
		 *   3) 데이터 읽기: get(int index)
		 *   4) 데이터 존재 여부: isEmpty()
		 *   5) 데이터 수정: set(int index, 데이터)
		 *   6) 데이터 삭제: remove(int index)
		 *   7) 데이터 전체 삭제: clear()
		 */
		
		
		
		

	}

}
