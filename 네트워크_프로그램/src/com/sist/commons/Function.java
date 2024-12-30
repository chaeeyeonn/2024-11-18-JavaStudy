package com.sist.commons;
// 서버 - 클라이언트 공통 사용
// => 내부 프로토콜: 서버와 클라이언트 간의 약속
/*
 *   100 => 로그인한다 => login.jsp
 *   200 => 방만들기 한다 => make.jsp
 *   ...
 *   100admin|1234|aaaaa => 요청번호(로그인)|id|pwd|닉네임 => send.jsp
 *   
 *   1. 서버로 요청 => 응답 받아 윈도우 출력
 *      --------
 *      요청 처리      결과값 출력
 */
public class Function {
	public static final int LOGIN=100; // 먼저 로그인한 사람 처리
	public static final int MYLOG=110; // 로그인하는 사람
	public static final int WAITCHAT=200;
	public static final int END=900;// 남아있는 사람
	public static final int MYEND=910;// 나가는 사람
	// 모든 처리는 서버에서 명령을 내린다

}
