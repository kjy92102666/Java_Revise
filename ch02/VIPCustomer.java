package ch02;

public class VIPCustomer extends Customer{
	private int agentID;		//���� ���� ID
	private float salesRatio;	//��ǰ���� ������
	
	public VIPCustomer() {
		customerGrade = "VIP";	//���� ���� ������, CustomerŬ������ ����߱⿡ ��밡��.
		bonusRatio = 0.05f;
		salesRatio = 0.1f;
	}

	@Override
	public int calcPrice(int price) {
		//super.calcPrice(price);	super�� �θ� ��ü�� ����Ű�°Ű�. this�� ��������� ����Ű�°Ű�.
		bonusPoint += (int)(price * bonusRatio);
		price -= (int)(price * salesRatio);	//price = �ݾ�x������
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
		System.out.println("���̸� : "+customertName+",����� : "+customerGrade+
				", ������Ʈ : "+bonusPoint);

	}
	
}
