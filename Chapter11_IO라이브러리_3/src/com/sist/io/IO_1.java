package com.sist.io;

import java.io.FileReader;

/*
 *   1. File 정보
 *      - 파일명: getName()
 *      - 경로명: getPath()
 *      - 파일 생성: createNewFile()
 *      - 폴더에 있는 파일 목록: listFiles()
 *      - 파일 크기: legngth()
 *      - 폴더 생성: mkdir()
 *      - 삭제: delete()
 *   2. 파일 입출력
 *      --------이미지/동영상/zip
 *              FileInputStream / FileOutputStream
 *              => 바이트 스트림
 *              => read / write
 *              => close
 *      --------실제 파일 입출력
 *              FileReader / FileWriter => char
 *              => 문자 스트림
 *              => read / write
 *              => close
 *              => 'w' 모드: create => 새로운 파일 생성
 *                  new FileReader("파일명")
 *              => 'a' 모드: append => 기존 파일 옆 / 밑에 이어쓰기 출력
 *                                 => 문자열 결합
 *                  new FileReader("파일명",true)
 *              => 파일은 반드시 닫기를 해야 함
 *              => Open API / 크롤링 데이터 => 저장
 *                => 전체 수집 => 오라클 전송
 *   3. 속도 최적화
 *      : InputStream / OutputStream
 *        Reader      / Writer
 *       => BufferedInputStream / BufferedOutputStream
 *       => ***BufferedReader / ***BufferedWriter
 *   4. 객체단위로 입출력
 *      : ObjectInputStream / ObjectOutputStream
 *   5. 네트워크 입출력
 *      - 송신: OutputStream => 네트워크 패키지 => byte
 *      - 수신: InputStream => char
 *        => 브라우저 송수신 가능(TCP)
 *        => 오라클(TCP)
 *   6. 표준 입출력
 *      입력 => System.in.read() => Scanner
 *      출력 => System.out.println()
 */
public class IO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0;
			long start=System.currentTimeMillis();
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			long end=System.currentTimeMillis();
			System.out.println("걸린 시간:"+(end-start));
		
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}

}
