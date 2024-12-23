/*
 *   구성요소
 *     => 멤버변수
 *        |공통으로 사용한느 변수여부(static)
 *        |정보 전체 / 데이터 관리 => 오라클(static)
 *                               |공유된 데이터
 *     => 생성자 / 초기화 블록
 *        ----생략 가능 / 오라클 연동(드라이버 등록)
 *            윈도우의 레이아웃
 *            웹 => 자동 로그인
 *        static 블록: MyBatis 연동
 *     => 활용 => ***메소드
 *                  |다른 클래스 연동(메시지)
 *                  |기능 처리 => 재사용
 *        1. 메소드 형식
 *                     공통 적용  종단 메소드: 확장, 변경 불가능
 *                     static / final / abstract - 선언만 => 프로그램에 맞게 구현해서 사용
 *                      |                                   => 버튼 => click();
 *                                                          => 추상클래스 / 인터페이스*
 *                                 변수 => 식별자 / 소문자로 시작
 *                                 약간의 의미만 부여 / 두 개의 단어 이용 => 두 번째 단어 시작 대문자(헝거리식 표기법)                       
 *                                 |                         
 *    선언부: [접근지정어][제어어] 리턴형 메소드명(매개변수) - 0종류 이상 여러 개 가능 / 사용자로부터 요청값을 받음 / 3개 이상이면 클래스 or 배열로 전송
 *           |                |사용자 요청 결과값 / 반드시 한 개 값만 설정 - 없는 경우 void / 기본형, 배열, 클래스
 *           => 다른 클래스와 연결 => 공개(public)
 *           |public / protected / private / default - 같은 폴더 안에서만 접근 가능
 *           모든 클래스  같은 폴더(패키지) 자신의 클래스영역(은닉화)
 *    구현부: {
 *             return값;
 *             : void일 때는 생략 가능 => 컴파일러가 자동으로 추가 => return은 반드시 필요 => 데이터형 동일 / 리턴형이 큰 데이터형을 사용
 *                                                       => return 메소드 종료점
 *                                                       => 중간에서 return 사용 가능  
 *           }     
 *    
 *        2. 메소드 호출
 *           인스턴스 메소드 => 객체명.메소드명(값...)
 *           static 메소드 => 클래스명.메소드명(값...) => 약식: new 클래스명().메소드명()
 */
public class 클래스_1 {
	int a=10; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		클래스_1 aa=new 클래스_1();
		System.out.println(new 클래스_1().a);

	}

}
