class Rand
{
	int[] arr=new int[5];//저장이 안 됨
	//인스턴스 초기화 블록
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
	// 생성자 => 인스턴스 변수는 초기화 보통 => 생성자
	// static의 초기화=> static 블록에서 주로 사용
	Rand()
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
	}
}
public class 클래스_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Rand r= new Rand();// r=>arr : 메모리가 따로따로 저장
	    //접근시 => 객체명.변수, 객체명.메소드
	    for(int i=0;i<r.arr.length;i++)
	    {
	    	System.out.println(r.arr[i]);
	    	
	    }
//		static => 클래스명.변수, 클래스명.메소드

	}

}
