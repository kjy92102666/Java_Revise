package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class SwingUI extends JFrame implements ActionListener{
	
	JLabel l1, l2;
	JTextArea area;
	JButton b;
	
	public SwingUI() {
		JFrame f = new JFrame();
		l1=new JLabel();
		l1.setBounds(50, 25, 100, 30);
		l2=new JLabel();
		l2.setBounds(160,25,100,30);
		
		area = new JTextArea();
		area.setBounds(20,75,250,200);
		
		b =  new JButton("Count Words");
		b.setBounds(100, 300, 120, 30);
		b.addActionListener(this);
		
		f.add(l1);
		f.add(l2);
		f.add(area);
		f.add(b);
		
		
		f.setSize(450,450);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new SwingUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//
		String text=area.getText();
		System.out.println("입력한 문자열"+text);
		String words[]=text.split("\\s"); //reguler expression? 정규식
		l1.setText("Words: " + words.length);
		l2.setText("Characters : " + text.length());	//스페이스바까지 포함해서 문자를 한글자씩 잘라서 카운트
		
	}
	
}
