package ch20;

public class MyThread2Test {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread2 mt2 = new MyThread2();
		Thread th1 = new Thread(mt2);
		th1.start();
		
		Thread mt22 = new Thread(new MyThread2());
		mt22.start(); 
		
		//�͸� Ŭ���� . �߻�ȭ�޼ҵ� �ϳ��ۿ� ���³��� �Լ��ȿ��� ���ʿ����, ������Ű�� ����ϴ� ����.
		Runnable runnable = new Runnable() {
			public void run() {
				System.out.println("runnable �͸��Լ�");
			}
		};	
		runnable.run();
		
		Runnable runnable2 = ()-> System.out.println("runnable �͸��Լ�");
		runnable2.run();
		
		
		System.out.println(Thread.currentThread() + "end! ");
	}
}
