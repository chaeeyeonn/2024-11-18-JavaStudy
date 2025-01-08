package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import com.sist.dao.*;
import com.sist.vo.*;
//                               상속 => 재사용 => 변경
public class ClientMainFrame extends JFrame implements ActionListener{
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
		
		cp.b1.addActionListener(this);//로그인 버튼
		cp.b2.addActionListener(this);//취소 버튼
	}
    public static void main(String[] args) {
    	try
    	{
    		UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");// 추가할 디자인 플랫폼 이름 넣기 => plaf.플랫폼 이름 앞.플랫폼 이름
    	}catch(Exception ex) {}//UI 디자인 적용 // 예외처리한 것
    	new ClientMainFrame();
;	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==cp.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.b1)//로그인
		{
			String id=cp.tf.getText();
			if(id.trim().length()<1)//입력이 안 됨
			{
				cp.tf.requestFocus();
				return;
			}
			String pwd=String.valueOf(cp.pf.getPassword());//char[] => String으로 변경
			if(pwd.trim().length()<1)
			{
				cp.pf.requestFocus();
				return;
			}
			
			MemberDAO dao=MemberDAO.newInstance();
			MemberVO vo=dao.isLogin(id, pwd);
			if(vo.getMsg().equals("NOID"))
			{
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
				cp.tf.setText("");
				cp.pf.setText("");
				cp.tf.requestFocus();//다시 입력하도록 공백 처리 후 돌아옴
			}
			else if(vo.getMsg().equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀렸습니다");
				cp.pf.setText("");
				cp.pf.requestFocus();
			}
			else//로그인된 상태
			{
				String msg=vo.getName()+"님 로그인 되었습니다\n"+"메인페이지로 이동합니다.";
				JOptionPane.showMessageDialog(this, msg);
				//alert()
			}
		}
	}
}
