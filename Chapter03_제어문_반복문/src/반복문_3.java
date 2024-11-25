//사용자로부터 값을 받아 해당 구구단을 출력
// 반복문 => 반복 패턴이 있어야 사용 가능
import java.util.Scanner;
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("단 입력(2~9):");
		int dan=scan.nextInt();
		
		System.out.println("====요청 결과값====");
		for(int i=1;i<=9;i++)
		{
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		

	}

}
