package oop_pro3;

public class Book{ // extends Object가 생략되어있다.object는 최상위 클래스니깐.

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {	//자체에 객체를 넣어버리면 직접 호출하지 않아도, 호출된다.
		//toString을 직접 호출하면 메모리가 호출될거다~
		return title+","+author;
	}
	
}
