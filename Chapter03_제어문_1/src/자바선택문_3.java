//입력 => 사칙연산
import java.util.Scanner;
public class 자바선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		// 지역변수(stack) => 메모리 , new 생성(heap) => 개발용
		// 메소드: 메소드Area...(static)
		System.out.print("첫 번째 정수 입력:");
		int num1=scan.nextInt();
		//키보드 이용해 정수 값 받기
		System.out.print("두 번째 정수 입력:");
		int num2=scan.nextInt();
		
		// 정수: nextInt(), 실수: nextDouble()
		// 문자열: next() => 문자 한 개를 자르는 경우: charAt()
		// 한 개의 기능을 가지고 있는 것: 메소드()
		
		System.out.print("연산자 입력(+, -, *, /):");
		
		switch(scan.next())// 문자열 받음
		{
		  case "+": //""=> String
			  System.out.println(num1+"+"+num2+"="+(num1+num2));
			  break;
		  case "-": 
			  System.out.println(num1+"-"+num2+"="+(num1-num2));
			  break;
		  case "*": 
			  System.out.println(num1+"*"+num2+"="+(num1*num2));
			  break;
		  case "/":
			  if(num2==0)
				  System.out.println("0으로 나눌 수 없습니다");
			  else
				  System.out.println(num1+"/"+num2+"="+(num1/num2));
			  break;
			  /* => 중첩 switch case
			   *  switch(num2)
			   *  {
			   *    case 0:
			   *      System.out.println("0으로 나눌 수 없습니다");
			   *      break;
			   *    default:
			   *      System.out.println(num1+"/"+num2+"="+(num1/num2));
			   *  }
			   */
			  default:
				  System.out.println("잘못된 연산자 입력입니다");
		}
		// 다중 조건문과 유사 => 선택문
		/*
		 *   if(조건문)
		 *   {
		 *     if(){
		 *     }
		 *     else{
		 *     }
		 *   }
		 *   
		 *   if(조건문)
		 *   {
		 *     switch()
		 *     {
		 *     }
		 *   }
		 */
		// 제어문은 한 개만 사용하는 것이 아니라 여러 개의 다른 제어문 사용 가능
		/*
		 *   if => 주로 단독 사용
		 *   for => if를 주로 사용: 반복문
		 */

	}

}
