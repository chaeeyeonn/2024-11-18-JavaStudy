package com.sist.io;
/*
 *   입출력
 *    - 메모리 입출력
 *      : Scanner, System.out.print(), System.in.read(), ...
 *                                    -------------------int / 반드시 예외처리
 *    - 파일 입출력
 *      : InputStream / OutputStream
 *           읽기            쓰기
 *      ** 특징
 *       1) 단방향 통신: 읽기 / 쓰기를 동시 처리 못함
 *       2) Stream: 데이터 이동 통로
 *       3) 1byte 입출력: 브라우저 / 한글이 없는 파일
 *       4) read(): 한 글자씩 저장
 *          write(): 한 글자씩 저장
 *          close(): 닫기
 *      : Reader / Writer => 2byte => 한글 읽기에 적합
 *          읽기     쓰기
 *        read()   write()   close()
 *        => 바이트스트림: 1byte 송신, 1byte 수신 => 다운로드 / 업로드
 *                    : FileInputStream / FileOutputStream
 *        => 문자스트림: 2byte 송신, 2byte 수신 => 한글 파일 제어
 *                  : FileReader / FileWriter
 *        => 필터스트림
 *        => 데이터를 메모리에 모아 한 번에 처리 => 속도가 빠름
 *           : BufferedInputStream / BufferedOutputStream / BufferedReader / BufferedWriter
 *           
 *           ObjectInputStream / ObjectOuputStream
 *      -------------------------------------------------------
 *    - 네트워크 입출력
 *    
 *      입출력
 *             입력스트림                출력스트림
 *      키보드  ==========> 자바 프로그램 =============> 모니터
 *                 |                       |
 *             ~InputStream           ~OutputStream
 *             ~Reader                ~Writer
 *      ~InputStream / ~OutputStream
 *      : 이미지나 동영상 같은 바이트 형태의 데이터 입출력
 *      : 업로드 / 다운로드
 *      ~Reader / ~Writer
 *      : 16bit(2byte)
 *      : 파일에 글쓰기 / 파일 읽기
 *      메모리에 모아서 한 번에 처리 => Buffered~
 *      => 객체 단위로 저장 ==> 파일 프로그램
 *      => 파일 => 데이터베이스 변경
 *      => 파일에 저장
 *        ----------open API => 파싱
 *        ----------크롤링 => 임시 저장 장소
 *        
 *      데이터 종류
 *      1) 정형화된 데이터: 데이터베이스 안 저장 => 공유
 *                    => 웹/윈도우에 출력할 데이터만
 *      2) 반정형화된 데이터: 구분만 된 데이터
 *                      : HTML / XML / JOSN. CSV/ 등...
 *      3) 비정형화된 데이터: 구분이 없는 데이터(뉴스/줄거리/댓글/...)
 *                     => 분석해서 필요한 데이터를 가져와 정형화된 데이터 만들기
 *                     => 정규식
 */
import java.io.*;
public class IO_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fis=null;
		try
		{
			//파일 읽기
			fis=new FileReader("C:\\JavaDev\\JavaStudy\\Chapter11_IO라이브러리_1\\src\\com\\sist\\io\\IO_1.java");
			int i=0; // read() => int 로 읽음 => char로 변환해야 함
			while((i=fis.read())!=-1)//-1:파일을 모두 읽음
			{
				System.out.print((char)i);
			}
		}catch(Exception ex) 
		{
			ex.printStackTrace();//오류 확인
		}
		finally
		{
			try
			{
				fis.close();
			}catch(Exception ex) {}
			
		}

	}

}
