package com.sist.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
// 문자 단위 저장 => write(String s)
import java.util.*;
public class IO_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileWriter fw=new FileWriter("c:\\java_data\\studnet.txt",true);//append 모드
//			String msg="Hello Java => IO => Hello \n";
//			fw.write(msg);
//			fw.close();
			String msg="Hello Oracle";
			//크롤링 => 빠른 속도
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(msg);
			System.out.println("등록 완료");
			bw.close();//확실히 닫아야 코딩 완료
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
