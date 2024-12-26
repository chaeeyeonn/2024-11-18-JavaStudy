package com.sist.io;
// => FileInputStream ==> Reader 형식으로 변경
// seoul_nature 데이터 읽기
import java.io.*;//웹에서 가장 많이 사용
public class IO_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("c:\\javaDev\\seoul_nature.txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(fis));//FileInputStream을 BufferedReader로 변경
			// 웹을 읽는 경우 자주 씀
			//1byte => 2byte
//			int i=0;
//			while((i=br.read())!=-1)
//			{
//				System.out.print((char)i);//파일 읽기 한 글자씩
//			}
			while(true)
			{
				String msg=br.readLine();
				if(msg==null) break;
				System.out.println(msg);
			}
			fis.close();
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}

	}

}
