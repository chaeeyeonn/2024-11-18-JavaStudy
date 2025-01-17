package com.sist.commons;
// 서버와 클라이언트간의 약속 => 내부 프로토콜(정수/문자열)
// 가독성위해 상수형으로 처리
// => 서버와 클라이언트가 동시에 사용: 공통 모듈
// => 이미지 => 확대 / 축소 필요: css 활용
public class Function {
	//client에서 요청
	//먼저 로그인한 사람 처리
	public static final int LOGIN=100;
	//로그인하는 사람 처리
	public static final int MYLOG=110;
	//채팅처리
	public static final int WAITCHAT=200;
	//쪽지 보내기 / 개인정보 보기
	public static final int SENDMESSAGE=300;
	public static final int INFO=400;
	public static final int BOARD=500;
	//방만들기 / 방 들어가기 / 방 나가기
	//나가기
	public static final int EXIT=900;
	public static final int MYEXIT=910;
	

}
