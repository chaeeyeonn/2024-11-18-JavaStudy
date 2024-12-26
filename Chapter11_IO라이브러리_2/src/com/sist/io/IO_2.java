package com.sist.io;
import java.io.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			//파일 복사 => 파일 전송
			//if 파일 자체 제어 => Reader / Writer 사용
			fis=new FileInputStream("c:\\javaDev\\movie.txt");
			fos=new FileOutputStream("c:\\java_data\\movie.txt");
			//                       => 파일이 없는 경우 자동으로 생성 / 있으면 덮어쓰기
			/*
			 *   mode
			 *   r => read
			 *   w => write => create
			 *   a => append
			 *   현재는 create 모드 => 경로명 뒤에 true 붙이면 append 모드
			 */
			int i=0;//i=> 한 글자씩이 아닌
			//읽은 바이트 수를 가져옴
			byte[] buffer=new byte[1024];
			//read(): 한 글자씩 / read(byte[],start,end): 바이트 수만큼
			while((i=fis.read(buffer,0,1024))!=-1)
			{
				fos.write(buffer,0,i);
			}
			System.out.println("복사 완료");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
				fos.close();
			}catch(Exception ex) {}
		}
	}

}
