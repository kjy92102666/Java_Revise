package ex19;

public class Decorator implements Coffee{
	
	Coffee coffee;
	
	public Decorator(Coffee coffee) {
		this.coffee = coffee;
	}
	
	@Override
	public void mixing() {
		//System.out.println("Decorator Shaking!!!");
		coffee.mixing();
	}
}