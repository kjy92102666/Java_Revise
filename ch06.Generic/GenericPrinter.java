package ch06;


public class GenericPrinter<T> { //<T>�ϸ�, �����Ϸ��� �پ��� ����?�� ���ڱ���~��� ������
	
	private T things;
	
	public void setThings(T things) {
		this.things = things;
	}
	
	public T getThings() {
		return things;
	}

	
	@Override
	public String toString() {	//������ �ְ��� �Ҷ�, ���� ���~
		return things.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
