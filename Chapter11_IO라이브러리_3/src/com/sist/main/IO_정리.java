package com.sist.main;
/*
 *   IO => java.io => CheckException => 예외처리 후 사용
 *                    --------------
 *                    |java.sql / java.net / java.lang
 *   1. 특징
 *      : 단방향 => Input / Output
 *        => 동시 처리하려면 => 쓰레드 이용
 *        => 네트워크: 전송(쓰기) / 수신(읽기)
 *        => Thread는 프로그램 안에서 다른 프로그램 여러 개를 동시 수행
 *      : 데이터 이동 통로 => Stream
 *      : Queue 방식 => FIFO (First In First Out)
 *      
 *   2. 종류
 *      - 바이트 송수신: 바이트 스트림
 *        => 1byte 읽기 / 쓰기
 *        => 동영상, 이미지, zip, ...
 *        => ~InputStream / ~OutputStream
 *        => 웹) 업로드, 다운로드, 데이터 읽기, ...
 *           네트워크에서도 주로 사용
 *      - 문자 송수신: 문자 스트림
 *        => 2byte 읽기 / 쓰기
 *        => 한글이 포함된 파일 제어
 *        => ~Reader / ~Writer
 *        
 *      - ~InputStream / ~OutputStream
 *        => FileInputStream / FileOutputStream
 *        => ObjectInputStream / ObjectOutputStream
 *      - ~Reader / ~Writer
 *        => FileReader / FileWriter
 *      - 속도 최적화 => 필터 스트림
 *        => BufferedInputStream / BufferedOutputStream
 *        => BufferReader / BufferWriter
 *        
 *   3. 사용처
 *      사용자(키보드, 마우스) ================= 자바프로그램 ================== 화면
 *                          입력스트림         응용프로그램      출력스트림      모니터/브라우저
 *      - 메모리에서 입출력: BufferedReader => readLine()
 *      - 파일에서 입출력
 *         - 바이트 스트림: ~InputStream, ~OutputStream
 *           => read(), read(byte[],int off,int len), write(int), write(byte[]) => getBytes(), close()
 *        리턴형: int   , int => 읽은 글자 수           , int       ,  byte => 한글 파일
 *         - 문자 스트림: ~Reader, ~Writer
 *           => read(), read(char[],int,int), write(int), write(char[]), ***write(String)
 *      - 네트워크 입출력
 *      ==============스트림 이용: 메모리에 저장된 데이터를 읽어 온다 => 절대 잊지 않음 => 신뢰성, 안정성
 *                            => 소켓 프로그램: 이메일(smtp), 파일 업로드(FTP), TELNET, ...
 *      표준 입출력
 *      - System.in / System.out
 *      public final class System
 *      {
 *           public static InputStream in;
 *                         => read()
 *           public static OutputStream out;
 *                         => print()
 *      }
 *      
 *   4. 파일 모드
 *      - r: ~InputStream / ~Reader => 읽기 전용
 *      - w: ~OutputStream / ~Writer => create => 덮어쓰기
 *      - a" new FileWriter("파일명",true) => append => 이어쓰기
 *      
 *   5. 객체 단위 저장
 *      : ObjectInputStream / ObjectOutputStream
 *      => 읽기 / 쓰기 / 수정 / 삭제
 *      => 제어는 ArrayList => 저장(ArrayList를 통으로 저장)
 *      => 직렬화 / 역직렬화
 *      
 *   6. XML, CSV, JSON
 *   
 *   7. 독립적인 클래스(.properties)
 *   
 */
import java.util.*;
import java.io.*;
public class IO_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
//			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
//			//Scanner => 가장 단순한 입력 클래스
//			System.out.println("문자열 입력:");
//			String msg=in.readLine();//enter => 메모리 저장
//			System.out.println(msg);
//			//명령프롬프트 X => 입력창 / 출력창 => 브라우저 or 윈도우창 이용
			System.out.print("입력:");
			int data=System.in.read();//int이기에 한 글자만 입력 가능
			System.out.println((char)data);//int => char 변환
			
		}catch(Exception ex) {}

	}

}
