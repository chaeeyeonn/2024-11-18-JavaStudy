// #1~10까지 난수 발생 => 배열[10] => 중복 없이 저장

import java.util.Arrays;

public class 배열_생성_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*10)+1;//재실행
			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					i--;//중복되면 다시 지우는 것
					break;
				}
			}
			
		}
		System.out.print(Arrays.toString(arr));

	}

}
