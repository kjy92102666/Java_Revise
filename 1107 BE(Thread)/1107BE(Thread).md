public class TabAndThread extends JFrame{
   MyLabel bar = new MyLabel(100);
   public TabAndThread() {
      // 윈도우 초기설정
      setTitle("생산자 소비자 쓰레드");
      setSize(350,200);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setLayout(null);
      bar.setBackground(Color.orange);
      bar.setOpaque(true);
      bar.setLocation(20,50);
      bar.setSize(300,20);
      
      // 컴포넌트 등록
      c.add(bar);
      c.addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
            System.out.println("pressed!!");
            bar.fill();
         }
      });
      
      
      // 윈도우 활성화
      setVisible(true);
      c.setFocusable(true);
      c.requestFocus();
      ConsumerThread th = new ConsumerThread(bar);
      th.start();
      
   }
   
   
   
   
   
   
   public static void main(String[] args) {
      new TabAndThread();
   }
}












package TabAndThreadEx;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TabAndThreadEx extends JFrame{
	
	public TabAndThreadEx() {
		MyLabel bar = new MyLabel(100);	//직접 지정하지 않고 외부클래스 생성.
		Container c = getContentPane();
		
		//윈도우 초기 설정
		setTitle("생산자 소비자 스레드");
		setSize(350,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//메모리 종료. 완전한종료
		c.setLayout(null);
		
		
		
		bar.setBackground(Color.orange);
		bar.setOpaque(true);//투명도?
		bar.setLocation(20, 50);
		bar.setSize(300, 20);
		
		
		//컴포넌트 생성
		JLabel label = new JLabel("레이블");
		
		
		//컴포넌트 등록
		c.add(bar);
		c.addKeyListener(new KeyAdapter() {
			public void keypressed(KeyEvent e) {
				System.out.println("pressed!!");
				bar.fill();
			}
		});
		
		setSize(350,200); 
		setVisible(true);
 
		
		c.setFocusable(true);
		c.requestFocus();
		setResizable(false);
		ConsumerThread th = new ConsumerThread(bar);
		th.start();
	}
	
	
	public static void main(String[] args) {
		//
		new TabAndThreadEx();
	}

}
