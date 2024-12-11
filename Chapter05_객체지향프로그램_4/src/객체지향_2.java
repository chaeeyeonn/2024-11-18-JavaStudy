//125page
class B
{
	int a;
	int b;
}
public class 객체지향_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  변수의 경우
		 *  int a=10;
		 *  int b=a;
		 *  => b=10
		 *  주소를 이용하는 것이 아닌 값만 이용한 것
		 */
		B aa=new B();
		aa.a=100;
		aa.b=200;
		
		//웹, 윈도우 활용도 높음
		/*MVC 구조
		 *           request     request
		 *   사용자 요청 ==> 요청값 받기 ==> 요청 처리
		 *   브라우저 전송 <== 결과값 받기 <== 처리 완료
		 */
		B bb=aa;
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);
		//같은 메모리 주소를 쓰고 있음 , 각각 별칭을 준 것 => 같은 주소(class B) 제어
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		
		bb.a=1000;
		bb.b=2000;
		//bb를 변경했으니 같은 주소를 제어하는 aa도 값이 바뀜
		//주소 참조해서 제어 => Call By Reference
		//클래스나 배열 => 주소를 넘겨주면 => 같은 메모리를 제어
		//클래스에서 제외 => String
		System.out.println("aa.a="+aa.a);
		
		String s1="Hello";//String도 원래 클래스지만 일반 변수처럼 취급
		// => 메모리 주소 제어가 아니라 값만 이용
		String s2=s1;
		System.out.println("s2="+s2);
		s2="Java";
		System.out.println("s2="+s2);
		System.out.println("s1="+s1);
		//s1값이 바뀌지 않음
		//같은 주소를 제어 / 다른 메모리 생성 => new / clone

	}

}
