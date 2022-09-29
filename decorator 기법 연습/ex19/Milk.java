package ex19;
//Coffee의 Decorator(추가된 클래스)

public class Milk extends Decorator{

	//부모가 이 생성자를 가지고 있기 때문에, 자식도 동일한 생성자를 가져 호출해야함.
	public Milk(Coffee coffee) {
		super(coffee);
	}
	
	//Coffee의 구현메소드 x. 그냥 지혼자 쓰는거
	public void mixing() {
		super.mixing();//부모꺼 호출하겠다!
		System.out.println("added Milk ");
	}
}
