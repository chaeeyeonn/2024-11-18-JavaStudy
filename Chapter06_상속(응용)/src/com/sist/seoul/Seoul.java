package com.sist.seoul;
import java.io.*;

import com.sist.vo.SeoulVO;
public class Seoul {
	public String getFileData(String path)//파일읽기 코드
	{
		StringBuffer sb=new StringBuffer();
		try
		{
			FileReader fr=new FileReader(path);
			int i=0;//문자 하나씩 읽어오기
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
		}catch(Exception ex) {}
		return sb.toString();
	}
	public SeoulVO[] seoulAllData(int type)
	{
		SeoulVO[] datas=null;
		String data="";
		if(type==1)//location 들어갈 자리
		{
			data=getFileData("c:\\javaDev\\seoul_location.txt");
		}
		else//nature 들어갈 자리
		{
			data=getFileData("c:\\javaDev\\seoul_nature.txt");
		}
		String[] seoul=data.split("\n");//한 줄씩 가져오기
		datas=new SeoulVO[seoul.length];
		int i=0;
		for(String s:seoul)
		{
			String[] ss=s.split("\\|");//|마다 나누기
			datas[i]=new SeoulVO();
			datas[i].setNo(ss[0]);
			datas[i].setName(ss[1]);
			datas[i].setContent(ss[2]);
			datas[i].setAddress(ss[3]);
			i++;
		}
		
		return datas;
	}
//	public SeoulVO[] seoulListData(int page)
//	{
//		SeoulVO[] seoul=new SeoulVO[];
//		return seoul;
//	}
//	public SeoulVO[] seoulFindData(int type,String findData)
//	{
//		
//	}
}
