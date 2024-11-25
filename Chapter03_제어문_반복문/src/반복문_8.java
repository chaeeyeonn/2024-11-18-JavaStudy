// 10개의 정수를 추출하여 최대값, 최소값 나타내기
// 1~100사이
public class 반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=1,min=100,count=0;// 최대값, 최소값에 대한 초기값은 각자 제일 반대값으로 놔야 비교 가능
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;//1~100
			System.out.print(num+" ");
			
			//최대값
			if(max<num)
				max=num; // num보다 max가 작으면 max값을 num으로 한다 => 제일 큰 num값이 max가 됨 => 최대값
			//최소값
			if(min>num)
				min=num; // num보다 min이 크면 min값을 num으로 한다 => 제일 작은 num값이 min이 됨 => 최대값
			//3의 배수 개수 구하기
			if(num%3==0)
				count++;
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		System.out.println("3의 배수 개수:"+count);

	}

}
