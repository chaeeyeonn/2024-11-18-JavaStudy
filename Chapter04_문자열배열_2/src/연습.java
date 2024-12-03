/*
 *   배열 => 같은 데이터를 묶어 관리(변수 여러 개 제어하기 쉽게 한 개의 이름 이용)
 *          ---------용도가 동일
 *                   = 연속적으로 메모리 배치(같은 크기)
 *                   = 구분자 => 인덱스(0부터 순차적) => 반복문 사용
 */
import java.util.Arrays;

public class 연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다.
//	   점수를 score 배열 변수에 저장하 고 1) 아래와 같이 출력하시오.
//		1번 학생 : 100점  
//		2번 학생 : 90점  
//		3번 학생 : 85점 
//		int[] score= {100,90,85};
//		for(int i=0;i<3;i++)
//		{
//			System.out.println((i+1)+"번 학생 : "+score[i]+"점");
//		}
//2) 학생들의 총점을 출력하시오.
//		int total=0;
//		for(int s:score)
//		{
//			total+=s;
//		}
//		System.out.println("총점 : "+total+"점");
		
		
//2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. (실적 0~100)
//  	1) 사번별 실적을 출력하시오. (사원(1) 50..)
//		int[] score={50,45,35,12,70};
//		for(int i=0;i<5;i++)
//		{
//				System.out.println("사원("+(i+1)+") "+score[i]);
//			}
//      2) 1월 실적의 총점과 평균을 출력하시오.
//		int total=0;
//		for(int s:score)
//		{
//			total+=s;
//		}
//		System.out.println("총점:"+total);
//		System.out.println("평균:"+(double)total/5.0);
		
		
//      3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
//		int max=score[0];
//		int min=score[0];
//		int maxi=0;
//		int mini=0;
//		for(int i=0;i<score.length;i++)
//		{
//			if(max<score[i])
//			{
//				max=score[i];
//			    maxi=i;
//			}
//			if(min>score[i])
//			{
//				min=score[i];
//			    mini=i;
//			}
//		}
//				System.out.println("실적 max:"+"사원"+(maxi+1)+" "+max+"점");
//				System.out.println("실적 min:"+"사원"+(mini+1)+" "+min+"점");

		
// 3. 크기가 10인 정수형 배열을 생성하고 여기에 0부터 9까지의 값으로 배열을 채우는 프로그램 만들기
//		int[] arr=new int[10];
//		int num=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=num;
//			num++;
//		}
//		System.out.println(Arrays.toString(arr));
		
		
// 4. 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int a:arr)
//		{
//			sum+=a;
//		}
//		System.out.println("sum="+sum);
		
		
//5. 1~100사이의 정수를 10개 저장하고  
//	1) 정수형 변수 evenTotal 에 배열 내의 데이터 짝수 합 계산하여 저장	
//  2) 정수형 변수 oddTotal 에 배열 내의 데이터 홀수 합 계산하여 저장
//		int[] arr=new int[10];
//		int evenTotal=0;
//		int oddTotal=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//			System.out.print(arr[i]+" ");
//			if(i%2==0)
//			{
//				evenTotal+=i;
//			}
//			else
//			{
//				oddTotal+=i;
//			}
//		}
//		System.out.println();
//		System.out.println("짝수 합:"+evenTotal);
//		System.out.println("홀수 합:"+oddTotal);


//6. 0~9사이의 난수를 100개 발생해서 빈도를 구해서 출력하시오 
//		int[] arr=new int[100];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*10);
//			
//		}
//		System.out.println(Arrays.toString(arr));
//
//		int[] result=new int[10];
//		for(int i=0;i<arr.length;i++)
//		{
//			result[arr[i]]++;
//		}
//		//출력
//		for(int i=0;i<result.length;i++)
//		{
//			System.out.println(i+"의 개수:"+result[i]);
//		}
		
		
//7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오(108~110page) ==> 코테 거의 무조건 나옴
		char[] arr=new char[5];
		//초기값
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.println(Arrays.toString(arr));
		//ASC정렬(오름차순) => 선택정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//Arrays.sort(arr) => 정렬 메소드
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));

		//DESC정렬(내림차순) => 버블정렬
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("정렬 후:");
		System.out.println(Arrays.toString(arr));
		// Arrays.sort(arr) => DESC가 없음

	}

}
