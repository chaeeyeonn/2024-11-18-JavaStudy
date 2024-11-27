/*
 *   문자 자르기
 *   ********** 매우매우 중요!!!!!!!!!!!!!
 *   
 *   substring: 문자열 자르기
 *   1) 지정된 위치부터 마지막까지
 *      Hello Java
 *      0123456789
 *      substring(6)
 *      => Java
 *   2) 중간에서 자르기
 *      substring(1,4) ==> endIndex-1 => 마지막 인덱스는 제외
 *      => ell
 *      
 *   공백 제거: trim()
 *  ----------------------------------JavaScript 동일
 */
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String data="Hello.Hello.Java";
		//확장자 형식 자르기
		//System.out.println(data.substring(data.lastIndexOf(".")+1));//+1: "."이후부터
		
		// 자른다고 데이터 바뀌는 것은 아님 => String 변수를 새로 넣는 이유
		
		String data="ID:admin,PWD:1234";
		String id=data.substring(data.indexOf(":")+1,data.indexOf(","));// 마지막 인덱스(,)는 제외됨
		System.out.println(id);
		String pwd=data.substring(data.lastIndexOf(":")+1);
		System.out.println(pwd);
		System.out.println("data:"+data);
		
		String address="서울 강동구 천호동 42[새주소] 서울 강동구 양재대로 1571 천호복합 상업시설";
		String addr1= address.substring(0,address.indexOf("["));
		String addr2= address.substring(address.indexOf("]")+1);
		System.out.println(addr1);
		System.out.println(addr2.trim());//trim(): 좌우공백 제거
		System.out.println("address:"+address);
		
		String s="Hello Java";
		s=s.substring(s.indexOf(" ")+1);//원래의 s값이 바뀌는 것
		System.out.println("s:"+s);

	}

}
