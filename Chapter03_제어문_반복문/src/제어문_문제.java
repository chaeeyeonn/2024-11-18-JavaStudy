/*
 *  1)	100점 만점으로 성적을 입력 받아
 *  90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D, 60점 이하면 F를 출력하라
 *  (switch~case 사용)
 */
/*import java.util.Scanner;
public class 제어문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("성적 입력(0~100):");
		int score=(scan.nextInt())/10;
		switch(score)
		{
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
			
		}
		

	}

}*/
/*
* 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 
* 프로그램을 만들어라 (switch~case 사용) */
/*import java.util.Scanner;
class 제어문_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫 번째 정수:");
		int num1=scan.nextInt();
		System.out.print("두 번째 정수:");
		int num2=scan.nextInt();
		System.out.print("연산자(+, -, *, /):");
		char c=scan.next().charAt(0);
		
		
		switch(c)
		{
		case '+':
			System.out.println("%d + %d = %d\n",num1,num2,(num1+num2));
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			if(num2==0)
			System.out.println("0으로 나눌 수 없습니다");
			else
			System.out.println(num1/(double)num2);
			break;
	    
		}
	}
}
		
*/
// * 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
/*		
class 제어문_문제 {

   public static void main(String[] args) {
	// TODO Auto-generated method stub
	   int count=0;
    for(int i=2;i<=100;i+=2)
    	count+=i;
    	System.out.println(count);
   }
}
*/

// * 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
/*class 제어문_문제 {

     public static void main(String[] args) {
     // TODO Auto-generated method stub
     for(int i=5;i<=50;i+=5)
   	 System.out.print(i+" ");
     }
}*/

/* B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
// */
/*class 제어문_문제 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
     for(char c='B';c<='N';c+=2)
    	 System.out.print(c+" ");
        }
 }
 */
/*
 * 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
 */
/*import java.util.Scanner;
class 제어문_문제 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);
	System.out.println("정수 한 개 입력:");
	int num=scan.nextInt();
	int sum=0;
	for(int i=0;i<=num;i++)
		sum+=i;
		System.out.println("1~"+num+"까지의 합:"+sum);
	
	     }
}
*/
/*
* 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
*/
/*class 제어문_문제 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
	for(int i=1;i<=30;i++)
		if(i%2==0)
		{
			System.out.printf("%02d\t",i);
			if(i%3==0)
				System.out.println();//3개를 출력하고 다음 줄에 출력한다
		}
}
}*/
/*
* 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
*/
/*class 제어문_문제 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
	int sum=0;
	for(int i=1;i<=10;i++)
	{
		if(i%2==0)
			sum-=i;
		else
			sum+=i;
	}
	System.out.println("sum="+sum);
}
}*/
/*
 * 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라
*/
class 제어문_문제 {

public static void main(String[] args) {
    // TODO Auto-generated method stub
	for(int i=1;i<=10;i++)
	{
		if(i%3!=0);
		System.out.print(i+" ");
	}
	
		}
	
}

