/*  *******외워요********
 * 
 *   String 클래스 => char[]을 제어
 *   => 문자 여러 개 저장하는 공간
 *      ---------문자열: "" / char: ''
 *   => 문자열을 저장하는 일반데이터 형식 / 기능(메소드)을 가지고 클래스형
 *   => 웹 / 윈도우 => 자바로 만들 수 있는 모든 프로그램의 핵심
 *    (=> 오라클: varchar2 / clob, MySql: varchar, text)
 *    (=> C/C++: 문자열이 없다 => char[], char*)
 *  => 문자열 저장하는 방법
 *     String name="Java"
 *     ------ ----
 *     데이터형 변수명
 *  => 클래스형으로 저장하는 방법
 *     String name=new String("Java");
 *  => String에서 지원하는 기능(메소드)
 *     - 메소드
 *     : 리턴형(처리 결과값), 메소드명(매개변수...)
 *       --------------  -----------------
 *       데이터형          기능    어떤 값을 첨부하는가
 *       {
 *        요청 처리
 *        결과값 전송
 *       }
 *       리턴형: 결과값 1개
 *       매개변수: 없는 경우 / 1개인 경우 / 여러 개인 경우
 *               random()  substring(1) substring(1,4)
 *               length()
 *       메소드: 라이브러리 => 이미 만들어져 있음
 *           *** 사용자 정의 => 직접 만들어 처리
 *    ***객체지향 프로그램: 변수 / 메소드
 *  
 *  => String에서 사용하는 메소드
 *  ***1) length(): 문자의 개수(한글/알파벳) => 동일
 *                 * 알파벳: 저장시 1byte: ASC/Unicode
 *                   한글: 저장시 2byte: Unicode => "UTF-8"
 *     -------------------------------------------------
 *     원형
 *     int length()
 *     
 *       => int len=length()
 *       => long / float / double로 받을 수 있음
 *       => 데이터형이 같거나 더 큰 데이터형으로 받을 수 있음
 *       => 작은 데이터형으로 받아야할 경우 => 형변환
 *          String word="홍길동";
 *          byte len=(byte)word.length();
 *       ** 가급적이면 같은 데이터형을 이용하길 권장
 *     --------------------------------------------------
 *     ex)
 *         String word="홍길동"
 *         int len=word.length(); // word 안에 있는 글자 수
 *         => len=3
 *         => 비밀번호 글자 수 조절, 입력 확인
 *            if(word.length()<1) => 입력 안 된 상태
 *         => 유효성 검사
 *         
 *  2) charAt(): 원하는 위치의 문자 한 개 추출
 *     -------------------------------------------------
 *     원형
 *     char charAt(int index)
 *      |              | -> index 번호에 해당하는 문자 추출 요청
 *     결과값         매개변수
 *     --------------------------------------------------
 *     문자열 저장
 *     String msg="Hello Java"
 *                 0123456789 => 인덱스 번호는 0부터 시작
 *                               => 배열(문자열): char[]
 *     charAt(3) ==> '1'
 *     ex)
 *         String msg="Hello Java";
 *         char c=msg.charAt(6) ==> c='J'
 *         String => 저장할 수 있는 문자의 개수는 제한이 없다
 *                => 줄거리 / 회사 소개
 *                
 *  ***3) indexOf => 지정된 문자나 문자열의 인덱스 번호를 찾아주는 역할
 *     => 웹(MVC)
 *     => 브라우저에서 실행되는 언어 => 자바가 아니다 => HTML로 출력
 *     --------------------------------------------------
 *     원형
 *     => 오버로딩 기법 (중복 메소드 선언)
 *        => 새로운 기능 추가하는 것
 *     int indexOf(char c)
 *     int indexOf(String s)  
 *     ---------------------------------------------------
 *   *** 오버로딩 vs 오버라이딩
 *   오버로딩: new => 새로운 기능 추가
 *   오버라이딩: modify => 기능 변경
 *     -------------------------------------------------
 *     String msg="Hello Java";
 *     int index=msg.indexOf('J');
 *         index=6
 *     int index=msg.indexOf('K')
 *         index=-1 // 존재하지 않음  
 *     문자열을 찾는 경우에는 첫 번째 문자의 인덱스 번호 추출
 *     => 대소문자 구분하기
 *     => 첫 번째 문자부터 찾기
 *     
 *  ***4) lastIndexOf: 뒤에서부터 요청된 문자의 인덱스 번호 추출
 *     -------------------------------------------------
 *     원형
 *     int lastIndexOf(char c)
 *     int lastIndexOf(String s)
 *     => URL / 파일 경로 / 확장자
 *     
 *     ex)
 *         String msg="Hello Java"
 *                     0123456789
 *         int len=msg.indexOf('a');// 7
 *         int len=msg.lastIndexOf('a');// 9
 * 
 *  ***5) 검색 관련
 *     contains(): 포함 문자 => %검색어%(오라클)    
 *     => 일반 검색기
 *     --------------------------------------------------
 *     원형
 *     boolean contains(String s)
 *                     --------포함된 문자
 *                     포함된 경우: true
 *                     불포함: false
 *     => 사용되는 제어문: if
 *     => 정규식이 더 편함(다른 단어들을 많이 섞어 쓸 것이기에)
 *     => 제목, 내용, 가수명 등 찾기
 * 
 *  6) 서제스트: 자동 완성기
 *     (프로그램 만들 때 자동 완성될 데이터가 없으니 네이버나 구글 데이터 끌고 올까? 쿠키에 저장했다 뿌릴 것인가) => 타겟형 광고
 *     *startsWith: 시작 문자열이 같은 경우 (자음만 쳐도 나오게 할까? => 오라클: Procedure)
 *     *endsWith: 끝나는 문자열이 같은 경우
 *     --------------------------------------------------
 *     원형
 *     ***boolean startsWith(String s)
 *                      => 해당 문자열로 시작
 *         => 웹에서 방문한 맛집 등(쿠키)
 *     ***공백 => trim(): 공백 제외
 *     
 *     boolean endsWith(String s)
 *                     => 해당 문자열로 끝
 * 
 *  *7) 변환
 *     replace() => 문자/문자열 변환
 *     --------------------------------------------------
 *     원형
 *     String replace(char old, char new)
 *     String replace(String old, String new)
 *     ==> 오버로딩
 *     ---------------------------------------------------
 *     String msg="Hello Java"; => 원본은 바뀌지 않음
 *     String s=msg.replace('a','b')
 *     s="Hello Jbvb"
 *     String s=msg.replace("Java","Oracle");
 *     s="Hello Oracle"
 *     
 *     replaceAll() => 전제 변경
 *     ---------------------------------------------------
 *     String replaceAll(String regex,String s)
 *                       ------------
 *                       패턴을 적용해서 변경 => 정규식
 *     => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
 *        모든 ip 가져오는 패턴
 *        맛있다 맛있고 맛있지 맛있니 ...
 *        맛있*
 *     
 *  
 *  ***8) trim(): 좌우의 공백만 제거
 *  => 입력여부 => 데이터를 자르는 경우에 공백을 제거
 *     원형
 *     String trim
 *     
 *     String msg="  Hello Java   ";
 *     Strings=msg.trim()
 *       => s="Hellp Java"
 *     ----------------------------------------------------
 *  9) toUpperCase: 대문자 변환
 *     toLowerCase: 소문자 변환
 *     ----------------------------------------------------
 *     원형
 *     String to UpperCase()
 *     String to LowerCase()
 *     
 *     String msg="Java";
 *     String s=msg.toUpperCase()
 *            s="JAVA"
 *     String s=msg.toLowerCase()
 *            s="java"
 *      
 * ***10) valueOf() => 모든 데이터형을 문자열로 변환
 *     -----------------------------------------------------
 *     원형
 *     중복메소드 정의 => 메소드명이 동일
 *     String valueOf(int i)
 *     String valueOf(byte i)
 *     String valueOf(char i)
 *     String valueOf(boolean i)
 *     String valueOf(float i)
 *     String valueOf(double i)
 *     String valueOf(char[] i)
 *     => static으로 제작
 *        ------변수 선언 없이 클래스명으로 접근 가능
 *        String.valueOf()
 *        => Math.random()
 *        Scanner scan=new
 *        
 * ***11) substring(): 문자열 자르기
 *     -------------------------------------------------------
 *     원형
 *     String substring(int begin)
 *            => begin부터 마지막 문자열까지  
 *     String substring(int begin, int end)
 *            => begin부터 end-1까지     
 *     ex)
 *     String s="aaa.java";
 *     String ext=s.substring(4); // => java
 *         => indexOf(), lastIndexOf()
 *         
 *     String substring(int begin, int end)
 *     String s="Hello Java";
 *     => 중간에 자르는 경우 (begin~end)
 *     => s.substring(2,5)// ello
 *                      -미포함
 *                      => end-1
 *     
 * ***12) split(): 단어별 구분하기
 *     --------------------------------------------------------
 *     원형
 *     String[] split(String regex)
 *     ==> 1|제목|출연|상영일...
 *     
 * 13) format(): 변환
 *     ---------------------------------------------------------
 *     원형
 *     String format(String s, Object obj...)
 *     가변 매개변수 => 원하는 개수만큼 사용 가능
 *     format("%d %d %d",10,20,30)
 *     =>%.2f 소수점 아래 두 자리까지
 * 
 * ***14) equals(): ==(저장된 문자열 비교)
 *     원형
 *     booles equals(String s)
 *     => 로그인 처리...
 *         
 */

