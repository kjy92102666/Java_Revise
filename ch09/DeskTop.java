package ch09;

public class DeskTop extends Computer {

	@Override
	void display() {
		//suepr()�� ���ٴ´�. ��.Ŭ�� ��.�޴� �����ΰ� ���⶧����. super()�� new.
		System.out.println("Deskop Display...");
	}

	@Override
	void typing() {
		System.out.println("Deskop Typing...");
	}

	@Override
	public void turnOn() {
		System.out.println("Deskop turn off...");
		//super.turnOn();
	}

	
}
