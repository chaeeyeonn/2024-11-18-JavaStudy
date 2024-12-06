/*
 *   ** 프로그램은 데이터 관리
 *              ---------
 *                 상태 관리: Vue, React(Front)
 *   데이터 저장 방법
 *   ------------
 *   변수: 데이터 한 개 저장 => 데이터를 변경할 수 있다
 *        읽기(메모리에서 데이터를 가지고 온다)
 *        쓰기(메모리 저장)
 *        수정(값 수정)
 *        => 데이터형 명수명=값;
 *        
 *   상수: 데이터 한 개 저장 => 데이터 변경 불가능
 *        읽기(메모리에서 데이터를 가져 온다)
 *        쓰기(메모리 저장)
 *        => final 데이터형 변수명=값;
 *           => 변수는 소문자로 시작
 *           => 상수는 전체 대문자
 *   ------------------------변수와 상수가 많은 경우에는 제어
 *   배열: 변수 여러 개를 한 개 이름으로 제어(관리가 쉽다)
 *        => 고정적
 *        => 같은 데이터형만 모아서 관리
 *        
 *   클래스 => 여러 개의 데이터를 저장할 수 있다
 *            => 고정적이 아니다(원하는 개수만큼 저장 가능)
 *        1) 데이터를 모아준다 => 한 개에 대한 정보
 *           사람 => 사람 1명에 대한 변수
 *           학생 => 학생 1명에 대한 정보 저장
 *           ---------------------------------
 *           저장하는 공간을 따라 만든 생성값
 *        => 데이터형 클래스
 *        => 액션 ==> 변수/메소드 
 *        ex) 학생
 *            class 학생 => 20명이라면? => 20개를 저장하는 공간을 만든다
 *            {
 *              이름
 *              학번    => 20개를 저장하는 메모리 만들어짐
 *              학점
 *              ...
 *            }
 *            ==> new ==> 1개의 데이터를 원하는 개수만큼 복사, 만들 수 있음
 *            ==> 다른 데이터형을 모을 수 있음
 *   ------------메모리에 저장
 *   파일
 *   데이터베이스
 *   ------------영구적인 저장 장치
 */
/*
 *   java => 한 개의 파일 안에 여러 개 클래스를 생성
 *   ** public class => 한 번만 사용 가능
 *   A.java
 *   public class A ==> 저장명
 *   {
 *   }
 *   class B
 *   {
 *   }
 *   
 *   A.java/B.java ==> 모두 가능
 *   class A
 *   {
 *   }
 *   class B
 *   {
 *   }
 *   권장 => 클래스는 가급적 파일을 따로 만든다
 */
class Student
{
	int hakbun;
	String name;
	int age;
}
public class 클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong=new Student();
		hong.hakbun=1;
		hong.name="홍길동";
		hong.age=20;
		System.out.println(hong);
		System.out.println(hong.name+"학번:"+hong.hakbun);
		Student shim=new Student();
		shim.age=21;
		shim.hakbun=2;
		shim.name="심청이";
		System.out.println(shim.name+"학번:"+shim.hakbun);
		Student ei=new Student();
		Student park=new Student();
		Student bu=new Student();
		

	}

}
