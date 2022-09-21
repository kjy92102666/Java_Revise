package ch04;
import ch02.MyArray;

public class MyArrayStack {
	
	private int top;			//최상위, 제일 먼저 빠질요소
	private MyArray arrayStack;	//스택은 배열을 다룬다.
	
	public MyArrayStack() {
		top = 0;
		arrayStack = new MyArray(10);	//초기 값 10.
	}
	
	public void push(int data) { //
		arrayStack.addElement(data);
		top++;
	}
	
	public int pop() {	//값도 뺴오고 삭제까지.
		return arrayStack.removeElement(--top);	
		//top이 push되면 1이 되니 전위연산으로 -- 해줘서 0으로만들어준다. 0부터 시작해야하니까~
		
	}
	
	public int peek() {	//값을 빼오지만 삭제를 하진 않는 함수.
		return arrayStack.getElement(top-1);	//top은 여전히 1.
	}
	
	public int getSize() {
		return top;
	}
	
	
	
	public void printShow() {
		arrayStack.printAll();
		
	}
	
	
}
