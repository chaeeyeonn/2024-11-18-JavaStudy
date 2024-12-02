// char 배열 사용법 / double / String
// => 응용 => 정렬/달력만들기.../중복없는 난수
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 선언
		char[] alpha=new char[26];
		// 초기화
		char c='A';
		for(int i=0;i<alpha.length;i++)
		{
			alpha[i]=c++;//A~Z
		}
		// 처리
		// 출력
		for(char cc:alpha)
		{
			System.out.print(cc+" ");
		}
		System.out.println();//줄바꿈
		// # 'K'가 있는 인덱스 번호를 출력 => 변수: index로 잡음
		int index=0;
		for(int i=0;i<alpha.length;i++)
		{
			if(alpha[i]=='K')
			{
				index=i;
				break;
				}
		}
		System.out.println("K의 index 위치:"+index);//실제 알파벳 번호라면 index+1

	}

}
