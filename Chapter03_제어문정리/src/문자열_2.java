// https://mvnrepository.com/ => java 라이브러리 사이트
// Jsoup => 크롤링 라이브러리
// 원하는 라이브러리 다운 받아 Build Path에 저장

// contains: 포함된 문자열 => web데이터 읽기 => 크롤링
// => 데이터 필요 => 데이터 읽어오기 => 자바 기능 ...
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 문자열_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String fd=scan.next();//findData
		
		int k=1;// 1~200 순서 표시 위한 변수
		for(int i=1;i<=4;i++)// 1~4페이지까지 다 펼치기 위한 반복문
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20241127&hh=11&rtm=Y&pg="+i).get();
			//곡명
			Elements title=doc.select("table.list-wrap a.title");//a. 다음에 두는 이름에 따라 다른 정보 가져올 수 있음 / 긁어오는 페이지 소스
			for(int j=0;j<title.size();j++)// 한 페이지 안에 있는 곡명 다 가져오는 반복문
			{
				// 데이터가 많아야 프로그램을 만들 수 있다
				//if(title.get(j).text().contains(fd))//검색어를 포함한 제목 가져오기 / 오라클 -> %검색어%
				//if(title.get(j).text().startsWith(fd))// 검색어로 시작하는 제목 가져오기 / 검색어%
				if(title.get(j).text().endsWith(fd))//검색어로 끝나는 제목 가져오기 / %검색어
				{
				System.out.println((k)+"."+title.get(j).text());
				//Thread.sleep(2000);//하나 실행 후 2초 쉬고 다음 실행
				k++;
				}
			}
		}

	}

}

