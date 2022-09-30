package ch20;

public class MyThread extends Thread{  
	//Thread는 인터페이스Runable을 implements 하고 있다.
	
	public void run() {
		for(int i=0; i<=199; i++) {
			System.out.print(i+" ");
		}
	}
	
}
