package ch10;

public class AICar extends Car{
	
	@Override
	void drive() {
		System.out.println("���� ���� �մϴ�.");
		System.out.println("������ ������ �ٲߴϴ�.");
	}
	
	@Override
	void stop() {
		System.out.println("������ ����ϴ�.");
	}
	
}
