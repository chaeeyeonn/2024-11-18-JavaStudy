package com.sist.io;
import java.io.*;
//폴더 / 파일 / 폴더 혹은 파일 존재 여부 확인 => 삭제
public class IO_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("c:\\java_data\\sawon.txt");
		if(!file.exists())
		{
			try {
				file.createNewFile();//파일 만들기
			}catch(Exception ex) {}
			
		}
		else
		{
			System.out.println("이미 존재하는 파일입니다");
		}
//		if(!dir.exists())//해당 폴더가 존재하지 않는 경우
//		{
//			dir.mkdir();//폴더 만들기
//		}
//		else
//		{
//			System.out.println("이미 존재하는 폴더입니다");
//		}
		System.out.println("프로그램 종료");
	}

}
