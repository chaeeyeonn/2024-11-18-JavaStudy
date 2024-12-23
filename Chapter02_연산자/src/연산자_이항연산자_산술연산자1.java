/*
 *  산술연산자 => 프로그램에서 가장 많이 사용하는 연산자
 *  =======
 *  +: 덧셈, 문자열 결합 => ***데이터형이 다른 경우 연산 처리는 큰데이터형으로 변경
 *  2 + 10 = 12
 *  2 + "10" => 210
 *  'A' + 10 => 65 + 10 => 75
 *  *** char는 연산처리가 되면 무조건 int 변경
 *  *** int이하 데이터형이 연산되면 int의 결과값이 나온다
 *      => 산술규칙
 *      byte b1=10;
 *      byte b2=20;
 *      b1+b2 => int(byte범위를 벗어나지 않아도 변수값이 어떻게 바뀔지 모르니 int값으로 자동 바뀌게 됨)
 *  "10" + 2 => 102 => 계산기 처음 숫자 입력할 때 문자열 결합하는 것
 *  
 *  -: 뺄셈
 *  long - int => long
 *  int- int => int
 *  char - char => int
 *  byte - byte - char => int
 *  
 *  *: 곱셈
 *  double * int => double
 *  char * char => int
 *  
 *  /: 나눗셈
 *    1) 0으로 나누면 오류 발생
 *    2) 정수/정수=정수
 *       =========== 오라클: 정수/정수=실수
 *                   자바스크립트: 정수/정수=실수
 *                   파이썬: 정수/정수=실수
 *                       : 정수//정수=정수
 *  
 *  %: 나머지 => 화폐 매수 구하기, 자리수 자르기, 윤년 계산
 *  5%2 => 1
 *   : 부호 존재(-,+) => 왼쪽 부호 따라감
 *  -5*-2 => 10
 *  -5/-2 => 2
 *  
 *  -5%-2 => -1
 *  -5%2 => -1
 *  5%-2 => 1
 */
public class 연산자_이항연산자_산술연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(-5%-2);

	}

}
