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
			String rrnstrY = rrn.substring(0,4);//0,1�ε��� ����Ŀ��
			
			//String name = lbltfName.getText();
			//adult = "";
			
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy�� MM�� dd��");    
			// ������ ����        
			String formatedY = formatter.format(Rrn.now);  	 
			
			// ������ ���� ��¥/�ð� ���        
			String formatNowY = formatedY.substring(0,4);
			//������ȣ ������ġ��ü 2�ڸ�[9],[10]
			int fNowY = Integer.parseInt(formatNowY);//���� �⵵
			
			int rrnY = Integer.parseInt(rrnstrY);
			
			Rrn.age = 0;	 //���� ����.
			Rrn.gen = ""; //���� ����.
			
			//String formatedM = formatter.format(rrn); 
			String formatNowB = rrn.substring(9,10);
			String formatNowBG = rrn.substring(10,12);
			
			int fNowB = Integer.parseInt(formatNowB);	//�ֹι�ȣ ���ڸ�
			int fNowBG = Integer.parseInt(formatNowBG);	//�ֹι�ȣ ���ڸ�
			
			if( ((rrnY>=1900) && (rrnY<2000)) ) { // 00��� �����̸�~ �ֹ� ���ڸ�1,2
					
				if( ( fNowY-rrnY ) > 19  ){
					Rrn.age = (fNowY-rrnY)+1;	//�� ���̸� �����ϱ����� +1����.
					Rrn.adult = "����, 20����";
					if(fNowB==1) {
						Rrn.gen = "����";
					}else if(fNowB==2) {
						Rrn.gen = "����";
					}else {
						Rrn.gen = "�߸� �Է� �ϼ̽��ϴ�.";
					}
				}
				/*
				 * else if( ( fNowY-rrnY ) <= 19 ) { age = (fNowY-rrnY)+1; adult = "�̼���"; }
				 */
				
			}else if((rrnY>=2000) && (rrnY<2100)) {
				// 00��� �����̸�~ �ֹ� ���ڸ�3,4
				
				if( ( fNowY-rrnY ) > 19  ){
					Rrn.age = (fNowY-rrnY)+1;
					Rrn.adult = "����, 21����";
						if(fNowB==3) {
							Rrn.gen = "����";
						}else if(fNowB==4) {
							Rrn.gen = "����";
						}else {
							Rrn.gen = "�߸� �Է� �ϼ̽��ϴ�.";
						}
				}else if( ( fNowY-rrnY ) <= 19 ) {
					Rrn.age = (fNowY-rrnY)+1;
					Rrn.adult = "�̼���, 21����";
						if(fNowB==3) {
							Rrn.gen = "����";
						}else if(fNowB==4) {
							Rrn.gen = "����";
						}else {
							Rrn.gen = "�߸� �Է� �ϼ̽��ϴ�.";
						}
				}
			}
			
			Rrn.lbltfResult.setText(Rrn.adult+"");
			//lbltfResult.setText("���� : " + age + ", " + adult+","+gen);
			
	}


}
