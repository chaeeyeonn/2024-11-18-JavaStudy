package com.sist.main;
/*
 *   교재194page
 *   상속: 이미 만들어진 클래스를 재사용
 *        ---------------기존의 클래스(사용자 정의, 라이브러리)
 *     - 상속을 내리는 클래스: 공통 적용되는 내용
 *     - 상속 받는 클래스: 유지보수 용이, 반복 제거, 관리 용이, 속도 느림, 변경 어려움, 소스 볼 수 없어 가독성 떨어짐  
 *                  => 가독성, 최적화가 어려워 가급적이면 상속 사용하지 않음
 *     => 클래스를 상속받아 새로운 클래스(기존 클래스+새로운 추가)
 *     => 메모리: 상속받은 클래스가 더 크다
 *        실제 크기 => 상속내리는 클래스가 더 크다
 *    *** 자바에서 가장 큰 클래스 = Object => 최상위 클래스
 *                            ---------클래스 리턴형 => Object
 *                            
          *** 어떤 클래스로 저장
 *      
 *        
 *   포함: 재사용
 *        상속 / 포함 - 그대로 사용
 *        --변경 사용
 *        상속 안 되는 클래스: final class => String, Sysetem, Scanner, ...
 *    
 *  
 */
import java.util.*;
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList();
		list.add("홍길동");
		
		String name=(String)list.get(0);//형변환
		

	}

}
