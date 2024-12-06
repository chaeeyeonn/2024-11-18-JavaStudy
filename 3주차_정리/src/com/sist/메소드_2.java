package com.sist;
import java.util.Scanner;
import java.io.*;//파일 읽기, 네트워크 전송: 읽기/쓰기
// Input / Output => io => 반드시 예외처리 해야 함
/*
 *  교재 마지막장 12장 => 자바 관련 모든 문법 응용
 *                    : 데이터베이스 => 웹
 *                    : 네트워크 => 온라인 게임
 *                    웹 => 쓰레드, 네트워크 => 흐름정도
 */
public class 메소드_2 {
    static String seoulData;//자동 초기화 => null
    //초기화(자동) => 초기화 블록 => 자동 로그인, 쿠키 읽기 ...
    static
    {
    	try
    	{
    		FileReader fr=new FileReader("c:\\javaDev\\seoul_location.txt");
    		int i=0;
    		StringBuffer sb=new StringBuffer();
    		while((i=fr.read())!=-1)
    		{
    			sb.append((char)i);
    		}
    		seoulData=sb.toString();
    		fr.close();
    	}catch(Exception ex)
    	{
    		
    	}
    }
    static void menu()
    {
    	System.out.println("===== 메뉴 =====");
    	System.out.println("1. 명소 목록");//페이징
    	System.out.println("2. 명소 상세 보기");
    	System.out.println("3. 명소 검색(명소명)");
    	System.out.println("4. 명소 검색(주소)");
    	System.out.println("5. 종료");
    	System.out.println("===============");
    }
    static void seoulList(int page)
    {
    	String[] seoul=seoulData.split("\n");
    	int i=0;
    	int j=0;
    	final int ROWSIZE=20;
    	int pagecnt=(page*ROWSIZE)-ROWSIZE;
    	for(String s:seoul)
    	{
    		if(j<20 && j>=pagecnt)
    		{
    			String[] sd=s.split("\\|");
    			System.out.println(sd[0]+""+sd[1]);
    			j++;
    		}
    		i++;
    	}
    	
    }
    static void seoulDetail(int seoulNo)
    {
    	String[] seoul=seoulData.split("\n");
    	for(String s:seoul)
    	{
    		String[] info=s.split("\\|");
    		if(info[0].equals(String.valueOf(seoulNo)))
    		{
    			System.out.println("명소명"+":"+info[1]);
    			System.out.println("상세"+":"+info[2]);
    			System.out.println("주소"+":"+info[3]);
    		}
    	}
    }
    static String[] find(int type,String findData)
    {
    	//확인 => 검색된 개수
    	String[] datas=seoulData.split("\n");
    	int count=0;
    	for(String seoul:datas)
    	{
    		String[] sd=seoul.split("\\|");
    		String ss="";
    		if(type==1)
    		{
    			ss=sd[1];
    		}
    		else
    		{
    			ss=sd[3];
    		}
    		
    		if(ss.contains(findData))
    		{
    			count++;//찾은 개수만큼 배열 개수 올림
    		}
    	}
    	//배열 크기 확인
    	String[] data=new String[count];// 동적 크기 / 혹은 목록의 최대값 넣어도 됨 => 출력시 안 들어간 배열 목록은 'null'로 표시
    	int i=0;
    	for(String seoul:datas)
    	{
    		String[] sd=seoul.split("\\|");
    		String ss="";
    		if(type==1)
    		{
    			ss=sd[1];
    		}
    		else
    		{
    			ss=sd[3];
    		}
    		
    		if(ss.contains(findData))
    		{
    			data[i]=sd[1]+"--"+sd[3];
    			i++;
    		}
    	}
    	return data;
    }
    //조립 => 사용자 정의 메소드는 반드시 호출해야 실행됨
    //=> 전체 프로젝트에 한 개 이상 main이 있어야 함
    static void process()
    {
//    	System.out.println(seoulData);
    	Scanner scan=new Scanner(System.in);
    	while(true)
    	{
    		menu();
    		System.out.print("메뉴 선택:");
    		int m=scan.nextInt();
    		switch(m)
    		{
    		case 5:
    			System.out.println("프로그램 종료");
    			System.exit(0);//break 넣으면 switch문만 꺼지기 때문에 프로그램 전체 종료 명령문을 씀//0=> 정상 종료
    		case 1:
    			System.out.print("명소 페이지:");
    			int page=scan.nextInt();
    			seoulList(page);
    			break;
    		case 2:
    			System.out.print("명소 선택:");
    			int seoulNo=scan.nextInt();
    			seoulDetail(seoulNo);
    			break;
    		case 3: case 4:
    			System.out.print("명소(1), 주소(2):");
    			int type=scan.nextInt();
    			System.out.println("검색어를 입력하세요:");
    			String fd=scan.next();
    			String[] ss=find(type,fd);
    			for(String s:ss) {
    				//if(s!=null)
    				System.out.println(s);
    			}
    			break;
    		}
    	}
    }
    //시작 => 자동 호출 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}
