package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//BMI>=18.5 : 저체중 // 18.5~22.9 : 정상 // 23.0 ~ 24.9 : 과체중 // 25.0 ~ : 비만
//계산식 
//윈도우 초기 설정  >>윈도우 배치 설정 >> (컴포넌트 배치 설정. 위치,크기>> 원하는 컴포넌트 생성) >> 
//버튼 생성>>★프레임에 컴포넌트 등록 >> 윈도우활성화
public class BMISwing extends JFrame implements ActionListener{

	JButton calBtn;
	
	private JLabel lblheight;
	private JLabel lblweight;
	private JLabel lblResult;
	private JTextField lbltfheight;
	private JTextField lbltfweight;
	private JTextField lbltfResult;

	
	public BMISwing() {
		//초기 설정
		this.setTitle("비만도 측정(BMI지수) 프로그램");
		this.setSize(400,500);
		
		//배치 설정
		this.setLayout(null);
		
		//프레임에 컴포넌트 등록
		lblheight = new JLabel("신장 ");
		lblheight.setBounds(50,20,100,40);
		lblweight = new JLabel("몸무게 ");
		lblweight.setBounds(50,80,100,40);
		lblResult = new JLabel("BMI 지수 판정");
		lblResult.setBounds(50,200,100,40);
		
		lbltfheight = new JTextField();
		lbltfheight.setBounds(150,20,100,40);
		lbltfweight = new JTextField();
		lbltfweight.setBounds(150,80,100,40);
		lbltfResult = new JTextField();
		lbltfResult.setBounds(150,200,100,40);
		
		
		//버튼 생성
		calBtn = new JButton("계산하기");
		//값이 어디로 담기는지 원리 여쭤보기!
		calBtn.setBounds(150,140,100,40);
		calBtn.addActionListener(this);
		
		//버튼 등록
		this.add(lblheight);
		this.add(lblweight);
		this.add(calBtn);
		
		this.add(lbltfheight);
		this.add(lbltfweight);
		this.add(lbltfResult);
		
		this.add(lblResult);
		
		//윈도우 활성화
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String var1 = lbltfheight.getText();
		String var2 = lbltfweight.getText();
		Double v1 = Double.parseDouble(var1);
		Double v2 = Double.parseDouble(var2);
		
		String str = "";
		Double result = 0.0;
		
		if(e.getSource() == calBtn) {
			
			result =Math.round(v2 / ((v1/100)*(v1/100))*100)/100.0;
			if( (result > 0) && (result <=18.5) ) {
				str = "저체중.";
			}else if( (result>18.5) && (result <= 22.9) ) {
				str = "정상 .";
			}else if( (result>22.9) && (result <= 24.9)) {
				str = "과체중.";
			}else {
				str = "비만 .";
			}
			
		}
		
		lbltfResult.setText(result + "" + str);

	}
	
	public static void main(String[] args) {
		new BMISwing();
	}

}


