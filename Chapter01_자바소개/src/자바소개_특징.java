// 주석 => 한 줄 주석 => 가독성 위함
/*
 * 여러 줄 주석
 * 오늘 강의
 * 1. 변수: 데이터형( 메모리에 저장하는 크기)
 * =================이후 JAVA 강의
 *    데이터 저장: 메모리에 저장 => RAM에 저장( 프로그램 종료시 사라짐)
 *              => 영구 저장? 파일/ RDBMS(오라클) => 공유 데이터
 * 2. 사용자 요청 따라 데이터 처리
 *    1) 연산자  2) 제어문
 * 3. 여러 개 동시 저장
 *    1) 같은 데이터 저장 (정수만, 실수만 등등) => 배열
 *    2) 다른 데이터 저장 (정수 + 실수 등) => 클래스(객체 지향 연결) -> 자바 특성 '재사용'(수정/추가 가능)
 * 4. 데이터 모아서 관리: 배열, 클래스
 *    명령문 모아서 관리: 메소드
 * 5. 객체 지향 프로그램
 *    => 가독성 중요
 *    => 재사용성
 *    => 최적화(퍼포먼스, 속도가 빠름, 기능이 쉬움)
 * 6. 예외처리: 종료하지 않는 프로그램: 에러가 나도 프로그램이 꺼지지 않고 에러임을 알림
 * ==================기본 문법
 * 7. 라이브러리: JAVA에서 지원하는 기능 (클래스, 메소드)
 *    => IO / 네트워크: Web 프로그램 기반
 * 8. 미니 프로젝트: 파일 기반 데이터
 * 
 * 교재 2page
 * - 자바 실행 과정
 * 프로그램 언어: C, C++, GAVA, C#, Python...
 * => java 언어는 프로그래머만 인식하는 언어, 컴퓨터는 모르는 언어다
 * => 컴퓨터가 인식할 수 있게 변경 => '컴파일'한다 => 컴퓨터가 알아듣는 이진법 숫자로 바뀜
 * ex) 'a' -> 65 -> 100001 => 모든 문자마다 번호를 가지고 있다('Unicode') => 0~65535
 * C/C++ 경우 A.c => A.obj(컴파일) => A.exe
 * **Java 경우 A.java => A.class(컴파일, javac) => 화면 출력(인터프리터, java)
 *                       -> 바이트 코드: 모든 운영체제에서 동일하게 사용 -> 배포용**
 * ==> java 소스 검증 2번 (컴파일(문법상의 에러 찾음), 실행시) => 보안이 높음  (HTML, CSS등은 소스 검증이 잘 안 되어 힘듦)
 * 
 * 교재 5page 이미지
 * - 이클립스는 코딩시마다 자동 컴파일이 된다: class가 바로 만들어짐 -> 바로 에러 출력
 *   javac는 자동 처리 -> java(실행) -> ctrl + F11
 *   
 * 교재 6page: 개발환경 구축
 * 1. JDK: jdk.java.net/17 (다운로드)
 *    => oracle(1.8(호환성 가장 좋음/ SUN사) 이후 유료) / openjdk(무료)
 *    => Spring Framework(11버전까지만 사용 가능) / Spring-Boot(17버전 이후 가능)
 *    => 버전 호환 찾아야 함
 * 2. 환경 설정
 *    내 PC - 속성 - 고급 시스템 설정 - 환경 변수 - 시스템 변수 - Class path(.;c:\jdk17.0.2\lib) , Path(c:\jdk17.0.2\bin)
 *    (리눅스: .bashrc)
 * 3. 편집기
 *    1) Eclipse(IBM에서 만든 통합 개발 툴, IDE)(무료)
 *      => Back-End 중심(Java/Web/Spring)
 *      => eclipse.rog
 *    2) 인텔리J
 *      => Back-End, Front-End중심(무료, 유료 존재)
 *      => jetbrains.com
 *  file - new - JavaProject - 프로젝트 폴더 생성
 *  => src 안에 class 만들어 사용 => 프로그램 시작점이니 'main'함수 설정(안 하면 실행 안 됨)
 * 
 * 교재 19page
 * - 주의점
 * 1. Java 파일명 = Class명
 * 2. 대소문자 구분(되도록 영문)
 *   *자바 개발자 약속
 *    1) 클래스명은 대문자로 시작, 두 번째 단어도 대문자로 시작
 *       ex) MainClass => 헝거리언식 표기법 / Main_class도 가능
 *    2) 변수/메소드는 소문자로 시작
 *    3) 상수는 전체를 대문자로 표기
 *    4) 가급적 모든 표기엔 의미 부여
 *       ex) a / movie_name => 후자가 의미 있음
 *           a, b, c / kor, eng, math => 후자가 의미 있음(3~7글자가 좋음)
 * 3. 문장 종료시(명령어) ; 쓰기
 * 4. 변수: 변경 가능
 *    상수: 변경 불가능(항상 앞에 'final'이 붙음, 맨 뒤 명칭은 대문자)
 *    리터럴: 실제 저장된 값 (ex: age(변수)=20(리터럴);)
 *    
 * 교재 23page 이미지
 * - Java 구조
 * Public class ClassName => 클래스 시작
 * { 프로그램 시작점
 *    public static void main(String[] arg)
 *    { => 메소드 시작
 *      ==> 기능 수행 => 소스 코딩
 *    } => 메소드 종료
 * } => 클래스 종료
 * 확장시
 * public class ClassName{
 * 변수
 * 생성자 => 변수의 초기화
 * 사용자 정의 메소드
 * main() => CBD
 * }
 * 
 * 교재 22~23page
 * - 들여쓰기: 포함관계가 확실히 드러나도록 들여쓰기 하기
 * - 주석: 컴파일 예외
 *   HTML <!-- -->
 *   CSS //
 *   Python #, """
 *             """
 *   JSP <%-- --%>
 *   
 *   JAVA 대량 주석: ctrl+(shift)+/
 *        주석 풀기: ctrl+(shift)+\
 */
public class 자바소개_특징 {
// class 만들 때 main 설정 안 한 경우: main + ctrl + space
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");

	}

}
