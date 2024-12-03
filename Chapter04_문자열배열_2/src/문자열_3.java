/*
 *   문자열
 *     = 비교(로그인, 아이디 중복체크 등) => equals
 *     = 검색 => contains
 *     = 검색어 출력 => startsWith
 *     = 검색어 자르기 => substring()
 *     = 검색 중 사용자가 실수 => trim()
 */
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="admin";
		//문자열 자체가 String
		if(id.equals(" admin".trim()))
		{
			System.out.println("아이디가 있습니다");
		}
		else
		{
			System.out.println("아이디가 없다");
		}

	}

}
