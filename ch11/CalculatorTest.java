package ch11;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();//할아버지가 손자한테 물려준경우
		int num1 = 10;
		int num2 = 2;
		
		int result = calc.add(num1, num2);
		System.out.println(result);
		result = calc.sub(num1, num2);
		System.out.println(result);
		result = calc.mul(num1, num2);
		System.out.println(result);
		result = calc.div(num1, num2);
		System.out.println(result);
		
//		if(calc instanceof CompleteCalc) {
//			CompleteCalc Cc = (CompleteCalc)calc;
//			Cc.showInfo();
//		}
		
		((CompleteCalc)calc).showInfo();	//부모를 다운캐스팅.
	}
}
