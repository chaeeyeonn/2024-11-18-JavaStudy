/*
 *   알파벳을 입력받아서 대문자/소문자/알파벳이 아닌가
 *   
 *   대문자라면 => if(대문자조건)
 *   소문자라면 => if(소문자조건)
 *   알파벳이 아니라면 => if(대문자,소문자가 아니라면)
 */
import java.util.Scanner; // 라이브러리, 입력을 받아서 처리해주는 클래스
public class 자바제어문_단일조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력:");
		char ch=scan.next().charAt(0);
		//char 받을 때 사용, (0)=> 제일 앞자리 하나 가져오는 것 / (1) => 두 번째 자리 가져옴
		//System.out.println("ch="+ch);
		/*
		 *   기본: 비교연산자
		 *        논리연산자 => 부정연산자        
		 */
		if(ch>='A' && ch<='Z')
			System.out.println(ch+"는(은) 대문자");
		if(ch>='a' && ch<='z')
			System.out.println(ch+"는(은) 소문자");
		if(!((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')))
			System.out.println(ch+"는(은) 알파벳이 아니다");
		

	}

}
