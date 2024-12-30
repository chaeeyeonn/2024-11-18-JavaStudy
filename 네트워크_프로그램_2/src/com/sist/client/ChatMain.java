package com.sist.client;
import java.util.*;
import java.net.*;
import java.awt.CardLayout;
import java.io.*;
import javax.swing.*;
import com.sist.commons.*;
import java.awt.event.*;
// 마우스 / 버튼 / 엔터 => 서버로 전송
// 서버에서 전송하는 값 읽기 ==> 자동화 처리
public class ChatMain extends JFrame implements ActionListener,Runnable,MouseListener{
	Login login=new Login();
	WaitRoom wr=new WaitRoom();
	CardLayout card=new CardLayout();
	// 네트워크 관련 클래스
	Socket s;
	OutputStream out;
	BufferedReader in;
	// 본인 여부 확인
	String myId;
	
	int selRow=-1;// 명단 속 이름을 누르지 않으면 -1
	
	public ChatMain()
	{
		setLayout(card);
		add("LOG",login);
		add("WR",wr);
		
		setSize(800,600);
		setVisible(true);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//x 버튼 비활성화 => 무조건 '종료하기' 버튼만 누를 수 있음
		
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		wr.tf.addActionListener(this);
		wr.b6.addActionListener(this);// 나가기
		
		wr.table2.addMouseListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatMain();

	}
	/*
	 *   client => 요청(이벤트) actionPerformed()
	 *   server => run()
	 *             case => 요청 처리
	 *   client => run()
	 *             case => 화면 출력
	 *             
	 *   모든 동작은 서버에서 내려준다
	 *   messageAll
	 *   messageTo 구분
	 *   
	 *   Client 요청 => out.write()
	 */
	@Override//서버 수신 후 출력
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				StringTokenizer st=new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				switch(protocol)
				{
				  case Function.LOGIN://먼저 로그인된 사람
				  {
					  String[] data= {
							  st.nextToken(),
							  st.nextToken(),
							  st.nextToken(),
							  st.nextToken()
					  };
					  wr.model2.addRow(data);
				  }
					  break;
				  case Function.MYLOG://로그인 하고 있는 사람
				  {
					  card.show(getContentPane(), "WR");
					  myId=st.nextToken();
					  setTitle(myId);
				  }
					  break;
				  case Function.WAITCHAT:
				  {
					  wr.ta.append(st.nextToken()+"\n");
					  wr.bar.setValue(wr.bar.getMaximum());//스크롤바가 맨 아래로 내려가도록
				  }
					  break;
				  case Function.EXIT://남아 있는 사람들의 명단칸 처리
				  {
					  String yid=st.nextToken();
					  // exit.jsp?id=admin
					  // String yid=request.getParameter("id")
					  for(int i=0;i<wr.model2.getRowCount();i++)
					  {
						  String id=wr.model2.getValueAt(i, 0).toString();//테이블 속 id를 하나씩 읽음
						  if(yid.equals(id))
						  {
							  wr.model2.removeRow(i);
							  break;
						  }
					  }
				  }
				  break;
				  case Function.MYEXIT:// 실제 나간 사람 처리
				  {
					  dispose();
					  System.exit(0);
				  }
				  break;
				  case Function.INFO:
				  {
					  String data="아이디:"+st.nextToken()+"\n"+"이름:"+st.nextToken()+"\n"+"성별:"+st.nextToken()+"\n"+"방위치:"+st.nextToken();
					  JOptionPane.showMessageDialog(this, data);
				  }
				}
			}
		}catch(Exception ex) {}
		
	}
	@Override//서버로 값 전송
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2)
		{
			dispose();// 윈도우 메모리 해제
			System.exit(0);// 프로그램 해제
			//React-Query => TanStack-Query
		}
		else if(e.getSource()==login.b1)
		{
			//1. 입력값 읽기
			String id=login.tf1.getText();
			if(id.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(name.trim().length()<1)
			{
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			// 서버와 연결
			connection(id,name,sex);
		}
		else if(e.getSource()==wr.tf)
		{
			String msg=wr.tf.getText();
			if(msg.trim().length()<1)
			{
				wr.tf.requestFocus();
				return;			
			}
			// 서버 전송
			try
			{
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			wr.tf.setText("");//엔터 쳐서 메시지 보낸뒤 입력창은 다시 공백 처리
		}
		else if(e.getSource()==wr.b6)
		{
			// 나가기
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
		
	}
	public void connection(String id,String name,String sex)
	{
		try
		{
			s=new Socket("192.168.10.107",3050);
			//서버 정보
			out=s.getOutputStream();
			in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			//로그인 요청
			out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			// => ObjectOutputStream 가능
		}catch(Exception ex) {}
		//서버 통신
		new Thread(this).start();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==wr.table2)
		{
			if(e.getClickCount()==2)//더블 클릭이면
			{
				int row=wr.table2.getSelectedRow();//선택한 table 줄 번호
				String id=wr.model2.getValueAt(row, 0).toString();//모든 아이디
				try
				{
					out.write((Function.INFO+"|"+id+"\n").getBytes());
				}catch(Exception ex) {}
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
