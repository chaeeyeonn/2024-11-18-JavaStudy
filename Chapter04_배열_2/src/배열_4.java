/*
 *   클래스의 구성요소
 *   class ClassName
 *   {
 *       --------------
 *       변수 => 멤버변수
 *              공유변수
 *              => 일반변수 / 배열 / 클래스(변수)
 *              => 변수 보호(데이터 보호)
 *       --------------
 *       메소드 => 기능/재사용
 *            => 유지보수 관련(수정,추가) => 오버라이딩 / 오버로딩
 *       --------------
 *       생성자 => 메모리에 클래스 저장 => 생략 가능
 */
// # 6개 난수 발생 => 중복없는 데이터 출력(1~45사이)
// 게임사이트 '피망' 고스톱 로직 
import java.util.Arrays;
// 재사용 => 메소드화
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6개 난수 저장하는 메모리 공간 확보 => 배열
		int[] lotto=new int[6];
		int su=0;//난수 발생시 저장하는 임시 공간, 변수
		boolean bCheck=false;//중복 여부 확인
		
		for(int i=0;i<lotto.length;i++)
		{
			bCheck=true;
			while(bCheck)//중복여부 확인 => 횟수가 지정 안 됨
			{
				su=(int)(Math.random()*45)+1;//1~45
				System.out.println(su);
				bCheck=false;//while문 종료
				//같은 정수가 있는지 확인
				for(int j=0;j<i;j++)
				{
					if(lotto[j]==su)//저장된 데이터중 난수와 같은 값이 있는가
					{
						bCheck=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));

	}

}
