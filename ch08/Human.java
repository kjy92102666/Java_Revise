package ch08;

public class Human extends Animal{
	
	public Human() {
		super();//����� ���� �����ڿ��� super()�� �ڵ����� �ٴ´�.
	}
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}
