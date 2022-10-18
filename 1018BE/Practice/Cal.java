package test.Practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cal implements ActionListener {
	final int num = 3_565_200;
	
	private Pay pay;
	private int money;
	
	public Cal(Pay pay) {
		this.pay = pay;
	}

		
		//3565200.
		@Override
		public void actionPerformed(ActionEvent e) {
			pay.str1 = pay.jbtn.getText();
			
			if(e.getSource()==pay.jbtn) {
				money = Integer.parseInt(pay.str1);
				
				if(money >num) {
					money = num/10000;
				}
				
			}
			pay.jl.setText(money+"");
			
			
			
		
		};
		

}
