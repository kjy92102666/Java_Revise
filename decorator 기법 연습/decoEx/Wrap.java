package decoEx;

public class Wrap extends Decorator{
	
	
	public Wrap(Computer computer) {
		super(computer);
		// TODO Auto-generated constructor stub
	}

	public void Execution() {
		System.out.println("Wrap���� �����մϴ�.");
		super.Execution();
	}
}
