import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		//1~100사이의 정수 추출
		Scanner scan=new Scanner(System.in);
		while(true)//무한루프 => 종료시점 지정 break
		{
			System.out.print("정수 입력(1~100):");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.print("잘못된 입력입니다");
				continue;
			}
			
			if(com>user)
			{
				System.out.println("입력한 수보다 큰 수를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력한 수보다 작은 수를 입력하세요");
			}
			else
			{
				System.out.println("정답입니다");
				break;//프로그램 종료
			}
		}

	}

}
