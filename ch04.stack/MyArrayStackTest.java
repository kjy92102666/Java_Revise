package ch04;

public class MyArrayStackTest {
	public static void main(String[] args) {
		
		MyArrayStack stack = new MyArrayStack();
		stack.push(1);
		stack.push(2);
		
		stack.printShow();
		
		System.out.println(stack.pop());
		System.out.println("==============================");
		stack.printShow();
		
		
		System.out.println(stack.peek());
		System.out.println("==============================");
		stack.printShow();
	}
}
