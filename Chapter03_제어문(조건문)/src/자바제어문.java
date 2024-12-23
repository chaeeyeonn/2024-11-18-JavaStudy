/*
 *   자바에서 지원하는 제어문
 *     => 프로그램의 흐름 변경(흐름 제어)
 *        1) 필요시 건너뛰는 프로그램을 만들 수 있다: 조건문
 *        2) 반복 수행: 반복문
 *        3) 중간에 정지: 반복제어문 => ESC
 *   조건문
 *     - 단일 조건문
 *       ex) 마우스 클릭, 버튼 클릭, 상세 보기 등
 *     - 선택 조건문: true/false를 나눠 처리
 *     - 다중 조건문
 *       ex) 메뉴 선택
 *   선택문
 *     - switch~case: 값을 1개만 선택해서 처리
 *     - 게임: 키값에 따라 처리
 *   반복문
 *     - while
 *     - do~while
 *     - for
 *   반복제어문
 *     - break
 *     - 특정 부분을 제외: continue
 *     
 *     
 *   1. 조건문 (54page)
 *   *** 자바의 모든 제어문은 바로 밑에 있는 문장 1개만 수행한다
 *       여러 개 동시 제어시 {}이용
 *       if(조건문)
 *       문장1 => if에서 제어
 *       =======
 *       문장2
 *       문장3
 *       ======> 별도의 문장
 *       
 *       if(조건문)
 *       {
 *         문장1
 *         문장2
 *         문장3
 *       } => 세 문장을 동시에 제어
 *     - 형식
 *       if(조건문) => 조건이 false면 건너뛴다
 *          가능 연산자: 부정연산자, 비교연산자, 논리연산자 => 결과값이 true/false만 나옴
 *       {
 *         실행문장 ==> 조건이 true일 때만 수행
 *       }
 *        단점: 여러 개 사용시에 모든 if문의 조건을 확인 => 속도가 늦다
 */   
public class 자바제어문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score=58;
		if(score>=60)
			System.out.println("합격");//false일 경우 수행하지 않음
		System.out.println("프로그램 종료");// 실행 문장(if문과 관련없음) => 같이 수행하고 싶으면 {}

	}

}
