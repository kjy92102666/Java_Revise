package oop_pro3;

public class Book{ // extends Object�� �����Ǿ��ִ�.object�� �ֻ��� Ŭ�����ϱ�.

	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {	//��ü�� ��ü�� �־������ ���� ȣ������ �ʾƵ�, ȣ��ȴ�.
		//toString�� ���� ȣ���ϸ� �޸𸮰� ȣ��ɰŴ�~
		return title+","+author;
	}
	
}
