/*
 *   1. 변수: 한 개만 저장하는 공간, 변경 가능
 *        => 1. 메모리 저장, 2. 값 읽기, 3. 수정 가능
 *     1) 지역변수
 *     2) 멤버변수
 *     3) 공유변수
 *    => 변수 저장에 필요한 내용
 *     : 메모리 크기 결정 / 클래스(JVM에서 크기를 모른다)
 *       기본형                ----------------- => new
 *       정수: byte(1byte), int(4byte), long(8byte)
 *       실수: ***double(8byte)
 *       논리: ***boolean(1byte)
 *       문자: char(2byte)
 *       --------------------
 *       참조형: 배열/클래스(***String,Integer,ArrayList)
 *          오라클: Connection / Statement / ResultSet
 *      *** 변경이 되는 값: 누적 / 루프 
 *                   *** 가독성: i/j => a/b, m/n으로 쓰기(비슷하게 생겨 알아보기 어려움)
 *     
 *     메모리 저장
 *     - MethodArea: Method / static(공유변수)
 *     - Stack: 메모리 자체에서 관리 => 지역변수
 *              {}이 종료된 경우 사라짐
 *     - Heap: 실제 데이터 공간: 클래스/배열
 *             자동으로 해제되지 않음 => 개발자 처리
 *           : new / delete => 가비지 컬렉션
 *                             자동 메모리 회수
 *            => 메모리 저장 => 확인(int malloc()) => new
 *                        => 해제(free()) => delete
 *    -----------------------------------------------
 *    
 *    사용자 요청에 따른 데이터 처리
 *    1) 연산자
 *       단항연산자(++,--,!,(type))
 *       이항연산자(+,-,*,/,% ==> == != < > <= >= ==> && || = += -=)
 *             1. 모든 연산자는 같은 데이터형만 연산이 가능
 *       삼항연산자(?:)
 *    2) 제어문
 *    if, if~else
 *    for, while, break
 *    -------- 묶어서 처리 => 메소드
 *    1. 입력 2. 처리 3. 출력 => 세분화
 */
import java.util.Scanner;
public class 자바1_3_정리 {

	// 멤버변수 => 자동 초기화 int a; => a=0
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 => 초기화가 안 된다 => int a;
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		System.out.print("월 입력:");
		int month=scan.nextInt();
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		System.out.println(year+"년도 "+month+"월 "+day+"일");	
		
		/*
		 *
		 */
		

	}

}
