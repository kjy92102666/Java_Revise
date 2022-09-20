package ch02;

public class VIPCustomer extends Customer{
	private int agentID;		//전문 상담원 ID
	private float salesRatio;	//제품가격 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";	//별도 선언 없지만, Customer클래스를 상속했기에 사용가능.
		bonusRatio = 0.05f;
		salesRatio = 0.1f;
	}

	@Override
	public int calcPrice(int price) {
		//super.calcPrice(price);	super는 부모 객체를 가리키는거고. this는 멤버변수를 가리키는거고.
		bonusPoint += (int)(price * bonusRatio);
		price -= (int)(price * salesRatio);	//price = 금액x할인율
		System.out.println("VIPCustomer calcPrice");
		return price;
	}

	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public float getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(float salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	
	public void showVipCustmoetInfo() {
		//VIPCustomer vip = new VIPCustomer();
		System.out.println("고객이름 : "+customertName+",고객등급 : "+customerGrade+
				", 고객포인트 : "+bonusPoint);

	}
	
}
