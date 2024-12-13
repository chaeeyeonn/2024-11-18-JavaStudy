package com.sist.manager;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.*;
//같은 패키지에 존재 => import 안 써도 됨
//다른 패키지에 존재 => import 필수
//import: 사용자 정의, 라이브러리 클래스 로드
//import java.lang.*; => 자동 추가
public class GenieMusicSystem {
	//원래는 private해서 getter/setter 쓰기
	public MusicVO[] musics=new MusicVO[50];
	public String title="지니 Top50";
	//인스턴스 초기화 블록 => 호출x , 상속x
	{
		//예외처리 => 파일 관련, 네트워크 관련, 데이터베이스 관련
		//url => 웹 네트워크
		try
		{
			//정상적 수행 => 에러나면 프로그램 종료
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");//태그명.구분자
			Elements singer=doc.select("table.list-wrap a.artist");//Elements => Jsoup 패키지 맞춰 고르기
			Elements album=doc.select("table.list-wrap a.albumtitle");
			
			for(int i=0;i<50;i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(singer.get(i).text());
				System.out.println(album.get(i).text());
				System.out.println("=====================================");
				musics[i]=new MusicVO();
				musics[i].setNo(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());				
			}
			
		}catch(Exception ex) {
			//에러 발생 시 복구 or 에러출력
			//에러 건너뛰기 가능
		}
	}
	// => 웹 / 윈도우 => 리턴형으로 데이터 전송
	public MusicVO[] musicAllData()
	{
		return musics;
	}
	public MusicVO[] musicFindData(String fd)//제목으로 검색
	{
		int count=0;
		for(MusicVO vo:musics)
		{
			if(vo.getTitle().contains(fd))
			{
				count++;
			}
		}
		//동적 배열 생성 => 가변 Collection
		MusicVO[] music=new MusicVO[count];
		//배열 단점: 메모리 개수 고정됨
		int i=0;
		for(MusicVO vo:musics)
		{
			if(vo.getTitle().contains(fd))
			{
				music[i]=vo;// 클래스는 주소값을 대입할 수 있음
				i++;
			}
		}
		return music;
	}
}
