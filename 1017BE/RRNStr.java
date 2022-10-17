package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//https://cafe.naver.com/webdev2202
public class RRNStr extends JFrame implements ActionListener{

	private JLabel lblRRN;
	private JLabel lblName;
	private JLabel lblResult;
	
	private JTextField lbltfRRN;
	private JTextField lbltfName;
	private JTextField lbltfResult;
    
	private String adult="";
	Date now = new Date(); //현재시간 나타내기 위한 객체생성
	
	

	public RRNStr() {
		
		//윈도우 초기설정
		this.setTitle("주민등록번호 문자열 처리기");
		this.setSize(600, 750);
		
		//윈도우 배치설정? 의미Q
		this.setLayout(null);
		
		//컴포넌트 생성
		//버튼 생성
		lblRRN = new JLabel("주민번호");
		lblRRN.setBounds(40,100,80,40);
		lblName = new JLabel("이 름");
		lblName.setBounds(40,180,80,40);
		lblResult = new JLabel("체크결과");
		lblResult.setBounds(40,260,80,40);
		
		lbltfRRN = new JTextField();
		lbltfRRN.setBounds(130,100,120,40);
		lbltfName = new JTextField();
		lbltfName.setBounds(130,180,120,40);
		lbltfResult = new JTextField();
		lbltfResult.setBounds(130,260,120,40);
		
		JButton jbtn_age = new JButton("나이");
		jbtn_age.setBounds(40,340,80,40);
		jbtn_age.addActionListener(this); 
		
		JButton jbtn_gen = new JButton("성별");
		jbtn_gen.setBounds(120,340,80,40);
		jbtn_gen.addActionListener(this); 
		
		JButton jbtn_adult = new JButton("성인여부");
		jbtn_adult.setBounds(200,340,85,40);
		jbtn_adult.addActionListener(this); 
		
		JButton jbtn_area = new JButton("지역");
		jbtn_area.setBounds(285,340,80,40);
		jbtn_area.addActionListener(this); 

		
		
		//프레임에 컴포넌트 등록
		this.add(lblRRN);
		this.add(lblName);
		this.add(lblResult);
		this.add(lbltfRRN);
		this.add(lbltfName);
		this.add(lbltfResult);
		this.add(jbtn_age);
		this.add(jbtn_gen);
		this.add(jbtn_adult);
		this.add(jbtn_area);

		//윈도우 활성화
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	
	//주민번호 앞자리 8자리로.(1900,2000 구분하려고.)
	@Override
		public void actionPerformed(ActionEvent e) {
			String rrn = lbltfRRN.getText();
			String rrnstrY = rrn.substring(0,4);//0,1인덱스 문자커팅
			
			//String name = lbltfName.getText();
			//adult = "";
			
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy년 MM월 dd일");    
			// 포맷팅 적용        
			String formatedY = formatter.format(now);  	 
			
			// 포맷팅 현재 날짜/시간 출력        
			String formatNowY = formatedY.substring(0,4);
			//고유번호 지방자치단체 2자리[9],[10]
			int fNowY = Integer.parseInt(formatNowY);//현재 년도
			
			int rrnY = Integer.parseInt(rrnstrY);
			
			int age = 0;	 //현재 나이.
			String gen = ""; //현재 성별.
			
			//String formatedM = formatter.format(rrn); 
			String formatNowB = rrn.substring(9,10);
			
			int fNowB = Integer.parseInt(formatNowB);	//주민번호 뒷자리
			
			if( ((rrnY>=1900) && (rrnY<2000)) ) { // 00년생 이전이면~ 주민 앞자리1,2
					
				if( ( fNowY-rrnY ) > 19  ){
					age = (fNowY-rrnY)+1;	//만 나이를 제거하기위해 +1해줌.
					adult = "성년, 20세기";
					if(fNowB==1) {
						gen = "남성";
					}else if(fNowB==2) {
						gen = "여성";
					}
				}
				/*
				 * else if( ( fNowY-rrnY ) <= 19 ) { age = (fNowY-rrnY)+1; adult = "미성년"; }
				 */
				
			}else if((rrnY>=2000) && (rrnY<2100)) {// 00년생 이후이면~ 주민 앞자리3,4

				if( ( fNowY-rrnY ) > 19  ){
					age = (fNowY-rrnY)+1;
					adult = "성년, 21세기";
						if(fNowB==3) {
							gen = "남성";
						}else if(fNowB==4) {
							gen = "여성";
						}else {
							gen = "잘못 입력 하셨습니다.";
						}
				}else if( ( fNowY-rrnY ) <= 19 ) {
					age = (fNowY-rrnY)+1;
					adult = "미성년, 21세기";
						if(fNowB==3) {
							gen = "남성";
						}else if(fNowB==4) {
							gen = "여성";
						}else {
							gen = "잘못 입력 하셨습니다.";
						}
				}
			}
			
			lbltfResult.setText(age+"");
			lbltfResult.setText(gen+"");
			lbltfResult.setText(adult+"");
			//lbltfResult.setText("지역 : " + age + ", " + adult+","+gen);
			
	}
	
	public static void main(String[] args) {
		RRNStr rrnstr = new RRNStr();
		
	}

}
