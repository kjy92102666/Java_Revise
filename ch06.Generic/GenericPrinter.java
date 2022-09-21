package ch06;


public class GenericPrinter<T> { //<T>하면, 컴파일러가 다양한 변수?가 오겠구나~라고 인지함
	
	private T things;
	
	public void setThings(T things) {
		this.things = things;
	}
	
	public T getThings() {
		return things;
	}

	
	@Override
	public String toString() {	//정보를 주고자 할때, 많이 사용~
		return things.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
