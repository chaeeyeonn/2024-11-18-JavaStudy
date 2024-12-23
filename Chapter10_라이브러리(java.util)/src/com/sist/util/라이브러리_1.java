package com.sist.util;
/*
 *   java.lang: 자바 기본 클래스의 집합 => import 생략 가능
 *   ---------Object / String / StringBuffer / Math / Wrapper
 *   java.util: 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *     => 반드시 import 사용
 *     1) 날짜
 *        Date => Calendar(보완)
 *     2) 문자열 분리
 *        StringTokenizer: split => 정규식
 *     3) 랜덤
 *        Random
 *     4) Collection => 자료 구조
 *        Collection 상속
 *          - List => **ArrayList / LinkedList - Queue / Vector
 *          - Set => **HashSet / TreeSet
 *          - Map => **HashMap / HashTable
 *   java.io: 입출력(메모리/네트워크/파일)
 *   java.net: 네트워크(Socket,URL)
 *   java.text: 변환(문자열, 날짜, 숫자)
 *   java.lang.reflect: 정규식
 *   java.sql: 데이터베이스 연동
 *   ------------------------------------
 *   웹 / 오픈 소스(외부 라이브러리)
 *       org / com
 */
import java.util.*;
//Scanner (x)
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		/*
		 *   r.nextInt() => Int 전체
		 *   r.nextInt(100) => 0~99 범위 설정 => ()속 숫자-1
		 *   ==> Math.random() => 안 쓰게 됨
		 */
//		int i=r.nextInt(100)+1;
//		System.out.println(i);
		// 게임, 예약일 등에 자주 쓰임
		int[] com=new int[6];
		for(int i=0;i<com.length;i++)
		{
			com[i]=r.nextInt(45)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					j--;
					break;
				}
			}
		}
		Arrays.sort(com);// 배열에 대한 제어 => java.util
		// => 오라클: ORDER BY no DESC(ASC)
		for(int i:com)
		{
			System.out.print(i+" ");
		}
		//
		System.out.println();
		for(int i=com.length-1;i>=0;i--)
		{
			System.out.print(com[i]+" ");
		}
	}
	
	

}
