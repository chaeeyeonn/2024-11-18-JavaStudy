/*
 *   버블 정렬 Buble sort
 *      => 인접한 데이터끼리 비교 정렬
 *     선택 정렬: 앞에서부터 정렬
 *     vs
 *     버블 정렬: 뒤에서부터 정렬
 *   
 *   방식
 *     20 30 40 50 10 => DESC(내림차순)
 *     -- --
 *     30 20
 *        -- --
 *        40 20
 *           -- --
 *           50 20
 *              -- --
 *              20 10
 *     -------------------1round
 *     30 40 50 20 (10)고정
 *     -- --
 *     40 30
 *        -- --
 *        50 30
 *           -- --
 *           30 20
 *     --------------------2round
 *     40 50 30 (20 10)고정
 *     ...
 *     ...
 *     i=1    j=4
 *     i2=1   j=3
 *     i3=2   j=2  => i+j=4(arr.;lengng-1)
 *                         j=arr.leng--
 *   
 */

import java.util.Arrays;

public class 배열응용_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
		System.out.println("정렬 전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n정렬 후:");
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;	
				}
			}
			System.out.println((i+1)+"round"+Arrays.toString(arr));
		}
		System.out.println("최종 결과값");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
