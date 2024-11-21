/*
 *   교재41page~
 *   대입연산자
 *   ------- = ex) int a = 10;
 *                      ===
 *      => 뒤에서부터 처리 => 10을 a에 대입한다
 *   복합대입연산자
 *     *** += => 여러 개 증가 / 누적, 합 계산할 때 씀
 *     int a=10;
 *     a+=5 // 5개 증가(a=a+5/a++를 5번 쓰는 거랑 같음)
 *     *** -= => 여러 개 감소
 *     a-=5 // 5개 감소(a=a-5/a--를 5번 쓰는 거랑 같음)
 *     ex) 1~100중 홀수만 출력
 *     => +=2
 *     *=
 *     /=
 *     %=
 */
public class 연산자_이항연산자_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		a++;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a="+a);
		
		int b=10;
		b+=5;
		System.out.println("b="+b);
		
		int c=10;
		c=c+5;//c+=5
	    System.out.println("c="+c);
        
	    // 여러 번 증가 => 복합대입연산자 사용
	    // 1씩 증가 => 증감연산자 사용
	}

}
