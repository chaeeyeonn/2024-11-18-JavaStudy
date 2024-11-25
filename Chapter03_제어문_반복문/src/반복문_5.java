//1~100사이의 3의 배수 합, 5의 배수 합. 7의 배수 합
public class 반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thr=0;
		int fiv=0;
		int sev=0;
		for(int i=0;i<=100;i++)
		{
			if(i%3==0)
				thr+=i;
			if(i%5==0)
				fiv+=i;
			if(i%7==0)
				sev+=i;
		}
		System.out.println("1~100사이의 3의 배수합:"+thr);
		System.out.println("1~100사이의 5의 배수합:"+fiv);
		System.out.println("1~100사이의 7의 배수합:"+sev);
		

	}

}
