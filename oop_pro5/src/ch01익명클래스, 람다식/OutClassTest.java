package ch01;

public class OutClassTest {
	public static void main(String[] args) {
		OutClass oc = new OutClass();

		
		oc.usingInClass();
//		OutClass.InClass inClas = new OutClass.InClass(); 
		//out�� ������ �� inŬ������ �����ؾ���..
		OutClass.InClass inClass = oc.new  InClass();
		inClass.inTest();
		
	}
}
