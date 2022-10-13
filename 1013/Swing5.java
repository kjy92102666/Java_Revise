package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing5 extends JFrame implements ActionListener{

	private JLabel lblName;
	private JLabel lblName1;
	
	private JTextField lbltfName;
	private JTextField lbltfName1;
	private JTextField lbtfOut;
	
	private JLabel lblName2;
	private JLabel lblResult;
	
	private JButton jbtn1;
	private JButton jbtn2;
	private JButton jbtn3;
	private JButton jbtn4;

	
	//윈도우 초기 설정  >>윈도우 배치 설정 >> 버튼 생성>> ★프레임에 컴포넌트 등록
	public Swing5() {
		//윈도우 초기 설정
		this.setTitle("가상 윈도우창 계산기 <> ");//this.생략된거.
		this.setSize(400,500);
		
		//윈도우 배치 설정
		this.setLayout(null);
		
		//함수 ,메소드:포함하는 블록 안에서만 작동하면 
		
		//프레임에 컴포넌트 등록
		lblName = new JLabel("값 1: ");
		lblName.setBounds(50,5,100,40);
		lblName1 = new JLabel("값 2: ");
		lblName1.setBounds(50,100,100,40);
//		lblName2 = new JLabel("÷");
//		lblName2.setBounds(50,50,100,40);
		lblResult = new JLabel("결과 : ");
		lblResult.setBounds(50,150,100,40);
		
		lbltfName = new JTextField();
		lbltfName.setBounds(100,5,200,40);
		lbltfName1 = new JTextField();
		lbltfName1.setBounds(100,100,200,40);
		lbtfOut = new JTextField();
		lbtfOut.setBounds(100,150,200,40);
		
		
		//버튼 생성 +
		jbtn1 = new JButton( new ImageIcon("plus (2).png") );
		jbtn1.setBounds(100,50,53,45);
		jbtn1.addActionListener(this);	
		//여기서 this는 Swing5()클래스 객체 자신을 가리킨다.
		
		//버튼 생성 -
		jbtn2 = new JButton(new ImageIcon("sub (2).png"));
		jbtn2.setBounds(155,50,53,45);
		jbtn2.addActionListener(this);
		
		//버튼 생성 x
		jbtn3 = new JButton(new ImageIcon("mul (2).png"));
		jbtn3.setBounds(210,50,53,45);
		jbtn3.addActionListener(this);
		
		//버튼 생성 ÷
		jbtn4 = new JButton(new ImageIcon("div (2).png"));
		jbtn4.setBounds(265,50,53,45);
		jbtn4.addActionListener(this);

		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(lblName);
		add(lblName1);
		add(lbltfName);
		add(lbltfName1);
		add(lbtfOut);
		add(lblResult);
		
		//윈도우활성화
		setVisible(true);
		setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			String val1 = lbltfName.getText();
			String val2 = lbltfName1.getText();
			int result = 0;
			
			if(e.getSource() == jbtn1) {
				result = Integer.parseInt(val1) + Integer.parseInt(val2);
			}
			if(e.getSource() == jbtn2) {
				result = Integer.parseInt(val1) - Integer.parseInt(val2);
			}
			if(e.getSource() == jbtn3) {
				result = Integer.parseInt(val1) * Integer.parseInt(val2);
			}
			if(e.getSource() == jbtn4) {
				result = Integer.parseInt(val1) / Integer.parseInt(val2);
			}
			
		
			lbtfOut.setText(result + "");
		
	}
	
	
	public static void main(String[] args) {
		new Swing5();
	}

	
}
