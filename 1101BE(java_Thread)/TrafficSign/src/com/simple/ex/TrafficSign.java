package com.simple.ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyPanel extends JPanel implements ActionListener{
	
	boolean flag = false;
	private int light_number = 0; 		//색깔을 구분하기 위한 숫자번호?
	
	public MyPanel() {
		//컴포넌트 생성
		setLayout(new BorderLayout());	//상하좌우 가운데
		
		JButton btn = new JButton("traffic light turn on");
		btn.addActionListener(this); 	//actionPerformed()을 가리킴. 이상태로 끝나면 가운데 정렬(default는 센터).
		add(btn, BorderLayout.SOUTH); 	//BorderLayout의 상수값,  버튼 위치값.
	}
	
	@Override
	protected void paintComponent(Graphics g) {	//protected는 자손들까지만, 
		super.paintComponent(g);
		//여기서 내가 원하는 그림을 그리겠다~
		
		g.setColor(Color.BLACK);	//멤버의 color값이(테두리만) black으로 세팅.
		g.drawOval(100, 100, 100, 100); //타원, 원을 그릴 수 있
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);

		if(light_number == 0) {
			g.setColor(Color.RED);
			g.fillOval(100,100,100,100);	//그원을 다 채운다.
		}else if(light_number == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100,200,100,100);	
		}else {
			g.setColor(Color.YELLOW);
			g.fillOval(100,300,100,100);	
		}
		
		System.out.println("다시 구른다=>");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 신호등을 변경
		if(++light_number >= 3) {
			light_number = 0;
			
		}
		repaint();//버튼을 누를때마다 if문으로 돌아가서 그리게 된다.
		
		
	}
}

public class TrafficSign extends JFrame {
	
	public TrafficSign() {
		
		this.setTitle("신호등");
		this.setSize(300,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		add(new MyPanel());
	}
	
	public static void main(String[] args) {
		new TrafficSign();
	}
}
