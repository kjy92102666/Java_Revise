package com.simple.ex;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame implements ActionListener {//�����츦 ������ �Ǵ� Ŭ������ JFrame, �̺�Ʈ�� ������ �ϴ� Ŭ������ implements 
	private JLabel[] labels;
	private JButton button;	//���Գ����� ��ư.
	private int[] numbers;
	
	
	public MyCounter() {
		//������ �ʱ⼳��
		setTitle("���Ըӽ�");
		setSize(500,300);
		JPanel panel = new JPanel();
		panel.setLayout(null); 	//null�� �Ǿ� �ֱ� ������, for()�ȿ� ���� ����.
		
		labels = new JLabel[3]; 	//������Ʈ ������ JLabel();, JLabel[3]�� JLabel 3����
		numbers = new int[3];
		
		for(int i=0; i<numbers.length; i++) {
			labels[i] = new JLabel(" "+numbers[i]);	//numbers[i]��°�� labels[i]��°�� �ִ´�., �������� ������Ʈ�� �����
			labels[i].setFont(new Font("�������", Font.BOLD|Font.ITALIC,100));	
			//���� ü, ����
			//setBounds�� Ǯ� �ۼ� �� ��.
			labels[i].setSize(100,100);
			labels[i].setLocation(100+100*i, 20);//�տ� ���� ��ġ�� ���ݾ� �̵��ϵ���.
			panel.add(labels[i]);
			
		}
		
		button = new JButton("����");
		button.setSize(250,50);
		button.setLocation(100,150);
		panel.add(button);
		button.addActionListener(this);
		
		add(panel);   //��ü ������ ���.
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {// ��ư �������� ������ ���� �߻��ϴ� �Լ�
		for(int i=0; i<3; i++) {
			numbers[i] =(int)(Math.random() * 10);//0~9���� ������ ������ �ٲ��� ������ numbers�� ��´�.
			labels[i].setText(""+numbers[i]);
		}
		
		
	}
}
