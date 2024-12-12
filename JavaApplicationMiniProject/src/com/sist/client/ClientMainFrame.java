package com.sist.client;
import javax.swing.*;
//                               상속 => 재사용 => 변경
public class ClientMainFrame extends JFrame{
	MenuForm mf=new MenuForm();//포함 클래스 => 그대로 사용
	ControlPanel cp=new ControlPanel();
	//배치
	public ClientMainFrame()
	{
		setLayout(null);//사용자 정의 => 직접 배치하겠다
		mf.setBounds(20, 15, 1650, 50);//(x점,y점,가로 길이, 세로 길이)
		add(mf);//메뉴 적용
		cp.setBounds(20, 80, 1650, 870);
		add(cp);//메인 화면 적용
		setSize(1700,1000);//윈도우 창 크기
		setVisible(true);
	}
    public static void main(String[] args) {
    	try
    	{
    		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");// 추가할 디자인 플랫폼 이름 넣기 => plaf.플랫폼 이름 앞.플랫폼 이름
    	}catch(Exception ex) {}//UI 디자인 적용 // 예외처리한 것
    	new ClientMainFrame();
;	
}
}
