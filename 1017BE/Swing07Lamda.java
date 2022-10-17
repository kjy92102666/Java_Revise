package com.simple.ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Swing07Lamda extends JFrame implements ActionListener{

	JLabel lblName;
	JLabel lblName1;
	
	JTextField lbltfName;
	JTextField lbltfName1;
	JTextField lbtfOut;
	
	//private JLabel lblName2;
	private JLabel lblResult;
	
	private JButton jbtn1;
	private JButton jbtn2;
	private JButton jbtn3;
	private JButton jbtn4;

	
	//������ �ʱ� ����  >>������ ��ġ ���� >> ��ư ����>> �������ӿ� ������Ʈ ���
	public Swing07Lamda() {
		//������ �ʱ� ����
		this.setTitle("���� ������â ���� <> ");//this.�����Ȱ�.
		this.setSize(400,500);
		
		//������ ��ġ ����
		this.setLayout(null);
		
		//�Լ� ,�޼ҵ�:�����ϴ� ��� �ȿ����� �۵��ϸ� 
		
		//�����ӿ� ������Ʈ ���
		lblName = new JLabel("�� 1: ");
		lblName.setBounds(50,5,100,40);
		lblName1 = new JLabel("�� 2: ");
		lblName1.setBounds(50,100,100,40);
//		lblName2 = new JLabel("��");
//		lblName2.setBounds(50,50,100,40);
		lblResult = new JLabel("��� : ");
		lblResult.setBounds(50,150,100,40);
		
		lbltfName = new JTextField();
		lbltfName.setBounds(100,5,200,40);
		lbltfName1 = new JTextField();
		lbltfName1.setBounds(100,100,200,40);
		lbtfOut = new JTextField();
		lbtfOut.setBounds(100,150,200,40);
		
		
		//��ư ���� +
		jbtn1 = new JButton( new ImageIcon("plus (2).png") );
		jbtn1.setBounds(100,50,53,45);
		jbtn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int plus=0;
				//Ű���� �Է°� �޾ƿ���.
				String num1 = lbltfName.getText();
				String num2 = lbltfName1.getText();
				
				int num2_ = Integer.parseInt(num2);
				if(e.getSource() == jbtn1){
					plus = Integer.parseInt(num1)+num2_;
				}
				
				lbtfOut.setText(String.format("%.2f", plus ));
				
			}
		});
		
		
		//��ư ���� -
		jbtn2 = new JButton(new ImageIcon("sub (2).png"));
		jbtn2.setBounds(155,50,53,45);
		jbtn2.addActionListener(this);//this:��ü������ �� �ּҰ�.
		//���⼭ this�� Swing5()Ŭ���� ��ü �ڽ��� ����Ų��.
		
		//Ŭ���� ���� reference�� �����ϴ� ���.3
		//��ư ���� x
		jbtn3 = new JButton(new ImageIcon("mul (2).png"));
		jbtn3.setBounds(210,50,53,45);
		jbtn3.addActionListener(new Multiple()); //4��. ����Ŭ�������.
		
		//��ư ���� ��
		jbtn4 = new JButton(new ImageIcon("div (2).png"));
		jbtn4.setBounds(265,50,53,45);
		//jbtn4.addActionListener(new Divide(this)); //3��. Ŭ���� �� ��������
		//Swing06�ּҰ��� ������ �����Ѵ�.

		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtn4);
		add(lblName);
		add(lblName1);
		add(lbltfName);
		add(lbltfName1);
		add(lbtfOut);
		add(lblResult);
		
		//������Ȱ��ȭ
		setVisible(true);
		setResizable(false);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
			int plus=0;
			//Ű���� �Է°� �޾ƿ���.
			String num1 = lbltfName.getText();
			String num2 = lbltfName1.getText();
			int result=0;
			
			int num2_ = Integer.parseInt(num2);
			if(num2_ !=0 ){
				plus = Integer.parseInt(num1)+num2_;
			}
			
			lbtfOut.setText(String.format("%.2f", plus ));

			if(e.getSource() == jbtn2) {
				result = Integer.parseInt(num2) - Integer.parseInt(num2);
			}

			
		
			lbtfOut.setText(result + "");
			
	}
	
	public void sqrt() {
		System.out.println("��~������ ����!");
	}
	
	
	private class Multiple implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double mul = 0.0;
			
			String num1 = lbltfName.getText();
			String num2 = lbltfName1.getText();
			int num2_ = Integer.parseInt(num2);
			if(num2_ !=0 ){
				mul = Integer.parseInt(num1)*(double)num2_;
			}
			
			lbtfOut.setText(String.format("%.2f", mul ));
			sqrt();
		}
		
	}
	
	public static void main(String[] args) {
		Swing07Lamda win = new Swing07Lamda();
		
	}

	
}
