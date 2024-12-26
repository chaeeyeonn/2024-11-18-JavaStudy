package com.sist.io;
import java.io.*;
public class IO_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\student.txt");
			//파일이 존재하지 않으면 자동 생성됨
			//파일이 존재하면 글쓰기 진행
//			fos.write('A');
//			fos.write('B');
//			fos.write('C');
//			fos.write('D');
//			fos.write('E');
			String msg="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			fos.write(msg.getBytes());
			//단위: byte => byte[] => getbytes() 메소드 쓰기
			fos.close();
			System.out.println("저장 완료");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
