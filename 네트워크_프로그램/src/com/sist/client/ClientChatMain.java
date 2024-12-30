package com.sist.client;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import com.sist.commons.*;
public class ClientChatMain extends JFrame implements ActionListener,Runnable{
	JButton b1,b2;
	JTextArea ta;
	JTextField tf;
	private String name;
	// 서버 연결 => 네트워크 관련
	Socket s;
	// => 단방향
	OutputStream out;// 서버에서 들어오는 값은 자동화되도록 만들기
	BufferedReader in;
	
	// 레이아웃
	public ClientChatMain()
	{
		b1=new JButton("접속");
		b2=new JButton("종료");
		
		tf=new JTextField(25);
		tf.setEnabled(false);
		ta=new JTextArea();
		ta.setEditable(false);
		JScrollPane js=new JScrollPane(ta);
		
		JPanel p=new JPanel();
		p.add(tf);
		p.add(b1);
		p.add(b2);
		
		add("Center",js);
		add("South",p);
		setSize(450,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		tf.addActionListener(this);// 채팅 문자 넘기기
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientChatMain();
	}
	@Override// 서버에서 들어오는 값 처리
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				//서버에서 보내준 값
				ta.append(msg+"\n");
			}
		}catch(Exception ex) {}
		
	}
	@Override//버튼 클릭시
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==b1)
		{
			name=JOptionPane.showInputDialog("이름 입력:");
			try
			{
				// 서버 연결
//				s=new Socket("localhost",3050);
				s=new Socket("192.168.10.107",3050);
				// 송수신
				out=s.getOutputStream();
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
			}catch(Exception ex) {}
			tf.setEnabled(true);// 접속 받기
			b1.setEnabled(false);// 더이상의 접속 안 받기
			// 서버에서 들어온 값을 받는다
			new Thread(this).start();//run() 호출
		}
		else if(e.getSource()==tf)
		{
			String msg=tf.getText();
			if(msg.trim().length()<1)//입력이 안 됐을 경우
			{
				tf.requestFocus();
				return;
			}
			try
			{
				out.write(("["+name+"]"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			tf.setText("");
		}
		
	}

}
