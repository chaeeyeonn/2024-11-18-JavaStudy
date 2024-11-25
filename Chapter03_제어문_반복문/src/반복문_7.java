// 무한루프
/*
 *   컴퓨터 => 난수 발생: 1~100사이 정수 추출
 *   => 맞추는 게임 => 힌트: up, down
 */
// 반복문 안에 if문 많이 쓰임
import java.util.Scanner;
public class 반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com=(int)(Math.random()*100)+1;
		
		//사용자 입력 받기
		Scanner scan=new Scanner(System.in);
		for(;;)//for문의 무한루프
		{
			System.out.println("1~100사이의 정수 입력:");
			int user=scan.nextInt();
			
			//힌트
			if(com>user)
			{
				System.out.println("UP");
			}
			else if(com<user)
			{
				System.out.println("DOWN");
			}
			else
			{
				System.out.println("정답입니다");
				System.exit(0);//프로그램 종료, break도 됨
				// break는 정지, System.exit(0)은 시스템 종료 느낌
				// 무한루프는 반드시 종료 조건을 첨부해야함
			}
		}
	}

}
