// # 3명의 국어, 영어, 수학 점수 => 학점, 평균, 총점, 순위 출력 메소드
/*
 *   주소값이 전송되면 => 해당 주소에 값을 채운다
 *   얕은 복사
 *   ==> 메모리 주소가 같은 경우 같은 메모리를 제어한다 ==> 메소드가 매개변수를 받아 조작할 수 있는 이유
 *   
 *   매개변수 전송 => 값만 전송(복사본) ==> 기본형, String(기본형 취급) => Call By Value
 *              => 주소값 전송(원본이 넘어감) ==> 배열 / 클래스 => Call By Reference
 *     => 매개변수명 => 별칭 => 앝은 복사
 */
import java.util.Scanner;
public class 메소드_2 {
//	total[i]=kor[i]+eng[i]+math[i];
//	avg[i]=total[i]/3.0;
	static int[] display()
	{
		int[] arr= {10,20,30};
		return arr;
	}//Call By Reference => 메모리 주소 전송 => 주소에 값을 받음
	static void display2(int[] arr)//원본 변수와 메소드에 들어오는 변수의 메모리는 다르다(원본, 복사본 차이) => Call By Value
	{
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;//선언과 동시에 초기화
	}
	//학점
	//평균
	//총점
	//순위
	//입력
	static void input(int[] kor,int[] eng,int[] math)
	{
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"국어 점수 입력:");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"영어 점수 입력:");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"수학 점수 입력:");
			math[i]=scan.nextInt();
			
		}
		
	}
	static int sum(int kor,int eng,int math)
	{
		return kor+eng+math;
	}
	static double avgs(int total)
	{
		return total/3.0;
	}
	//결과출력
	//조립
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		char[] score=new char[3];
		double[] avg=new double[3];
		int[] rank=new int[3];
		
		
		//테스트
		//int[] arr=display();
//		int[] arr=new int[3];
//		display2(arr);
//		// 배열/클래스 => 주소 참조
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		input(kor,eng,math);//같은 메모리 주소 사용
		for(int i=0;i<kor.length;i++)
		{
			total[i]=sum(kor[i],eng[i],math[i]);//다른 주소 이용
		}
		for(int i=0;i<avg.length;i++)
		{
			avg[i]=avgs(total[i]);
		}
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-7.2f%-5d\n",kor[i],eng[i],math[i],avg[i],total[i]);
		}
		
		
		
		int[] arr= {10,20,30};
		System.out.println(arr[0]);
		int[] a=arr;
		a[0]=1000;
		a[1]=2000;
		a[2]=3000;
		System.out.println(arr[0]);
		System.out.println(a[0]);
		//같은 메모리를 공유해 a값이 바뀌면 arr값도 바뀜
		

	}

}
