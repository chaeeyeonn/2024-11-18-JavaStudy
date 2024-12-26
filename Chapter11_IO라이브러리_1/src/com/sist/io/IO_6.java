package com.sist.io;
//삭제: delete()
/*
 *   1. 파일 읽기
 *      new File("경로명\\파일명")
 *   2. 폴더 읽기
 *      new File("경로명\\폴더명")
 *   3. 주요 메소드
 *      getName(): 파일명 읽기
 *      getPath(): 경로명 ~ 파일명
 *      length(): 파일 크기
 *      
 *      listFiles(): 폴더의 파일 목록
 *      mkdir(): 폴더 제작
 *      createNewFile(): 파일 생성
 *      delete(): 삭제
 *      exists(): 존재 여부 확인
 */
import java.io.*;
public class IO_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir=new File("c:\\java_data");
		//rm 파일명 => rm -rf 폴더명
		//dir.delete();
		File[] files=dir.listFiles();
		for(File f:files)
		{
			f.delete();
		}
		dir.delete();
		System.out.println("삭제 완료");//빈 폴더여야 지워짐
	}

}
