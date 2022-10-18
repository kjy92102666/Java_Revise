package CarGame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Mypanel extends JPanel{ //패널은 언젠가는 jframe에 들어가야한다. ==.패널을 달 벽이 필요하다~.
	//여러명과 여러 패널들로 나눠서 팀별작업가능.
	BufferedImage img = null; //버퍼. 임시보관(잠깐쓰고 사라질 수 있). 여기서는 이미지.
	int img_x = 100; //시작 지점
	int img_y = 100; //잡기.
	
	public Mypanel() {
		try {
			img = ImageIO.read(new File("car.gif"));
		}catch(IOException e) {
			System.out.println("no image");
			System.exit(1);//콘솔 출력 후 강력하게 죽는다?
		}
		
		addKeyListener(new KeyListener() {//addACtion... 이 아니라 key값을 받아 작동하는 함수
			
			@Override//눌렀다 반드시 떼야 발생
			public void keyTyped(KeyEvent e) { }
			
			@Override//눌렀다 뗄때 발생.
			public void keyReleased(KeyEvent e) { }
			
			@Override
			public void keyPressed(KeyEvent e) {
				//가장 먼저발생. 눌렀을때 발생. 방향키를 쓸건지, 문자키를 방향키 대신으로 쓸건지 정해야함.
				int keycode = e.getKeyCode();//뭐가 눌려졌는지 알아낸다
				switch(keycode) {
				case KeyEvent.VK_UP:	
					if(img_y >= 10) {
						img_y -= 10;
					}else {
						img_y += 10;//충돌시, 튕겨나오는 효과?
					}
					break;
				case KeyEvent.VK_DOWN:
					//(img_y <= 10 )? img_y += 10 : img_y -= 10;
					if(img_y<220) {
						img_y +=10;
					}else {
						img_y -=10;
					}
					break;
				case KeyEvent.VK_LEFT:
					if(img_x>=10) {
						img_x -= 10;
					}else {
						img_x += 10;
					}
					break;
				case KeyEvent.VK_RIGHT:
					if(img_x<220) {
						img_x += 10;
					}else {
						img_x -= 10;
					}
					break;
				case KeyEvent.VK_SPACE:
					if(img_x<225) {
						img_x += 10;
						img_y += 10;
					}else {
						img_x -= 10;
						img_y -= 10;
					}
				//이동하고 그 위치를 그려준다는 느낌.
				}
				//이동한 좌표에서 자동차 다시 그리기
//				System.out.println("x : " + img_x);
//				System.out.println("y : " + img_y);
				repaint();
			}
			
		});
		//키보드가 자동으로 연결되지 않기에 연결해주는 작업을 해줘야함...
		//패널에서 키보드 이벤트가 적용되도록 설정.
		this.requestFocus();
		this.setFocusable(true);
		
	}
	//패널 안에 메소드
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);//위치 바꾸고 이미지를 다시 그린다.
	}
	
	
}


public class CarGame extends JFrame{
	public CarGame() {
		//객체 생성
		
		//윈도우 초기화
		this.setTitle("자동차 게임");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//정확하게 종료버튼기능을 적용. 화면에선 사라지지만 메모리에선 사라지지x
		
		//컴포넌트 생성
		add(new Mypanel()); //JFrame과 비슷한 container. 뭔가 담아놓는 공간.
		
		//컴포넌트 등록
		
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CarGame();
	}
}
