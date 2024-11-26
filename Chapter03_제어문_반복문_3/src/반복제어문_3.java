/*
 *   일차 for문, while문 필수 암기
 *   + break
 *   조건문: 단일 조건문, 선택 조건문 필수 암기
 */
public class 반복제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)// j가 2면 제외하고 증감식으로 돌아감
					continue;//=> while문에서 잘못된 입력이 있을 때 가끔 씀
				System.out.println("i="+i+",j="+j);
			}
		}

	}

}
