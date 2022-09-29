package decoEx;

public class Wrap extends Decorator{
	
	
	public Wrap(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}

	public void Execution() {
		System.out.println("Wrap에서 실행합니다.");
		super.Execution();
	}
}
