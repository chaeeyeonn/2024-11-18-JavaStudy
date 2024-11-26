/* - 진도
 *   웹개발 ==> 데이터베이스
 *   = server단: Back-End => 자바 / 스프링 / 데이터베이스 연동
 *   = DB단: DBA
 *   = View단: Front-End => 자바스크립트
 *                         Jquery => VueJS => React => Next
 *                         ------4, 5 동시 출시
 *              option: MSA / DevOps / AWS
 *                      => Spring Cloud
 *              자바 / 파이썬 => 데이터분석(Numpy,Pandas,Matplotlib)
 *              ---FullStack       => DJango<==>Spring
 *                                 => ElasticSearch:NoSQL => google
 *                                 => 코딩테스트
 *                                 
 *   조건문: **단일조건문 / **선택조건문 / 다중조건문
 *   1. 단일조건문 => 독립문장
 *      형식) if(조건문) => 부정연산자 / 비교연산자 / 논리연산자
 *          {
 *            조건이 true일 때 수행 => false면 건너뛰기 
 *          }
 *          => 오류처리 => 8장 예외처리
 *          => 비정상 종료 방지하고 프로그램 유지
 *          => if: 유효성 검사
 *   2. 선택조건문 => true / false 처리 나눔
 *      형식) if(조건문)
 *           {
 *             조건이 true일 때 수행
 *           }
 *           else
 *           {
 *             조건이 false일 때 수행
 *           }
 *           웹 => 무조건 결과값 전송
 *                (아이디 중복 체크, 우편번호 검색 등)
 *   3. 다중조건문 => 1개의 조건만 수행(menu, 카테고리 선택 등)
 *      형식) if(조건문)
 *           {
 *             조건이 true일 때 수행 => 종료
 *           }      false일 때 다음 조건으로
 *           else if(조건문)
 *           {
 *             조건이 true일 때 수행 => 종료
 *             false일 때 다음 조건으로
 *           }
 *           else(조건문)
 *           {
 *             해당 조건이 없는 경우 무조건 실행
 *           }   
 *   선택문: switch~case: 다중 조건문과 유사
 *         =========== 범위를 지정, 값을 한 개만 선택(게임, 어플 등)
 *      형식) switch(문자/정수/문자열)
 *           {
 *             case 값1:
 *                  실행문장
 *                  break;
 *             case 값2:
 *                  실행문장
 *                  break;
 *             default:
 *                  실행문장
 *           }
 *       1) case 안에 중복된 값이 있으면 안 된다
 *       2) default는 생략 가능
 *       3) 문자 -> ''
 *       4) 문자열 -> ""
 *   반복문: **for / **while / do~while
 *    1. for: 반복 횟수가 지정된 경우 => 웹(반복횟수)
 *            => 화면 UI => 목록 / 슬라이드
 *            => Front-End
 *                           ==== ++, --, +=, -=
 *       형식) for(초기식;조건식;증감식)
 *            {
 *              반복 수행 문장
 *            }
 *            초기식: 한 번 수행
 *            조건식: false까지 수행
 *            증감식: 조건식에 있는 변수를 변경 => false가 되게 만듦
 *            
 *          => 무한루프: for(;;)
 *    
 *    2. while: 반복횟수가 없는 경우
 *            => 데이터베이스 / 파일 읽기
 *            => Back-End
 *    3. do~while: 후조건 => 먼저 반복문장을 1번 수행
 *                 => 반드시 한 번 이상 수행
 *                 
 *   (교재68page)
 *    - 중첩 for(이중for)
 *        형식) 
 *            for(초기식;조건식;증감식) => 세로 계산 => 출력 줄 수
 *            {    true면 다음 for문으로 
 *              for(초기식;조건식;증감식) => 가로 계산 => 출력 칸 수
 *              {
 *                반복 수행 문장
 *                false면 1차for증감식으로 이동
 *              }
 *            }
 *   반복제어문: **break / continue
 */
/*
 *   만들기↓
 *   *****
 *   *****
 *   *****
 *   *****
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)// 줄 수
		{
			//이차for문이 종료되면 일차 증가식으로 이동
			for(int j=1;j<=5;j++)//화면 출력
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
