/*
 *   문자열 분리 / 자르기 / 변경 / 찾기
 *   = charAt(int index)
 *   ex)
 *   Hello Java
 *   0123456789
 *   charAt(6) => J
 */
// 1. 사용자의 문자열 입력값을 받아 => a A가 몇 개인가
import java.util.Scanner;
// 2. 사용자의 문자열 입력값을 받아 => 좌우 대칭 여부 확인
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String data="Hello Java";
//		System.out.println("마지막 문자:"+data.charAt(data.length()-1));
		//-1 => length는 0부터 시작이기 때문에 10번째 글자->9로 떠야함
		
//		Scanner scan=new Scanner(System.in);
//		System.out.print("문자열 입력:");
//		String data=scan.nextLine();
		
//		int count=0;
//		for(int i=0;i<data.length();i++)//length는 0부터 시작이니 =이 들어가면 안 됨
//		{
//			char ch=data.charAt(i);
//			//System.out.println(ch);
//			if(ch=='a' || ch=='A')
//				count++;
//		}
//		//지역변수={}변수=>{}종료하면 사라지는 변수
//		System.out.println("a나 A의 개수:"+count);
		Scanner scan=new Scanner(System.in);
		String data="";
		while(true)//짝수인지 판별하기
		{
			System.out.println("문자열 입력:");
			data=scan.next();
			if(data.length()%2==0)
				break;
			else
				System.out.println("문자 개수가 짝수여야 합니다");
		}
		
		boolean bCheck=true;//default값 나타내기
		int j=data.length()-1;
		for(int i=0;i<data.length()/2;i++)//좌우대칭이므로 앞에서부터 반만 가져옴
		{
			char s=data.charAt(i);
			char e=data.charAt(j);
			System.out.println("start:"+s+",end:"+e);//확인
			if(s!=e)//반복문 안에서 else넣으면 중간에 멈춰서 뒤에 꺼 계산 못 함
			{
				bCheck=false;
				break;
			}
			j--;//뒤에서부터 가져오기
		}
		System.out.println("======결과값=======");
		if(bCheck==true)
			System.out.println(data+"는(은) 좌우대칭입니다");
		else
			System.out.println(data+"는(은) 좌우대칭이 아닙니다");
	}

}
