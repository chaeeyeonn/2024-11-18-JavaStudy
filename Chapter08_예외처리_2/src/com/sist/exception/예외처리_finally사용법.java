package com.sist.exception;
//try~catch~finally
//finally는 생략 가능
//사용처: 파일 닫기, 오라클 해제, 서버 연결 해제
//try~catch 상관없이 무조건 수행

import java.io.*;//파일 읽기 => CheckException => 무조건 예외처리
public class 예외처리_finally사용법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   	FileReader fr=null;//모든 클래스의 초기값은 null
//		try
//		{
//			fr=new FileReader("c:\\javaDev\\seoul_nature.txt");//CheckException이기 때문에 try{} 밖으로 뺄 수 없음
//			int i=0;// 한 글자씩 읽어옴
//			// => 정수형으로 'A'=65
//			while((i=fr.read())!=-1)
//			{
//				System.out.print((char)i);//char로 다시 바꿈
//			}
//			
//		}catch(IOException ex)//Exception , Throwable 가능
//		{
//			ex.printStackTrace();//에러 확인
//		}
//		finally//안에도 try~catch 가능 
//		{
//			try//무조건 파일 닫음
//			{
//				fr.close();
//			}catch(IOException e) {}
//		}
		//자동 리소스
//		try(FileReader fr1=new FileReader("c:\\\\javaDev\\\\seoul_nature.txt")
//		{
//			int i=0;// 한 글자씩 읽어옴
//			// => 정수형으로 'A'=65
//			while((i=fr.read())!=-1)
//			{
//				System.out.print((char)i);//char로 다시 바꿈
//			}
//			//자동으로 파일 닫기 가능
//		}catch(IOException e)
//		{
//			System.out.println(e.getMessage());
//		}

	}

}
