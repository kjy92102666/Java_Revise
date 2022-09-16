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
		System.out.println("================== 고객정보출력 ==================");
		
		for(Customer customer : customerList) {
			customer.showCustomerInfo();
		}
		
		System.out.println("================== 구구분분선선 ==================");
		System.out.println("============= 할인율과 보너스 포인트 계산 ============");
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);	
			//같은 메소드를 호출한 것 처럼 보이지만, 동작은 각각. 생성된 객체(인스턴스) 기준으로 함수가 호출되기때문!!
			
			System.out.println(customer.getCustomerGrade()+" 등급은" + cost +"원 지급 하셨습니다.");
			System.out.println(customer.getBonusPoint()+" 현재 보너스 포인트는 " + 
					customer.getBonusPoint()+"P입니다.");
		}
		
		//파라미터 타입은 하난데 결과값은 다르게 나와야 할때.(Overriding 되어 있어야 한다.)
	}
}
