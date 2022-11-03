package Sync;

public class SharedBoard {
	
	private int sum =0;		//집계판의 합
	
	synchronized public void add() {
		//public void add() {
		int n = sum;
		Thread.yield();		//현재 실행 중인 스레드 양보
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this) {	//mutex상호 배제할 객체.
			n += 10;			//10
		}
		
		sum = n;			//증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() + ":" + sum);
		
	}
	
	public int getSum() { return sum;}
}
