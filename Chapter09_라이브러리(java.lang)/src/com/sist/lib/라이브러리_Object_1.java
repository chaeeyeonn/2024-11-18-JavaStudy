package com.sist.lib;
//toString(): 객체를 문자열 => 객체 출력시 생략 가능
/*
 *   Object 클래스
 *   1. 모든 클래스에 상속을 내림
 *   2. Object는 가장 큰 데이터형 => 모든 데이터값을 받을 수 있음
 *      Object o=1
 *      Object o=""
 *      Object o=10.5
 *   3. 모든 객체가 사용할 수 있는 기능 제공
 *      -----------------------------메소드
 *   4. java.lang => Object외에 다른 클래스는 final => 상속받아 변경 불가능
 *   5. Object => finalize() / clone() / toString() / hashCode() / equals()
 *             => 하위 클래스의 메소드, 변수 접근 불가능 => split() / subString() 등에 접근 불가
 *             => 오버라이딩된 변수 / 메소드만 사용 가능
 *             
 *   toString(): 문자열 변환 / 객체의 정보 확인
 *   ----------멤버변수 확인 => 오버라이딩
 *                          --------상위클래스로 객체를 선언 => 오버라이딩된 메소드 호출 가능
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class 라이브러리_Object_1 extends JFrame implements ItemListener{
    JComboBox box=new JComboBox();
    JLabel la=new JLabel();
    public 라이브러리_Object_1()
    {
    	box.addItem("홍길동:남자");//addItem => Object => 모든 데이터형 가능
    	box.addItem("심청이:여자");
    	box.addItem("박문수:남자");
    	box.addItem("이순신:남자");
    	box.addItem("김두한:남자");
    	
    	setLayout(null);
    	
    	box.setBounds(10,15,100,35);
    	add(box);
    	
    	la.setBounds(10,100,300,35);
    	add(la);
    	
    	setSize(400, 200);
    	setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	// Object는 출력 가능 / 문자열 제어는 불가능 => String으로 받아야 함
    	// => Object로 매개변수나 리턴형을 쓸 경우 => 반드시 형변환
    	
    	box.addItemListener(this);
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object o=1;
//		o="Hello";
//		o=10.5;
//		o='a';
		//혼합된 배열 Object[] obj={"",10,'a',...};
		//javascript => 배열 => Object
		// => 모든 클래스를 모아서 사용 가능
    	new 라이브러리_Object_1();
    	

	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String obj=(String)box.getSelectedItem();//or .toString()
			String[] datas=obj.split(":");
			la.setText("이름:"+datas[0]+",성별:"+datas[1]);
		}
		
	}

}
