/*
 *   1. 출력
 *      ***System.out.println() => 에러 출력시 많이 씀
 *                         == new Line(줄바꿈)
 *      System.out.print()
 *                 ===== 가로 출력     
 *      System.out.printf() => jdk1.8 이상
 *                      = 출력 서식 만들어 출력
 *                      = C언어에서 도입
 *   2. 입력
 *   3. 임의의 수 추출
 */
public class 연산자_이항연산자_산술연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=80;
		int math=80;
		
		System.out.println("국어:"+kor);//국어:90
		System.out.println("영어"+eng);
		System.out.println("수학"+math);
		
		System.out.print("국어:"+kor+",영어:"+eng+",수학:"+math);
		System.out.println();
		System.out.printf("국어:%d,영어:%d,수학:%d",kor,eng,math);
		/*
		 * %d => 정수값 대입
		 * %f => 실수값 대입
		 * %s => 문자열 대입
		 * %c => 문자 입력
		 */
		System.out.println();
		System.out.println(10/3.0);
		System.out.printf("%.2f",10/3.0);//실수값에 소수점 두 자리까지만 나타냄

	}

}
