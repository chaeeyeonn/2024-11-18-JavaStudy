/*
 *   #중복없는 난수 3개 발생 => 1~9사이
 *    사용자 입력하여 맞추기 => 중복없게
 *    => 숫자 야구 게임
 *    힌트: 숫자는 맞으나 자리가 안 맞을 경우 => 0S-1B
 *         숫자도 맞고 자리도 맞을 경우 => 1S-1B
 *    3S가 되면 프로그램 종료
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열_생성_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 컴퓨터가 중복없는 난수 3자리 발생
		int[] com=new int[3];// 현재 0 0 0
		// 사용자가 3자리 입력
		int[] user=new int[3];// 현재 0 0 0
		
		// 초기화
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)//j<=1이 아닌 이유: i 첫 번째는 하나밖에 없으니 중복될 비교 대상이 없음
			{
				if(com[i]==com[j])//index속 내용이 같으면(1번 대 2번 / 2번 대 3번 ...)
				{
					i--;//중복이 있으니 되돌아가 난수 다시 발생시키기
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(com));
		// 난수와 사용자 입력 비교
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수를 입력하세요:");
			int input=scan.nextInt();
			
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다");
				continue;
			}
			//세자리 정수 입력 완료
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			//세 자리를 각각 자르기
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;//처음부터 다시 입력
			}
			//문제 발생 ==> 0이 입력되면 안 됨
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			//오류처리 완료 => 조건문 역할 '오류 방지하기'
			
			// 힌트 주기
			int s=0;
			int b=0;
			for(int i=0;i<3;i++)//com / 0,1,2니까 i<3
			{
				for(int j=0;j<3;j++)//user
				{
					if(com[i]==user[j])//같은 수가 있는가
					{
						if(i==j)// 같은 자리에 있는가
							s++;
						else
							b++;
					}
				}
			}
			System.out.printf("Number:%d,Result:%dS-%dB\n",input,s,b);
			if(s==3)
			{
				System.out.println("Game Over");
				break;
			}
			// 종료 여부 확인 - 결과 알려주기
		}
		

	}

}
