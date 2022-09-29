package decoEx;

public class Line extends Decorator{

	public Line(Computer computer) {
		//super.Execution();
		super(computer);
	}
	
	public void Execution() {
		super.Execution();
		System.out.println("Line을 실행합니다~");
		
	}
}
