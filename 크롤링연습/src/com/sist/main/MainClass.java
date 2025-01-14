package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  class: 중복 가능 => 태그명.class명
		 *  id: 중복 불가능 => 태그명#id명
		 */
		String html="<html>" // html 문서 시작
				   +"<body>" // 브라우저 출력
				   +"<div id=aaa>" // 구분자: class / id
				   +"<div>Java</div>" // Element
				   +"<div>Oracle</div>"
				   +"<div>HTML/CSS</div>"
				   +"</div>"
				   +"<div class=bbb>"
				   +"<div>JavaScript</div>"
				   +"<div>JSP</div>"
				   +"<div>Spring</div>" // Elements
				   +"</div>"
				   +"<img src=http://www.daum.net>"
				   +"</body>" // 화면 출력 닫는 태그
				   +"</html>"; // 문서 닫는 태그
		try
		{
			// Element => text(), attr(): 속성값
			// html() => HTML 태그, data(): JavaScript읽기
			// Elements => get(): 태그 하나씩 가져오기
			// --------태그 개수 확인 => size()
			Document doc=Jsoup.parse(html);
			Elements div=doc.select("div#aaa");
			System.out.println(div);
			System.out.println("---------------");
			Elements div1=doc.select("div.bbb div");
			// => 후손 태그
			//System.out.println("div개수? "+div.size());
//			Element div1=div.get(0);
//			System.out.println(div1.text());
//			Element div2=div.get(1);
//			System.out.println(div2.text());
			for(int i=0;i<div1.size();i++)
			{
				System.out.println(div1.get(i).text());
			}
			Element img=doc.selectFirst("img");// 상세보기에 많이 씀 / img 태그 사용
			System.out.println(img.attr("src"));
			/*
			 *   1. 읽어올 태그 => 상위 태그 찾기
			 *   
			 */
		}catch(Exception ex) {}

	}

}
