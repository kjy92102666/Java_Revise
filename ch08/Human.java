package ch08;

public class Human extends Animal{
	
	public Human() {
		super();//상속을 받은 생성자에는 super()가 자동으로 붙는다.
	}
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
