/*
 *   문자열 정보
 *   => length(): 문자의 개수 
 *   ex) 비밀번호는 8자리 이상
 */
// 사용자가 입력한 문자의 개수 확인 => 공백 포함
import java.util.Scanner;
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    System.out.print("문자열 입력:");
	    String str1=scan.next();// 공백 포함하기: nextLine(enter칠 때까지 생각함) / 공백불포함:next(여러 단어를 공백 불포함하여 각각 계산 가능)
	    String str2=scan.next();// byte개수가 아닌 글자수로 계산함
	    String str3=scan.next();
	    System.out.println("====결과값====");
	    System.out.println("문자 개수:"+str1.length());
	    System.out.println("문자 개수:"+str2.length());
	    System.out.println("문자 개수:"+str3.length());

	}

}
