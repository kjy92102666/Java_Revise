package com.simple.ex;

import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEvent extends JFrame 
implements MouseListener, MouseMotionListener{ //imple..�� ���� ����. ���߻����x

	public MouseEvent() {
		//������ �ʱ�ȭ
		this.setTitle("���콺 �̺�Ʈ");
		this.setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// ������ ���̾ƿ� ����
		// �ƹ� ���� ������, border ���̾ƿ��� ������. (��,��,��,��)
		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		
		
		
		
		//������Ʈ ����
		
		
		
		//������Ʈ �����ӿ� �߰�
		this.add(panel, BorderLayout.CENTER);
		
		
		this.setVisible(true);
		//this.setResizable(false);
	}
	
	@Override
	public void mouseDragged(java.awt.event.MouseEvent e) {
		// 
		display("���콺 Dragged!"+e.getClickCount(),e);
	}

	@Override
	public void mouseMoved(java.awt.event.MouseEvent e) {
		// 
		display("���콺 Moved!"+e.getClickCount(),e);
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		// 
		display("���콺 Clicked!"+e.getClickCount(),e);
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		// ���콺 ���ʹ�ư�� ������ �߻�.
		display("���콺 ����"+e.getClickCount(),e);	//ȭ�� ����Լ�.("��µɹ���"+e.�̺�Ʈ)
	}


	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		//���콺�� �� ������ �߻�.
		display("���콺 release"+e.getClickCount(),e);
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		// 
		display("���콺 Entered"+e.getClickCount(),e);
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
		// ���콺 ������ ����� �߻�.
		display("���콺 Exited"+e.getClickCount(),e);
	}
	
	private void display(String str, java.awt.event.MouseEvent e) {
		//display ���ο����� �� �Լ�.
		System.out.println(str+"x="+e.getX()+", Y="+e.getY());	//���콺 �����϶�, x,y��ǥ�� get!
		
	}
	
	
	public static void main(String[] args) {
		new MouseEvent();
	}
	

}
