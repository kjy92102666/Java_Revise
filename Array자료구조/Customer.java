package ch02;
	
public class Customer {
	
	//private�� ��ӽ� ��� ���ϱ⿡ protected. public�� �ʹ� �������̶� ����.
	protected int customerID;		//�� id
	protected String customertName;	//�� �̸�
	protected String customerGrade;	//�� ���
	protected int bonusPoint; 		//1%�� ���� ���ʽ� ����Ʈ
	protected float bonusRatio;		//ratio:����. �μ��� ����

	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01f;//f������ double�� ����
	}

	public int calcPrice(int price) {
		bonusPoint = bonusPoint + (int)(price * bonusRatio); //intxfloat�� ����
		System.out.println("Customer calcPrice");
		return price;
	}
	
	
	//getter,setter�� public�� �ƴϸ� �����ؼ� ȣ�����ִ� ���. �������� ��ȣ���� ����
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
		System.out.println("���̸� : "+customertName+",����� : "+customerGrade+", ������Ʈ : "+bonusPoint);
	}
	
}
