//# 6개의 난수 발생 => 중복 없는 데이터 출력(1~45)
// => 배열_4 class 파일보다 쉬운 방법 => 프로그램 개발에 정답은 없다
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
		int[] lotto=new int[6];
		//초기값
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;//횟수 원상복귀 => 중복 없애기
					break;
				}
			}
		}
		//처리(생략)
		//출력
		for(int i:lotto)
		{
			System.out.print(i+" ");
		}

	}

}
