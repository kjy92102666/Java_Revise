package ch03;

public class SuperMan extends Human{
	private int power;
	/*
	public SuperMan() {
		//기본생성자는 super()부모객체를 가리킴. 부모에 기본생성자를 먼저 호출하게끔... 내가 호출은 안했더라도,
		//super();
		super(2);
		power = 1;
		System.out.println("Child Default Constructor ()");
	}
	*/
	public SuperMan(int eyes) {
		super(eyes);
	}

	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	
	
	
}
