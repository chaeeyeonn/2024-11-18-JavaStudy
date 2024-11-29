/*
 *   1. 데이터를 관리하기 쉽게 데이터 묶어서 사용
 *      -------------------------------
 *      1) 같은 데이터형을 모아서 관리 => 배열
 *      2) 다른 데이터를 모아서 관리 => 구조체 / 클래스
 *                                 |자바x   |자바o, 사용자 정의 데이터
 *                                 
 *   2. 관련된 명령문을 묶어서 사용 => 재사용
 *      ----------연산자, 제어문 => 메소드
 *   ================================+ 묶음(클래스)
 *     => 클래스: 객체지향의 특성(캡슐화, 상속, 다형성)
 *     => 클래스의 종류: 종단 클래스 / 추상 클래스 / 인터페이스 / 내부 클래스
 *     
 *   (교재84page)
 *     배열: 일차원 배열 / 이차원 배열 / 다차원 배열 / 가변 배열
 *          웹 => 일차원 배열
 *      | => Collection => 10장 (데이터를 모으는 웹 프로그램 핵심)
 *        => 웹에서 사용하는 자바
 *        
 *     배열(Array)
 *       1) 장점
 *          = 인텍스 기반 => 0번~끝번 순차적 => for문 쓰기 편리
 *           *** 데이터를 빠르게 접근
 *          = 연속적으로 메모리 저장 => 메모리 크기가 동일
 *           *** 메모리 관리 효율적
 *           *** CPU cache를 통해 배열에 있는 데이터 접근하는 시간 단축
 *       2) 단점
 *          = 고정된 크기(미리 사용전 크기를 정해야 함)
 *           *** 가변형 => ArrayList
 *          = 삽입(데이터 추가), 삭제 => 사용 불가
 *          = 추가/삭제 => 새로운 배열 만들어 사용해야 함
 *          
 *       ** 같은 유형의 변수를 여러 개 담는 고정된 크기의 데이터 구조
 *          ------------long(int,char...)
 *          ------------선언 시에 큰 데이터형을 선언 => 작은 데이터형을 첨부
 *          메모리 연속적으로 배치
 *          
 *  - 배열의 필요성
 *    # 학생 3명의 국어, 영어, 수학 점수를 입력 받아 총점, 평균, 학점 구하기
 *    
 *    
 */
import java.util.Scanner;
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int kor1,kor2,kor3;
		int eng1,eng2,eng3;
		int math1,math2,math3;
		int total1,total2,total3;
		double avg1,avg2,avg3;
		char score1,score2,score3;//학생 수만큼 변수를 넣어야 함
		
		System.out.print("첫 번째 학생의 국어 점수:");// 변수가 달라 for문을 돌릴 수 없음 
		kor1=scan.nextInt();
		System.out.print("첫 번째 학생의 영어 점수:");
		eng1=scan.nextInt();
		System.out.print("첫 번째 학생의 수학 점수:");
		math1=scan.nextInt();
        // + 나머지 두 명도 다 넣어야 함
		
		total1=kor1+eng1+math1;
		avg1=total1/3.0;
		//학점은 switch~case 만들기
		System.out.printf("%d %d %d %d %.2f\n",kor1,eng1,math1,total1,avg1);
		// + 나머지 두 명도 다 넣어야 함
		//==> 매우 귀찮고 힘든 과정이 됨 ==> 배열 사용 필요 ==> 한 개 변수명을 이용함 ==> 제어 편리
		// 배열 => 클래스 => 클래스 여러 개 => 인터페이스

	}

}
