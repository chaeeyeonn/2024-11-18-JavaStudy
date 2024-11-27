/*   *** 외우기
 *  - 문자열 => 기능(메소드) => 반드시 결과값(리턴형/반환형)
 *   => int scan.nextInt()
 *   
 *   => String: 문자열을 저장하는 데이터형
 *              -------------------- 제한이 없다
 *              일반 데이터형, 클래스형 가능
 *     문자열 변수 선언
 *     = String name="홍길동" -> 여러 글자 저장 가능 *** 이걸 더 많이 씀
 *     = String name=new String("홍길동") => 새로운 메모리 공간에 저장
 *     
 *     기능(메소드)
 *     => 문자열은 비교연산자를 사용하지 않는다
 *     1. 비교 기능
 *        ***equals() => ==
 *        equalsIgnoreCase: 대소문자 무시
 *        => 로그인 처리시 아이디, 비밀번호 비교
 *        포함 문자
 *        ***contains => 검색 중 포함 문자 찾기
 *        ---------------
 *        ***startsWith() => 시작 문자열
 *        ***endsWith() => 끝 문자열 => 확장자
 *        ---------------자동완성기 / 서제스트
 *     2. 변경
 *     3. 문자열 분해
 *     4. 제어
 */
// 사용자 입력값 받아 => ID/PWD => 로그인
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID="admin";
		final String PWD="1234"; // 상수로 고정
		
		Scanner scan=new Scanner(System.in);
		// equals => 같으면 true, 틀리면 false
		// 같을 때까지 로그인 반복
		while(true)//무한 루프
		{
			System.out.print("ID를 입력하세요:");
			String id=scan.next();//String이니 next로 받음
			System.out.print("PWD를 입력하세요:");
			String pwd=scan.next();
			// Scanner => 정수: nextInt() / 문자열: next() / 실수: nextDouble() / 논리형: nextBoolean()
			// String => 변경 불가능 => 확장 불가능 => 제공한 내용만 사용 => 표준화(누구나 같은 내용)
			// 변수 => 대소문자 구분
			if(ID.equalsIgnoreCase(id) && PWD.equals(pwd))//equalsIgnoreCase: 대소문자 무시
			{
				System.out.println("로그인되었습니다");
				System.out.println("메인페이지로 이동합니다");
				break; // while문 종료
			}
			else
			{
				System.out.println("ID나 PWD가 틀립니다");
				System.out.println("다시 입력하세요");
			}
		}

	}

}
