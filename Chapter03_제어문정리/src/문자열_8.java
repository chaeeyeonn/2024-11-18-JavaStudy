// 대문자 변환 => toUpperCase()

//replace(문자,문자)
//           =>
//replace(문자열,문자열)
//            =>
import java.util.Scanner;
/*
 *   함수: function
 *   메소드: method
 *   ============= 기능상으로는 동일
 *   class 종속에 따라 나뉨
 *   C/C++/Python => function
 *   Java/Kotlin => method
 */
public class 문자열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="hong gil dong";
		System.out.println(name.toUpperCase());
		String rename="HONG GIL DONG";
		System.out.println(rename.toLowerCase());
		//Upper / Lower => 오라클
		// 데이터 관리=> 자바+오라클 => JSP에서 HTML로 변환
		
		String data="Hello Java";
		System.out.println(data.replace('a','k'));
		System.out.println(data.replace("Java", "Oracle"));//대소문자 구분하니 주의
		//==> 오라클 연동할 때 자주 씀
		
		// 이미지, 줄거리, 내용
		// |,  &,  '' => 오라클에서 첨부할 수 없다
		// & => replace
		// & => Scanner
		// || => 문자열 결합
		// 문자열 => ''

	}

}
