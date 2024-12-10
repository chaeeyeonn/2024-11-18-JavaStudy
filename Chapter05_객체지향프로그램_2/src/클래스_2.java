// 멤버변수, 공유변수의 초기화 => 값 주입
/*
 *   구성요소 => 설계 => 메모리에 저장 후에 사용(객체)
 *   
 *   클래스
 *     *** 멤버변수만 가지고 있는 경우 => 데이터형 클래스
 *         사용자 정의 데이터형: ~VO, ~DTO
 *     *** 메소드만 가지고 있는 경우 => 액션 클래스(기능)
 *         연결용: 오라클 연결 / 브라우저 연결
 *               --------    ---------
 *                ~DAO       ~Model(~Controller,~Action)
 *                
 *    class ClassName
 *    {
 *      변수 설정 => 클래스 안에서 필요한 데이터 설정
 *      변수 => 사용위해 초기값(초기화)
 *        1) 명시적 초기화 -> 우선
 *        2) 생성자
 *           - 클래스를 메모리에 저장할 때 호출하는 메소드
 *             new 생성자()
 *             --- ------초기값을 주입
 *             저장할 메모리 공간 생성
 *             => 멤버변수의 초기화 담당
 *           - 생성자 = 클래스명 동일
 *             class A => A()
 *             class B => B()
 *             => 리턴형이 없다
 *             => 여러 개 만들 수 있다 => 오버로딩
 *                                    ------메소드명이 동일
 *                                          리턴형 관계 없음
 *                                          매개변수 => 개수나 데이터형이 다른 경우
 *                                          접근지정자는 관계없음
 *                                          한 개 클래스 안에서 존재
 *                                          class A
 *                                          => A()
 *                                          => A(int a)
 *                                          => A(int a, int b)
 *                                          => A(Stirng s)
 *                                          ==> 상속에서 예외
 *                                          ==> 생성자가 필요한 위치
 *                                              A() => 매개변수가 없는 생성자 => 디폴트 생성자
 *                                              *** 생성자가 없는 경우 컴파일러에 의해 생성 ==> 디폴트 생성자
 *                                          웹 => 오라클 연결(시작과 동시 연결), 서버 연결, 파일 읽어서 데이터 저장
 *          - 생성자의 용도: 변수 초기화(명시적인 초기화가 안 되는 경우)
 *                                 => 구현 후 데이터 처리
 *                      : 시작과 동시에 처리하는 기능이 있는 경우
 *                        윈도우 초기화(화면UI)
 *          - 생성자 호출
 *            new 생성자()
 *            new 생성자() ==> 각각 새로운 메모리 생성
 *            new 생성자()
 *                        
 *        3) 초기화 블록
 *           - 인스턴스 블록
 *           - static 블록
 *        메소드: 기능 처리
 *    }
 */
class Student
{   //저장1. 명시적 초기화
	int hakbun=1;
	String name="홍길동";
	String sex="남자";
	
	//저장2. 생성자 이용
	Student(){
		System.out.println("Student() 디폴트 생성자 Call");
		hakbun=2;
		name="심청이";
		sex="여자";
	}
	//생성자 여러 개 사용 가능
	Student(int h,String n, String s)
	{
		hakbun=h;
		name=n;
		sex=s;
	}
	Student(int h,String n)
	{
		//생성자 => 자신의 생성자 호출
		this();// super() => 상속 내린 클래스의 생성자
		hakbun=h;
		name=n;
	}
	Student(String n,String s) //=> '데이터형'이 서로 달라 가능
	{
		this(5,"이산");// 주의점: 반드시 첫 줄에 사용한다 => 다음 순서대로 이어지기 떄문 => 현재 바뀐 건 학번 뿐
		name=n;
		sex=s;
	}
	//자동완성기도 존재하긴 함
	//Student(10.5','A',100)이라면?
	//똑같은 것이 없다면 원래 데이터형보다 더 큰 데이터형이 받을 수 있음
	//but, 권장: 같은 것 만들어놓기
	//=> 오버 로딩 기법
	Student(int a,int b,int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Student(char a,double b,int c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	Student(double a,double b,double c)//=> double, char, int를 모두 받을 수 있음
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	

}
public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student hong=new Student();
//		System.out.println("이름"+hong.name);
//		System.out.println("성별"+hong.hakbun);
//		System.out.println("학번"+hong.sex);
//		
//		Student shim=new Student();
//		System.out.println("이름"+shim.name);
//		System.out.println("성별"+shim.hakbun);
//		System.out.println("학번"+shim.sex);
		
		Student hong=new Student(1,"홍길동","남자");
		System.out.println("이름"+hong.name);
		System.out.println("학번"+hong.hakbun);
		System.out.println("성별"+hong.sex);
		
		Student shim=new Student(2,"심청이","여자");
		Student park=new Student(3,"박문수","남자");

		Student lee=new Student(4,"이순신");
		System.out.println("이름"+lee.name);
		System.out.println("학번"+lee.hakbun);//디폴트값을 남자로 이미 넣어놓음
		System.out.println("성별"+lee.sex);// this()로 인해 생성자 호출됨 => 여자
		
		Student kim=new Student("김두한","남자");
		System.out.println("이름"+kim.name);
		System.out.println("학번"+kim.hakbun);//디폴트값은 1로 이미 넣어놓음 => this()로 인해 생성자 호출됨 => 2 => 클래스 변동으로 인해 5로 바뀜
		System.out.println("성별"+kim.sex);
		
		Student d=new Student(10.5,'A',100); //=> 모두 double값으로 바뀌어 출력됨
		System.out.println("이름"+d.name);
		System.out.println("학번"+d.hakbun);
		System.out.println("성별"+d.sex);

	}

}
