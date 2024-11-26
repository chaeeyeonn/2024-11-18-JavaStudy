import java.io.*;
public class 반복문_5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\JavaDev\\JavaStudy\\Chapter03_제어문_반복문_2\\src\\반복문_4.java");
		int i=0;//한글자씩 읽음 => 문자가 아닌 정수형으로 읽음
		//반복 횟수를 모르는 경우 while문을 쓴다
	    while((i=fr.read())!=-1)
	    {
	    	//-1:EOF
	    	System.out.print((char)i);
	    }
				

	}

}
