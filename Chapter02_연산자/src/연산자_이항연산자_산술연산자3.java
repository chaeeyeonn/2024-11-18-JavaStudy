// 임의로 변수 초기화
// => 난수 => Math.radom()
/*
 *   Math.random() => double (0.0~0.99)
 *   1~100을 받으려면
 *   (int)(Math.random()*100)+1
 *    === ================== =
 *     2   1                 3
 *    0.0~99.0 => 0~99 => 1~100
 */
public class 연산자_이항연산자_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;// 게임 분야
		int b=(int)(Math.random()*100)+1;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(a+b);

	
	}

}
