package ch02;
	
public class Customer {
	
	//private은 상속시 사용 못하기에 protected. public은 너무 범용적이라서 제외.
	protected int customerID;		//고객 id
	protected String customertName;	//고객 이름
	protected String customerGrade;	//고객 등급
	protected int bonusPoint; 		//1%의 적립 보너스 포인트
	protected float bonusRatio;		//ratio:비율. 두수의 관계

	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01f;//f생략시 double로 간주
	}

	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price * bonusRatio); //intxfloat은 오휴
		System.out.println("Customer calcPrice");
		return price;
	}
	
	
	//getter,setter는 public이 아니면 생성해서 호출해주는 방식. 데이터의 보호성도 있음
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomertName() {
		return customertName;
	}
	public void setCustomertName(String customertName) {
		this.customertName = customertName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	public float getBonusPoint() {
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
		System.out.println("고객이름 : "+customertName+",고객등급 : "+customerGrade+", 고객포인트 : "+bonusPoint);
	}
	
}
