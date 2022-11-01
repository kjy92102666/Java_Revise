package thread_swing;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread extends Thread{
	private JLabel timeLabel;
	
	public TimerThread (JLabel timeLabel){
		this.timeLabel = timeLabel;
	}

	//Thread는 무한루프.
	public void run() {
		int n =0;
		while(true){
			timeLabel.setText(n+"");
			n++;
			try {
				sleep(1000);	//이미 상속 됐기에 thread.sleep() X
			} catch (InterruptedException e) {
				// Exception최상위 예외처리지만 정확한 오류 파악이 불가.
				return; //Thread가 수행을 하지 않게된다.
			}
			
		}
	}
}

	public class TimerThread2 extends JFrame{
		public TimerThread2() {
			setTitle("타이어 쓰레드");
			setSize(300,170);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());
			
			//컴포넌트 생성
			JLabel timerLabel = new JLabel();
			timerLabel.setFont(new Font("맑은고딕",Font.BOLD, 80));
			
			TimerThread th = new TimerThread(timerLabel);
			th.start();
			//컴포넌트 등록
			add(timerLabel);
			setVisible(true);
		}
	
	
	
	public static void main(String[] args) {
		//메인도 Thread.
		new TimerThread2();

		System.out.println("메인 스레드 문자가 출력을 한다.");
		
		
	}
}

