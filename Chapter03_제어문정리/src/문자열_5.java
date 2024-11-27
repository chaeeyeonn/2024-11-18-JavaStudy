/*
 *   문자의 위치 찾기
 *   indexOf(문자): 문자열 처음부터 처음 발견되는 인덱스 위치(숫자)
 *   lastIndexOf(문자): 문자열 마지막부터 처음 발견되는 인덱스 위치(숫자)
 *   *** 없는 경우 -1 출력
 *   => 확장자?
 *   ex) a 찾기
 *     Hello Java
 *            - - lastIndexOf: 뒤에서부터 찾음
 *          indexOf: 앞에서부터 찾음
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Hello Java";
		//           0123456789
		// 웹에서 등장: URL => 마지막 파일명을 찾아서 처리
		// 경로는 항상 뒤에서부터 찾음
		int a=data.indexOf("a");//7
		int b=data.lastIndexOf("a");//9
		int c=data.indexOf("c");//-1
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);

	}

}
