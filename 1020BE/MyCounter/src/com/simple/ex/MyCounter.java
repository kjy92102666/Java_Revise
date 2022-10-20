package com.simple.ex;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame implements ActionListener{
	
	private JLabel label, label1;
	private JButton button;
	private JButton downButton;
	
	private int counter = 0;
	
	public MyCounter() {
		setTitle("카운터");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		//컴포넌트 생성
		label = new JLabel("counter");
		
		label1 = new JLabel(counter+"");
		label1.setFont(new Font("맑은고딕", Font.BOLD | Font.ITALIC, 100));
		
		panel.add(label);
		panel.add(label1);
		
		button = new JButton("카운터 증가");
		panel.add(button); //프레임에 등록.
		button.addActionListener(this);	
		
		downButton = new JButton("카운터 감소");
		panel.add(downButton); //프레임에 등록.
		downButton.addActionListener(this);		
		
		
		
		//컴포넌트 등록
		add(panel);
		
		setVisible(true); //등록되어 있는걸 보여주는 함수.
		
	}
	
	public static void main(String[] args) {
		new MyCounter();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//1.카운터 증가, 2.카운터 값을 
		if(e.getSource() == downButton) {
			counter--;
		}else {
			counter++;
		}
		label1.setText(counter+"");
		
	}

	
}