import java.util.Scanner;

public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String msg="Hello Java";
//		int len=msg.indexOf("Java");
//		System.out.println(len);
//		대소문자 구분
//		if(msg.contains("va"))
//		{
//			System.out.println("포함되어 있습니다");
//		}
//		else
//		{
//			System.out.println("포함되지 않는 문자열입니다");
//		}
//		String msg="   Hello Java";//공백이 있는 경우 찾기 힘듦
//		if(msg.trim().startsWith("Hello"))//trim(): 공백 제외
//		{
//			System.out.println("yes");
//		}
//		else
//		{
//			System.out.println("no");
//		}

//String[] data={
//				"자바와 JSP",
//				"혼자 배우는 자바",
//				"스프링과 자바",
//				"자바의 정석",
//				"자바 기초",
//				"스프링 부트와 자바"
//		};
//		Scanner scan=new Scanner(System.in);
//		System.out.print("검색어 입력:");
//		String fd=scan.next();
//		
//		for(String d:data)
//		{
//			if(d.startsWith(fd))
//			{
//				System.out.println(d);
//			}
//		}
		int a=10;
		int b=20;
		System.out.println(a+b);//30
		System.out.println(String.valueOf(a)+String.valueOf(b));//1020 => 문자열로 변환
	}

}
		
		
