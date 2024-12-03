/*
 *   문자열 배열
 *   String[] 배열명={"","",""}; => 명시적 선언
 *   String[] 베열명=new String[10]; => default => null
 *   
 *   int[] aa; aa=null ==> 배열 / 클래스 => 메모리 주소를 참조
 *   => 배열 주소: [
 *   => 클래스 주소: 클래스@주소
 *   
 *   
 */
import java.util.*;
public class 문자열_1 {
	/*
	 *   배열도 변수의 일종
	 *        ----------여러개의 데이터 저장 가능
	 *        => 한개의 이름으로 제어 가능
	 *        -------------구분이 가능하게 => 각 변수마다 인데스를 부여
	 *        arr[0] arr[1]....0부터~순차적
	 *                        -----------반복 사용이 가능
	 *        
	 *        
	 *        
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"홍길동","박문수","강감찬","이순신","김두한"};//고정
		// 문자열 => 데이터추가/데이터수정 불가능 => 검색용
		// 문자열 => 오라클 명령어 "SELECT *FROM table_name"
		// 전체 출력
		//일반 for: 데이터 수정, 데이터 추가 => 인덱스
		// for-each: 브라우저/원도우 =>인덱스 이용X 
		// 라이브러리
		List list=new ArrayList();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		
		for(int i=0;i<names.length;i++)
		{
			}
		}

}
