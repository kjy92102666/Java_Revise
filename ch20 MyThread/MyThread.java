package ch20;

public class MyThread extends Thread{  
	//Thread�� �������̽�Runable�� implements �ϰ� �ִ�.
	
	public void run() {
		for(int i=0; i<=199; i++) {
			System.out.print(i+" ");
		}
	}
	
}
