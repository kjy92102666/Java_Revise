package ch01;

public class OutClass {//일반 외부클래스.
	
	private int num = 10;
	private final static int num1 = 10;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//inner클래스는 외부가 생성된 후에 내부가 생성된다.
	public class InClass {//인스턴스 내부클래스
		int inNum = 10;
		//num1=10; 내부에서 접근불가.
		
		public void inTest() { //in클래스는 내부에서만 쓰일 목적을 명시하자
			//static int i=10; //내부클래스에서 선언이 안되는데 스태틱이라고 되겠나?
			System.out.println("Out class num : " + num);
			System.out.println("In class inNum : " + inNum);
		}
	}
	
	
	public void usingInClass() {
		inClass.inTest();
		inClass.inNum = 5;// 내부에서 내부 접근은 가능하다~
	}
	
}
