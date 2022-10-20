package com.simple.ex;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Rectangle{	//일반 사각형 클래스
	int x,y,w,h;
}

class Mypanel extends JPanel implements MouseListener{ //패키지안에 똑같은 클래스가 있으면 문제가생김.
	
	BufferedImage img = null;  //마우스 드래그시, 시각적으로 움직여짐은 버퍼에 담겼다가 새로 그려지는 형태
	int img_x=0, img_y=0;
	Rectangle[] array = new Rectangle[100];//저장할 사각형 갯수 ~100. 객체배열!
	
	int index=0;	//배열갯수 카운트할 변수
	
	
	public Mypanel() {
		//윈도우 초기화
		this.addMouseListener(this);
		
	}
	//mousePressed에서 보관해놓고 paintComponent를 꺼내서 그린다.
	public void paintComponent(Graphics g) { //이 메소드는 이름이 정해져있다. 그리기 전담.
		super.paintComponent(g);	//등록부터 하고,
		//그리고 싶은거 그리는 영역
		
		for(Rectangle r: array ) {//내부적으로 다시 그린다... 
			if(r!=null) {
				g.drawRect(r.x, r.y, r.w, r.h); //x,y,width,height의 값이 Rect타입의 객체 값으로 저장.				
				//g.draw에 여러가지 함수들이 있다. 타원,직선...
			}
		}
		System.out.println("->->->");
	}
	
	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// 
	}
	
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// 마우스 왼쪽버튼을 누르면 발생.
		// 마우스 클릭시. 좌표, 크기를 배열객체에 저장.
		if(index > 100) return; //저장 갯수가 100개 이상이되면 되돌아간다.
		array[index]=new Rectangle();
		array[index].x = e.getX();
		array[index].y = e.getY();
		array[index].w = 50;	//사각형 위치
		array[index].h = 50;	//사각형 크기 고정.
		index++;
		repaint(); //paintComponent()가 호출된다.==다시 그리기 호출
		//마우스 드래그 시 움직임이 보여지는건 빠른 속도로 다시 그리는 원리.
		
		//윈도우 draw는 위와 같은 구조로 이루어진다.
	}


	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		//마우스에 손 뗏을때 발생.
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) { }

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) { }
	
}


public class DrawMouse extends JFrame{	//전체 윈도우클래스. 패널이 이쪽으로 들어온다.
	public DrawMouse() {
		setTitle("마우스 이벤트");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Mypanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawMouse();
	}
}