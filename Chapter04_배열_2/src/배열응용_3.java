// # 요일 맞추기(라이브러리 이용)
import java.util.*; // 두 개 이상 이용 => Scanner / Calendar
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// # 입력 받기 => year/month/day => 요일 알기
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();//객체 생성
		//Calendar => 추상 클래스 => new를 사용하지 못한다
		cal.set(Calendar.YEAR,year);
		cal.set(Calendar.MONTH,month-1);//0번부터 시작
		cal.set(Calendar.DATE,day);
		
		char[] strWeek= {' ','일','월','화','수','목','금','토'};//week가 1부터 시작함
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다");
		//입력한 달의 마지막 날 구하기
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println("마지막 날:"+lastday);

	}

}
