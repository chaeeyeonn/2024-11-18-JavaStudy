package com.sist.music;
import javax.swing.*;
import javax.swing.table.*;//<table>
import java.awt.*;
import java.awt.event.*; // => interface
//ActionListener=> actionPerformed()
/*
 *   extends => 상속: 클래스가 가지고 있는 모든 변수/메소드
 *              ---생성자, statit, 초기화 블록 제외
 *   => 객체지향           
 *     1. 캡슐화: 데이터 보호 => 사용자 정의 데이터형
 *        => 메소드를 이용해서 변수의 기능 설정
 *                         --------
 *                         읽기: getter
 *                         getXxx()
 *                         쓰기: setter
 *                         setXxx()
 *        => 데이터 손실 / 변경 방지
 *     2. 상속: 기존의 클래스 재사용 => 보통 라이브러리 클래스
 *                             => 기능 변경 사용
 *     3. 다형성: 변경 / 추가 => 오버라이딩 / 오버로딩
 *     
 */
public class MusicMainWindow extends JFrame implements ActionListener{
	String[] names= {"TOP 50","가요","POP","OST","트롯","JAZZ"};
	JButton[] btns=new JButton[6];
	JTable table;
	DefaultTableModel model;
	//재사용 => 포함 클래스(has-a)
	/*
	 *   접근지정어
	 *   - 클래스: 다른 클래스 사용 가능: public
	 *   - 생성자: 다른 클래스 사용 가능: public
	 *   - 멤버변수: 자신 클래스에서만 사용: private
	 *     ------기본형 / 클래스 / 배열
	 *                 ------------참조변수(주소)
	 *   - 메소드: 다른 클래스와 통신: public
	 */
	
	//초기화
	public MusicMainWindow()
	{
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,7));
		for(int i=0;i<btns.length;i++)
		{
			btns[i]=new JButton(names[i]);
			p.add(btns[i]);
			btns[i].addActionListener(this);
		}
		add("North",p);
		
		String[] col= {"곡명","가수명","앨범"};
		String[][] row=new String[0][3];
		model=new DefaultTableModel(row,col);
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		
		table.setRowHeight(35);
		table.getTableHeader().setBackground(Color.orange);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(true);
		
		add("Center",js);
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		String[] temp= {"aaaa","bbbbb","cccccccc"};
//		model.addRow(temp);
//		model.addRow(temp);
//		model.addRow(temp);
		//display(1);
	}
	//출력
	public void display(int type)
	{	//한 번을 지우기 시작
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		MusicSystem ms=new	MusicSystem();
		MusicVO[] music=ms.musicData(type);
		for(MusicVO vo:music)
		{
			String[] data={
					vo.getTitle(),
					vo.getSinger(),
					vo.getAlbum()
			};
			model.addRow(data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MusicMainWindow();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<btns.length;i++)
		{
			if(e.getSource()==btns[i])
			{
				display(i+1);
				break;
			}
		}
		
	}

}
