package com.sist.lang;
/*
 *   java.lang
 *     => Object / String / StringBuffer / Math / Wrapper
 *   java.util
 *     => Random / StringTokenizer / Date / Calendar
 *     => Collection(List, Map, Set)
 *   java.io
 *     => File / FileInputStream / FileOutputStream / FileReader / FileWriter / BufferReader
 *        BufferedInputStream / BufferedOutputStream / ObjectOutputStream / ObjectInputStream
 *   java.sql
 *     => Connection / Statement / ReasultSet
 *     
 *   => 외부 라이브러리(웹) => 파싱(XML, HTML, JSON, CSV)
 *   
 *   = java.lang
 *   - StringBuffer: 임시로 문자열을 저장 => 한 번에 출력
 *       => append(): 문자열 결합
 *   - Math
 *       => random(): 임의 발생 => 0.0~ 0.99
 *       => ceil(): 올림 => 총 페이지
 *   - Wrapper
 *       : 데이터를 쉽게 다루기 위해 클래스화한 클래스
 *       => 제네릭스: 데이터형의 통일화 => 형변환없이 사용
 *         => Collection
 *       => int => Integer: 문자열을 정수형 변환
 *                 Integer.parseInt("10")
 *       => long => Long: 문자열을 long으로 변환
 *                  Long.parseLong("")
 *       => double => Double: 문자열을 실수로 변환
 *                    Double.parseDouble()
 *       => boolean => Boolean: 문자열을 논리형으로 변환
 *                     Boolean.parseBoolean()
 *      --------------------------------------------
 *      ==> 혼합 가능
 *          Integer i=100; => AutoBoxing
 *          int ii=i; => UnBoxing
 *      --------------------------------------------9장
 */
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=135;
		// SELECT CEIL(COUNT(*)/10.0) FROM emp; => 오라클
		int totalpage=(int)(Math.ceil(count/10.0)); // => 13.5 => 14
		/*
		 *  가끔 쓰는 편
		 *  게시판 게시물 중 삭제되는 게시물로 인해 count가 바뀌더라도 페이지 수 그대로 냅두고 싶을 떄
		 */
		System.out.println(totalpage);
		//Random => nextInt(100)+1 이 편함

	}

}
