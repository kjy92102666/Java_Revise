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
//		System.out.println("금액은 " + customerL.calcPrice(10000));
		
		Customer customerK = new GOLDCustomer();
		customerK.setCustomerID(5329877);
		customerK.setCustomerName("Kim");
//		customerK.calcPrice(10000);
//		customerK.showCustmoer();
//		System.out.println("금액은 " + customerK.calcPrice(10000));
		
		//VIPCustomer customerP = new VIPCustomer();//업캐스팅 안해줘서 오류.
		Customer customerP = new VIPCustomer();
		customerP.setCustomerID(3927311);
		customerP.setCustomerName("Park");
//		customerP.calcPrice(10000);
//		customerP.showCustmoer();
//		System.out.println("금액은 " + customerP.calcPrice(10000));
		
		
		customerList.add(customerL);
		//customerList.add(customerK);업캐스팅 안해줘서 오류.
		customerList.add(customerK);
		customerList.add(customerP);
		
		System.out.println("====================== 고객정보출력 ======================");
		
		for(Customer customer : customerList) {
			customer.calcPrice(10000);
			customer.showCustmoer();
		}
		

		
		
	}
}
