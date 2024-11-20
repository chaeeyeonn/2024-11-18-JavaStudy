/*
 *   부정연산자: !
 *     => 조건문에서 사용(로그인이 안 된 경우, 예약 기간이 아닌 경우 등)
 *     => 무조건 boolean만 사용
 *        true => !true => false가 됨
 *        
 *     ex) boolean bCheck=false;
 *         !bCheck => true
 */
public class 연산자_단항연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck=false;
		System.out.println(bCheck);//false
		bCheck=!bCheck;
		System.out.println(bCheck);//true
		
		/*int kor=55;
		if(!(kor>=60))//kor이 60점 이상이 아니라면(!) => 조건문
		{
			
		}*/
		
		// 연산자 => 응용(제어문) / 일반 연산만 하는 것이 아니다

	}

}
