
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello Java";
		String s2="Hello Java";
		String s3=new String("Hello Java");
		//s1과 s2는 같은 주소를 공유 중 / s3는 다름(new)
		// 문자열은 모두 같음 ==> equals 사용
		// equalsIgnoreCase 제외한 모든 String 메소드는 대소문자 구분함
		if(s1==s3)//메모리 주소 비교
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		}

		if(s1.equals(s3))//저장되어 있는 문자열 비교
		{
			System.out.println("s1==s3");
		}
		else
		{
			System.out.println("s1!=s3");
		}
	}

}
