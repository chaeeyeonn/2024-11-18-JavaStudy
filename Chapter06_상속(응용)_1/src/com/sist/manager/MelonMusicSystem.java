package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sist.vo.MusicVO;

public class MelonMusicSystem extends GenieMusicSystem {
	//public MusicVO[] musics=new MusicVO[50];//붙이면 지니뮤직 데이터를 그대로 가져옴
	public String title="멜론 Top50";
	{
		//예외처리 => 파일 관련, 네트워크 관련, 데이터베이스 관련
		//url => 웹 네트워크
		try
		{
			//정상적 수행 => 에러나면 프로그램 종료
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01");//태그명.구분자
			Elements singer=doc.select("div.wrap_song_info div.rank02");//Elements => Jsoup 패키지 맞춰 고르기
			Elements album=doc.select("div.wrap_song_info div.rank03");
			
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
	//musicAllData , musicFindData(String fd)코드는 이미 상속되어있음
	//static, 생성자, 초기화 블록 제외하고 추가됨 ==> 포함 클래스를 더 많이 씀
}
