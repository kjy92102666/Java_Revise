package ch21;

public class PriorityThread extends Thread{
	
	public void run() {
		int sum = 0;
		Thread t=  Thread.currentThread();	//본인 쓰레드.
		System.out.println(t + "start ");
		
		for(int i=0; i<=1_000_000; i++) {
			sum += i;
		}
		
		System.out.println("sum  : [" + sum + "] Priority : " + t.getPriority()+" end");
	}
}
