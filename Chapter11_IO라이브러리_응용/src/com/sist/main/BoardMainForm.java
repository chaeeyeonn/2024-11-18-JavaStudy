package com.sist.main;
import javax.swing.*;

import com.sist.board.*;
import java.util.*;
import java.util.List;
import java.awt.*;// 해당 라이브러리에도 List가 있으니 유의
import java.awt.event.*;
import java.text.SimpleDateFormat;
public class BoardMainForm extends JFrame implements ActionListener,MouseListener{
	CardLayout card=new CardLayout();
	BoardList bList=new BoardList();
	BoardDetail bDetail=new BoardDetail();
	BoardInsert bInsert=new BoardInsert();
	BoardUpdate bUpdate=new BoardUpdate();
	BoardDelete bDelete=new BoardDelete();
	// 게시판 관리자
	BoardManager bm=new BoardManager();
	// 변수 설정
	int curpage=1;
	int totalpage=0;//입력 받아야 알 수 있으니 0
	public BoardMainForm()
	{
		setLayout(card);
		//추가
		add("LIST",bList);
		add("DETAIL",bDetail);
		add("INSERT",bInsert);
		add("UPDATE",bUpdate);
		add("DELETE",bDelete);
		
		setTitle("윈도우 게시판 ver 1.0");
		listPrint();
		setSize(640,550);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 이벤트 등록
		bList.inBtn.addActionListener(this); // 글쓰기 이동 버튼 
		bInsert.b1.addActionListener(this); // 글쓰기 버튼
		bInsert.b2.addActionListener(this); // 취소 버튼
		
		// 이전
		bList.prevBtn.addActionListener(this);
		// 다음
		bList.nextBtn.addActionListener(this);
		// table
		bList.table.addMouseListener(this);
		
		// 목록
		bDetail.b3.addActionListener(this);
		// 수정
		bDetail.b1.addActionListener(this);
		// 삭제
		bDetail.b2.addActionListener(this);
		
		// 실제 삭제
		bDelete.b1.addActionListener(this);// 삭제
		bDelete.b2.addActionListener(this);// 취소
	}
	public void listPrint()
	{
		// table 내용 삭제 => model 총 개수 삭제
		// 새 데이터 들어올 때마다 한 번 지워야 함 => 안 그러면 같은 내용이 뒤에 다시 이어붙음
		for(int i=bList.model.getRowCount()-1;i>=0;i--)
		{
			bList.model.removeRow(i);
		}
		// 데이터 받기
		/*
		 *   다른 패키지에 같은 이름의 클래스가 있는 경우
		 *   java.util.List
		 *   java.awt.*
		 *   
		 *   혹은 변수에
		 *   java.util.List 직접 붙이기
		 */
		List<BoardVO> list=bm.boardListData(curpage);
		totalpage=bm.boardTotalPage();
		bList.pageLa.setText(curpage+"page / "+totalpage+"pages");// 현재 페이지 / 총 페이지
		
		// 게시물 출력
		for(int i=0;i<list.size();i++)
		{
			BoardVO vo=list.get(i);
			String[] data= {
					String.valueOf(vo.getNo()),vo.getSubject(),vo.getName(),
					new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()),String.valueOf(vo.getHit())
			};
			bList.model.addRow(data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(bList.inBtn==e.getSource()) // 목록에서 새글 버튼 클릭함
		{
			bInsert.nameTf.setText("");// 공백 => 글 써넣으면 안 지워짐 => 위에서 메모리 할당을 지우지 않았으므로
			bInsert.subTf.setText("");
			bInsert.ta.setText("");
			bInsert.pwdPf.setText("");
			// card 변경 => 윈도우 창 변경
			card.show(getContentPane(),"INSERT"); // 새 글쓰기 창으로 변경하겠다
			bInsert.nameTf.requestFocus();
		}
		else if(bInsert.b2==e.getSource())// 글쓰기 취소
		{
			card.show(getContentPane(), "LIST");// List로 돌아가기
			// 웹: javascript:history.back()
		}
		else if(bInsert.b1==e.getSource())// 글쓰기 버튼 클릭
		{
			String name=bInsert.nameTf.getText();// 입력된 값 읽기(이름)
			if(name.length()<1)// 입력이 안 됨 => 유효성 검사
			{
				bInsert.nameTf.requestFocus();
				return;// 다시 돌아가
			}
			
			String subject=bInsert.subTf.getText();// 입력된 값 읽기(제목)
			if(subject.length()<1)// 입력이 안 됨 => 유효성 검사
			{
				bInsert.subTf.requestFocus();
				return;// 다시 돌아가
			}
			String content=bInsert.ta.getText();// 입력된 값 읽기(내용)
			if(content.length()<1)// 입력이 안 됨 => 유효성 검사
			{
				bInsert.ta.requestFocus();
				return;// 다시 돌아가
			}
			String pwd=String.valueOf(bInsert.pwdPf.getPassword());// 입력된 값 읽기(비밀번호)
			if(pwd.length()<1)// 입력이 안 됨 => 유효성 검사
			{
				bInsert.pwdPf.requestFocus();
				return;// 다시 돌아가
			}
			BoardVO vo=new BoardVO();
			vo.setName(name);
			vo.setSubject(subject);
			vo.setContent(content);
			vo.setPwd(pwd);
			int no=bm.boardSequence();
			vo.setNo(no);
			vo.setRegdate(new Date());
			
			bm.boardInsert(vo);// 추가된 상태
			
			// 목록으로 재이동
			card.show(getContentPane(),"LIST");
			listPrint();
		}
		else if(e.getSource()==bList.prevBtn)// 이전
		{
			if(curpage>1)
			{
				curpage--;
				listPrint();
			}
		}
		else if(e.getSource()==bList.nextBtn)// 다음
		{
			if(curpage<totalpage)
			{
				curpage++;
				listPrint();
			}
		}
		// 웹 => 반드시 현재 페이지로 전송해야 함
		else if(e.getSource()==bDetail.b3)// 상세보기 => 목록 이동
		{
			card.show(getContentPane(), "LIST");
			listPrint();
		}
		else if(e.getSource()==bDetail.b2)
		{
			card.show(getContentPane(),"DELETE");
		}
		else if(e.getSource()==bDetail.b1)
		{
			// 수정 요청
			String no=bDetail.no.getText();
			BoardVO vo=bm.boardUpdateData(Integer.parseInt(no));
			card.show(getContentPane(), "UPDATE");
			bUpdate.nameTf.setText(vo.getName());
			bUpdate.subTf.setText(vo.getSubject());
			bUpdate.ta.setText(vo.getContent());
		}
		else if(e.getSource()==bDelete.b2)
		{
			card.show(getContentPane(), "DETAIL");
		}
		else if(e.getSource()==bDelete.b1)
		{
			String pwd=String.valueOf(bDelete.pf.getPassword());
			if(pwd.length()<1)
			{
				bDelete.pf.requestFocus();
				return;
			}
			String no=bDetail.no.getText();
			boolean bCheck=bm.boardDelete(Integer.parseInt(no),pwd);
			if(bCheck==false)
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
				bDelete.pf.setText("");
				bDelete.pf.requestFocus();
			}
			else
			{
				card.show(getContentPane(), "LIST");
				listPrint();
			}
		}
		// 수정 / 삭제 => 본인 여부 확인 => 비밀번호
		// boolean => 비밀번호 체크
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==bList.table)
		{
			if(e.getClickCount()==2)// 더블클릭
			{
				int row=bList.table.getSelectedRow();
				String no=bList.model.getValueAt(row, 0).toString();
				//System.out.println(no);
				BoardVO vo=bm.boardDetailData(Integer.parseInt(no));
				
				card.show(getContentPane(), "DETAIL");
				
				// 출력 => bDetail
				bDetail.no.setText(String.valueOf(vo.getNo()));
				bDetail.name.setText(vo.getName());
				bDetail.sub.setText(vo.getSubject());
				bDetail.ta.setText(vo.getContent());
				bDetail.hit.setText(String.valueOf(vo.getHit()));
				bDetail.day.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				
				
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
