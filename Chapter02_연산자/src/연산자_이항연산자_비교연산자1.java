/*
 *   비교연산자 => 숫자, 논리만 비교
 *           => ""==""(x) => equals()
 *           
 *   ==: 같다
 *   !=: 같지 않다
 *   ====== 왼쪽 기준
 *   <: 작다
 *   >: 크다
 *   <=:작거나 같다
 *   >=: 크거나 같다
 *   
 *   => 결과값은 true/false => 조건문에서 사용
 *   
 */
public class 연산자_이항연산자_비교연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(6==7);//true
		System.out.println(6!=7);//false
		System.out.println(6<7);
		System.out.println(6<=6);//true
		System.out.println(6>=6);//true
		
		char c='A';// 65, char는 연산 처리되면 정수로 변경
		/*
		 *   'A'=65 'B'=66
		 *   'a'=97 'b'=98
		 *   '0'=48 '1'=49
		 */
		int a=65;
		System.out.println(c==a);//true
		c='0';//48
		a=0;
		System.out.println(c==a);//false
		System.out.println((c-c)==a);//true
		System.out.println((int)'+');//43
		System.out.println((int)'*');//42
		System.out.println((int)'/');//47
		System.out.println((int)'-');//45
		// 유니코드 => 0~65535
		
		boolean bCheck1=false;
		boolean bCheck2=true;
		// ==, !=만 가능
		System.out.println(bCheck1==bCheck2);
		System.out.println(bCheck1!=bCheck2);
		
		/*String s1=new String("Hello");
		String s2=new String("Hello");
		System.out.println(s1==s2);//비교 불가
		System.out.println(s1.equals(s2));//true*/
		
		int x=10;
		int y=9;
		
		System.out.println(x==y++);//x=10 y=9 false
		System.out.println(x==++y);//x=10 y=11 false
		
		// 비교연산자 => 조건문, 반복문(로그인, 아이디 중복, 우편변호 검색, 검색처리)

	}

}
