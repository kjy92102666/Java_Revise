package ch05;

public class Customer {
	
	protected int customerID;		//
	protected String customerName;	
	protected String customerGrade;
	protected int bonusPoint;
	protected float bonusRatio;
	
	public Customer() {
		customerGrade = "실딱이";
		bonusRatio = 0.01f;
	}
	
	public int calcPrice(int price) {
		bonusPoint += (int)(bonusRatio * price);
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

	
		
	public void showCustomerInfo() {
		System.out.println(customerName + "님의 고객등급은 " + customerGrade+"이며, 보너스 포인트는"
	+bonusPoint+"입니다.");
	}
	
}
