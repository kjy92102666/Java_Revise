package ch21;

public class MyJoin extends Thread{ //==implements Runnable.
	
	private int start = 0;
	private int end = 0;
	private int sum;
	
	public MyJoin(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
		for(int i=start; i<=end; i++) {
			sum += i;
		}
	}

	//�α׸� ��� ���ؼ� sum get. ó���� ���� �Լ��̹Ƿ� �͸�Ŭ�������� ������ Ŭ������ �������.
	public int getSum() {
		return sum;
	}
	
	
}
