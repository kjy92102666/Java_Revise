package com.simple.ex;

import java.awt.Button;
import java.awt.Frame;

public class AWTExam extends Frame{	//
	public AWTExam() {
		setSize(300,300); //
		setTitle("윈도우");
		
		Button b = new Button("클릭");
		//??? ??????
		b.setBounds(10, 100, 100, 30); 	//x,y
		
		add(b);
		
		
		setLayout(null);// 
		
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new AWTExam();
		
	}
}
