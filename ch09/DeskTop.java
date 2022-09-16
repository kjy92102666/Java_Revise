package ch09;

public class DeskTop extends Computer {

	@Override
	void display() {
		//suepr()가 못붙는다. 추.클에 추.메는 구현부가 없기때문에. super()는 new.
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
