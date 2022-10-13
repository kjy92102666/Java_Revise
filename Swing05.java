package com.simple.ex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Frame을 상속 받았다. 02보다 이 구조가 더 많이 쓰인다.
public class Swing05 extends JFrame {
	JButton btn; //버튼을 클래스 멤버로 선언. 원래는 클래스에 멤버로.
	JTextField tfName;
	JLabel lblName;
	private JTextField tfNameOut;
	private JLabel lblName1;
	private JTextField tfName1;
	
	public Swing05() {
		//윈도우 초기 설정
		setTitle("윈도우01");
		setSize(400,500);	//가로 세로 크기
		
		//윈도우 배치 설정
		setLayout(null); 
		
		//컴포넌트 배치를 직접 설정.(위치, 크기)
		
		//원하는 컴포넌트 생성
		//키보드 입력 컴포넌트 JTextFiled(콘솔에선 Scanner)
		lblName = new JLabel("숫자1 : "); //가운데 정렬되서 보여줄거다~
		lblName.setBounds(50, 5, 100, 40);
		lblName1 = new JLabel("숫자2 : ");
		lblName1.setBounds(50, 50, 100, 40);
		
		tfName = new JTextField();//값을 받을 텍스트상자.
		tfName.setBounds(100,5,100,40);
		tfName1 = new JTextField();
		tfName1.setBounds(100,55,100,40);
		
		tfNameOut = new JTextField();
		tfNameOut.setBounds(100,150,100,40);
		
		//버튼 생성
		btn = new JButton("+");
		btn.setBounds(100,100,100,40);//x,y,가로,세로	
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String name = tfName.getText();
				int n = Integer.parseInt(name);
				
				String name1 = tfName1.getText();
				int n1 = Integer.parseInt(name1);
				int result = n + n1;
				
				tfNameOut.setText(result+"");
				
			}
		});
		
		//프레임에 컴포넌트 등록. 
		add(btn);

		add(tfName);
		add(tfName1);
		add(tfNameOut);
		add(lblName);
		add(lblName1);
		
		//윈도우 활성화(윈도우 보이게)
		setVisible(true); //false로 바꾸면 실행해도 화면이 안보인다.
		setResizable(false); //창크기 고정. 크기바꿀거냐? false.
				
	}
	public static void main(String[] args) {
		Swing05 f1 = new Swing05();

	}
}
