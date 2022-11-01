package thread;

import javax.swing.JLabel;

public class TimerThread extends Thread{

	int n =0;

	//Thread는 무한루프.
	public void run() {
		while(true){
			//timeLabel.setText(n+"");
			n++;
			try {
				sleep(1000);	//이미 상속 됐기에 thread.sleep() X
			} catch (InterruptedException e) {
				// Exception최상위 예외처리지만 정확한 오류 파악이 불가.
				return; //Thread가 수행을 하지 않게된다.
			}
			
		}
	}

	public static void main(String[] args) {
		//메인도 Thread.
		TimerThread th = new TimerThread();
		th.start(); //다른 Thread실행.
		System.out.println("메인 스레드 실행;");
		
		
		
	}

}
