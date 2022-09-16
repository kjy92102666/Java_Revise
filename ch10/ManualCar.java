package ch10;

public class ManualCar extends Car{
	
	@Override
	void drive() {
		System.out.println("사람이 운전합니다.");
	}
	
	@Override
	void stop() {
		System.out.println("브레이크를 밟아서 멈춥니다.");
	}
}
