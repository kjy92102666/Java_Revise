package ex1;

import java.util.*;
import java.util.stream.Collectors;

public class ReduceT {
	public static void main(String[] args) {
		Person lee = new Person("lee", 10);
		Person park= new Person("park", 20);
		Person kim  = new Person("kim ", 30);
		
		List<Person> list = Arrays.asList(lee,park,kim);
		Person user = list.stream().reduce((p1, p2)->{
			lee.getAge();
			if(p1.getAge()>p2.getAge())return p1;
			else return p2;
		}).get();
		
		System.out.println(user);
		
		list.stream().map(p->p.getAge()).filter(p->p>10).forEach(p->System.out.println(p));

		System.out.println("----------------------------------------------");
		
		List<Person> tmpList = list.stream()
				.filter(p->p.getAge()>10)
				.collect(Collectors.toList());
		
		tmpList.stream().forEach(p->System.out.println(p));
		
		
	}
}
