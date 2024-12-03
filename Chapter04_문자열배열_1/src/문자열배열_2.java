import com.sist.data.*;//사용자 정의
import java.util.Scanner;
public class 문자열배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 읽기
		String[] fdata=ArrayData.korEng;
		// 데이터 확인(출력)
		Scanner scan=new Scanner(System.in);
		System.out.println("과일명 입력:");
		String f=scan.next();
		for(String ff:fdata)
		{
			if(ff.contains(f))//문자가 다 붙어 있기에 equals 불가
			{
				String change=ff.substring(ff.indexOf(":")+1);//:이후로 잘라 추출
			    System.out.println(f+"의 영어는 "+change);
			    break;
			}
		}

	}

}
