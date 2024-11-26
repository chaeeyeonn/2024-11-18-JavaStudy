/*
 *  while문: 반복 횟수 지정되어 있지 않음
 *     형식) 
 *          초기값 ⓐ
 *          while(조건식) ⓑ
 *          {
 *            반복 수행 문장 ⓒ
 *            증감식 ⓓ
 *          }
 *          시용처: 데이터베이스, 서버(자바서버=>인트라넷), 파일읽기
 *                                 |사내메신저, 게임
 *                => 무한루프: while(true) => Front-End
 *          : 실행되지 않는 경우 => 선조건이기 때문 => 무조건 한 번 이상 수행
 */
public class 반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 출력 => 이중 while문은 사용 안 함
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");//반복수행문장
			i++;//증감식
		}
		//for(int i=1;i<=10;i++)

	}

}
