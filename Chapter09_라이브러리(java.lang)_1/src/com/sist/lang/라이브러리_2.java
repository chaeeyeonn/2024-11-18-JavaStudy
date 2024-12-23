package com.sist.lang;
/*
 *   java.lang
 *     1. Object
 *       : 최상위 클래스 => 모든 클래스의 상위 클래스
 *         ----------객체 관련 기능
 *         객체 소멸 / 객체 복제 / 객체 비교 / 객체 생성
 *         -------   -------   ------   -------
 *         finalize()  **clone()  **equals()  getClass()
 *         
 *     2. String: 문자열 관리 클래스
 *       => 웹의 3대 클래스
 *          String / ArrayList / Integer
 *       => 오라클 연동 3대 클래스
 *          Connection / ResultSet / Statement
 *       기능
 *         1) trim(): 공백 제거(좌우)
 *         2) length(): 문자 개수
 *         3) substring(): 문자를 자르는 경우
 *         4) indexOf/lastIndexOf => 문자 위치 찾기
 *         5) equals(): 문자 비교
 *            -----------------가장 많이 등장 => 로그인
 *         6) contains(): 포함 문자열
 *         7) startsWith(): 시작 문자열 => 방문한 맛집
 *            ex) food_1 food_2
 *        ** 8) valueOf(): 다른 데이터형 문자열 변환 => 윈도우 => Cookie: 저장값 무조건 String
 *         9) replace() / replaceAll()
 *         10) split()
 *     3. StringBuffer: 문자열 결합 => append
 *     4. Math: Random() / ceil()
 *       => 모든 메소드가 static으로 만들어짐
 *       => Math.random(), Math.ceil()
 *     5. System: println() / print() / printf() / gc() / exit() => 윈도우
 *     6. Wrapper
 *        : 기본형(데이터형)을 클래스화 시켜서 사용이 편리하도록 만든 클래스
 *          byte => Byte
 *          short => Short
 *          ***int => Integer
 *          ***long => Long
 *          float => Float
 *          ***double => Double
 *          char => Character
 *          ***boolean => Boolean
 *          ----------------------메소드(기능)
 */
import java.io.*;
public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//log file 만들 때
			long start=System.currentTimeMillis();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;//문자 하나씩 받기
			String data="";//문자열 결합
			StringBuffer sb=new StringBuffer();
			// 문자열 결합의 최적화
			// 파일읽기 => 웹사이트 읽기 => HTML
			while((i=fr.read())!=-1)
			{
				//data+=(char)i;
				sb.append((char)i);
			}
			fr.close();
			System.out.println(sb.toString());
			long end=System.currentTimeMillis();
			// 문자열 제어는 String
			// 문자열 결합은 StringBuffer (비동기적): 데이터 크롤링 => 쓰레드
			//            StringBuilder (동기적)
			System.out.println("걸린 시간:"+(end-start));
		}catch(Exception ex) {}

	}

}
