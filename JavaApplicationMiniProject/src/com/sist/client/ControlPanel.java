package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.spi.ToolProvider;

import javax.swing.*;
public class ControlPanel extends JPanel{
// 화면 변경
	HomePanel hp;
	ChatPanel cp;
	FoodGenrePanel fgp;
	FoodFindPanel ffp;
	FoodDetailPanel fdp;
CardLayout card=new CardLayout();
	public ControlPanel()
	{
		setLayout(card);
		hp=new HomePanel(this);
		add("HOME",hp);
		cp=new ChatPanel(this);
		add("CHAT",cp);
		fgp=new FoodGenrePanel(this);
		add("FOOD",fgp);
		ffp=new FoodFindPanel(this);
		add("FIND",ffp);
		fdp=new FoodDetailPanel(this);
		add("DETAIL",fdp);
	}
	
}
