package test.RRN;

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
	
	JTextField lbltfRRN;
	private JTextField lbltfName;
	JTextField lbltfResult;
    
	String adult="";
	Date now = new Date(); //현재시간 나타내기 위한 객체생성
	String gen;
	int age;
	private String area;
	private int rrnY;
	private int fNowY;
	private String formatNowBG;
	private String rrn;
	private String rrnstrY;
	private int fNowBG;
	
	

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
		jbtn_age.addActionListener(this); //내부클래스
		
		JButton jbtn_gen = new JButton("성별");
		jbtn_gen.setBounds(120,340,80,40);
		jbtn_gen.addActionListener(new ActionListener() {
			//익명구현클래스.
			@Override
			public void actionPerformed(ActionEvent e) {		
				lbltfResult.setText(gen+"");
			}
		}); 
		
		JButton jbtn_adult = new JButton("성인여부");//외부
		jbtn_adult.setBounds(200,340,85,40);
		jbtn_adult.addActionListener(new Adult(this)); 
		
		
		JButton jbtn_area = new JButton("지역");
		jbtn_area.setBounds(285,340,80,40);
		jbtn_area.addActionListener((ActionEvent e)-> {
			
			
			fNowBG = Integer.parseInt(formatNowBG);	//주민번호 뒷자리 2,3
			
					//주민번호 2,3자리 할당고유번호
					if((fNowBG>=0)&&fNowBG<=8) {
						area = "서울특별시";
					}else if( (fNowBG>8)&&(fNowBG<=12) ) {
						area = "부산광역시";
					}
					else if( (fNowBG>12)&&(fNowBG<=15) ) {
						area = "인천광역시";
					}
					else if( (fNowBG>16)&&(fNowBG<=25) ) {
						area = "경기도";
					}
					else if( (fNowBG>25)&&(fNowBG<=34) ) {
						area = "강원도";
					}
					else if( (fNowBG>34)&&(fNowBG<=39) ) {
						area = "충청북도";
					}
					else if( (fNowBG==40) ) {
						area = "대전광역시";
					}
					else if( (fNowBG>40)&&(fNowBG<=47) ) {
						area = "충청남도";
					}
					else if( (fNowBG>47)&&(fNowBG<=54) ) {
						area = "전라북도";
					}
					else if( (fNowBG>54)&&(fNowBG<=66) ) {
						area = "전라남도";
					}
					else if( ((fNowBG>=67)&&(fNowBG<=69))||(fNowBG==76) ) {
						area = "大대구광역시";
					}
					else if( ( (fNowBG>69)&&(fNowBG<=75) )||( (fNowBG>76)&&(fNowBG<=81) )  ) {
						area = "경상북도";
					}else if( ((fNowBG>81)&&(fNowBG<=84)) && ((fNowBG>85)&&(fNowBG<=89))&&((fNowBG>89)&&(fNowBG<=92))  ) {
						area = "경상남도";
					}
					else if( (fNowBG>92)&&(fNowBG<=95) ) {
						area = "제주특별자치도";
					}

			lbltfResult.setText("지역 : " + area);
		}); 

		
		
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
			rrn = lbltfRRN.getText();
			rrnstrY = rrn.substring(0,4);//0,1인덱스 문자커팅
			
			//String name = lbltfName.getText();
			//adult = "";
			
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy년 MM월 dd일");    
			// 포맷팅 적용        
			String formatedY = formatter.format(now);  	 
			
			// 포맷팅 현재 날짜/시간 출력        
			String formatNowY = formatedY.substring(0,4);
			//고유번호 지방자치단체 2자리[9],[10]
			fNowY = Integer.parseInt(formatNowY);//현재 년도
			
			rrnY = Integer.parseInt(rrnstrY);
			
			age = 0;	 //현재 나이.
			gen = ""; //현재 성별.
			area = "";
			
			//String formatedM = formatter.format(rrn); 
			String formatNowB = rrn.substring(9,10);
			formatNowBG = rrn.substring(10,12);
			
			int fNowB = Integer.parseInt(formatNowB);	//주민번호 뒷자리 1
			if( ((rrnY>=1900) && (rrnY<2000)) ) { // 00년생 이전이면~ 주민 앞자리1,2
				
				if( ( fNowY-rrnY ) > 19  ){
					age = (fNowY-rrnY)+1;	//만 나이를 제거하기위해 +1해줌.
					adult = "성년, 20세기";
					if(fNowB==1) {
						gen = "남성";
					}else if(fNowB==2) {
						gen = "여성";
					}else {
						gen = "잘못 입력 하셨습니다.";
					}	
				}
				/*
				 * else if( ( fNowY-rrnY ) <= 19 ) { age = (fNowY-rrnY)+1; adult = "미성년"; }
				 */
				
			}else if((rrnY>=2000) && (rrnY<2100)) {
				// 00년생 이후이면~ 주민 앞자리3,4
				
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
			
			
			
			
	}
	
	public static void main(String[] args) {
		RRNStr rrnstr = new RRNStr();
		
	}

}
