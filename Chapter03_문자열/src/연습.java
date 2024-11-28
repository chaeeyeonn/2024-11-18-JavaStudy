/*
 * 1. 대소문자가 있는 문자열을 입력받아서 대문자는 소문자로->toLowerCase 소문자는 대문자로-> toUpperCase 변경
 * 
 * 2. 문자열을 입력받아서 역순으로 출력하는 프로그램
 */

import java.util.Scanner;
public class 연습 {
/*
 *  length()
 *  substring()
 *  equals()
 *  contains()
 *  indexOf() / lastIndexOf()
 *  valueOf()
 *  trim()
 *  -------------------------
 *  replace()
 *  ----------
 *  split()
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("알파벳 문자열 입력:");
		String ch=scan.next();
		//2. System.out.printIm(mew StringBuilder(ch).reverse());
//		System.out.println("변환 전 문자열"+ch);
//		String change="";
//		for(int i=1;i<ch.length();i++)
//		{
//			char c=ch.charAt(i);
//			if(c>='A' && c<='Z')
//			{
//				change+=(char)(c+32);
//			}
//			else if(c>='a' && c<='z')
//			{
//				change+=(char)(c-32);
//			}
//		}
//		System.out.println("변환 후:"+change);
		
		for(int i=ch.length()-1;i>=0;i--)
		{
			System.out.print(ch.charAt(i));
		}
		

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
