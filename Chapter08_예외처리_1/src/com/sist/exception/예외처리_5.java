package com.sist.exception;
/*
 *   예외처리 => try~catch
 *   => IO / SQL
 *   => try: 정상 수행하는 문장
 *         => 입력값, 실수 => 오류 발생
 *       => 오류 찾아 복구 => catch
 *     => try: if / catch: else
 *     => catch: 한 개만 수행 , 클래스 크기에 따라 작은 순서 제작
 *                            ---------------------
 *                            1. 계층 구조
 *                               Object: 최상위 클래스
 *                                  |
 *                               Throwable
 *                               ----------
 *                               |         |
 *                             Error     Exception
 *                          => 처리 불가능  => 처리 가능
 *                                       ----------
 *                                       |         |
 *                                    Check      UnCheck
 *                         => 컴파일시 예외처리 무조건 확인  => 필요시 예외처리
 *   ==> 예외를 잡을 수 있는 능력은 상위클래스일수록 크다
 *   ==> catch(Exception e)
 *     
 */
public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
