package com.sist.io;
import java.io.*;
// 필터 스트림 => 읽기 성능을 최적화
/*
 *   파일의 단점: 구분자가 없다 => 임의로 구분자를 만들어서 처리해야 함
 */
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			BufferedReader br=new BufferedReader(fr);//내용을 한 번에 읽어옴
			long start=System.currentTimeMillis();
			while(true)
			{
				String msg=br.readLine();//한 줄씩 읽어온다 => 훨씬 빨라짐
				if(msg==null) break;
				System.out.println(msg);
			}
			long end=System.currentTimeMillis();
			fr.close();
			br.close();
			System.out.println("걸린 시간:"+(end-start)+"ms");
		}catch(Exception ex) {}

	}

}
