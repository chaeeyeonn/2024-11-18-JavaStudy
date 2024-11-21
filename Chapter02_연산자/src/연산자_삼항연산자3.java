// 점수 입력 => 학점 계산 (A~D, F)
/*
 *   A => score>=90 && score<=100
 *   B => score>=80 && score<90
 *   C => score>=70 && score<80
 *   D => score>=60 && score<70
 *   F => score<60
 */
import java.util.Scanner;
public class 연산자_삼항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("점수입력(1~100):");
		int score=scan.nextInt();//정수
		// nextDouble():실수, nextBoolean():true/false, next():문자열
		/*
		 *   알파뱃 => 대문자 조건
		 *           c>= 'A' && c<='Z' => A~Z사이에 존재
		 *         => 소문자 조건
		 *           c>='a' && c<='z' => a~z사이에 존재
		 *         => 알파벳 조건
		 *           c>='A' && c<='Z' || c>='a' && c<='z' // 대문자, 소문자 유니코드 순서가 붙어있지 않음
		 */
		System.out.println(score<0 || score>100?"비정상입력":"정상입력");
		System.out.println("====결과값====");
		System.out.print(score>=90 && score<=100?"A학점":"");
		System.out.print(score>=80 && score<90?"B학점":"");
		System.out.print(score>=70 && score<80?"C학점":"");
		System.out.print(score>=60 && score<70?"D학점":"");
		System.out.print(score>=0 && score<60?"F학점":"");
		

	}

}
