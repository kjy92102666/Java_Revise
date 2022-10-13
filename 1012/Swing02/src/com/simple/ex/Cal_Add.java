package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//윈도우 초기 설정  >>윈도우 배치 설정 >> 원하는 컴포넌트 생성>> 버튼 생성>>★프레임에 컴포넌트 등록 >>윈도우 활성화
public class Cal_Add extends JFrame{

	private JLabel lblName;
	private JTextField tfName;
	private JTextField tfNameOut;
	private JLabel lblName1;
	private JTextField tfName1;
	private JLabel lblNameR;


	public Cal_Add() {
		
		//윈도우 초기 설정. 생성자에다가 해주자!
		setTitle("가상 윈도우창 계산기 <+>");
		setSize(400,500);//x,y
		
		
		//윈도우 배치 설정
		setLayout(null);
		
		//원하는 컴포넌트 생성
		lblName = new JLabel("값 1 : ");
		lblName.setBounds(50,50,100,40);
		tfName = new JTextField(); 		 //JTextField ==Scanner();
		tfName.setBounds(100,50,100,40);
		
		lblName1 = new JLabel("값 2 : ");
		lblName1.setBounds(50,150,100,40);
		tfName1 = new JTextField(); 
		tfName1.setBounds(100,150,100,40);
		
		
		lblNameR = new JLabel("결과 : ");
		lblNameR.setBounds(50,200,100,40);
		tfNameOut = new JTextField();
		tfNameOut.setBounds(100,200,100,40);
		
		
		//버튼 생성
		JButton btn = new JButton("+");
		btn.setBounds(100,100,100,40);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = tfName.getText();
				int n = Integer.parseInt(name);
				String name1 = tfName1.getText();
				int n1 = Integer.parseInt(name1);
				int result = n+n1;
				tfNameOut.setText(result+"");
				//tfNameOut.setText(n+n1); String으로 받아와야 해서 오류.
				
			}
		});
		
		//프레임에 컴포넌트 등록
		add(btn);
		
		add(lblName);
		add(lblName1);
		add(tfName);
		add(tfName1);
		add(tfNameOut);
		add(lblNameR);
		
		
		//윈도우 활성화(윈도우 보이게)
		setVisible(true); 		//false로 바꾸면 실행해도 화면x
		setResizable(false);	//창크기 고정. 크기 바꿀거면 true
	}
	
	
	public static void main(String[] args) {
		new Cal_Add();
	}
}
