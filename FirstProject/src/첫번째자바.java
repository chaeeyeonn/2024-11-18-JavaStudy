/*
    - 자바 설치
    1. path: c:\jdk-17.0.2\bin => java/javac
       classpath: 자바에서 지원하는 라이브러리를 사용
                  .;c:\jdk-17.0.2\lib =>현재폴더
    - 이클립스 설치
    1. File => new => JavaProject
    2. src 안에 자바 파일 생성
    
    public class ClassName{
    프로그램의 시작
              public static void main(String[] args)
              {
                 // 코딩 시작
              }
          }
    
    - Git
     => team ==> shareProject
     => team ==> commit
     
    - java 주의점
    1. 대문자 구분: 파일명은 대문자로 시작
    2. 들여쓰기 -> 가독성
    3. 명령문 종료시 ;(세미콜론)
       ; 제외 -> 파이썬 / Kotlon / javascript
    4. java의 경우 {가 옆으로 붙음, 코딩은 다음 줄에 쓰기(엔터하면 됨)
    5. 문법 익히기
       데이터 저장 ====> 데이터 처리(요청따라) ==> 화면 출력
           |               |                  |
           |            연산자/제어문          명령프롬포트: Application(문법배우기)
           |            ==========          브라우저 출력: Web Application(주력할 곳)
           |               |                모바일 출력: Mobile Application
           |             메소드               Spting: Java / Kotlin
         한 개 저장(메모리):변수/상수
         여러 개 저장: 배열
                    클래스
         ----------------
         프로그램 종료시 사라짐
         파일/오라클 => 영구적인 저장
         ================== 기본 문법
         1) 기능 모아서 관리
            ====
            => 단락 나누기: 메소드
            => 클래스 / 객체 => 객체지향 프로그램
            => 프로그램 유지(예외처리)
            =============================== 교재 8장까지
            => 라이브러리: 자바에서 지원
            -> 1차 응용프로그램(순수 자바)
        ==================> Web
        이후 과정
        1) HTML: 브라우저에서 실행
                 자바 경우 브라우저에서는 일반 텍스트
            => 투박함 => CSS나 자바스크립트 사용
        2) JSP(요청시 HTML -> JAVA
               응답시 JAVA -> HTML)
            | MVC(model view control
              ===
              Front + Back = Full
              |        |
              JS/TS   자바/오라클/스프링
        3) 통합: Framework : Spring
                기본틀 => 메인보드
        4) 데이터 분석: Python / Numpy / Pandas / MatplotLib
        5) NoSQL => elasitcsearch(데이터베이스, 오라클 역할) (구글이 이걸로 만듦)
        6) 배포: AWS
        =======================
        차세대 개발용 공부 과정
        spring-boot / JPA / MySQL / React-Query / Redux / Vue3 / NextJS / TypeScript / NodeJS(React에서 만듦)
        교재(9권)
        JAVA / ORACLE / 알고리즘
        HTML/CSS/JavaScript(한 권) / JSP
        Spring-Boot / Python / 데이터 분석
        elasicsearch
        ======================
        실무에서 잘 쓰는 것들
        Spring + MyBaties + JSP + JavaScript(Jquery)
 */
public class 첫번째자바 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		System.out.println("김채연");
		{
			
		}
	}

}
