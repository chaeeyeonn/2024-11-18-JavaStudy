// format() => 출력 형식 => System.out.printf()
// ------웹에 출력 가능       ----------------docs창만 가능
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		double avg=0.0;
		/*
		 *  변수 => 선언
		 *  초기화
		 *  int=0
		 *  double=0.0
		 *  char='/0'
		 *  long=0L
		 *  float+0.0F
		 *  String=null => 메소드 주소가 없는 상태
		 *         ----NullPointerException
		 *             모든 클래스가 메모리 할당이 안 된 상태
		 *             
		 *  1. 변수 설정 ==> 변경되는 값 확인
		 *  2. 제어문 처리 ==> 어떤 제어문 사용 여부
		 *  3. 연산 처리 ==> 시용자 요청 연산
		 *  ---------------웹/모바일/애플리케이션
		 *  4. 결과값 출력  ==> 화면에 출력
		 *  
		 */
		for(int i=1;i<=9;i++)
		{
			int num=(int)(Math.random()*10)+1;
			System.out.print(num+" ");
			sum+=num;
		}
		//평균 구하기
		avg=sum/9.0;
		String msg=String.format("평균:%.2f", avg);// 출력 형식 
		// 정수: %d, 실수: %f, 문자: %c, 문자열: %s
		// 날짜 변환, 학점 , MessageFormat
		System.out.println(msg);

	}

}
