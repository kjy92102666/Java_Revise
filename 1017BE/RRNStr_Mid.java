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
public class RRNStr_Mid extends JFrame implements ActionListener{

	private JLabel lblRRN;
	private JLabel lblName;
	private JLabel lblResult;
	
	private JTextField lbltfRRN;
	private JTextField lbltfName;
	private JTextField lbltfResult;
    
	Date now = new Date(); //����ð� ��Ÿ���� ���� ��ü����
	
	

	public RRNStr_Mid() {
		
		//������ �ʱ⼳��
		this.setTitle("�ֹε�Ϲ�ȣ ���ڿ� ó����");
		this.setSize(600, 750);
		
		
		
		//������ ��ġ����? �ǹ�Q
		this.setLayout(null);
		
		//������Ʈ ����
		//��ư ����
		lblRRN = new JLabel("�ֹι�ȣ");
		lblRRN.setBounds(40,100,80,40);
		lblName = new JLabel("�� ��");
		lblName.setBounds(40,180,80,40);
		lblResult = new JLabel("üũ���");
		lblResult.setBounds(40,260,80,40);
		
		lbltfRRN = new JTextField();
		lbltfRRN.setBounds(130,100,120,40);
		lbltfName = new JTextField();
		lbltfName.setBounds(130,180,120,40);
		lbltfResult = new JTextField();
		lbltfResult.setBounds(130,260,120,40);
		
		JButton jbtn = new JButton("����");
		jbtn.setBounds(40,340,80,40);
		jbtn.addActionListener(this); 

		
//		JButton jbtn_adult = new JButton("���ο���");
//		jbtn_adult.setBounds(100,340,120,40);
//		jbtn_adult.addActionListener(this); 
		
//		JButton jbtn_area = new JButton("����");
//		jbtn_area.setBounds(100,340,120,40);
//		jbtn_area.addActionListener(this); 

		
		
		//�����ӿ� ������Ʈ ���
		this.add(lblRRN);
		this.add(lblName);
		this.add(lblResult);
		this.add(lbltfRRN);
		this.add(lbltfName);
		this.add(lbltfResult);
		this.add(jbtn);


		//������ Ȱ��ȭ
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	
	//�ֹι�ȣ ���ڸ� 8�ڸ���.(1900,2000 �����Ϸ���.)
	@Override
		public void actionPerformed(ActionEvent e) {
			String rrn = lbltfRRN.getText();
			String rrnstrY = rrn.substring(0,4);//0,1�ε��� ����Ŀ��

			String name = lbltfName.getText();
			String adult = "";
			
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy�� MM�� dd��");    
			// ������ ����        
			String formatedY = formatter.format(now);  	 
			
			// ������ ���� ��¥/�ð� ���        
			String formatNowY = formatedY.substring(0,4);
			
			int fNowY = Integer.parseInt(formatNowY);//���� �⵵
			int rrnY = Integer.parseInt(rrnstrY);

			
			int age = 0;	 //���� ����.
			String gen = ""; //���� ����.
			
			//String formatedM = formatter.format(rrn); 
			String formatNowB = rrn.substring(9,10);
			
			int fNowB = Integer.parseInt(formatNowB);	//�ֹι�ȣ ���ڸ�
			//int rrnY = Integer.rrnNum 
			
			if( ((rrnY>=1900) && (rrnY<2000)) ) { // 00��� �����̸�~ �ֹ� ���ڸ�1,2
					
				if( ( fNowY-rrnY ) > 19  ){
					age = (fNowY-rrnY)+1;	//�� ���̸� �����ϱ����� +1����.
					adult = "����, 20����";
					if(fNowB==1) {
						gen = "����";
					}else if(fNowB==2) {
						gen = "����";
					}
				}
//				else if( ( fNowY-rrnY ) <= 19 ) {
//					age = (fNowY-rrnY)+1;
//					adult = "�̼���";
//				}
				
			}else if((rrnY>=2000) && (rrnY<2100)) {// 00��� �����̸�~ �ֹ� ���ڸ�3,4

				if( ( fNowY-rrnY ) > 19  ){
					age = (fNowY-rrnY)+1;
					adult = "����, 21����";
						if(fNowB==3) {
							gen = "����";
						}else if(fNowB==4) {
							gen = "����";
						}
				}else if( ( fNowY-rrnY ) <= 19 ) {
					age = (fNowY-rrnY)+1;
					adult = "�̼���, 21����";
						if(fNowB==3) {
							gen = "����";
						}else if(fNowB==4) {
							gen = "����";
						}
				}
			}
			
			lbltfResult.setText("���� : " + age + ", " + adult+","+gen);
			
			
	}
	
	public static void main(String[] args) {
		RRNStr_Mid rrnstr = new RRNStr_Mid();
		
	}

}