// 초기값 => 데이터를 저장하는 방법
/*
 * 자바에서 사용하는 표현법
 *  1. 정수
 *    byte/short/int => 숫자 사용( 법위만 초과하지 않음)
 *    숫자표현 방법
 *      10 => 10진법
 *      ***012 => 8진법
 *      ex)날짜: 2024-09-20 중 '09'를 8진법으로 읽어버려 에러남, 8진법은 0 ~ 7만 가능, 0 함부로 붙이지 않도록 조심
 *        +시간
 *      0x12 => 16진법
 *    long표현
 *      10L, 10l
 *  2. 실수형
 *      10.5 => double
 *      10.5F, 10.5f
 *  3. 문자형
 *      한 글자만 저장이 가능
 *      'A' "" => 문자열 => 여러 개 문자 사용이 가능 "ABCD..."
 *  4. 논리형
 *      true/false
 *      
 * 데이터 저장 방법
 *  1. 명시적 초기화
 *     int a=10;
 *  2. 입력을 받아서 초기화
 *  3. 난수 발생
 *  
 * 변수 선언
 *  1) 선언과 동시에 값 저장
 *     데이터형 변수명=값 (사용 빈도 더 높음)
 *  
 *  2) 선언 후 값 저장
 *     데이터형 변수명;
 *     변수명=값
 *     
 *  *** 변수 선언만 하고 사용하면 에러 발생, 값 저장 무조건
 */
public class 변수_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수
		byte byteVal=127; //-128~127 범위이니 성공 (1byte)
		short shortVal=32767; //-32768~32767 범위이니 성공 (2byte)
		//shortVal=30000;//변수 변경 가능
		
		int intVal=21400000;//4byte 범위이니 성공 => 이 메모리를 사용한다면 'intVal' 변수를 이용한다는 뜻 
		long longVal=3000000000000L;// int로 인식하고 있으니 long표현을 붙임
		/*
		 * 8byte 메모리 공간을 만들어라
		 * => 300000000000 명령
		 * => 사용시 longVal
		 */
		// 수정
		longVal=100L;
		// 값 읽기
		System.out.println(longVal);
		// 큰 데이터형에는 작은 값을 저장할 수 있다
		long a=100;// int값이 더 작으니까 자동 100L이 된 것(int의 범위에도 들어가니까 되는)
		
		int b='B';//문자열 B는 66의 정수값을 가짐
		System.out.println(b);
		
		char c=65;//65는 문자열 A의 값을 가짐, 문자열은 하나만 가능
		System.out.println(c);
		
		System.out.println((int)'홍'); // 홍은 54861의 값을 가짐 => 아스키 코드값
		
		boolean boo=false;
		System.out.println(boo);//조건문일 때 사용
		
		float f=10.5F;//실수는 double이 디폴트, double이 더 큼
		System.out.println(f);
		double d=10.5f;// double이 더 크니까 10.5f가 double이 됨
		// 왼쪽 데이터형이 오른쪽 데이터형보다 크거나 같아야 함
		/*
		 * 데이터는 선언된 데이터형을 따라 간다
		 * 
		 * byte = byte
		 * short = short, byte
		 * int = byte, short, char, int
		 * long = byte, short, char, int, long
		 * float = byte, short, char, int, long, float
		 * double = byte, short, char, int, long, float, double
		 * => 자동 형변환
		 * (int)10.5 => 10으로 바뀜
		 * (double)10 => 10.0으로 바뀜
		 * (int)'A' => 65로 바뀜
		 * (char)65 => 'A'
		 * (double)'A' => 65.0
		 * (float)'A' => 65.0F
		 */
		// 10/3=3  10/(double)3=3.333333 => 데이터 변환의 필요성
		System.out.println(10/3);
		System.out.println(10/(double)3);
	}

}
