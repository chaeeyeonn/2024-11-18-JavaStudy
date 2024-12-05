
import java.util.Calendar;
import java.util.Scanner;
public class 메소드_3 {
	// # 입력받은 값이 윤년인가 확인
	/*
	 *   4년마다,
	 *   100년 제외,
	 *   400년 마다
	 */

	static boolean isYear(int year)
	{
		boolean bCheck=false;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			bCheck=true;
		}
		return bCheck;
	}
	
	//10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
	static void maxPrint(int a,int b)
	{
		System.out.println("큰 값:"+Math.max(a, b));//라이브러리 이용 => 3개면 어려움
//		System.out.println(a>b?a:b);//삼항연산자  => ?라면 true값:false값 => 3개면 어려움 ==> if문 사용
	}
	
	//11. 입력 받은 값이 짝수인지 홀수인지 판별하는 메소드를 구현하시오
	static void print(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+"는(은) 짝수");
		}
		else
		{
			System.out.println(a+"는(은) 홀수");
		}
	}
		
    //13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
	static char weekData(int year,int month,int day)
	{
		char[] strWeek= {'일','월','화','수','목','금','토'};
//		//1. 1년도 1월 1일 ~ 전년도까지의 총 일 수
//		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
//		//2. 전 달까지의 총 일 수
//		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
//		if(isYear(year))
//		{
//			lastday[1]=29;
//		}
//		else
//		{
//			lastday[1]=28;
//		}
//		for(int i=0;i<month-1;i++)
//		{
//			total+=lastday[i];
//		}
//		//3. 입력된 일자
//		total+=day;
//		//4. 전체 총합%7
//		int week=total%7;
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);//month => 0~
		cal.set(Calendar.DATE, day);
		int week=cal.get(Calendar.DAY_OF_WEEK);
		// week=> 1~7
		return strWeek[week-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		System.out.print("년도 입력:");
//		int year=scan.nextInt();
//		
//		boolean bCheck=isYear(year);
//		if(bCheck==true)
//			System.out.println(year+"는(은) 윤년입니다");
//		else
//			System.out.println(year+"는(은) 윤년이 아닙니다");
//		
//		System.out.print("두 개 정수 입력(10 20):");//공백 통해 두 개 받을 수 있음
//		int a=scan.nextInt();
//		int b=scan.nextInt();
//		maxPrint(a,b);
//		
		//print(a)
		System.out.print("년 월 일을 입력(2024 1 1):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		char c=weekData(year, month, day);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+c+"요일입니다");

	}

}
