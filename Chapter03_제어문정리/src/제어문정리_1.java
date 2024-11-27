/*
 *   자바에서 제공하는 제어문
 *   = 조건문
 *     형식)
 *       - 단일 조건문 => 독립적으로 처리
 *         if(조건문) => true / false => 부정연산자 / 비교연산자 / 논리연산자
 *         {
 *           조건이 true일 때 수행하는 문장
 *         }
 *         
 *       - 선택 조건문 => true / false를 나눠 처리
 *          *** 웹에서 가장 많이 사용되는 조건문
 *          *** 조건문 만들기에 주력하기
 *          *** 기본 사이트 제작 => JSP(MVC) / Spring / Spring-Boot => Django
 *         if(조건문)
 *         {
 *          조건이 true일때 처리
 *         }
 *         else
 *         {
 *          조건이 false일 때 처리
 *         }
 *         
 *       - 다중 조건문: 조건을 여러 개 사용 => 해당 조건만 출력(메뉴, 화면 찾기 등)
 *         if(조건문)
 *         {
 *          조건 true일 때 처리 문장 => 수행 후 종료
 *          조건 false일 경우 => 다음 조건으로 넘어감
 *         }
 *         else if(조건문)
 *         {
 *         }
 *         else if(조건문)
 *         {
 *         }
 *         else
 *         {
 *         }
 *         
 *       - 선택문
 *         switch(정수/문자/문자열)
 *                => 문자 => '' => char
 *                => 문자열 => "" => String
 *                ** 윈도우 / 웹 => 송수신하는 모든 데이터는 String
 *                             => 다른 데이터형이 필요할 때는 변경(String)
 *                             => Integer.parseInt("10") => 10
 *                                Double.parseDouble("5.0") => 5.0
 *                                Byte / Boolean ==> Wrapper
 *                             => char[] => 제어 => String
 *        swtich(정수/문자/문자열)
 *        {
 *         case 값1:
 *              수행문장
 *              break;
 *         case 값2:
 *              수행문장
 *              break;
 *         case 값3:
 *              수행문장
 *              break;
 *         default:
 *              수행문장
 *        }
 *        => 무조건 break를 사용하는 것은 아님
 *          => 같은 수행 문장을 수행할 때는 break를 사용하지 않는다
 *          => case 10: case 9: ==> total==10 || total==9
 *                  score='A';
 *          => case에 중복된 데이터는 사용 불가
 *          => 다중 조건문으로 변경 가능: 프로그램은 정답이 없다,
 *                                  잘 짠 프로그램: 가독성, 최적화, 유지보수, **공통모듈
 *                                                                => 반복을 최대한 제거
 *          
 *      - 반복문 => 중복 제거
 *      => for: 반복 횟수 지정 => 웹 화면 UI
 *                    |false면 종료
 *         for(초기값;조건식;증감식)
 *         {    1     2 <= 4
 *          반복 수행 문장 3
 *         }
 *        => 가장 많이 사용되는 반복문
 *        => 웹에서는 특별한 경우가 아니면 이중 for문은 사용하지 않음
 *        => 웹: 송수신 중요
 *          (연습: 네트워크)
 *      => while: 반복 횟수 지정 x => 데이터베이스 / 파일 읽기
 *              : 선조건 => 한 번도 실행하지 않을 수도 있음
 *         초기값; 1
 *         while(조건문) 2
 *         {
 *          반복 수행 문장; 3
 *          증감식; 4
 *         }
 *      ==> while(true)
 *          {
 *           반복 수행 문장
 *           => 종료 조건은 무조건 작성
 *            => 게임: ESC 종료
 *          }
 *      => do~while: 후조건 => 한 번은 무조건 수행 
 *         초기값 1
 *         do
 *         {
 *          반복 실행 문장 2 => 무조건 한 번 이상 수행
 *          증감식 3
 *         }while(조건식) 4
 *                  |false면 종료
 *      
 *     - 반복제어문장
 *      => break: 반복 종료
 *                for, while, do~while => 무조건 종료
 *                => switch, 반복문에서 사용
 *      => continue: 특정부분을 제외
 *                   for => 증감식으로 이동
 *                   while => 조건식으로 이동 => 무한루프 가능성
 *                   => 반복문에서만 사용 가능
 *      *** 소속 반복문만 제어(안긴 문장이 있으면 안긴 것만 제어)
 *        for
 *        {
 *         for
 *         {
 *          break;
 *         }
 *        }
 *      이름이 있는 break: 잘 안 씀, 원하는 자리에 break 걸 수 있음
 *        outer: for
 *        {
 *         for
 *         {
 *          break outer;
 *         }
 *        }
 *              
 */
// ★☆☆☆★
// ☆★☆★☆
// ☆☆★☆☆
// ☆★☆★☆
// ★☆☆☆★
/*
 *  위치 지정
 *  i   j_1  j_2
 *  1    1    5
 *  2    2    4
 *  3    3    3
 *  4    4    2
 *  5    5    1   
 *  i==j
 *  i+j==6 
 */
public class 제어문정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==j) || (6-i==j))
				{
					System.out.print("★");
				}
				else
				{
					System.out.print("☆");
				}
			}
			System.out.println();
		}

	}

}
