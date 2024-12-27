package com.sist.board;
import java.util.*;
import java.io.*;
public class BoardIOSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=null;
		try
		{
			List<BoardVO> list=new ArrayList<BoardVO>();
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\board.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("파일에 저장 공간 생성 완료");
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			// 오라클 / 서버 / 파일 연결 위해 주로 씀 => 닫아야 함
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}
	}

}
