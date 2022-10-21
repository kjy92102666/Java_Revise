package com.simple.ex;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame implements ActionListener {//윈도우를 가져야 되는 클래스에 JFrame, 이벤트를 가져야 하는 클래스에 implements 
	private JLabel[] labels;
	private JButton button;	//슬롯내리는 버튼.
	private int[] numbers;
	
	
	public MyCounter() {
		//윈도우 초기설정
		setTitle("슬롯머신");
		setSize(500,300);
		JPanel panel = new JPanel();
		panel.setLayout(null); 	//null로 되어 있기 때문에, for()안에 직접 지정.
		
		labels = new JLabel[3]; 	//컴포넌트 생성은 JLabel();, JLabel[3]은 JLabel 3생성
		numbers = new int[3];
		
		for(int i=0; i<numbers.length; i++) {
			labels[i] = new JLabel(" "+numbers[i]);	//numbers[i]번째를 labels[i]번째에 넣는다., 여러개의 컴포넌트를 만들고
			labels[i].setFont(new Font("맑은고딕", Font.BOLD|Font.ITALIC,100));	
			//글자 체, 굵기
			//setBounds를 풀어서 작성 한 꼴.
			labels[i].setSize(100,100);
			labels[i].setLocation(100+100*i, 20);//앞에 행의 위치를 조금씩 이동하도록.
			panel.add(labels[i]);
			
		}
		
		button = new JButton("스핀");
		button.setSize(250,50);
		button.setLocation(100,150);
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);   //전체 프레임 등록.
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {// 버튼 눌렀을때 랜덤한 숫자 발생하는 함수
		for(int i=0; i<3; i++) {
			numbers[i] =(int)(Math.random() * 10);//0~9까지 난수를 정수로 바꿔준 값들을 numbers에 담는다.
			labels[i].setText(""+numbers[i]);
		}
		
		
	}
}
