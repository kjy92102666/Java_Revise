package ch20;

public class MyThread2 implements Runnable{	
	//Thread가 Runnable을 implements하기 때문에, 오버라이딩 가능!

	@Override
	public void run() {
		int i;
		for(i=0; i<=199; i++) {
			System.out.println(i+" ");
		}
	}
	
}
