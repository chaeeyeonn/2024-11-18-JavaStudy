/*
 *    변수 => 데이터를 모아서 관리 => 배열 / 클래스
 *    연산자 응용 => 제어문
 *    제어문 응용 => 배열
 *    배열 응용 => 메소드
 *    메소드 응용 => 클래스
 *    클래스 응용 => 라이브러리
 *    ------------------------------------
 *    처리하는 기능이 많은 경우 => 소스코딩이 많다 => 조립
 *    
 *    1) 문자열 => 웹, 윈도우 프로그램의 대부분
 *               가장 많이 사용되는 데이터형
 *               문자 여러 개를 모아 저장
 *               ---------char[] => String
 *    2) String: 일반 데이터형 / 클래스형
 *       사용 방법
 *       : 일반 데이터형 => 가장 많이 사용
 *         String 변수명="";
 *       : 클래스형
 *         String 변수명=new String("저장 데이터","UTF-8") => 한글은 2byte
 *         -------------------------------------------한글 변환(브라우저 => char => 1byte)
 *    3) String의 default값은 null(주소가 없는 상태)
 *       => 모든 클래스의 default(에러나면 'NullPointerException'뜸)
 *    4) String 기능(메소드)
 *       ** String, Math, Scanner, System은 final class 
 *       => 변경 불가능 / 있는 그대로 사용 => 오버라이딩 불가능 / 표준화
 *       ** java.lang.* => import를 생략할 수 있다
 *       메소드 => 결과값, 매개변수, 메소드명, 기능 알기
 *       
 *       - 변환
 *         : toUpperCase() => 대문자 변환
 *           결과값: String / 매개변수: X
 *           / 메소드명: toUpperCase / 기능: String toUpperCase(), String name=toUpperCase()
 *         : toLowerCase() => 소문자 변환
 *           String toLowerCase()
 *         ***: valueOf() => 모든 데이터형을 문자열로 변환
 *              String valueOf(int/char/double/...) => 오버로딩(같은 개념을 가지고 데이터형에 따라 다른 기능을 만든다)
 *         ***: replace() => 문자, 문자열 변환
 *              String replace(char c1,char c2) => c1을 c2로 변경
 *              String replace(String old,String new)
 *              ------리턴형
 *         : replaceAll() => 패턴을 이용한 문자열 변환
 *                           --------regex(정규식)
 *           String replaceAll(String regex,String change)
 *                            --------------
 *       - 문자 분해
 *         ***: substring() => 문자 자르기
 *              String substring(int begin)
 *              String substring(int begin,int end)
 *                                         =======end-1까지만 자름
 *         ***: split() => 단어별로 나눠서 배열에 저장
 *              String[] split(String regex)
 *       - 비교
 *         ***: equals() => 같은 경우 true / 다른 경우 false (==)
 *              boolean equals(String s)
 *         : startsWith() => 시작하는 문자열이 같은 경우
 *           boolean startsWith(String s)
 *         : endsWith() => 끝나는 문자열이 같은 경우
 *           boolean endsWith(String s)
 *         ***: contains() => 포함된 문자열이 같은 경우
 *              boolean endsWith(String s)
 *              ===> 주로 if문에서 사용
 *       - 위치 찾기
 *         ***: indexOf() => 처음부터 찾기 / 문자, 문자열
 *         int indexOf(char c)
 *         int indexOf(String s) => 문자열의 첫 글자 찾음(자바)
 *         : lastIndexOf() => 끝부터 찾기
 *           intlastIndexOf(String s)
 *       - 문자열 결합
 *         : concat() => 문자열 결합
 *           String concat(String s)
 *         :    +     => 문자열 결합
 *       - 기타
 *         ***: trim() => 좌우 공백 제거(가운데 제외)
 *              String trim()
 *         : charAt() => 문자의 위치 알고 문자 읽기
 *           char charAt(int index) 어떤값(매개변수) => 결과값(리턴형)
 *           ==> 사용자 요청값 => 매개변수
 *               처리 => 결과값
 *         : toCharArray() => String을 char[]로 변경
 *         
 *   => 문자열 배열
 *      형식)
 *          String[] arr={"","","","",""} => 명시적 초기화
 *          String[] arr=split()
 */
import java.util.Scanner;
public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 선언과 동시에 초기화
	    String[] names= {"홍길동","심청이","박문수","이순신","강감찬"};
	    Scanner scan=new Scanner(System.in);
	    System.out.print("이름 입력:");
	    String name=scan.next();
	    //정수:nextInt(), 실수:nextDouble()
	    //문자열:next() => 공백이 있는 경우 nextLine()
	    //논리: nextBoolean()
	    
	    // 출력
	    for(String n:names)
	    {
	    	//if(n.equals(name))//입력값과 n이 같은가 / 대소문자 구분(구분없으면 equalsIgnoreCase)
	    	if(n.contains(name))
	    	System.out.print(n+" ");
	    }
	    

	}

}
