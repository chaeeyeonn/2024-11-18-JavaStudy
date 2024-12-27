package com.sist.board;
import java.io.Serializable;
import java.util.*;

import lombok.Data;
/*
 *   => 파일 => ArrayList => 제어
 *   --------------------------
 *   1. Collection: 다수의 데이터 저장, 제어 라이브러리
 *        - List: 데이터 중복 가능 / 순서 가짐
 *          - ArrayList
 *            1) add()
 *            2) set()
 *            3) remove()
 *            4) get()
 *            5) size()
 *            6) isEmpty()
 *        - Set: 데이터 중복 불가 / 순서 없음
 *          - HashSet 
 *            1) add()
 *            2) remove()
 *            3) size()
 *            4) isEmpty()
 *            5) clear()
 *        - Map: 웹에서 가장 많이 사용 라이브러리 => MyBatis(키, SQL) / Spring(키, class)
 *             : 키(중복 x) + 값(중복 o)
 *          - HashMap
 */
// 캡슐화 / 오버라이딩
@Data
public class BoardVO implements Serializable{
	private int no; //게시물 번호
	private String name; // 글쓴이
	private String subject; // 제목
	private String content; // 내용
	private String pwd; // 비밀번호 => 본인여부 확인 , 삭제용
	private Date regdate; // 작성일
	private int hit; // 조회수
}
