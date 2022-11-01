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
	private int light_number = 0; 		//������ �����ϱ� ���� ���ڹ�ȣ?
	
	public MyPanel() {
		//������Ʈ ����
		setLayout(new BorderLayout());	//�����¿� ���
		
		JButton btn = new JButton("traffic light turn on");
		btn.addActionListener(this); 	//actionPerformed()�� ����Ŵ. �̻��·� ������ ��� ����(default�� ����).
		add(btn, BorderLayout.SOUTH); 	//BorderLayout�� �����,  ��ư ��ġ��.
	}
	
	@Override
	protected void paintComponent(Graphics g) {	//protected�� �ڼյ������, 
		super.paintComponent(g);
		//���⼭ ���� ���ϴ� �׸��� �׸��ڴ�~
		
		g.setColor(Color.BLACK);	//����� color����(�׵θ���) black���� ����.
		g.drawOval(100, 100, 100, 100); //Ÿ��, ���� �׸� �� ��
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);

		if(light_number == 0) {
			g.setColor(Color.RED);
			g.fillOval(100,100,100,100);	//�׿��� �� ä���.
		}else if(light_number == 1) {
			g.setColor(Color.GREEN);
			g.fillOval(100,200,100,100);	
		}else {
			g.setColor(Color.YELLOW);
			g.fillOval(100,300,100,100);	
		}
		
		System.out.println("�ٽ� ������=>");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ȣ���� ����
		if(++light_number >= 3) {
			light_number = 0;
			
		}
		repaint();//��ư�� ���������� if������ ���ư��� �׸��� �ȴ�.
		
		
	}
}

public class TrafficSign extends JFrame {
	
	public TrafficSign() {
		
		this.setTitle("��ȣ��");
		this.setSize(300,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		add(new MyPanel());
	}
	
	public static void main(String[] args) {
		new TrafficSign();
	}
}
