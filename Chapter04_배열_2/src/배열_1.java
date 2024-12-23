/*
 *   데이터 저장 ====> 데이터 가공 ======> 결과값 출력
 *   --------변수    --------연산자/제어문 -------브라우저, 핸드폰, 윈도우
 *           묶어서 한 개 이름으로 제어
 *   --------------------------------------------
 *   관련된 데이터를 묶어서 사용: 배열, 클래스
 *   관련된 명령문을 묶어서 사용: 메소드
 *   --------------------------------------------자바 기본 형식
 *   => 객체 지향 프로그램(5장)
 *   배열: 관련된 제이터를 여러 개 모아서 한 개의 이름으로 관리
 *   ---
 *     1) 장점: 여러 개 변수를 한 번에 처리 가능
 *             => 연속적인 메모리 구조: 메모리 크기 동일 => 같은 데이터형만 모아 관리
 *     2) 단점: 한 번 선언하면 변경/추가/삭제 불가능
 *         => 가변형(컬렉션) 등장
 *   
 *   1. 배열 생성
 *      데이터형[] 배열명;==> 권장사항
 *      데이터형 배열명[];
 *   2. 배열의 초기화 => 값을 지정 (변수 => 초기화)
 *      => 지역변수(메소드 안에 선언하는 변수)(대표:main)
 *      => 클래스: 멤버변수
 *      1) 선언과 동시에 초기화
 *         => 초기값을 지정: 명시적 초기화
 *            int[] arr:{1,2,3,4,5}; => 데이터 검색 => 데이터 고정 => String => 크롤링
 *         => 기본데이터로 초기화 => 기본 데이터값 설정
 *            int[] arr=new int[5]
 *                             ---저장 개수
 *            => 정수 5개를 모아서 관리: 0으로 초기화
 *            => new를 이용 => 새로운 메모리를 만들어라
 *               ---------
 *               정수
 *               int: 0
 *               short: 0
 *               실수
 *               float: 0.0f
 *               double: 0.0
 *               논리
 *               boolean: false
 *               문자
 *               char: '\u00000' => ''
 *               문자열
 *               String: null: 저장된 주소가 없는 상태
 *               ------모든 클래스는 디폴트값이 null
 *     ***배열명
 *     int[] 배열명
 *     double[] 배열명
 *     char[] 배열명
 *     boolean[] 배열명
 *            --
 *    => 선언시에 저장 개수 확인
 *    int[] arr={1,2,3,4,5} : 5개 저장
 *    int[] arr=new int[5]
 *                     ---개수 고정
 *                        저장된 값은 변경 가능
 *                        메모리 크기는 변경 불가능
 *                        --------arraycopy
 *                                새로운 배열
 *                     ---얕은 복사 / 깊은 복사
 *                                  -------새로운 배열 생성 => clone()
 *                        같은 주소 이용
 *    2) 선언 후에 초기화
 *       int[] arr;
 *       => arr=new int[]{1,2,3,,4,5}; => 메소드 이용
 *    3) 출력(데이터 읽기)
 *       int[] arr={1,2,3,4,5}
 *       - 일반for문 이용 => 인덱스 이용
 *         for(int i=0;i<arr.length;i++)
 *         {
 *            System.out.println(arr[i])
 *         }
 *   *** - 향상된 for문 이용: 실제 배열에 저장된 데이터 읽기
 *         브라우저에 출력시에 사용되는 for => 변경 불가능 => 출력
 *         for(int i:arr)
 *         {
 *           System.out.println(i)
 *         }
 *       - 라이브러리 이용
 *         System.out.println(Arrays.toString(배열명))
 *    4) 메모리에 저장되는 과정(메모리 주소를 참조해서 데이터 관리 => 참조변수)
 *       int[] arr=new int[5]
 *       --------- ----------
 *       Stack(데이터가 있는 메모리 주소) Heap(실제 데이터가 저장된 메모리)
 */

import java.util.Arrays;
/*
 *   86page => 배열 생성 / 초기화
 *   87page => 배열 선언
 *   88page => 선언과 동시에 초기화(new)
 *   89page => 메모리에 저장
 *   92page => 향상된 for문
 *   95page => 데이터형의 변환
 *   96page까지
 *   (2차는 웹에 잘 안 나옴)
 */

public class 배열_1 {
//멤버변수 => 다른 클래스에서도 사용 가능 => heap
//프로그램 종료시까지 사용 가능
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수 => main에서만 사용 가능 => stack
		// main이 종료되면 자동으로 사라짐
	    // 정수/문자/문자열
		
		//#1. 정수 10개에 대한 평균 => 반복문 사용하려면 배열
		// 초기값 결정 => 0으로 default
		int[] arr=new int[10];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		// 사용자 요청 처리=>평균
		double avg=0.0;//C언어와 다름
		// C언어: 시작과 동시에 사용하는 모든 변수를 선언
		// 자바: 필요시마다 어떤 위치든 상관없이 변수 선언 가능
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		
		// 결과값 출력
		String result=String.format("%.2f",sum/10.0);
		System.out.println(result);
		
 
	}

}
