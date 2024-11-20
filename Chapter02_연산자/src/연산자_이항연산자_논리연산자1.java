/*  교재38page~47page
 *   &&: and 연산자/ 예약일, 체크인 등
 *   ||: or 연산자/ 유효성 검사
 *   
 *   국, 영, 수 점수 입력 => 총점, 평균
 *   => int kor=입력
 *      int eng=입력
 *      int math=입력
 *      
 *      int total=kor+eng+math
 *      double avg=total/3.0
 *   => 틀림. 앞서 오류 검사를 실시해야함
 *   
 *   (조건) && (조건) => 범위, 기간 안에 있는 경우 => 직렬연산자 => 두 조건 모두 맞아야 함
 *   -----    -----    a>=1 && a<=100  1~100
 *     |        |
 *    ------------
 *         |
 *       결과값 => true/false 
 *       
 *   (조건) || (조건) ==> 범위 밖에 있는 경우 => 병렬연산자 => 한 조건만 맞아도 됨
 *   -----    -----     a<1 || a>100
 *     |        |
 *    ------------
 *         |
 *       결과값 => true/false 
 *       
 *   int x=10;
 *   int y=9;
 *   
 *   x<y && x==++y => false
 *   앞 조건이 false일 경우 뒤 조건은 연산처리되지 않음 => 효율적인 연산
 *   x=10
 *   y=9
 *   
 *   int x=10;
 *   int y=9;
 *   
 *   x<y || x==++y => true
 *   ||는 효율적인 연산하지 않아 뒤 조건도 연산처리 됨
 *   x=10
 *   y=10   
 */
public class 연산자_이항연산자_논리연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=9;
		
		/*boolean bCheck= x<y && x==++y;
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);*/
		
		boolean bCheck= x>y || x==++y;
		System.out.println(bCheck);
		System.out.println(x);
		System.out.println(y);//9, 앞 조건이 true이므로 뒤 조건 연산 안 함 => 효율적인 연산

	}

}
