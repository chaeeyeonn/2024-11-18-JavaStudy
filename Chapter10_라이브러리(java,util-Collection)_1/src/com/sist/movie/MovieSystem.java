package com.sist.movie;
//영화 데이터 관리 => 오라클이 될 예정
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
//모든 사용자에게 공통으로 쓰는 부분
public class MovieSystem {
	//static은 메모리 공간 한 개만 사용 => 모든 사용자가 공유
	private static ArrayList<Movie> movieList=
			            new ArrayList<Movie>();
	//초기화
	static//초기화 블록
	{
		try
		{
			//IO => CheckException: 반드시 예외처리
			//java.net / java.io / java.sql
			//크롤링 => URL(네트워크)
			//초기화 블록에서는 throws문장 사용 불가
			//복구 가능 => throws문장은 예외 선언
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
			
			//데이터 분리
			String data=sb.toString();
			String[] movies=data.split("\n");
			
			for(String movie:movies)
			{
				String[] ss=movie.split("\\|");
				Movie m=new Movie();
				m.setMno(Integer.parseInt(ss[0]));
				m.setTitle(ss[1]);
				m.setGenre(ss[2]);
				m.setPoster(ss[3]);
				m.setActor(ss[4]);
				m.setDirector(ss[5]);
				m.setRegdate(ss[6]);
				m.setGrade(ss[7]);
				
				movieList.add(m);
				
			}
		}catch(Exception ex) {}
		//생성자: 초기화 블록 이용
		//자동 저장
	}
	//전체 목록
	public ArrayList<Movie> movieListData()
	{
	   return movieList;	
	}
	//상세보기
	public Movie movieDetailData(int mno)
	{
		Movie m=new Movie();
		for(Movie mm:movieList)
		{
			if(mm.getMno()==mno)
			{
				m=mm;
				break;
			}
			
		}
		return m;
	}
	//검색 => 제목
	public ArrayList<Movie> movieFindTitle(String title)
	{
		ArrayList<Movie> list=new ArrayList<Movie>();
		for(Movie m:movieList)
		{
			if(m.getTitle().contains(title))
			{
				list.add(m);
			}
		}
		return list;
	}
	
	//검색 => 출연진
	public ArrayList<Movie> movieFindActor(String actor)
	{
		ArrayList<Movie> list=new ArrayList<Movie>();
		for(Movie m:movieList)
		{
			if(m.getTitle().contains(actor))
			{
				list.add(m);
			}
		}
		return list;
	}
	//검색 => 장르
	public ArrayList<Movie> movieFindGenre(String genre)
	{
		ArrayList<Movie> list=new ArrayList<Movie>();
		for(Movie m:movieList)
		{
			if(m.getTitle().contains(genre))
			{
				list.add(m);
			}
		}
		return list;
	}

}
