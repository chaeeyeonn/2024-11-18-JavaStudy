package com.sist.exception;

import java.util.Arrays;

public class 예외처리_CheckException_예제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try
		//{
			int[] lotto=new int[6];//지역변수로만 쓰이면 try절 안에서만 쓰임
			for(int i=0;i<lotto.length;i++)
			{
				lotto[i]=(int)(Math.random()*45)+1;
				for(int j=0;j<i;j++)
				{
					if(lotto[i]==lotto[j])
					{
						i--;
						break;
					}
				}
			}
			//정렬
			Arrays.sort(lotto);
			
			//출력
			for(int i:lotto)// try~catch 부분 적용 시
			{
//				try {
					try {
						Thread.sleep(1000);//try~catch 절 자동 완성도 가능
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//기다렸다 출력 / 예외처리하고 써야 함 => throws
//					System.out.print(i+" ");	
//				}catch(InterruptedException e)
//				{
//					
//				}
				
			}
		//}catch(InterruptedException e)
		//{
			//e.printStackTrace();
		//}
		//finally
		//{
			//System.out.println("프로그램 종료");
		//}

	}

}
