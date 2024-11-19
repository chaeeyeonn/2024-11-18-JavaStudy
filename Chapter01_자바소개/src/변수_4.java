/*
 *  교재26page
 *  문자열 결합
 *  ========
 *  문자열 => ""
 *  3+""+4 => 34
 *  3+"7"+7 => "377"
 *  =====
 *  "37"+7
 *  ======="377"
 *  7+7+"3"+7+7= "14377" => 문자열 우선x, 순차적 계산
 *  
 *  교재30page
 *  논리형: boolean
 *         => 반드시 true/false만 사용 가능(오직 소문자) <-> Python은 True라고 씀
 *         => 비교연산자
 *            boolean b=6<7 => true
 *            if(boolean)
 *         => 로그인 / 아이디중복체크 / 검색어 / 장바구니 / 댓글 등
 *  byte: 네트워크 전송 / 바이트, 파일 전송
 *  short: C언어 호환, 사용 빈도 별로 없음
 *  일반 정수: int / 일반 실수: double
 *  문자: 값 설정 '', 문자는 한 개만
 *       => Java는 2byte이기에 한글 한 글자 가능
 *  실수: double => 데이터형 중에 가장 큰 데이터형(boolean 예외)
 *  
 *  // final => 상수
 *  
 *  교재37page
 *  값 교환
 *  
 *  int a=10;
 *  int b=20;
 *  
 *  a=b; a=20
 *  b=a; b=20
 *  =========
 *  
 *  int a=10;
 *  int b=20;
 *  
 *  int temp=a;
 *  a=b;
 *  b=temp
 */
public class 변수_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a=20;//변경 가능
		final int A=100;// 변경 불가능

	}

}
