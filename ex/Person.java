package oop_pro3.ex;
//객체 생성하는 방법. 1.new 2.db드라이브 로드할때쓰이는 ...

public class Person {
	//자기 멤버를 private으로 쓰는 경우는 잘 없... 객체 기본요소들생성.
	private String name;
	private int age;
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + ", " + age;
	}
	
	
	
}
