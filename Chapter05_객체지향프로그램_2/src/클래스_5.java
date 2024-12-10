/*
 *   멤버 변수 초기화
 *   - 생성자   => 인스턴스 변수, static 변수 초기화
 *            => 반드시 호출
 *   - 인스턴스 블록 => 인스턴스 변수, static 변수 초기화 => 호출 자동 처리
 *   - static 블록 => static 변수 초기화 => 호출 자동 처리
 *   =============> 멤버 초기화 담당 / 시작과 동시에 처리하는 기능
 *                  블록 안에서 구현 가능 / 상속은 예외
 *                  
 *   ==> 기본 초기화 => 명시적 초기화 => static 블록 => 인스턴스 블록 => 생성자
 *                      |                           |          |
 *                      동시 사용 없음
 *                      |
 *                      우선 순위 1.
 *                      불가능 시 생성자, static 블록 이용
 *                      
 */
class Movie
{
	int movieNo=1;
	static int id=1;
	//인스턴스 블록
	{
		System.out.println("인스턴스 블록 진입");
		movieNo=2;
		System.out.println("movieNo변수 저장 완료");
	}
	Movie()
	{
		System.out.println("생성자 호출");
		movieNo=3;
		System.out.println("생성자에서 movieNo 저장 완료");//=> 어차피 movieNo는 3이 되니 앞 초기화는 쓸모 없어짐
	}
	static
	{
		System.out.println("static 블록 진입");
		id=100;
		System.out.println("저장 완료");
	}
}
public class 클래스_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m=new Movie();
		System.out.println(m.movieNo);
		System.out.println(Movie.id);//static이라서(메모리 할당 필요 없음) 생성자 호출 필요 없음

	}

}
