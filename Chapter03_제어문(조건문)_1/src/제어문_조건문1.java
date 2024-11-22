/*
 *   자바에서 지원하는 제어문
 *   = 조건문***: 요청에 맞는 문장만 실행 => 건너뛰는 경우도 있음
 *             => 오류 방지
 *             - if로 처리가 어려운 과정 => 예외처리(교재8장) 
 *             => 사전에 방지 => if => 이런 경우
 *     - 단일조건문
 *          형식: if(조건문 => true/false)
 *                   | 부정연산자(!), 비교연산자, 논리연산자
 *               {
 *                  조건문이 true일 경우에만 처리하는 문장
 *               }
 *               false일 경우 건너뛰기	
 *               => 독립적으로 실행 => if문을 여러 개 사용하는 속도가 저하=> 모든 if의 조건을 검색하기 때문
 *          사용처: 아이디 중복체크, 검색, 상세보기, 예약내용
 *    교재55page
 *      중첩 if문
 *        if() => 아이디가 같고
 *        {
 *          if() => 비밀번호가 같다면
 *          {
 *          }
 *        }
 *        ==> if( && )   
 *     - 선택조건문: 나눠서 처리
 *                true => 처리
 *                false => 처리
 *          형식: if(조건문)
 *               {
 *                  조건이 true일 때
 *               }
 *               else
 *               {
 *                  조건이 false일 때
 *               }
 *          
 *          => 두 개가 나눠지는 경우
 *             1) 로그인 => 로그인된 경우(main화면 이동) => if
 *                        로그인이 안 된 경우(back, 회원가입창 이동) => else
 *             2) 찜하기/좋아요 => if~else
 *             3) 대문자/소문자, 3의 배수 등
 *     - 다중조건문
 *   = 선택문 (게임, 네트워크)
 *   = 반복문***
 *     do~while: 무조건 한 번 이상 수행
 *     while: 반복 횟수가 없는 경우(데이터베이스, 파일 읽기)
 *     ***for: 횟수 지정 (코딩테스트, 정보처리실기) 
 *   = 반복제어문
 *     break: 반복을 종료
 *     continue: 특정부분을 제외하고 다시 반복 시작
 *     
 *     
 *     1. 중첩 조건문
 *        컴퓨터와 사용자의 가위, 바위, 보 게임
 *        가위(0), 바위(1), 보(2)
 *        경우의 수 if
 *          컴퓨터 가위 => 사용자 가위, 바위, 보
 *          컴퓨터 바위 => 사용자 가위, 바위, 보
 *          컴퓨터 보 => 사용자 가위, 바위, 보
 *          ==> 9가지
 */
//사용자 입력을 받는다
import java.util.Scanner;//이미 만들어져있는 클래스(라이브러리=> 현재 Scanner)를 읽어오는 경우
// 클래스를 가져올 때 => import
// 클래스 전체 가져오기 => *
public class 제어문_조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2):");
		int player=scan.nextInt();
		
		int com=(int)(Math.random()*3);//0, 1, 2
		
		// 1. 출력
		System.out.print("컴퓨터:");

		if(com==0)
			System.out.println("가위");
		if(com==1)
			System.out.println("바위");
		if(com==2)
			System.out.println("보");
		
		System.out.print("Player:");
		if(player==0)
			System.out.println("가위");
		if(player==1)
			System.out.println("바위");
		if(player==2)
			System.out.println("보");
		
		System.out.println("====결과====");
		//if(com==0)//컴퓨터가 가위를 낸 경우
		//{
			if(player==0 && com==0)//가위
				System.out.println("비겼다");
			if(player==1 && com==0)//바위
				System.out.println("Player win");
			if(player==2 && com==0)//보
				System.out.println("Com win");
		//}
		//if(com==1)//컴퓨터가 바위를 낸 경우
		//{
			if(player==0 && com==1)//가위
				System.out.println("Com win");
			if(player==1 && com==1)//바위
				System.out.println("비겼다");
			if(player==2 && com==1)//보
				System.out.println("Player win");
		//}
		//if(com==2)//컴퓨터가 보를 낸 경우
		//{
			if(player==0 && com==2)//가위
				System.out.println("Player win");
			if(player==1 && com==2)//바위
				System.out.println("Com win");
			if(player==2 && com==2)//보
				System.out.println("비겼다");
		//}
		
	}

}
