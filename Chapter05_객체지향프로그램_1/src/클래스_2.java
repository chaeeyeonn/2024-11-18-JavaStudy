// 클래스 제작 => 인스턴스와 정적 변수 구분
/*
 *   클래스
 *     - 사용자 정의 데이터형: 데이터를 모아서 전송 목적, 데이터 관리
 *       배열의 단점을 보완 => 구조체 => 클래스로 대체
 *       => 변수 여러 개를 모아서 관리(관련된 변수를 모아서 저장)
 *       => 배열: 고정적, 같은 데이터형만 vs 클래스: 가변형, 다른 데이터형을 모아서 관리
 *       => ~VO: Value Object: 값만 저장 => Spring
 *       => ~DTO: Data Transfor Object: 데이터를 모아서 전송 => 브라우저, 윈도우, 서버에 전송
 *     
 *     - 액션 클래스: 변수 + 기능(메소드) => 기능 처리
 *       => 메소드 중심
 *       => ~DAO: 데이터베이스 연결과 처리 => 오라클 / MySQL
 *       => ~Manager, ~Service, ~Model
 *          |크롤링,맵  |BI       |브라우저 연동
 *          OpenApi  |DAO+Model
 *       => 보안처리 => 벌금
 *          |시큐어코딩
 *          
 *   변수
 *     : 데이터값을 따로 저장 => 인스턴스 변수 => static(X)
 *     : 한 개의 메모리 공유 => 정적 변수, 공유 변수 => static(O)
 *   ex) 카드 52장
 *       => 클래스는 한 개 설계 => 저장 여러 개 사용
 *       class Card
 *       {
 *         char number; => '\O'
 *         String type; => null
 *         static int width; => 0
 *         static int height; => 0
 *       }
 *       Card c1=new Card();
 *               ---새 메모리 생성 => 인스턴스 변수
 */
class Card
{
	char number;
	String type;
	//new를 이용해서 저장공간 생성 후 사용 => 여러 개 사용 가능
	static int width;
	static int height;
	//컴파일시 자동 생성 => 저장 공간 한 개로 공유
}
public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1=new Card();
		// 객체 => 정적 상태(데이터) : 명사형 => 변수
		//     => 동적인 상태(메소드) : 동사형 => 메소드
		//     => 변수+메소드
		//     => 현실 세계에 있는 모든 사물
		/*
		 *   1. 설계: 관련 데이터 모아 관리
		 *      class Student
		 *      {
		 *        int hakbun;
		 *        String name;
		 *        String subject;
		 *      }
		 *   2. 메모리 저장: 설계된 에이터 저장
		 *      Strudent s1=new Student()
		 *   3. 활용
		 *      s1.jakbun=10;...
		 *   4. 객체 소멸
		 *      s1 => null => GC 대상
		 *      => System.gc() => 멀티미디어, 화상채팅
		 *      
		 *      class Student
		 *      {
		 *        int kor,eng,math,total,rank;
		 *        double avg
		 *        => 클래스 전체에 사용 가능
		 *        => 전역변수
		 *        => 다른 클래스에서 사용 가능
		 *      }
		 *      
		 *      학생 => 성적관리 시스템
		 *      ---actor
		 *      
		 *      산출물: 반드시 프로젝트 제출!
		 */
		
		c1.number='A';
		c1.type="♡";
		c1.width=150;
		c1.height=180;
		System.out.println("c1 안에 저장된 데이터num: "+c1.number);
		System.out.println("c1 안에 저장된 데이터type: "+c1.type);
		System.out.println("c1 안에 저장된 데이터width: "+c1.width);
		System.out.println("c1 안에 저장된 데이터height: "+c1.height);
		
		Card c2=new Card();
		c2.number='2';
		c2.type="♣";
		// 메모리 따로 생성 => 인스턴스(객체 변수)
		c2.width=200;
		c2.height=250;
		// 메모리 하나 공유
		System.out.println("c2 안에 저장된 데이터num: "+c2.number);
		System.out.println("c2 안에 저장된 데이터type: "+c2.type);
		System.out.println("c2 안에 저장된 데이터width: "+c2.width);
		System.out.println("c2 안에 저장된 데이터height: "+c2.height);
		//static => 객체명.변수명
		//----------> 클래스명.변수명
		Card.width=300;
		Card.height=350;//클래스 변수
		//컴파일 시에 메모리 생성
		// Card 6byte
		//c1 => number, type => 객체
		/*
		 *  객체: 사용자 정의 클래스의 변수 => 여러 개 제어 가능
		 *     : 여러 개 변수를 저장할 수 있는 메모리 공간의 이름
		 *     : 메모리 주소를 이용하는 프로그램 => 참조 변수
		 *  ***** 자신의 데이터 메모리에만 접근 가능
		 */

	}

}
