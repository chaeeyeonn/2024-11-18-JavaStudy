package com.sist.io;
import java.io.*;
import java.net.*;
import java.util.Scanner;

import javax.swing.text.Document;

import org.jsoup.Jsoup;
public class IO_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  영화진흥원
		 *  1. 일일 박스오피스
		 *  2. 실시간 예매율
		 *  3. 좌석 점유율
		 */
		String[] strUrl= {"","searchMainDailyBoxOffice.do","searchMainRealTicket.do","searchMainDailySeatTicket.do"};
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("=======Menu=========");
			System.out.println("1. 일일 박스오피스");
			System.out.println("2. 실시간 예매율");
			System.out.println("3. 좌석 점유율");
			System.out.println("===================");
		    System.out.println("메뉴 선택:");
		    int menu=scan.nextInt();
		    String path="https://www.kobis.or.kr/kobis/business/main/";
		    //뒤에 확장자 .do를 붙여야 함 => MVC구조 => URL주소는 마음대로 변경 가능
		    path=path+strUrl[menu];
		    
		    org.jsoup.nodes.Document doc=Jsoup.connect(path).get();
		    System.out.println(doc.toString());
//		    URL url=new URL(path);
//		    HttpURLConnection conn=(HttpURLConnection)url.openConnection();
//		    if(conn!=null)//접속이 됐다면
//		    {
//		    	BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
//		    	//전송 => 1byte / 수신 => 2byte로 변환 / 안 그러면 한글 다 깨짐
//		    	while(true)
//		    	{
//		    		String msg=br.readLine();
//		    		if(msg==null) break;
//		    		System.out.println(msg);
//		    	}
//		    }
//		    conn.disconnect();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
