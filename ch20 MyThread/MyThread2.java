package ch20;

public class MyThread2 implements Runnable{	
	//Thread�� Runnable�� implements�ϱ� ������, �������̵� ����!

	@Override
	public void run() {
		int i;
		for(i=0; i<=199; i++) {
			System.out.println(i+" ");
		}
	}
	
}
