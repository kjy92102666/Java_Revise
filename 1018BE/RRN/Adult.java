package test.RRN;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

public class Adult implements ActionListener {
	RRNStr Rrn = null;
	public Adult(RRNStr Rrn) {
		this.Rrn = Rrn;
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			String rrn = Rrn.lbltfRRN.getText();
			String rrnstrY = rrn.substring(0,4);//0,1인덱스 문자커팅
			
			//String name = lbltfName.getText();
			//adult = "";
			
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy년 MM월 dd일");    
			// 포맷팅 적용        
			String formatedY = formatter.format(Rrn.now);  	 
			
			// 포맷팅 현재 날짜/시간 출력        
			String formatNowY = formatedY.substring(0,4);
			//고유번호 지방자치단체 2자리[9],[10]
			int fNowY = Integer.parseInt(formatNowY);//현재 년도
			
			int rrnY = Integer.parseInt(rrnstrY);
			
			Rrn.age = 0;	 //현재 나이.
			Rrn.gen = ""; //현재 성별.
			
			//String formatedM = formatter.format(rrn); 
			String formatNowB = rrn.substring(9,10);
			String formatNowBG = rrn.substring(10,12);
			
			int fNowB = Integer.parseInt(formatNowB);	//주민번호 뒷자리
			int fNowBG = Integer.parseInt(formatNowBG);	//주민번호 뒷자리
			
			if( ((rrnY>=1900) && (rrnY<2000)) ) { // 00년생 이전이면~ 주민 앞자리1,2
					
				if( ( fNowY-rrnY ) > 19  ){
					Rrn.age = (fNowY-rrnY)+1;	//만 나이를 제거하기위해 +1해줌.
					Rrn.adult = "성년, 20세기";
					if(fNowB==1) {
						Rrn.gen = "남성";
					}else if(fNowB==2) {
						Rrn.gen = "여성";
					}else {
						Rrn.gen = "잘못 입력 하셨습니다.";
					}
				}
				/*
				 * else if( ( fNowY-rrnY ) <= 19 ) { age = (fNowY-rrnY)+1; adult = "미성년"; }
				 */
				
			}else if((rrnY>=2000) && (rrnY<2100)) {
				// 00년생 이후이면~ 주민 앞자리3,4
				
				if( ( fNowY-rrnY ) > 19  ){
					Rrn.age = (fNowY-rrnY)+1;
					Rrn.adult = "성년, 21세기";
						if(fNowB==3) {
							Rrn.gen = "남성";
						}else if(fNowB==4) {
							Rrn.gen = "여성";
						}else {
							Rrn.gen = "잘못 입력 하셨습니다.";
						}
				}else if( ( fNowY-rrnY ) <= 19 ) {
					Rrn.age = (fNowY-rrnY)+1;
					Rrn.adult = "미성년, 21세기";
						if(fNowB==3) {
							Rrn.gen = "남성";
						}else if(fNowB==4) {
							Rrn.gen = "여성";
						}else {
							Rrn.gen = "잘못 입력 하셨습니다.";
						}
				}
			}
			
			Rrn.lbltfResult.setText(Rrn.adult+"");
			//lbltfResult.setText("지역 : " + age + ", " + adult+","+gen);
			
	}


}
