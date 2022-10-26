package com.simple.ex;
import javax.swing.*;    
import java.awt.event.*;    

class RadioButtonExample extends JFrame implements ActionListener{    
	JRadioButton rb1, rb2, rb3, rb4;    
	JButton b;    
	
	RadioButtonExample(){      
		rb1=new JRadioButton("Male");    
		rb1.setBounds(100,50,100,30);     
		rb2=new JRadioButton("Female");   
		rb2.setBounds(100,100,100,30);   
		
		//얘네는 그룹x
		rb3=new JRadioButton("Zerg");    
		rb3.setBounds(100,150,100,30);     
		rb4=new JRadioButton("Terran");    
		rb4.setBounds(100,200,100,30);   
	
		
		ButtonGroup bg = new ButtonGroup();    //영역을 나누기위해 사용. 비록 하나만 있더라도 생성해야함.
		ButtonGroup bg1 = new ButtonGroup();
		
		bg.add(rb1);			//라디오 버튼 기능을 상실함. 중복체크 가능.
		bg.add(rb2);    
		bg1.add(rb3);
		bg1.add(rb4);
		b=new JButton("click");    
		b.setBounds(100,150,80,30);    
		b.addActionListener(this); 
		
		add(rb1);
		add(rb2);
		add(rb3);
		add(rb4);
		add(b);    
		setSize(300,300);    
		setLayout(null);    
		setVisible(true);    
	}    
	
	public void actionPerformed(ActionEvent e){ 
		
		if(rb1.isSelected()){    
			JOptionPane.showMessageDialog(this,"You are Male.");   //alert창 같은 결과가 나옴. 
		}    
		if(rb2.isSelected()){    
			JOptionPane.showMessageDialog(this,"You are Female.");    
		}    
	}    
	
	public static void main(String args[]){    
		new RadioButtonExample();    
	}
}   