package com.simple.ex;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Rectangle{	//�Ϲ� �簢�� Ŭ����
	int x,y,w,h;
}

class Mypanel extends JPanel implements MouseListener{ //��Ű���ȿ� �Ȱ��� Ŭ������ ������ ����������.
	
	BufferedImage img = null;  //���콺 �巡�׽�, �ð������� ���������� ���ۿ� ���ٰ� ���� �׷����� ����
	int img_x=0, img_y=0;
	Rectangle[] array = new Rectangle[100];//������ �簢�� ���� ~100. ��ü�迭!
	
	int index=0;	//�迭���� ī��Ʈ�� ����
	
	
	public Mypanel() {
		//������ �ʱ�ȭ
		this.addMouseListener(this);
		
	}
	//mousePressed���� �����س��� paintComponent�� ������ �׸���.
	public void paintComponent(Graphics g) { //�� �޼ҵ�� �̸��� �������ִ�. �׸��� ����.
		super.paintComponent(g);	//��Ϻ��� �ϰ�,
		//�׸��� ������ �׸��� ����
		
		for(Rectangle r: array ) {//���������� �ٽ� �׸���... 
			if(r!=null) {
				g.drawRect(r.x, r.y, r.w, r.h); //x,y,width,height�� ���� RectŸ���� ��ü ������ ����.				
				//g.draw�� �������� �Լ����� �ִ�. Ÿ��,����...
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
		// ���콺 ���ʹ�ư�� ������ �߻�.
		// ���콺 Ŭ����. ��ǥ, ũ�⸦ �迭��ü�� ����.
		if(index > 100) return; //���� ������ 100�� �̻��̵Ǹ� �ǵ��ư���.
		array[index]=new Rectangle();
		array[index].x = e.getX();
		array[index].y = e.getY();
		array[index].w = 50;	//�簢�� ��ġ
		array[index].h = 50;	//�簢�� ũ�� ����.
		index++;
		repaint(); //paintComponent()�� ȣ��ȴ�.==�ٽ� �׸��� ȣ��
		//���콺 �巡�� �� �������� �������°� ���� �ӵ��� �ٽ� �׸��� ����.
		
		//������ draw�� ���� ���� ������ �̷������.
	}


	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		//���콺�� �� ������ �߻�.
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) { }

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) { }
	
}


public class DrawMouse extends JFrame{	//��ü ������Ŭ����. �г��� �������� ���´�.
	public DrawMouse() {
		setTitle("���콺 �̺�Ʈ");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Mypanel());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawMouse();
	}
}