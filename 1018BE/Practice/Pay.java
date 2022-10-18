package test.Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pay extends JFrame{
	
	int num;
	String str1;
	String str2;
	JButton jbtn;
	JTextField jtf5;
	JLabel jl5;
	JTextField jtf4;
	JLabel jl4;
	JTextField jtf3;
	JLabel jl3;
	JTextField jtf2;
	JLabel jl2;
	JTextField jtf1;
	JLabel jl1;
	JTextField jtf;
	JLabel jl;

	public Pay() {
		
		
		this.setTitle("급여 수령액 분배기");
		this.setSize(400,600);
		
		this.setLayout(null);
		
		
		
		jl = new JLabel("급여 수령액");
		jl.setBounds(20,40,80,40);
		jtf = new JTextField();
		jtf.setBounds(100,40,200,40);
		
		jl1 = new JLabel("만 원");
		jl1.setBounds(20,100,80,40);
		jtf1 = new JTextField();
		jtf1.setBounds(100,100,200,40);
		
		jl2 = new JLabel("오천원");
		jl2.setBounds(20,160,80,40);
		jtf2 = new JTextField();
		jtf2.setBounds(100,160,200,40);
		
		jl3 = new JLabel("천 원");
		jl3.setBounds(20,220,80,40);
		jtf3 = new JTextField();
		jtf3.setBounds(100,220,200,40);
		
		jl4 = new JLabel("오백원");
		jl4.setBounds(20,280,80,40);
		jtf4 = new JTextField();
		jtf4.setBounds(100,280,200,40);
		
		jl5 = new JLabel("백 원");
		jl5.setBounds(20,360,80,40);
		jtf5 = new JTextField();
		jtf5.setBounds(100,360,200,40);
		
		num = 0;
		
		str1="";
		str2="";
		
		
		jbtn = new JButton("계산");
		jbtn.setBounds(160,450,60,40);
		jbtn.addActionListener((ActionListener) this);
		
		
		this.add(jbtn);
		this.add(jl);
		this.add(jtf);
		this.add(jl1);
		this.add(jtf1);
		this.add(jl2);
		this.add(jtf2);
		this.add(jl3);
		this.add(jtf3);
		this.add(jl4);
		this.add(jtf4);
		this.add(jl5);
		this.add(jtf5);
		
		
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public static void main(String[] args) {
		new Pay();

	}
}
