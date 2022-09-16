package ch03;

public class Human {
	
	int eyes;
	int mouse;
	
	public Human() {
		eyes = 2;
		mouse = 1;
		System.out.println("Parents Default Constructor ()");
	}



	public Human(int eyes) {
		// TODO Auto-generated constructor stub
		this.eyes = eyes;
		System.out.println("Child Default Constructor (int eyes)");
	}



	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getMouse() {
		return mouse;
	}
	public void setMouse(int mouse) {
		this.mouse = mouse;
	}
	
	
	
	
}
