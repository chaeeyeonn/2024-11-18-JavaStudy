// #정수 0~9 사이의 난수 발생 => 30개의 난수 중 각 숫자의 빈도수 구하기
public class 배열_생성_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];//0~9까지의 변수 모음
		// 아이디마다 장바구니에 추가한 개수
		for(int i=1;i<=30;i++)//30번 반복
		{
			int num=(int)(Math.random()*10);
			System.out.print(num+" ");//랜덤값 출력
			arr[num]++;// 각 난수의 빈도수 증가
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}

	}

}
