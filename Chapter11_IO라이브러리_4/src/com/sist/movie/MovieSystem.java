package com.sist.movie;
import java.io.*;
import java.util.*;
//ObjctInputStream
public class MovieSystem {
	//영화 정보를 가지고 있다 => 요청 기능
	private static List<Movie> movieList=new ArrayList<Movie>();
	static
	{
		ObjectInputStream ois=null;
		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\movie_info.txt");
			ois=new ObjectInputStream(fis);
			movieList = (List<Movie>)ois.readObject();
			//제어 => List로 사용
			// => 파일에 다시 저장
			// remove() => List 재저장 가능
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				ois.close();
			}catch(Exception ex) {}
		}
	}
	public List<Movie> movieListData()
	{
		return movieList;
	}
	//상세보기
	public Movie movieDetailData(int mno)
	{
		Movie movie=new Movie();
		for(Movie m:movieList)
		{
			if(m.getMno()==mno)
			{
				movie=m;
				break;
			}
		}
		return movie;
		
	}
	//검색 WHERE title LIKE '%fd%' => 네트워크 통신
	// => 웹(네트워크 통신)
	// writeObject(Object): 직렬화
	// Object readObject(): 역직렬화 => 형변환 후 사용
	// 저장되는 데이터는 반드시 implements Serializable 사용
	// 이젠 직렬화 사용 => 구현할 메소드 딱히 없음
	public List<Movie> movieFindData(String title)
	{
		List<Movie> list=new ArrayList<Movie>();
		for(Movie m:movieList)
		{
			if(m.getTitle().contains(title))
			{
				list.add(m);
			}
		}
		return list;
	}
}
