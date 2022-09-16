package ch06;

public class GOLDCustomer extends Customer{
	private int AgentID;
	private float salesRatio;
	
	public GOLDCustomer(){
		customerGrade = "골딱이";
		bonusRatio = 0.03f;
		salesRatio = 0.05f;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint = (int)(bonusRatio*price);
		price -= (int)(salesRatio*price);
		
		return price;
	}

	public int getAgentID() {
		return AgentID;
	}

	public void setAgentID(int agentID) {
		AgentID = agentID;
	}

	public float getSalesRatio() {
		return salesRatio;
	}

	public void setSalesRatio(float salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	@Override
	public void showCustmoer() {
		System.out.println(customerName+"님의 고객등급은 "+customerGrade+
				"이며, 보너스 포인트는"+bonusPoint+"입니다 GOLD");
	}
}
