class Member2
{
	int no=100;//Heap => 멤버변수
	int id=300;
	Member2(){
		System.out.println("this="+this);
		int no=200;//Stack => 지역변수 => 저장 위치 다르기때문에 같은 변수 이름 가능
		System.out.println("no="+(no+this.no));// this.통해 클래스 자신이 가지고 있는 멤버(변수, 메소드) 가져옴
		//1. 지역변수, 매개변수 우선
		//2. 멤버변수
		System.out.println(id);//원래는 this.id 써야하지만 충돌 안 될 경우 생략 가능
	}
	/*
	 *   this => 자신의 객체 나타냄
	 *   ----지역 변수와 매개 변수 == 멤버 변수가 동일한 이름을 가지고 있는 경우(구분자)
	 *       모든 클래스는 this를 가지고 있다
	 *       
	 *   class A
	 *   {
	 *       this
	 *   }
	 *   class B
	 *   {  
	 *       this
	 *   }
	 *   ----------this => static 변수
	 *   A a=new A(); a=> A this
	 *   B b=new B(); b=> B this
	 */
}
/*
 *   int a=10;
 *   static int b=20;
 *   
 *   static void display() => static => 공통으로 사용하는 기능
 *   {
 *      b만 가능
 *      A a=new A(); 쓰고 a 가능
 *   }
 *   void display2() => instance
 *   {
 *       a, b 사용 가능
 *   }
 */
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m=new Member2();
		System.out.println("m="+m);//this 주소와 동일
		//static에서는 this 사용 불가 => 인스턴스에서만 가능
		//static => 공유이기 때문

	}

}
