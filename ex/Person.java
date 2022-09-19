package oop_pro3.ex;
//��ü �����ϴ� ���. 1.new 2.db����̺� �ε��Ҷ����̴� ...

public class Person {
	//�ڱ� ����� private���� ���� ���� �� ��... ��ü �⺻��ҵ����.
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
