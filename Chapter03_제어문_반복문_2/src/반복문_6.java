/*
 *   ======================================컴포넌트: java=> 클래스 => 재사용
 *   데이터 관리 => 데이터 가공 => 가공된 데이터 출력
 *   ========    ======== 요청에 맞게 가공
 *                        ============ 연산자 / 제어문 => 명령문을 묶어 => 메소드
 *    데이터를 묶어서 사용
 *    -----------
 *    배열 / 클래스
 *    파일 / RDBMS(오라클)
 *    
 *    데이터베이스
 *    -------- 데이터를 모아서 관리하는 곳
 *    -> 변수
 *    -> char => String
 *    
 *    while => 1차
 *    동작 순서 / 형식 / 사용처 알기
 *    형식) 초기식  => 한 번만 사용
 *         while(조건식)
 *         {
 *           반복 수행 문장
 *           증감식 => 마지막 순서에서 두 번째 순서로 이동
 *                 => false => 종료
 *                 => true => 3번으로 이동
 *         }
 */
public class 반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100사이의 난수 발생 => 5개
		// 최대값/ 최소값
//		int a=(int)(Math.random()*100)+1;
//		int b=(int)(Math.random()*100)+1;
//		int c=(int)(Math.random()*100)+1;
//		int d=(int)(Math.random()*100)+1;
//		int e=(int)(Math.random()*100)+1;
//		
//		int max=a;
//		int min=a;
//		
//		if(max<a)
//			max=a;
//		if(max<b)
//			max=b;
//		if(max<c)
//			max=c;
//		if(max<d)
//			max=d;
//		if(max<e)
//			max=e;
//		
//		if(min>a)
//			min=a;
//		if(min>b)
//			min=b;
//		if(min>c)
//			min=c;
//		if(min>d)
//			min=d;
//		if(min>e)
//			min=e;
//		
//		System.out.printf("%d,%d,%d,%d,%d\n",a,b,c,d,e);
//		System.out.println("max:"+max);
//		System.out.println("min:"+min);
		
		int i=1;
		int max=1;
		int min=100;
		while(i<=5)// 수정이 편리 => 유지보수가 편함
		{
			int a=(int)(Math.random()*100)+1;
			System.out.print(a+" ");
			if(max<a)
				max=a;
			if(min>a)
				min=a;
			i++;
		}
		System.out.println();
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		// 반복문은 중복 코딩을 제거할 경우에 사용
		
		
		
	}
}