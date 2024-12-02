// #국어점수 5개 입력 => rank 5개
import java.util.Arrays;
import java.util.Scanner;
public class 배열_생성_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kor=new int[5];
		int[] rank=new int[5];
		
		// => 국어점수와 순위 매칭 ==> index 번호로 매칭
		for(int i=0;i<kor.length;i++)
		{
			kor[i]=(int)(Math.random()*101);
		}
		System.out.println(Arrays.toString(kor));
		//등수
		for(int i=0;i<kor.length;i++)
		{
			rank[i]=1;//등수 1번
			for(int j=0;j<kor.length;j++)
			{
				if(kor[i]<kor[j])
				{
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));
	}

}
