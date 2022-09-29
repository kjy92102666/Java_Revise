package ex19;

public class MochaSyrup extends Decorator{

	public MochaSyrup(Coffee coffee) {
		super(coffee);
	}
	
	public void mixing() {
		super.mixing();
		System.out.println("added Mocha");
	}
}

