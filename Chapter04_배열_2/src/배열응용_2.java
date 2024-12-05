// => 달력
/*
 *   1. 사용자 정의
 *      # 달력: 1일자의 요일 확인
 *      => 1년도 1월 1일 확인 => 월요일
 *      1) 1/1/1 ~ 2023/12/31 => 총 일수 계산
 *      2) 2024/11/30 => 총 일수 계산
 *      3) -------------------------------+1 => 12/1일자 계산
 *      4) 1)+2)+3)/7 ==> 요일 계산
 *      0일: 일요일 , 6일: 토요일
 *      ==> 예약, 일정관리 시스템
 *      
 *   2. 라이브러리 이용(Calendar)
 */
import java.util.Scanner;
public class 배열응용_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 입력 받기 => year/month/day => 요일 알기
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
//		System.out.print("일 입력:");
//		int day=scan.nextInt();
		
		//전년도까지의 일 수 구하기
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;//윤년처리
		//전달까지의 일 수
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
		//모든 언어에서 사용되는 윤년 계산
		if((year%4==0 && year%100!=0)||(year%400==0))//윤년조건
			lastday[1]=29;
		else
			lastday[1]=28;
		for(int i=0;i<month-1;i++)//전 달까지라서 month-1
		{
			total+=lastday[i];
		}
		//입력 날 +
		//total+=day;
		total++;//각 월의 1일 구하기
		//요일 구하기
		//(switch~case대신 사용)
		char[] strWeek= {'일','월','화','수','목','금','토'};
		int week=total%7;
		
		System.out.println(year+"년도 "+month+"월 ");//+"1일 "+strWeek[week]+"요일입니다");
		System.out.println();
		for(char c:strWeek)
		{
			System.out.print(c+"\t");
		}
		//달력 윗부분 완성
		System.out.println();
		for(int i=1;i<lastday[month-1];i++)
		{
			if(i==1)//for문 시작
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");//HTML 변경
				}
			}
			System.out.printf("%2d\t",i);
			//1일과 요일 맞춤
			week++;// 요일 변경
			if(week>6)//일요일이라면 
				{
				week=0;
				System.out.println();//다음 줄로 출력
				}
			
		}

	}
}


