//1~100까지의 합(67page)
public class 반복문_4 {
    //짝수합, 홀수합, 총합
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; 
		int even=0; 
		int odd=0;//누적변수, 누적합 초기값은 0, 누적곱=> 초기값 1
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			System.out.println("sum="+sum+",i="+i);
		}
		
		}

	}


