package ch06;
import java.util.ArrayList;



public class CustomerTest {
	public static void main(String[] args) {
		ArrayList <Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer();
		customerL.setCustomerID(1153023);
		customerL.setCustomerName("Lee");
//		customerL.calcPrice(10000);
//		customerL.showCustmoer();
//		System.out.println("�ݾ��� " + customerL.calcPrice(10000));
		
		Customer customerK = new GOLDCustomer();
		customerK.setCustomerID(5329877);
		customerK.setCustomerName("Kim");
//		customerK.calcPrice(10000);
//		customerK.showCustmoer();
//		System.out.println("�ݾ��� " + customerK.calcPrice(10000));
		
		//VIPCustomer customerP = new VIPCustomer();//��ĳ���� �����༭ ����.
		Customer customerP = new VIPCustomer();
		customerP.setCustomerID(3927311);
		customerP.setCustomerName("Park");
//		customerP.calcPrice(10000);
//		customerP.showCustmoer();
//		System.out.println("�ݾ��� " + customerP.calcPrice(10000));
		
		
		customerList.add(customerL);
		//customerList.add(customerK);��ĳ���� �����༭ ����.
		customerList.add(customerK);
		customerList.add(customerP);
		
		System.out.println("====================== ��������� ======================");
		
		for(Customer customer : customerList) {
			customer.calcPrice(10000);
			customer.showCustmoer();
		}
		

		
		
	}
}
