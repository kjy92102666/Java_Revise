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
	Date now = new Date(); //����ð� ��Ÿ���� ���� ��ü����
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
		
		JButton jbtn_age = new JButton("����");
		jbtn_age.setBounds(40,340,80,40);
		jbtn_age.addActionListener(this); //����Ŭ����
		
		JButton jbtn_gen = new JButton("����");
		jbtn_gen.setBounds(120,340,80,40);
		jbtn_gen.addActionListener(new ActionListener() {
			//�͸���Ŭ����.
			@Override
			public void actionPerformed(ActionEvent e) {		
				lbltfResult.setText(gen+"");
			}
		}); 
		
		JButton jbtn_adult = new JButton("���ο���");//�ܺ�
		jbtn_adult.setBounds(200,340,85,40);
		jbtn_adult.addActionListener(new Adult(this)); 
		
		
		JButton jbtn_area = new JButton("����");
		jbtn_area.setBounds(285,340,80,40);
		jbtn_area.addActionListener((ActionEvent e)-> {
			
			
			fNowBG = Integer.parseInt(formatNowBG);	//�ֹι�ȣ ���ڸ� 2,3
			
					//�ֹι�ȣ 2,3�ڸ� �Ҵ������ȣ
					if((fNowBG>=0)&&fNowBG<=8) {
						area = "����Ư����";
					}else if( (fNowBG>8)&&(fNowBG<=12) ) {
						area = "�λ걤����";
					}
					else if( (fNowBG>12)&&(fNowBG<=15) ) {
						area = "��õ������";
					}
					else if( (fNowBG>16)&&(fNowBG<=25) ) {
						area = "��⵵";
					}
					else if( (fNowBG>25)&&(fNowBG<=34) ) {
						area = "������";
					}
					else if( (fNowBG>34)&&(fNowBG<=39) ) {
						area = "��û�ϵ�";
					}
					else if( (fNowBG==40) ) {
						area = "����������";
					}
					else if( (fNowBG>40)&&(fNowBG<=47) ) {
						area = "��û����";
					}
					else if( (fNowBG>47)&&(fNowBG<=54) ) {
						area = "����ϵ�";
					}
					else if( (fNowBG>54)&&(fNowBG<=66) ) {
						area = "���󳲵�";
					}
					else if( ((fNowBG>=67)&&(fNowBG<=69))||(fNowBG==76) ) {
						area = "�޴뱸������";
					}
					else if( ( (fNowBG>69)&&(fNowBG<=75) )||( (fNowBG>76)&&(fNowBG<=81) )  ) {
						area = "���ϵ�";
					}else if( ((fNowBG>81)&&(fNowBG<=84)) && ((fNowBG>85)&&(fNowBG<=89))&&((fNowBG>89)&&(fNowBG<=92))  ) {
						area = "��󳲵�";
					}
					else if( (fNowBG>92)&&(fNowBG<=95) ) {
						area = "����Ư����ġ��";
					}

			lbltfResult.setText("���� : " + area);
		}); 

		
		
		//�����ӿ� ������Ʈ ���
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

		//������ Ȱ��ȭ
		this.setVisible(true);
		this.setResizable(false);
		
	}
	
	
	//�ֹι�ȣ ���ڸ� 8�ڸ���.(1900,2000 �����Ϸ���.)
	@Override
		public void actionPerformed(ActionEvent e) {
			rrn = lbltfRRN.getText();
			rrnstrY = rrn.substring(0,4);//0,1�ε��� ����Ŀ��
			
			//String name = lbltfName.getText();
			//adult = "";
			
			SimpleDateFormat formatter = 
					new SimpleDateFormat("yyyy�� MM�� dd��");    
			// ������ ����        
			String formatedY = formatter.format(now);  	 
			
			// ������ ���� ��¥/�ð� ���        
			String formatNowY = formatedY.substring(0,4);
			//������ȣ ������ġ��ü 2�ڸ�[9],[10]
			fNowY = Integer.parseInt(formatNowY);//���� �⵵
			
			rrnY = Integer.parseInt(rrnstrY);
			
			age = 0;	 //���� ����.
			gen = ""; //���� ����.
			area = "";
			
			//String formatedM = formatter.format(rrn); 
			String formatNowB = rrn.substring(9,10);
			formatNowBG = rrn.substring(10,12);
			
			int fNowB = Integer.parseInt(formatNowB);	//�ֹι�ȣ ���ڸ� 1
			if( ((rrnY>=1900) && (rrnY<2000)) ) { // 00��� �����̸�~ �ֹ� ���ڸ�1,2
				
				if( ( fNowY-rrnY ) > 19  ){
					age = (fNowY-rrnY)+1;	//�� ���̸� �����ϱ����� +1����.
					adult = "����, 20����";
					if(fNowB==1) {
						gen = "����";
					}else if(fNowB==2) {
						gen = "����";
					}else {
						gen = "�߸� �Է� �ϼ̽��ϴ�.";
					}	
				}
				/*
				 * else if( ( fNowY-rrnY ) <= 19 ) { age = (fNowY-rrnY)+1; adult = "�̼���"; }
				 */
				
			}else if((rrnY>=2000) && (rrnY<2100)) {
				// 00��� �����̸�~ �ֹ� ���ڸ�3,4
				
				if( ( fNowY-rrnY ) > 19  ){
					age = (fNowY-rrnY)+1;
					adult = "����, 21����";
						if(fNowB==3) {
							gen = "����";
						}else if(fNowB==4) {
							gen = "����";
						}else {
							gen = "�߸� �Է� �ϼ̽��ϴ�.";
						}
				}else if( ( fNowY-rrnY ) <= 19 ) {
					age = (fNowY-rrnY)+1;
					adult = "�̼���, 21����";
						if(fNowB==3) {
							gen = "����";
						}else if(fNowB==4) {
							gen = "����";
						}else {
							gen = "�߸� �Է� �ϼ̽��ϴ�.";
						}
				}
			}
			
			lbltfResult.setText(age+"");
			
			
			
			
	}
	
	public static void main(String[] args) {
		RRNStr rrnstr = new RRNStr();
		
	}

}
