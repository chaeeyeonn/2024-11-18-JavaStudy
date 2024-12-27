package com.sist.movie;

import java.io.ObjectOutputStream;
import java.io.*;
import java.util.*;
//데이터 크롤링
//객체 단위로 저장한 파일 만든다
// ObjectOutputStream
public class MovieInputData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=null;
		try
		{
			List<Movie> list=new ArrayList<Movie>();
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt"); //한글 파일이기 때문에 Reader 이용
			int i=0;
			StringBuffer sb=new StringBuffer();
			while(((i=fr.read())!=-1))
			{
				sb.append((char)i);
			}
			String data=sb.toString();
			String[] mdata=data.split("\n");
			for(String m:mdata)
			{
				String[] mm=m.split("\\|");
				Movie movie=new Movie();
				movie.setMno(Integer.parseInt(mm[0]));
				movie.setTitle(mm[1]);
				movie.setGenre(mm[2]);
				movie.setPoster(mm[3]);
				movie.setActor(mm[4]);
				movie.setRegdate(mm[5]);
				movie.setGrade(mm[6]);
				movie.setDirector(mm[7]);
				list.add(movie);
			}
			//list 저장
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\movie_info.txt");
			//파일이 없는 경우 자동 생성
			oos=new ObjectOutputStream(fos);
			oos.writeObject(list);
			System.out.println("영화 객체 단위 저장 완료");//Object 객체 저장 통해 항상 저장된 값을 어디서든 쓸 수 있음
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				oos.close();
			}catch(Exception ex) {}
		}

	}

}
