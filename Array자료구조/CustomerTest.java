package ch02;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomertName("김민");
		customerLee.setCustomerID(10001);
		
		int price = customerLee.calcPrice(10000);
		
		customerLee.showCustomerInfo();
		System.out.println("결제금액은 : " + price + "원");
		
		System.out.println("============================================================");
		
		VIPCustomer vipKim = new VIPCustomer();
		vipKim.setCustomertName("VIP 김민");
		vipKim.setCustomerID(7777);
		//vipKim.calcPrice(10000); //메소드 재정의로 calcPrice()불러왔는데 뭘 불러오는지 기준?
		price = vipKim.calcPrice(10000);
		
		vipKim.showVipCustmoetInfo();
		System.out.println("결제금액은 : " + price + "원");
		
		Customer customer = (Customer)new VIPCustomer();
		//VIPCustomer vipCustomer = new Customer();
		//customer. 부모로 바뀐 상태라 자식인 VIP에 있는 멤버들은 안보임. 부모인Customer꺼만 보임...
		
		Customer vc = new VIPCustomer();
		price = vc.calcPrice(1000);	//
		System.out.println(price);//자식calcPrice()가 작동.
		
		/*
		 * 업캐스팅된 customer1로 재정의(오버라이딩)된 메소드를 호출 시, 자식메소드가 호출된다.
		 * 자바는 인스턴스 기준으로 함수 호출된다.(동일한 상황일시, ex 오버라이딩.)==가상메소드 원리.
		 */
	}
	
}
