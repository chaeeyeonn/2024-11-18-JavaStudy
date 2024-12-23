/*
 *   반복문 => for
 *    1. 형식
 *    for(초기식;조건식;증감식)
 *    {
 *      반복 수행 문장
 *    }
 *    => 향상된 for => for-each: JDK 1.5이상
 *                   ---------배열 / Collection
 *                            웹에서 주로 사용
 *                   VueJS/ReactJS
 *                    |Vuex   |Redux
 *                              |React-Query=> 개인 프로젝트
 *                               ===========Nextjs
 *                                  |MSA
 * - 프로젝트
 * 1) 자바 => 자바 정리
 * 2) 웹 데이터베이스 활용 / JSP 사용 / MVC 구조
 * 3) 웹 Spring 관련 내용 습득, 데이터베이스 고급
 * 4) 웹(개인프로젝트) => 신기술
 *   
 *   2. 동작 순서(66page)
 *    초기식 -> 조건식 -> 반복 수행 문장 -> 증감식
 *             | false면 종료
 *    초기식은 한 번만 수행
 *   3. 프로그램 구현 방법
 *      순서
 *      1) 변수 설정
 *      2) 변수 초기화 => 난수 / 명시적 / 입력값
 *      3) 제어문을 이용해서 사용자 요청값을 추출
 *        => 데이터베이스 안에 있는 데이터 추출
 *      4) 결과값을 출력
 *   
 *   for 무한루프: 종료가 없는 상태
 *   => for(;;) => while(true)
 *   ** 1~10까지 출력 => for/while/do~while 모두 가능
 *   => 프로그램의 단점: 정답이 없다 / 오라클: SQL문장이 다 다르다
 */
import java.io.*;
public class 반복문_6 {

	public static void main(String[] args) throws Exception{ 
		// TODO Auto-generated method stub
        FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		//String movie="";
        StringBuffer sb=new StringBuffer();//Buffer:최적화
		int i=0;
		while((i=fr.read())!=-1)// -1EOF
		{
			sb.append((char)i);
		}
		fr.close();
		System.out.println(sb.toString());

	}

}
