package com.simple.ex;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame implements ActionListener{
	
	private JLabel label, label1;
	private JButton button;
	private JButton downButton;
	
	private int counter = 0;
	
	public MyCounter() {
		setTitle("ī����");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		//������Ʈ ����
		label = new JLabel("counter");
		
		label1 = new JLabel(counter+"");
		label1.setFont(new Font("�������", Font.BOLD | Font.ITALIC, 100));
		
		panel.add(label);
		panel.add(label1);
		
		button = new JButton("ī���� ����");
		panel.add(button); //�����ӿ� ���.
		button.addActionListener(this);	
		
		downButton = new JButton("ī���� ����");
		panel.add(downButton); //�����ӿ� ���.
		downButton.addActionListener(this);		
		
		
		
		//������Ʈ ���
		add(panel);
		
		setVisible(true); //��ϵǾ� �ִ°� �����ִ� �Լ�.
		
	}
	
	public static void main(String[] args) {
		new MyCounter();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		//1.ī���� ����, 2.ī���� ���� 
		if(e.getSource() == downButton) {
			counter--;
		}else {
			counter++;
		}
		label1.setText(counter+"");
		
	}

	
}
