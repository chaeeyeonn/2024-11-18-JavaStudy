/*
 *   1. String
 *     문자열 저장 클래스 / 일반 데이터형처럼 사용 가능
 *     String name=""; ==> 더 선호
 *     
 *     String name=new String("초기값")
 *     
 *     클래스 => 문자열을 제어하는 기능을 제공
 *                          ---- 메소드
 *          => 완전 표준화(확장 불가능 => 변경 사용 불가능)
 *     
 *     메소드
 *     1) 결과값(리턴형)
 *     2) 어떤 데이터를 첨부(매개변수)
 *     3) 메소드명
 *     기능       -- 매개변수
 *     int length()
 *     --- ------메소드명
 *     결과값(리턴형)
 *     
 *     boolean equals(String s) => if
 *     String s1="";
 *     String s2="";
 *     if(s1.equals(s2)) => 같은 경우
 *     if(!s1.equals(s2)) => 다른 경우
 *     //아이디 중복 체크, 로그인 등
 *     
 *     boolean contains(String s) => 포함되었는가
 *     String s1="asdfasdf";
 *     String s2="a";
 *     if(s1.contains(s2)) => 포함 상태 => s1과 s2 순서를 바꾸면 안 됨 => 범위가 큰 문자열 안에 작은 문자열 넣기
 *     //우편번호 검색 등
 *     
 *     boolean startsWith(String s)
 *     String s1="Hello Java";
 *     String s2="He"
 *     String s3="Java"
 *     if(s1.startsWith(s2)) => s2로 시작하는 문자열인지 여부
 *     if(s1.endsWith(s3)) => s3로 끝나는 문자열인지 여부
 *     //자동 완성기
 *     
 */
public class 문제정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
