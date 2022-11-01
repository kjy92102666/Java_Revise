package runable_thread_swing;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread implements Runnable{ //인터페이스 이름이 Runnable일뿐. 구현해줘야한다.
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
				Thread.sleep(1000); // 1000/1000초. 스케쥴링 데이터, 정확한 1초는 아니다.
				//sleep(1000);	Runnable에는 sleep이 없기에 사용x
			} catch (InterruptedException e) {
				// Exception최상위 예외처리지만 정확한 오류 파악이 불가.
				return; //Thread가 수행을 하지 않게된다.
			}
			
		}
	}
}

	public class TimerThreadMain extends JFrame{
		public TimerThreadMain() {
			setTitle("Runnable 타이머 쓰레드");
			setSize(300,170);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());
			
			//컴포넌트 생성
			JLabel timerLabel = new JLabel();
			timerLabel.setFont(new Font("맑은고딕",Font.BOLD, 80));
			
			//TimerThread th = new TimerThread(timerLabel);
			TimerThread runable = new TimerThread(timerLabel);
			Thread th = new Thread(runable);	//th는 참조링크를 갖고 있을뿐!
			th.start();
			
			//컴포넌트 등록
			add(timerLabel);
			setVisible(true);
		}
	
	
	
	public static void main(String[] args) {
		//메인도 Thread.
		new TimerThreadMain();

		System.out.println("메인 Runnable 스레드 문자가 출력을 한다.");
		
		
	}
}

