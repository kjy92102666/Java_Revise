package ch06;

public class Customer {
	
	protected int customerID;		//
	protected String customerName;	
	protected String customerGrade;
	protected int bonusPoint;
	protected float bonusRatio;

	
	public Customer() {
		customerGrade = "�ǵ���";
		bonusRatio = 0.01f;
	}
	
	public int calcPrice(int price) {
		bonusPoint = (int)(bonusRatio*price);
		price -= (int)(bonusRatio*price);
		
		return price;
	}

	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public float getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(float bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
	public void showCustmoer() {
		System.out.println(customerName+"���� ������� "+customerGrade+
				"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ� customer");
	}
	
	
	
}
