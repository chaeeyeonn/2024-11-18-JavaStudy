package com.sist.io;
import java.io.*;
import com.sist.model.*;
import java.util.*;

public class Container {
	//클래스 모아 관리 => 관련 클래스가 여러 개 있는 경우
	//Model(브라우저 전송) , DAO
	private Map<String,Object> clsMap=new HashMap<String, Object>();
	public Container()
	{
//		clsMap.put("a", new A());
//		clsMap.put("b", new B());
//		clsMap.put("c", new C());
//		clsMap.put("d", new D());
//		clsMap.put("e", new E());
//		clsMap.put("f", new F());
//		clsMap.put("g", new G());
		File dir=new File("C:\\JavaDev\\JavaStudy\\Chapter11_IO라이브러리_1\\src\\com\\sist\\model");
		String pack="com.sist.model";
		File[] files=dir.listFiles();
		for(File f:files)
		{
			if(f.isFile())
			{
				try
				{
					String name=f.getName();
					String n=name.substring(0,name.lastIndexOf("."));
					String cls=pack+"."+n;
					//동적으로 메모리 할당 => 리플렉션
					Class clsName=Class.forName(cls);
					Object obj=clsName.getDeclaredConstructor().newInstance();
					clsMap.put(n.toLowerCase(),obj);
				}catch(Exception ex) {}
			}
		}
		
	}
	//요청시마다 클래스 찾기
	public I getBean(String key)
	{
		return (I)clsMap.get(key);
	}

}
