package com.simple.ex;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Cal_Sub {
//������ �ʱ⼳��, ��ġ,������Ʈ����,��ư����,������Ʈ ���,������ Ȱ��ȭ
	
	private JLabel lblName;
	private JLabel lblName1;

	public Cal_Sub() {
		JFrame jf = new JFrame();
		//�ʱ� ����
		jf.setTitle("���� ������â ����<->");
		jf.setSize(400,500);
		
		//��ġ
		jf.setLayout(null);
		
		lblName = new JLabel("���� 1: ");
		lblName.setBounds(50,5,100,40);
		lblName1 = new JLabel("���� 2: ");
		lblName1.setBounds(50,50,100,40);
		
		JButton jbtn = new JButton("-");
		jbtn.setBounds(100,100,100,40);
		
		jf.add(jbtn);
		jf.add(lblName);
		jf.add(lblName1);
		
		jf.setVisible(true);
		jf.setResizable(false);
	}
	
	public static void main(String[] args) {
		new Cal_Sub();
	}
}
