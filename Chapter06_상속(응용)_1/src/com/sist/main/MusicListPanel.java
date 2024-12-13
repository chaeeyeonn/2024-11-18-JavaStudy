package com.sist.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.table.*;

import com.sist.manager.*;//멜론 코딩도 함께하기 위해 * 붙임
import com.sist.vo.*;
import java.awt.event.*;//버튼 처리

public class MusicListPanel extends JPanel
implements ActionListener
{
	JLabel la;
	JButton b1,b2;
	JTable table;
	DefaultTableModel model;
	GenieMusicSystem gm=new GenieMusicSystem();
	public MusicListPanel()
	{
		setLayout(null);
		la=new JLabel("Music Top 50",JLabel.CENTER);
		la.setFont(new Font("궁서체",Font.BOLD,35));
		la.setBounds(10, 15, 760, 50);
		add(la);
		
		b1=new JButton("지니뮤직");
		b2=new JButton("멜론");
		b1.setBounds(10,75,120,30);
		b2.setBounds(135,75,100,30);
		add(b1);
		add(b2);
		
		String[] col= {"순위","곡명","가수명","앨범"};
		String[][] row=new String[0][4];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		js.setBounds(10,110,760,450);
		add(js);
		musicPrint(1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
//		JPanel p=new JPanel();
//		b1=new JButton("이전");
//		b2=new JButton("다음");
//		p.add(b1);
//		p.add(b2);
	}
	public void musicPrint(int type)
	{
		for(int i=model.getRowCount()-1;i>=0;i--)
			//앞서 있던 데이터를 모두 지우고 다음 데이터 로딩하기 위함
			//지우고 나면 맨 마지막 데이터가 남아서(왜인지 모름) 뒤부터 지우기 시작함
		{
			model.removeRow(i);
		}
		if(type==1)
		{
			gm=new GenieMusicSystem();
			la.setText("지니 Top 50");
			b1.setEnabled(false);//버튼 비활성화
			b2.setEnabled(true);//버튼 활성화
		}
		else
		{
			gm=new MelonMusicSystem();
			la.setText("멜론 Top 50");
			b2.setEnabled(false);
			b1.setEnabled(true);
		}
		
		//la.setText(gm.title);//Music Top 50을 gm title로 바꿈 => extends로 인해 안 되는 듯. 따로 조건문에 넣기
		MusicVO[] musics=gm.musicAllData();
		for(MusicVO vo:musics)
		{
			String[] data= {String.valueOf(vo.getNo()), vo.getTitle(), vo.getSinger(), vo.getAlbum()
		    };
			model.addRow(data);
		}
	}
	//버튼 처리 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)//b1 버튼을 눌렀을 때
		{
			musicPrint(1);
			
		}
		else if(e.getSource()==b2)//b2 버튼을 눌렀을 떄
		{
			musicPrint(2);
		}
		
		
	}
}
