package com.sist.exception;
/*
 *   1) 예외 방법과 형식
 *      ------------
 *      CheckException
 *        => java.io / java.net / java.sql
 *        => 반드시 예외처리 사용
 *        => 컴파일시 예외처리 작성했는 지 확인
 *      UnCheckException
 *        => java.lang / java.util
 *          => Object => clone() => 예외처리 필요
 *                      ---------메모리 복제(prototype)
 *        => 예외처리를 필요시에만 작성
 *                   -----사용자가 자주 발생하는 에러가 있는 경우
 *      웹 개발 => network(c/s) => 반드시 예외처리          
 *      1. 직접 처리(예외 복구)
 *         try
 *         {
 *            실행이 가능한 소스 코딩(정상 수행)
 *            => 에러가 발생할 수 있다 => 이에 사전 방지 목적
 *            => 에러 난 경우 스킵 => catch로 이동
 *            => if ~ else
 *         }catch(예외클래스)
 *         {
 *            1) 에러 확인 가능
 *               getMessage() => 에러 메시지 확인
 *               printStackTrace() => 실행 과정 => 에러 위치 확인
 *            2) 복구 여부 => 에러에 대한 영역
 *         }
 *         finally => 생략 가능
 *         {
 *            try ~ catch와 상관없이 무조건 수행
 *            => 서버 닫기 / 오라클 닫기 / 파일 닫기 ...
 *         }
 *         ** catch: 에러가 발생시 처리하는 영역
 *                 => 다중 catch 가능
 *                 => 에러 종류에 따라 따로 잡을 수 있음
 *                 => 최상위 예외 클래스 이용해 한 개로 통합 가능
 *                   => Exception / Throwable
 *                     -----------  ----------
 *                     예외만 가능     예외+에러
 *                 => 순서 존재: 작은 예외 클래스부터 큰 예외 클래스로 진행
 *                   => 계층도 이해
 *                   
 *         *** try에서 정상 수행 하면 catch는 수행하지 않는다
 *             finally가 있는 경우 finally는 수행한다
 *         *** try에 있는 문장을 수행하는 과정에서 에러가 난 경우에만 catch를 수행한다
 *         
 *    2. 간접 처리(예외 회피) => 컴파일 시 통과
 *      => 특별한 경우가 아니면 사용자 정의에서는 많이 사용하지 않음
 *         --------소스가 많은 경우(try설정이 어려운 경우)
 *                 ------------유지보수 => 추가하는 기능에 예외처리가 필요하다
 *                             ------기능추가 / 기능 수행
 *      => 시스템 자체에서 처리 => 복구x, 정상수행 불가능
 *      ex) public void display() throws Exception
 *          {
 *          }
 *          
 *          public void main() throws Exception
 *          {
 *             문장1
 *             display(); 에러 발생 => 종료
 *             문장2
 *             문장 종료
 *          }
 *          ** try~catch 주 사용
 *          
 *      static => 변수, 메소드 => 컴파일시에 메모리 저장
 *      instance=> 변수, 매소드 => 객체 생성 후 메모리 저장
 *      
 *      => 메소드() throws 예외클래스, 예외클래스,....... => 순서 상관 x
 *               -------------------------
 *               컴파일러에 알려준다(예외 선언)
 *               -----------------------
 *               다음 호출시에 처리한 다음 사용하겠다
 *      => 예외처리가 많이 선언 => 한개로 통합 => 가장 큰 예외처리 클래스 이용
 *      
 *      *** 자바에서 예외처리는 전체를 제공하지 않는다
 *      *** 필요에 따라 사용자 정의 예외처리 제작가능
 *               
 *         
 */
public class 예외처리_예외복구 {
	public void display() throws Exception
	{
		System.out.println(10/0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인스턴스는 사용이 불가능 => 사용시에는 반드시 객체 생성 후 사용
		// static은 바로 사용 가능
		예외처리_예외복구 a=new 예외처리_예외복구();
		//a는 메모리 주소(객체)
		//a=>display가 저장
		try
		{
			a.display();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("정상 수행");

	}

}
