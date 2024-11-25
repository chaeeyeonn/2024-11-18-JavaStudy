/* 2. 
 * 10개의 알파벳을 추출
 * 사용자가 입력 => 몇 번째 위치하고 있는지 확인
 * A B C D E F G H I J
 * => D => 4번째 위치한다 => index 구하는 방법 => 크롤링, 데이터 수집 방법
 */
/* 1. 
 * A~Z사이 하나 입력받아 몇 번째 위치인지 구하기
 */
import java.util.Scanner;
public class 반복문_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳을 입력(대문자):");
		char c=scan.next().charAt(0);
		//Scanner는 char를 가져오지 못함 => 문자열만 가져오니 첫 번째 문자를 추출하는 것 => charAt(0)
		System.out.println("c:"+c);
		
		//위치 확인
		//System.out.println("몇 번째 위치:"+(c-64));//97:A
		int index=1;
		for(char ch='A';ch<='Z';ch++)
		{
			if(ch==c)
				break; // 반복문 중단
			index++;
		}
		System.out.println(c+"는(은)"+index+"번째 위치하고 있다");

	}

}
