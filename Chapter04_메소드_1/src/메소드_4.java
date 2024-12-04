/*
 *   # 사용자로부터 단 입력 => 해당 구구단 출력
 *     ---------------    ------------
 *     매개변수               리턴형 ==> 자체 출력? => void
 *                          리턴형? ==> String(return 생략 불가)
 *                          
 *    
 */
import java.util.Scanner;
public class 메소드_4 {
//    static void gugudan(int dan)
//    {
//    	for(int i=1;i<=9;i++)
//    	{
//    		System.out.println(dan+"*"+i+"="+(dan*i));
//    	}
//    }
	static String gugudan(int dan)
	{
		String result="";
		for(int i=1;i<=9;i++)
		{
			result+=dan+"*"+i+"="+(dan*i)+"\n";
		}
		return result;
	}
    static void process()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("단 입력(2~9):");
    	int dan=scan.nextInt();
    	
    	//메소드 호출
    	String g=gugudan(dan);
    	System.out.println(g);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
