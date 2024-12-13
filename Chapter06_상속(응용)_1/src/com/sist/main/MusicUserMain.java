package com.sist.main;
import javax.swing.*;
import javax.swing.table.*;

public class MusicUserMain extends JFrame{
	JTabbedPane tp;
	MusicListPanel mlp=new MusicListPanel();
	MusicFindPanel mfp=new MusicFindPanel();
	MusicDetailPanel mdp=new MusicDetailPanel();
	public MusicUserMain()
	{
		tp=new JTabbedPane();
		tp.addTab("뮤직목록",mlp);
		tp.addTab("뮤직검색",mfp);
		tp.addTab("상세보기",mdp);
		//tp.setTabPlacement(JTabbedPane.TOP);//top은 default
		//윈도우에 추가
		add("Center",tp);
		//크기
		setSize(800,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//윈도우 창 끄면 메모리 할당 더이상 안 하고 완전히 종료 => 지금까진 그냥 감추는 거였음
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicUserMain();
		
		
		

	}

}