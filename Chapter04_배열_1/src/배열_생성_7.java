/*
 *    연산자 => 결과값 => 응용(제어문)
 *    제어문 => 배열 응용
 *    
 *    1) 배열 생성 => 관련된 데이터(기능이 동일한 역할)
 *    2) 배열 초기화 => for문 주로 이용
 *    3) 배열 출력 => index를 이용 / for-each(데이터만 읽기) / Arrays.toString()
 *    
 *       제어: 값을 변경 => index를 이용한다
 *            (for-each => 화면 출력용 => Front할 때 주로 사용)
 *       형식: for(데이터형 변수: 배열(컬렉션))
 *       ex) int[] arr={10,20,30,40,50};
 *            for(int i:arr)
 *            {
 *              i=10  ==> index값이 아닌 실제 값을 보내준다는 것
 *              i=20
 *              ...
 *              i=50
 *              이후 자동 종료
 *            }
 *            
 *                 
 *  
 */
public class 배열_생성_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={10,20,30,40,50};
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//더 큰 데이터형들도 똑같이 출력
		for(long i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(double i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//Object => 최상위 데이터형
		/*
		 *  Object o;
		 *  o=10
		 *  o="Hello"
		 *  o='A'
		 *  o=10.0
		 *  o=100L
		 *  o=true
		 *  ==> 모든 데이터형을 받을 수 있음
		 *  ==> Javascript
		 *  
		 */
		Object[] arr1= {"홍길동",27,180.0,'A',true};
		for(Object i:arr)
		{
			System.out.print(i+" ");
		}


	}

}
