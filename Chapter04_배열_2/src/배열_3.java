//# 10개의 정수를 임의 추출(1~100) => max, min
// max, min 위치 각각 찾기

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		//임의의 수 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 초기화된 데이터 출력
		System.out.println(Arrays.toString(arr));
		// 사용자 요청1 = max,min값
		int max=arr[0];
		int min=arr[0];
		// => 저장된 데이터 중 하나를 대입하는 것이 좋음
		for(int i:arr)//실제 저장된 데이터를 가지고 온다(index 번호 아님)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		// 사용자 요청2 = max,min index값
		int maxIndex=0;
		int minIndex=0;
		for(int i=0;i<arr.length;i++)//index번호 찾기
		{
			if(arr[i]==max)
				maxIndex=i;
			if(arr[i]==min)
				minIndex=i;
		}// 두 변수를 구하는 것이니 break 안 씀
		System.out.println("최대값 index:"+maxIndex);
		System.out.println("최소값 index:"+minIndex);

	}

}
