package decoEx;

public class Decorator implements Computer{
	
	Computer computer;
	
	public Decorator(Computer computer) {
		this.computer = computer;
	}

	@Override
	public void Execution() {
		System.out.println("Decorator을 실행합니다~");
		computer.Execution();
	}

}
