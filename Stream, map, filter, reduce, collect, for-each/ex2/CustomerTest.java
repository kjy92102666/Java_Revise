package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerTest {
	public static void main(String[] args) {
		
		Customer CustomerLee = new Customer("ÀÌ¼ø½Å",40);
		Customer CustomerKim = new Customer("±èÀ¯½Å",20);
		Customer CustomerHong = new Customer("È«±æµ¿",13);
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(CustomerLee);
		customerList.add(CustomerKim);
		customerList.add(CustomerHong);
//		
//		for(Customer c: customerList) {
//			System.out.println(c.getName());
//		}
//		
//		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
//		
//		List<String> listStr = customerList.stream()
//				.map(c->getName())
//				.collect(Collectors.toList());
//		listStr.stream().forEach(s->System.out.println(s));
//		

		
		
		int sum=0;
		for (Customer c:customerList) {
			sum += c.getCost();
		}
		System.out.println(sum);

		int total = customerList.stream()
				.mapToInt(c->c.getCost())
				.sum();
		System.out.println(total);
		
		int total1 = customerList.stream()
				.map(c->c.getCost())
				.reduce(0, (x,y)-> x+y);
		System.out.println(total1);
		
		
		customerList.stream().filter(c->c.getAge()>=20)
				.map(c->c.getName())
				.sorted()
				.forEach(c->System.out.println(c));
		
		
		List<Customer> tmpList = customerList.stream()
				.filter(c->c.getAge()>=20)
				.collect(Collectors.toList());
		tmpList.forEach(c->System.out.println(c));
		
	}
}
