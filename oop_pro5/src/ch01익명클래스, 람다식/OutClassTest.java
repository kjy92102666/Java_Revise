package ch01;

public class OutClassTest {
	public static void main(String[] args) {
		OutClass oc = new OutClass();

		
		oc.usingInClass();
//		OutClass.InClass inClas = new OutClass.InClass(); 
		//out이 생성된 후 in클래스를 생성해야함..
		OutClass.InClass inClass = oc.new  InClass();
		inClass.inTest();
		
	}
}
