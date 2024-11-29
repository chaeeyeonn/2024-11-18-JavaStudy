import java.util.Arrays;

public class 배열_생성_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha= {'A','B','C','D','E'};
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		alpha[1]='K';//변수와 동일하게 사용
		alpha[4]='M';
		System.out.print(Arrays.toString(alpha));
		//배열 안에 있는 모든 데이터 한 번에 읽어서 출력
}
}
