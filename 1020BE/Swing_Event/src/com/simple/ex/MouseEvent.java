package com.simple.ex;

import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEvent extends JFrame 
implements MouseListener, MouseMotionListener{ //imple..는 다중 가능. 다중상속은x

	public MouseEvent() {
		//윈도우 초기화
		this.setTitle("마우스 이벤트");
		this.setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 윈도우 레이아웃 설정
		// 아무 말도 없으면, border 레이아웃이 설정됨. (동,서,남,북)
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		
		
		
		//컴포넌트 생성
		
		
		
		//컴포넌트 프레임에 추가
		this.add(panel, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		//this.setResizable(false);
	}
	
	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// 
		display("마우스 Dragged!"+e.getClickCount(),e);
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// 
		display("마우스 Moved!"+e.getClickCount(),e);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// 
		display("마우스 Clicked!"+e.getClickCount(),e);
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// 마우스 왼쪽버튼을 누르면 발생.
		display("마우스 누름"+e.getClickCount(),e);	//화면 출력함수.("출력될문자"+e.이벤트)
	}


	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		//마우스에 손 뗏을때 발생.
		display("마우스 release"+e.getClickCount(),e);
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// 
		display("마우스 Entered"+e.getClickCount(),e);
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// 마우스 영역을 벗어날때 발생.
		display("마우스 Exited"+e.getClickCount(),e);
	}
	
	private void display(String str, java.awt.event.MouseEvent e) {
		//display 내부에서만 쓸 함수.
		System.out.println(str+"x="+e.getX()+", Y="+e.getY());	//마우스 움직일때, x,y좌표값 get!
		
	}
	
	
	public static void main(String[] args) {
		new MouseEvent();
	}
	

}
