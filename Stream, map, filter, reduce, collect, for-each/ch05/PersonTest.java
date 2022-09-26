package ch05;

import java.util.*;

public class PersonTest {
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		list.add(new Person("kim", 10));
		list.add(new Person("lee", 20));
		list.add(new Person("park", 30));
		
		//p==<Person>. 조건식이 하나면 {} 생략가능.
//		list.stream().forEach(p->{
//			if(p.getAge() > 20) {
//				System.out.println(p);
//			}
//		});
		//필터로 바꿔보면,
		list.stream().filter(p->p.getAge() > 20).
		forEach(p->System.out.println(p));
		
		//나이만 찍고싶을때,
		list.stream().filter(p->p.getAge() > 20).
		map(p->p.getAge()).forEach(p->System.out.println(p));
		
	}
}
