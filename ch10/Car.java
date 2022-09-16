package ch10;

public abstract class Car {
	abstract void drive();
	abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	final public void run() { //public 이지만 final로 선언되어 있기 때문에 자식이 재정의x.
		startCar();
		drive();
		stop();
		turnOff();
		//추상화 클래스로 템플릿(순서)을 정해준 방식.템플릿 메서드 패턴.
	}
}
