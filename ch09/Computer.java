package ch09;

//�߻�Ŭ������ ��ӹ޾Ƽ� ��� �ϴ� ������ ���̵��� ����. interface�� ���� �ٸ���..?
public abstract class Computer {
	abstract void display();
	abstract void typing();

	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	
}
