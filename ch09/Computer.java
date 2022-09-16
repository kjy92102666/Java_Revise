package ch09;

//추상클래스는 상속받아서 써야 하는 일종의 가이드라고 생각. interface랑 뭐가 다르지..?
public abstract class Computer {
	abstract void display();
	abstract void typing();

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	
}
