package com.sist.io;
import java.util.*;
import java.io.*;
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis= new FileInputStream("c:\\javaDev\\mydata.jar");
			BufferedInputStream bis=new BufferedInputStream(fis);
			FileOutputStream fos= new FileOutputStream("c:\\java_data\\mydata.jar");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			int i=0;
			byte[] buffer=new byte[1024];
			while((i=bis.read(buffer,0,1024))!=-1)
			{
				bos.write(buffer,0,i);
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
