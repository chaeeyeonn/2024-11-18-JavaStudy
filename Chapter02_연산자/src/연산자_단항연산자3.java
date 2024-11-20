/*
 *   형변환연산자
 *   ====== long => int, char => int, byte => int 등 데이터형 변환
 *   
 *   숫자/문자(정수인식) 변환 => boolean은 제외(논리)
 *   
 *   데이터형의 크기
 *      <=======           ======>      
 *      DownCasting       UpCasting
 *      데이터형 작게        데이터형 크게
 *      => 강제            => 자동 => 자동형변환
 *   byte < short < int < long < float < double
 *          char
 *          
 *   byte b=10;
 *   int i=b;
 *         => int로 변경됨
 *   int a=10;
 *   double d=a;
 *            => double로 변경됨
 *            
 *   10 + 10.5 = 20.5 but 연산은 같은 데이터형만 처리가 가능
 *   int  double
 *    |
 *   double인 10.0로 바뀜(UpCasting)
 *   
 *   *** 가장 큰 데이터형으로 바뀌는 것임
 *   *** int이하 데이터형(byte, short, char)은 모든 연산 결과가 int로 변경(범위 상관없이)
 *   *** 필요시 강제로 변환 가능 => 형변환연산자 통한 수동형변환
 *       (int)10.5 + (int)20.3 = 30 => double형태를 int형태로 바꿈(소수점 뒤는 무조건 버림)
 *       (int)(10.5+20.5) => (int)31.0 => 31 => 괄호 먼저 처리
 */
public class 연산자_단항연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a=10;
		double d=a;
		System.out.println(d);//정수 -> 실수 10.0
		
		byte b1=100;
		byte b2=27;
		int b3=b1+b2;
		
		int a=10;
		int b=3;
		System.out.println(a/(double)b);
		
		int a=123456;
		double d=123456.78;
	    int res= (int)((d-a)*100);
	    System.out.println(res);//77나옴 => 같은 byte가 아니라서 부등 소수점때문에 소수점 뒤 마지막은 반올림됨
		
		int a=123456;
		float d=123456.78f;// 실수 디폴트인 double이 적용되어 float처리 위해 f붙임
	    int res= (int)((d-a)*100);
	    System.out.println(res);//78나옴 => 같은 4byte기 때문에 소수점 부등 소수점이 그대로 반영됨*/
		
		

	}

}
