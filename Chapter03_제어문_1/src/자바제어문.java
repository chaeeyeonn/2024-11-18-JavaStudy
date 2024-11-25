/*
 *  교재54page~83page
 *   자바에서 지원하는 제어문
 *   *** 변수 / 연산자 / 제어문 => 기본 요소
 *   *** 메소드 / 객체지향 프로그램
 *   *** 라이브러리 => 조립
 *   
 *   제어문 => 연산자가 응용
 *   ---- 배열
 *        --- 메소드
 *            ----- 클래스
 *   
 *   1. 제어문
 *      조건문 : 사용자 요청에 맞게 처리 => 필요에 따라 수행 혹은 건너뛰기
 *             ==================
 *             검색, 상세보기, 로그인, 아이디 중복 체크...
 *        1) 단일 조건문(54page): 독립문장으로 실행
 *             형식: if(조건문) => 부정연산자(!), 비교연산자(==,!=...), 논리연산자(&&,||) => 반드시 true, false
 *                  {
 *                    조건문 true일 때 실행하는 문장
 *                  }
 *             => 조건이 true면 실행, false면 건너뛴다
 *        2) 중첩 if문
 *             형식: if(조건문) => 조건이 모두 true일 때만 수행
 *                  {
 *                     if(조건문)
 *                     {
 *                        조건 true일 때 수행
 *                     }
 *                  }
 *                  ==> 변경가능(메뉴 조절 등 특별한 경우에만 사용): if(조건 && 조건)
 *                                                         {
 *                      
 *                                                         }
 *        3) 선택 조건문(56page): true/false를 나눠서 수행
 *           => 가장 많이 사용되는 if문
 *           => 웹: 모든 내용이 브러우저로 전송
 *                 =======true/false
 *                 아이디 중복체크/검색/에러발생
 *             형식: if(조건문)
 *                  {
 *                    true일 때 수행
 *                  }
 *                  else
 *                  {
 *                    false일 때 수행
 *                  }
 *        4) 다중 조건문: 메뉴 처리, 키보드 처리, 별점 처리
 *           *** 여러 개의 조건문을 사용하지만 한 개의 조건만 수행
 *             형식: if(조건문)
 *                  {
 *                   조건 true일 때 => 수행 후 종료
 *                   조건 false일 때 => 다음 조건문으로 이동
 *                  }
 *                  else if(조건문)
 *                  {
 *                   조건 true일 때 => 수행 후 종료
 *                   조건 false일 때 => 다음 조건문으로 이동
 *                  }
 *                  else if(조건문)
 *                  {
 *                  }
 *                  else
 *                  {
 *                   **생략 가능
 *                     조건이 모두 false가 되면 무조건 수행하는 문장
 *                  }
 *                 
 *                
 *        
 *      선택문
 *      반복문
 *      반목제어문
 */
// 다중조건문 예제
// 사용자로부터 정수 두 개, 연산자 한 개 입력(+, -, *, /)
//                                           -- 중쳡 조건문 => 나누기 값 0 여부 확인
// 프로그램은 비정상 종료가 없어야 함, 사전에 오류를 방지
// 웹 => 비정상 종료를 방지 => 에러가 발생 => 건너뛰기(다음 문장으로 이동)
// => 8장 예외처리
import java.util.Scanner;
public class 자바제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);//참조 연산자 => 객체 지향
		//자바에서 클래스를 저장할 때 => 반드시 new를 동적 메모리 할당(저장)
		// malloc(클래스의 크기) => 메모리를 만들어 준다
		// ------------------ 승격
		// free() => delete: 자바 => 자동 메모리 회수: '가비지컬렉션(GC)'
		System.out.println("첫 번째 정수 입력:");
		int num1=scan.nextInt();
		System.out.println("두 번째 정수 입력:");
		int num2=scan.nextInt();
		System.out.print("연산자 입력(+, -, *, /):");
		char op=scan.next().charAt(0);
		// 맨 처음 문자를 읽는 경우에 사용 => charAt() => 문자열은 0부터 시작
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		System.out.println("op:"+op);
		
		// 연산처리 => 4개 경우의 수 => 한 번만 실행 => 다중 조건문
		if(op=='+')
			System.out.println(num1+"+"+num2+"="+(num1+num2));
		    //종료
		else if(op=='-')
			System.out.println(num1+"-"+num2+"="+(num1-num2));
		else if(op=='*')
			System.out.println(num1+"*"+num2+"="+(num1*num2));//사칙연산 우선순위때문에 */에선 ()없어도 됨
		else if(op=='/')
		{
			//오류처리
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다");
			else
				System.out.printf("%d/%d=%.2f\n",num1,num2,(num1/(double)num2));//소수점 아래 두 자리까지=> num2값을 실수값으로 바꿈 => double
		}
		else
			System.out.println("사용하지 않는 연산자를 입력하셨습니다");

	}

}
