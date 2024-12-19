package com.sist.main;
/*
 * 교재 295~
 * 자바에서 지원하는 라이브러리
 *              --------
 *              프로그램에 필요한 클래스를 모아서 개발시에 사용 가능한 클래스 활용
 * => 라이브러리 중심 => 조립
 * (Scanner / System / String / ...)
 * 
 * 라이브러리
 * 1. 자바 지원
 *    java.lang
 *      **Object
 *      System
 *      **String
 *      StringBuffer
 *      Math
 *      **Wrapper: **Integer / **Double / **Boolean / Byte / Float / **Long / ...
 *    java.util
 *      Scanner
 *      Date / Calendar
 *      Collection: 배열 대체
 *      -----------
 *      List / Set / Map
 *      ----------------interface
 *      List: ArrayList, Vector, LinkedList => Queue, Stack
 *      Set: TreeSet / ***HashSet
 *      Map: ***HashMap / HashTable
 *    java.io
 *      FileReader / FileWriter
 *      InputStream / OutputStream
 *      BufferedReader / BufferedWriter
 *      BufferedInputStream / BufferedOutputStream
 *      => 입출력: 파일 / 메모리 / 네트워크
 *      => ~Stream, Reader/Writer
 *         -------  -------------
 *         1byte    2byte(한글포함)
 *         |네트워크, 파일업로드/다운로드
 *      => File
 *    java.sql
 *      Connection
 *      Statement
 *      ResultSet
 *    java.net
 *      URL / SercerSocket / Socket
 *    java.text
 *      DecimalFormat / SimpleDateFormat / MessageFormat
 *    java.lang.reflect
 *      => 리플렉션 => 메소드 / 클래스 / 변수 / 생성자
 *    **** Annotation, 열거형
 *    ==> J2SE
 *    ----------------------학습하기
 *    웹 라이브러리: JSP / Servlet / Spring => 2차 자바
 *    ==> J2EE
 *    ----------------------------------------------
 *    => javax.http
 *    => javax.servlet.http
 *    => org.springframework
 * 2. 외부 업체 지원: Jsoup / lombok / Spring / ...
 *    => mvnrepository.com 참조
 *    => simlpe-json / bson ...
 * 3. 사용자 정의: 잘 만들어진 클래스 / 자주 쓰는 클래스 => .jar
 *   
 */
/*
 *   교재 9장
 *     java.lang 패키지
 *       1) import 생략 가능 => 자동 추가
 *          => 가장 많이 사용되는 라이브러리(System, String)
 *       2) 대표 클래스
 *          - Object: 모든 클래스의 상위 클래스
 *                  => 모든 클래스는 Object 상속을 받는다
 *            public class A extends Object
 *                           --------------생략 가능
 *                  : 명시적 / 묵시적
 *                  => A a=new
 *                  => System.out.println(a.toString())
 *                  => System.out.pringln(a)
 *                  => 자주 사용 / 객체의 값이 정상적으로 처리 확인
 *                  => 객체를 문자열화 시킴
 *                => **clone(): 객체를 복제
 *                  => 객체 복사
 *                     얕은 복사: 같은 주소 이용
 *                     Call By Reference
 *                     깊은 복사: clone => 새로운 메모리에 저장
 *                     게임(아바타) => prototype
 *                  => finalize(): 소멸자 => 메모리 해제시에 자동 호출
 *                    -----------System.gc(): 바로 회수 / 프로그램 종료시 회수
 *                  => **equals() => 객체 비교 => 재정의(오버라이딩)
 *                  => hashCode() => 비교
 *                  
 *          
 */
class Student
{
	private String name;
	private String phone;
	private String address;
	//접근 가능 => 메소드
	public Student(String name,String phone,String address)
	{
		//지역변수 / 매개변수
		/*
		 *   1. 지역변수, 매개변수 찾기
		 *   2. 멤버변수
		 *   
		 *   ** 지역변수 우선 순위
		 */
		this.name=name;
		this.phone=phone;
		this.address=address;
	}
	public void print()
	{
		System.out.println("이름"+name);
		System.out.println("주소"+address);
		System.out.println("전화"+phone);
	}
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동", "010-1111-1111", "서울");
		Student s2=new Student("심청이", "010-2222-2222", "경기");
		
		s1.print();
		System.out.println(s1);//메모리 주소 확인 => 묵시적
		s2.print();
		System.out.println(s2.toString());//메모리 주소 확인 => 명시적

	}

}
