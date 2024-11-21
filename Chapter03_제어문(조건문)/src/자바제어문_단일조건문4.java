/*
 *   *********윤년(달력/일정표)
 *   -------------
 *    조건
 *    1. 4년마다
 *    2. 100년마다 제외
 *    3. 400년마다 윤년
 *    
 *    year%4==0
 *    year%100!=0
 *    year%400==0
 *    => (year%4==0 && year%100!=0)||(year%400==0)
 */
// 연도 입력 받아서 윤년여부 확인
import java.util.Scanner;
public class 자바제어문_단일조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 입력:");
		int year=scan.nextInt();
		
		//결과 출력
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.println(year+"는(은) 윤년");
		}
		//else
		if(!((year%4==0 && year%100!=0)||(year%400==0)))
		{
			System.out.println(year+"는(은) 윤년이 아님");
		}
	}

}
