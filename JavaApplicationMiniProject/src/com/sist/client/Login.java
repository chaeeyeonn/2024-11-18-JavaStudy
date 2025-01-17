package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class Login extends JFrame{
	JLabel la1,la2;//이름표(id,pwd)
	JTextField tf;//id 입력창
	JPasswordField pf;//비밀번호 입력창
	JButton b1,b2;//확인, 취소용 버튼
	public Login()
	{
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
		
		setBounds(640,420,330,170);
		setVisible(true);// 화면 출력		
	}

}
