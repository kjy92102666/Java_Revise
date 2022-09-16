package ch10;

public abstract class Car {
	abstract void drive();
	abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	final public void run() { //public ������ final�� ����Ǿ� �ֱ� ������ �ڽ��� ������x.
		startCar();
		drive();
		stop();
		turnOff();
		//�߻�ȭ Ŭ������ ���ø�(����)�� ������ ���.���ø� �޼��� ����.
	}
}
