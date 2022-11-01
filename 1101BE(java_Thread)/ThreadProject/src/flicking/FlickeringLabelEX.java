package flicking;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FlickeringLabel extends JLabel implements Runnable{
	private long delay;  		// 배경색이 바뀌는 지연 시간. 밀리초 단위
	
	// FlickeringLabel(text, ) 
	public FlickeringLabel(String text, long delay) {
		super(text); 			// JLabel 생성자 호출
		this.delay = delay;
		setOpaque(true); 		// 배경색 변경이 가능하도록 설정

		Thread th = new Thread(this);	//this로 가리키면서 처리하는방법도 있.
		th.start();
	}
	
	@Override
	public void run() { 
		//ll
		int n=0;
		while(true) { 
			if(n == 0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if(n == 0) n = 1;		//토글버튼을 위한 0,1 왔다갔
			else n = 0;
			try {
				Thread.sleep(delay); // delay 밀리초 동안 잠을 잔다.
			}
			catch(InterruptedException e) {
				return; 
			}
		}
	}
}

public class FlickeringLabelEX extends JFrame {
	
	public FlickeringLabelEX() {
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
	
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜박", 500); // 500밀리초 주기로 배경색 변경

		// 깜박이지 않는 레이블 생성
		JLabel label = new JLabel("안깜박");
		
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박", 300); // 300밀리초 주기로 배경색 변경

		add(fLabel);
		add(label);
		add(fLabel2);
	
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEX();
	}
}


