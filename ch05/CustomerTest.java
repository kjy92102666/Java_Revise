package ch05;
import java.util.ArrayList;


public class CustomerTest {
	
	public static void main(String[] args){
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		//Customer customer = new VIPCustomer();
		
		Customer customerLee = new Customer();
		customerLee.setCustomerName("Lee");
		customerLee.setCustomerID(1153023);
		

		Customer customerShin = new Customer();
		customerShin.setCustomerName("Shin");
		customerShin.setCustomerID(5329877);
		//customerShin.setCustomerGrade();
		
		Customer customerPark = new VIPCustomer();
		customerPark.setCustomerName("Park");
		customerPark.setCustomerID(123321);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerPark);
		System.out.println("================== ��������� ==================");
		
		for(Customer customer : customerList) {
			customer.showCustomerInfo();
		}
		
		System.out.println("================== �����км��� ==================");
		System.out.println("============= �������� ���ʽ� ����Ʈ ��� ============");
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);	
			//���� �޼ҵ带 ȣ���� �� ó�� ��������, ������ ����. ������ ��ü(�ν��Ͻ�) �������� �Լ��� ȣ��Ǳ⶧��!!
			
			System.out.println(customer.getCustomerGrade()+" �����" + cost +"�� ���� �ϼ̽��ϴ�.");
			System.out.println(customer.getBonusPoint()+" ���� ���ʽ� ����Ʈ�� " + 
					customer.getBonusPoint()+"P�Դϴ�.");
		}
		
		//�Ķ���� Ÿ���� �ϳ��� ������� �ٸ��� ���;� �Ҷ�.(Overriding �Ǿ� �־�� �Ѵ�.)
	}
}
