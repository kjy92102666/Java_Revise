package com.simple.ex;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Cal_Div extends JFrame{
	JButton btn;
	
	
	//윈도우 초기 설정  >>윈도우 배치 설정 >> 버튼 생성>> ★프레임에 컴포넌트 등록
	public Cal_Div() {
		//윈도우 초기 설정
		setTitle("가상 윈도우창 계산기 <+> ");
		setSize(400,500);
		
		//윈도우 배치 설정
		
		
	}
	
	public static void main(String[] args) {
		new Cal_Div();
	}
}
