package com.sist.main;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.spi.ToolProvider;

import javax.swing.*;
public class ControlPanel extends JPanel{
//	public ControlPanel() //메인 화면 크기 임시용
//	{
//		setBackground(Color.white);
//	}
	Image back;
	JLabel la1,la2;//이름표(id,pwd)
	JTextField tf;//id 입력창
	JPasswordField pf;//비밀번호 입력창
	JButton b1,b2;//확인, 취소용 버튼
	public ControlPanel()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\background.jpg");
		la1=new JLabel("ID");
		la2=new JLabel("Password");
		tf=new JTextField();
		pf=new JPasswordField();
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		//배치 => 실행과 동시에 실행 명령 / 초기화 => 생성자 이용
		setLayout(null);
		la1.setBounds(10,15,80,30);//백 스킨 기준 위치
		tf.setBounds(95,15,200,30);
		add(la1);add(tf);
		
		la2.setBounds(10,50,80,30);
		pf.setBounds(95,50,200,30);
		add(la2);add(pf);
		
		JPanel p=new JPanel();//로그인, 취소버튼 묶기
		p.setOpaque(false);//배경색 지우기
		p.add(b1);
		p.add(b2);
		p.setBounds(10,90,285,35);
		add(p);
		
	}
	@Override
	//메인 화면 스킨
	public void paintComponent(Graphics g) {
		//paint: 이미지 위에 있는 기능 이미지 덮음
		//paintComponent: 이미지 위에 있는 기는 이미지 남김
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);//그림 적용 위치
	}

}
