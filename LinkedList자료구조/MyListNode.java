package ch03;
public class MyListNode {
	
	private String data;//�길 �ٸ��� �������ҽ��� �״�� �ᵵ �ȴ�.
	public MyListNode next;
	
	public MyListNode(String data) {
		this.data = data;
		this.next = null;
	}
	
	public String getData() {
		return data;
	}
	
}
