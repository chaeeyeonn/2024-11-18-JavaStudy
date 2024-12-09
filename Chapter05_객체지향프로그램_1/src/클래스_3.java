/*
 *   프로그램==========================저장=======================화면 UI=================구현  ====> 테스트 ====> 배포
 *   요구사항 분석                   데이터베이스                                                   |단위테스트(Junit)  |발표
 *   (벤치마킹)                                                                                 |디버깅
 *   |
 *   기능설정
 *   필요한 데이터 추출
 *   =======================      ==========                  =======                =======
 *   |클래스 설계 => 메소드 / 변수      |메모리 할당 => new            출력                클래스와 클래스 연관
 *   |유스케이스 다이어그램             |정규화                                             |클래스 다이어그램
 *   
 *   객체: 현실 세계에 있는 모든 사물(Object) => OOP
 *        ----------------------------
 *        |단순화(시뮬레이션) => 가정
 *         ----추상화: 누구나 생각하는 공통된 데이터를 추출
 *           => 개발자만 알아보면 된다
 *           
 *        변수 추출 => 기능 추출 => 구현 => 사용
 *                   |추가, 수정
 *        ==> 클래스는 한 개에 대한 정보를 가지고 있다 => 이후 여러 개 저장으로 활용
 */
// 변수 => 1. 기본형 2. 배열 3. 클래스
// 평잠, 구분 번호, actor, String, String[], ...
/*
 *   1. 클래스 구성요소
 *   class ClassName
 *   {
 *      변수
 *        1) 변수 종류
 *          - 인스턴스 변수(객체변수)
 *            : new 이용해 메모리 따라 저장 가능
 *            인스턴스: 메모리에 제시어가 저장된 상태
 *            객체 = 인스턴스
 *          - 공통변수(정적변수)
 *            : 모든 객체가 공통으로 사용하는 변수 => 메모리 공간이 한 개
 *            
 *            
 *      생성자
 *      메소드
 *   }
 *   => new: 클래스의 메모리 크기를 확인 후에 메모리를 할당 => 사용시마다 클래스 크기만큼 메모리를 생성
 *                                     ---------메모리 공간 생성
 *                                              사용된 주소값을 객체에
 *           => 클래스는 한 개만 설계
 *           => new 여러 개를 저장해서 사용
 *           => 사용자 정의 클래스: 일반 변수와 동일
 *              --------------사용자 정의 데이터형: 배열, 읽기, 쓰기, 변경 가능
 *              **자바에서 지원
 *              
 *              
 *      종류                메모리 저장 시점          메모리 해제 시점         저장위치       사용위치     사용 방법
 *      ----------------------------------------------------------------------------------------------------
 *      인스턴스 변수            new 이용              프로그램 종료           Heap       클래스 전체/   객체명.변수명  
 *                                                                                 다른 클래스
 *      정적 변수(공유변수)   컴파일 시 자동 메모리 할당    프로그램 종료          MethodArea   클래스 전체/  클래스명.변수명
 *                        한 개만 생성                                                다른 클래스
 *      지역 변수           메소드 호출시마다           메소드 종료            Stack         {}
 *                        => 매개변수 포함
 *      
 *     생성자: 변수의 초기값을 대입 => 메모리에 초기값을 넘겨준다
 *          => new  생상저{}
 *      class A
 *      {
 *        int aa;
 *        double dd;
 *      }
 *      A a=new A(); => 메모리 생성
 */

import java.text.DecimalFormat;
class Recipe2
{
	String poster;
	String title;
	String chef;
	String chef_poster;// => null
	int star;
	int hit;// => 0
}
public class 클래스_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. recipe 저장
		//2. 데이터를 저장할 메모리 공간(메모리 할당)
		Recipe2 recipe1=new Recipe2();//24byte메모리 생성
		// => 기본형, 클래스형: 4byte
		// 데이터 초기화
		recipe1.poster="https://recipe1.ezmember.co.kr/cache/recipe/2024/08/08/fa7f51b62545d1c53c2e70d9006e8c5a1_m.jpg";
		recipe1.title="감자꽈리고추조림 밥통 거덜내는 무시무시한 저녁반찬";
		recipe1.chef="아임레시피";
		recipe1.chef_poster="https://recipe1.ezmember.co.kr/cache/rpf/2023/11/02/3c59439108b7310153bca4a5f170fb0d1.jpg";
		recipe1.hit=4510;
		recipe1.star=5;
		//변수값 지정
		//저장 데이터 출력 => 2중 메모리 형태
		System.out.println("레시피 포스터:"+recipe1.poster);
		System.out.println("레시피 제목:"+recipe1.title);
		System.out.println("쉐프명:"+recipe1.chef);
		System.out.println("쉐프 포스터:"+recipe1.chef_poster);
		DecimalFormat df=new DecimalFormat("###,###");
		
		System.out.println("조회수:"+recipe1.hit);
		for(int i=1;i<=recipe1.star;i++)
		{
			System.out.print("★");
		}
		System.out.println();
		System.out.println();
		//recipe2 만들기
		Recipe2 recipe2=new Recipe2();
		recipe2.poster="https://recipe1.ezmember.co.kr/cache/recipe/2020/05/18/2cad62498784efd2b97c0f80abebfcff1_m.jpg";
		recipe2.title="#최애반찬#소세지강정";
		recipe2.chef="심킹카";
		recipe2.chef_poster="https://recipe1.ezmember.co.kr/cache/rpf/2019/06/20/bcec53bab4eb42c9489afd12d640dce31.png";
		recipe2.hit=140000;
		recipe2.star=5;
		
		System.out.println("레시피 포스터:"+recipe2.poster);
		System.out.println("레시피 제목:"+recipe2.title);
		System.out.println("쉐프명:"+recipe2.chef);
		System.out.println("쉐프 포스터:"+recipe2.chef_poster);
		DecimalFormat df1=new DecimalFormat("###,###");
		
		System.out.println("조회수:"+recipe2.hit);
		for(int i=1;i<=recipe1.star;i++)
		{
			System.out.print("★");
		}
		

	}

}
