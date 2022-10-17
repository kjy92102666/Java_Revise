package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing06 extends JFrame implements ActionListener{

	JLabel lblName;
	JLabel lblName1;
	
	JTextField lbltfName;
	JTextField lbltfName1;
	JTextField lbtfOut;
	
	//private JLabel lblName2;
	private JLabel lblResult;
	
	//private JButton jbtn1;
	private JButton jbtn2;
	private JButton jbtn3;
	private JButton jbtn4;
	private JButton jbtnAdd;

	
	//윈도우 초기 설정  >>윈도우 배치 설정 >> 버튼 생성>> ★프레임에 컴포넌트 등록
	public Swing06() {
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
		
		
		//버튼 생성 + LamdaVer
		jbtnAdd = new JButton(new ImageIcon("plus (2).png"));
		jbtnAdd.setBounds(100,50,53,45);
		jbtnAdd.addActionListener( (ActionEvent e) ->{
			
			int plus=0;
			//키보드 입력값 받아오기.
			String num1 = lbltfName.getText();
			String num2 = lbltfName1.getText();
			
			int num2_ = Integer.parseInt(num2);
			if(num2_ !=0 ){
				plus = Integer.parseInt(num1)+num2_;
			}
			
			//lbtfOut.setText(String.format("%.2f", plus));
			lbtfOut.setText(plus+"");
		}); 
		
		
		//버튼 생성 -
		jbtn2 = new JButton(new ImageIcon("sub (2).png"));
		jbtn2.setBounds(155,50,53,45);
		jbtn2.addActionListener(this);//this:객체생성한 후 주소값.
		//여기서 this는 Swing5()클래스 객체 자신을 가리킨다.
		
		//클래스 간에 reference를 공유하는 방법.3
		//버튼 생성 x
		jbtn3 = new JButton(new ImageIcon("mul (2).png"));
		jbtn3.setBounds(210,50,53,45);
		jbtn3.addActionListener(new Multiple()); //4번. 내부클래스방식.
		
		//버튼 생성 ÷
		jbtn4 = new JButton(new ImageIcon("div (2).png"));
		jbtn4.setBounds(265,50,53,45);
		jbtn4.addActionListener(new Divide(this)); //3번. 클래스 간 참조공유
		//Swing06주소값을 가지고 생성한다.

		add(jbtnAdd);
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
		
			int plus=0;
			//키보드 입력값 받아오기.
			String num1 = lbltfName.getText();
			String num2 = lbltfName1.getText();
			int result=0;
			int num2_ = Integer.parseInt(num2);
//			if(num2_ !=0 ){
//				plus = Integer.parseInt(num1)+num2_;
//			}
//	
//			lbtfOut.setText(String.format("%.2f", plus ));
			
			if(e.getSource() == jbtn2) {
				result = Integer.parseInt(num1) - Integer.parseInt(num2);
			}

			lbtfOut.setText(result + "");
		
	}

	
	private class Multiple implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double mul = 0.0;
			
			String num1 = lbltfName.getText();
			String num2 = lbltfName1.getText();
			int num2_ = Integer.parseInt(num2);
			if(num2_ !=0 ){
				mul = Integer.parseInt(num1)*(double)num2_;
			}
			
			lbtfOut.setText(String.format("%.2f", mul ));
		}
		
	}
	
	public static void main(String[] args) {
		Swing06 win = new Swing06();
		
	}

	
}
