import java.util.*;
import java.io.*;
public class MovieSystem {
  //영화 전체 정보 => 모든 user가 공유
	static Movie[] movies=new Movie[1938];
	
	//초기화
	static
	{
		try
		{
			//파일 전체 읽기
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;//한 글자씩 읽음 => 정수형으로 읽음
			StringBuffer sb=new StringBuffer();
			//문자열 결합의 최적화 => 데이터가 많은 경우
			//String data="";
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
				
			}
			fr.close();
			//System.out.println(sb.toString());
			String data=sb.toString();
			
			//분리
			String[] temp=data.split("\n");
			//영화 한 개에 대한 정보(한 줄)
			int j=0;
			for(String s:temp)
			{
				movies[j]=new Movie();
				//movies[0] => no, title, actor, ...
				String[] ss=s.split("\\|");
				movies[j].no=ss[0];
				movies[j].title=ss[1];
				movies[j].genre=ss[2];
				movies[j].poster=ss[3];
				movies[j].actor=ss[4];
				movies[j].regdate=ss[5];
				movies[j].grade=ss[6];
				movies[j].director=ss[7];
				j++;
				
			}
			
		}catch(Exception ex)//io => 파일 입출력 => 반드시 예외처리
		{
		}
		
	}
	//목록 => 페이지 놔눠 처리
			Movie[] movieListData(int page)
			{
				final int ROWSIZE=20;
				//int pagecnt=(ROWSIZE*page)-ROWSIZE; =>시작위치
				int start=(page-1)*ROWSIZE;
				int end=page*ROWSIZE;
				int totalpage=(int)(Math.ceil(movies.length/20.0));
				                      //|올림함수
				int ARRSIZE=20;
				if(page==totalpage)
				{
					end=page*ROWSIZE-2;
					ARRSIZE=18;
				}
				Movie[] movieData=new Movie[ARRSIZE];
				int j=0;
				for(int i=start;i<end;i++)
				{
					movieData[j]=movies[i];
					j++;
				}
				return movieData;
				
			}
			//상세보기
			Movie movieDetail(int no)
			{
				return movies[no-1];
			}
			//검색
}
