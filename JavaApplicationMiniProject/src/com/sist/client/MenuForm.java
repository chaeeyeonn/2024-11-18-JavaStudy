package com.sist.client;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

//포트 번호:3050
//화면 UI 클래스:   HiFiLookAndFeel  
import javax.swing.*;
public class MenuForm extends JPanel{
  public JButton b1=new JButton("홈");
  public JButton b2=new JButton("맛집");
  public JButton b3=new JButton("맛집 검색");
  public JButton b5=new JButton("커뮤니티");
  public JButton b6=new JButton("실시간 채팅");
  public JButton b7=new JButton("실시간 뉴스");
  
  //초기화 ==> 배치 => 생성자
  /*
   *  BorderLayout => North / South / East / West / Center
   *  FlowLayout => 일자 배치, 글자 크기에 따라 버튼 크기 달라짐
   *  GridLayout => 행열(가로, 세로, 가로 간격, 세로 간격) 배치, 일정 크기
   */
  public MenuForm()//헤드 버튼 디자인
  {
	  setLayout(new GridLayout(1,5,10,10));
	  add(b1);add(b2);add(b3);add(b5);add(b6);add(b7);//적은 순서대로 배치됨
  }
}
