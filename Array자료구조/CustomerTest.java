package ch02;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomertName("���");
		customerLee.setCustomerID(10001);
		
		int price = customerLee.calcPrice(10000);
		
		customerLee.showCustomerInfo();
		System.out.println("�����ݾ��� : " + price + "��");
		
		System.out.println("============================================================");
		
		VIPCustomer vipKim = new VIPCustomer();
		vipKim.setCustomertName("VIP ���");
		vipKim.setCustomerID(7777);
		//vipKim.calcPrice(10000); //�޼ҵ� �����Ƿ� calcPrice()�ҷ��Դµ� �� �ҷ������� ����?
		price = vipKim.calcPrice(10000);
		
		vipKim.showVipCustmoetInfo();
		System.out.println("�����ݾ��� : " + price + "��");
		
		Customer customer = (Customer)new VIPCustomer();
		//VIPCustomer vipCustomer = new Customer();
		//customer. �θ�� �ٲ� ���¶� �ڽ��� VIP�� �ִ� ������� �Ⱥ���. �θ���Customer���� ����...
		
		Customer vc = new VIPCustomer();
		price = vc.calcPrice(1000);	//
		System.out.println(price);//�ڽ�calcPrice()�� �۵�.
		
		/*
		 * ��ĳ���õ� customer1�� ������(�������̵�)�� �޼ҵ带 ȣ�� ��, �ڽĸ޼ҵ尡 ȣ��ȴ�.
		 * �ڹٴ� �ν��Ͻ� �������� �Լ� ȣ��ȴ�.(������ ��Ȳ�Ͻ�, ex �������̵�.)==����޼ҵ� ����.
		 */
	}
	
}
