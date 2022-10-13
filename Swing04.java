package com.simple.ex;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Frame을 상속 받았다. 02보다 이 구조가 더 많이 쓰인다.
public class Swing04 extends JFrame{
	JButton btn, btn1; //버튼을 클래스 멤버로 선언. 원래는 클래스에 멤버로.
	JTextField tfName;
	JLabel lblName;
	private JTextField tfNameOut;
	
	public Swing04() {
		//윈도우 초기 설정
		setTitle("윈도우01");
		setSize(400,500);	//가로 세로 크기
		
		//윈도우 배치 설정
		setLayout(null); 
		
		//컴포넌트 배치를 직접 설정.(위치, 크기)
		

		//원하는 컴포넌트 생성
		//키보드 입력 컴포넌트 JTextFiled(콘솔에선 Scanner)
		lblName = new JLabel("이 름 : "); //가운데 정렬되서 보여줄거다~
		lblName.setBounds(50, 50, 100, 40);
		
		tfName = new JTextField();
		tfName.setBounds(100,50,100,40);
		//tfName.setText(getName()); //값 변경,초기화.
		
		tfNameOut = new JTextField();
		tfNameOut.setBounds(100,150,100,40);
		
		//버튼 생성
		btn = new JButton("눌러봐");
		btn.setBounds(100,100,100,40);//x,y,가로,세로
		
//		btn.addActionListener(new ActionListener() {//인터페이스, 익명클래스
//		콘솔로 출력 개념.
//			//매개변수 안에 동작 값들이 들어있음.
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//버튼 클릭 시, 전달되는 함수. e를 통해서 전달된다.
//				//키보드 입력 값을 읽어오기.
//				String name = tfName.getText(); //Text는 멤버변수이름.
//				System.out.println("이름 :" + name);
//			}
//			
//		});
		
		btn.addActionListener(new ActionListener() {//인터페이스, 익명클래스
			//매개변수 안에 동작 값들이 들어있음.
			@Override
			public void actionPerformed(ActionEvent e) {
				//버튼 클릭 시, 전달되는 함수. e를 통해서 전달된다.
				//키보드 입력 값을 읽어오기.
				String name = tfName.getText(); //Text는 멤버변수이름.
				tfNameOut.setText(name);
			}
			
		});
		
		//프레임에 컴포넌트 등록. 
		add(btn);
		add(tfName);
		add(tfNameOut);
		add(lblName);
		
		//윈도우 활성화(윈도우 보이게)
		setVisible(true); //false로 바꾸면 실행해도 화면이 안보인다.
		setResizable(false); //창크기 고정. 크기바꿀거냐? false.
				
	}
	public static void main(String[] args) {
		Swing04 f1 = new Swing04();
		Swing04 f2 = f1;	//값만 대입. 공유개념.
		
	}
}
