package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//https://cafe.naver.com/webdev2202
public class RRNStr extends JFrame{

	private JLabel lblRRN;
	private JLabel lblName;
	private JLabel lblResult;
	
	private JTextField lbltfRRN;
	private JTextField lbltfName;
	private JTextField lbltfResult;

	public RRNStr() {
		
		//윈도우 초기설정
		this.setTitle("주민등록번호 문자열 처리기");
		this.setSize(400, 500);
		
		//윈도우 배치설정? 의미Q
		this.setLayout(null);
		
		//컴포넌트 생성
		//버튼 생성
		lblRRN = new JLabel("주민번호");
		lblRRN.setBounds(40,100,80,40);
		lblName = new JLabel("이 름");
		lblName.setBounds(40,150,80,40);
		lblResult = new JLabel("체크결과");
		lblResult.setBounds(40,200,80,40);
		
		lbltfRRN = new JTextField();
		lbltfRRN.setBounds(130,100,120,40);
		lbltfName = new JTextField();
		lbltfName.setBounds(130,150,120,40);
		lbltfResult = new JTextField();
		lbltfResult.setBounds(130,200,120,40);
		
		JButton jbtn = new JButton("확인");
		jbtn.setBounds(100,250,120,40);
		jbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String rrn = lbltfRRN.getText();
				String name = lbltfName.getText();
				
				
				//lbltfResult.setText();
				
				
			}
		});
		
		
		//프레임에 컴포넌트 등록
		this.add(lblRRN);
		this.add(lblName);
		this.add(lblResult);
		this.add(lbltfRRN);
		this.add(lbltfName);
		this.add(lbltfResult);
		this.add(jbtn);
		
		
		
		
		
		
		//윈도우 활성화
		this.setVisible(true);
		this.setResizable(false);
		
		
	}
	
	public static void main(String[] args) {
		new RRNStr();
	}
}
