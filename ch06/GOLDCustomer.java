package ch06;

public class GOLDCustomer extends Customer{
	private int AgentID;
	private float salesRatio;
	
	public GOLDCustomer(){
		customerGrade = "�����";
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
		System.out.println(customerName+"���� ������� "+customerGrade+
				"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ� GOLD");
	}
}
