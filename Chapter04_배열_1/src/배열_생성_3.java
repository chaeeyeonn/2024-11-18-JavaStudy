// 변수 => 배열
// => 연산처리 / 제어문 처리 => 사용자 요청 => 메소드
// =====> 클래스 구성요소
// 객체지향언어 => 자바 시작(5장)
// 사용자 정의 데이터형
// #1. 정수 입력 받아 2진법 출력    10 => 0000 0000 0000 1010 ==> 16bit
//     16bit 이용 => 2byte => 32767
import java.util.Scanner;
public class 배열_생성_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767사이의 정수 입력:");
		int num=scan.nextInt();
		// 라이브러리 이용
		//==> System.out.println(Integer.toBinaryString(num));
		
		//저장 공간 0,1 16개 => 16bit
		int[] binary=new int[16];
		//앞에서부터 저장? 뒤에서부터 저장?
		// index=0       index=15
        // index=0 ==> 0부터 출력  FIFO  => Queue
		// index=15 ==> 15부터 출력 LIFO => Stack
		int index=15;// while문에서의 변수
		
		// 요청 처리 => 제어문 / 연산자
		while(true)
		{
			binary[index]=num%2;//2로 나누고 나머지값을
			num/=2;//다시 2로 나누기를 반복 ==>2진법 만들기
			
			if(num==0)//피제수가 0으로 마무리
			break;
			
			index--;// 15부터 했으니 내려가기
		}
		//출력 형식
		for(int i=0;i<binary.length;i++)
		{    //        배열 개수
			if(i!=0 && i%4==0)//앞 칸 띄어쓰기 안 하기 + 4칸마다 띄어쓰기
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		

	}

}
