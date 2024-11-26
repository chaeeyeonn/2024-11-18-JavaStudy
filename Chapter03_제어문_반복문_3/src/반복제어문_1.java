/*
 *  break ==> 사용하는 위치: 반복문 / 선택문 ==> 조건문에서는 사용 불가능(안긴 상태에선 가능)
 *  continue ==> 사용하는 위치: 반복문 ==> 조건문, 선택문에서는 사용 불가능 => 특정 부분을 제외하고 싶을 떄 사용
 *                                ==> for문: 증가식으로 이동 / while문: 조건식으로 이동
 *  ***break, continue가 있는 경우, 다음에는 소스 코딩할 수 없음
 *  ex)
 *     for()
 *     {
 *       if{}
 *       {
 *         //소스코딩 가능
 *         break;
 *         //소스코딩 불가능
 *       }
 *     }
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
//			//System.out.print(i+" "); => 5까지 출력 후 break
//			if(i==5)
//				break;// 4까지 출력 후 break
//			System.out.print(i+" ");
			if(i==5)
				continue;// if 조건문 제외하고 증가식으로 이동(for문) => 5제외한 1~10까지 출력
			System.out.print(i+" ");
		}

	}

}
