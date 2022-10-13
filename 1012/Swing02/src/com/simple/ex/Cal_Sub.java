package com.simple.ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cal_Sub {
//윈도우 초기설정, 배치,컴포넌트생성,버튼생성,컴포넌트 등록,윈도우 활성화
	
	private JLabel lblName;
	private JLabel lblName1;

	public Cal_Sub() {
		JFrame jf = new JFrame();
		//초기 설정
		jf.setTitle("가상 윈도우창 계산기<->");
		jf.setSize(400,500);
		
		//배치
		jf.setLayout(null);
		
		lblName = new JLabel("숫자 1: ");
		lblName.setBounds(50,5,100,40);
		lblName1 = new JLabel("숫자 2: ");
		lblName1.setBounds(50,50,100,40);
		
		JButton jbtn = new JButton("-");
		jbtn.setBounds(100,100,100,40);
		
		jf.add(jbtn);
		jf.add(lblName);
		jf.add(lblName1);
		
		jf.setVisible(true);
		jf.setResizable(false);
	}
	
	public static void main(String[] args) {
		new Cal_Sub();
	}
}
