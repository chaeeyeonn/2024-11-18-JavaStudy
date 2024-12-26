package com.sist.io;
import java.io.FileWriter;
//파일 제어 => 파일에 읽기, 쓰기 => Reader / Writer 사용
import java.util.*;
public class IO_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일 쓰기 => FileWriter
		FileWriter fw=null;//2byte 단위: 한
		//FileWriter => 지역변수이므로 초기화 필요 / 예외처리 필요 => null값 넣어두기
		try
		{
			fw=new FileWriter("c:\\java_data\\sawon.txt",true);//true 를 통해 원 글에 이어붙이기 가능 => append 모드
			//sawon.txt 생성
//			fw.write("2|심청이|총무부|경기|3000\r\n");//원래 파일에 덮어쓰기 됨 => 이전 글 삭제됨
			fw.write("3|박문수|영업부|부산|3000\r\n");//저장할 때마다 이어붙어버리네...
			System.out.println("등록 완료");
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fw.close();
			}catch(Exception ex) {}
		}

	}

}
