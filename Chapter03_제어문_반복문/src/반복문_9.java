// 10개의 알파벳을 추출 => 대문자, 소문자 개수 각각 구하기
public class 반복문_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dcnt=0,scnt=0;
		//대부분 초기화값이 0이다
		for(int i=1;i<=10;i++)//10번 반복한다
		{
			char c='A';
			int no=(int)(Math.random()*2);
			//0,1
			if(no==0)
				c=(char)((Math.random()*26)+65);//대문자 추출 => A(65)부터 시작하니까 대문자 A~Z
			else
				c=(char)((Math.random()*26)+97);//소문자 추출 => a(97)부터 시작하니까 대문자 a~z
			
			System.out.print(c+" ");
			
			if(c>='A' && c<='Z')//대문자라면
				dcnt++;
			else
				scnt++;
		}
		System.out.println();
		System.out.println("소문자 개수:"+scnt);
		System.out.println("대문자 개수:"+dcnt);

	}

}
