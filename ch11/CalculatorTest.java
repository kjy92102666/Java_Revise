package ch11;

public class CalculatorTest {
	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();//�Ҿƹ����� �������� �����ذ��
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
		
		((CompleteCalc)calc).showInfo();	//�θ� �ٿ�ĳ����.
	}
}
