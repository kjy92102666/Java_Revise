package ex19;

//#19데코레이터 패턴을 활용한 커피머신프로그램
public class CoffeeTest {
	public static void main(String[] args) {
		Coffee coffee = new EdiaCoffee();
		coffee.mixing();
		System.out.println();
		
		Milk milk = new Milk(new EdiaCoffee()); //기반클래스를 Milk로 감싸놓음
		milk.mixing();
		System.out.println();
		
		MochaSyrup mocha = new MochaSyrup(new Milk(new EdiaCoffee()));
		mocha.mixing();
		
		//새로운 기반클래스
		Coffee myCoffee = new MyCoffee();
		Milk milk2 = new Milk(myCoffee);
		milk2.mixing();
	}
}
