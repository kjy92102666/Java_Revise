package ch03;
public class MyListNode {
	
	private String data;//얘만 다르고 나머지소스는 그대로 써도 된다.
	public MyListNode next;
	
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public String getData() {
		return data;
	}
	
}
