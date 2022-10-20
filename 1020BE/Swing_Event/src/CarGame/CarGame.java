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

class Mypanel extends JPanel{ //�г��� �������� jframe�� �����Ѵ�. ==.�г��� �� ���� �ʿ��ϴ�~.
	//������� ���� �гε�� ������ �����۾�����.
	BufferedImage img = null; //����. �ӽú���(��񾲰� ����� �� ��). ���⼭�� �̹���.
	int img_x = 100; //���� ����
	int img_y = 100; //���.
	
	public Mypanel() {
		try {
			img = ImageIO.read(new File("car.gif"));
		}catch(IOException e) {
			System.out.println("no image");
			System.exit(1);//�ܼ� ��� �� �����ϰ� �״´�?
		}
		
		addKeyListener(new KeyListener() {//addACtion... �� �ƴ϶� key���� �޾� �۵��ϴ� �Լ�
			
			@Override//������ �ݵ�� ���� �߻�
			public void keyTyped(KeyEvent e) { }
			
			@Override//������ ���� �߻�.
			public void keyReleased(KeyEvent e) { }
			
			@Override
			public void keyPressed(KeyEvent e) {
				//���� �����߻�. �������� �߻�. ����Ű�� ������, ����Ű�� ����Ű ������� ������ ���ؾ���.
				int keycode = e.getKeyCode();//���� ���������� �˾Ƴ���
				switch(keycode) {
				case KeyEvent.VK_UP:	
					if(img_y >= 10) {
						img_y -= 10;
					}else {
						img_y += 10;//�浹��, ƨ�ܳ����� ȿ��?
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
				//�̵��ϰ� �� ��ġ�� �׷��شٴ� ����.
				}
				//�̵��� ��ǥ���� �ڵ��� �ٽ� �׸���
//				System.out.println("x : " + img_x);
//				System.out.println("y : " + img_y);
				repaint();
			}
			
		});
		//Ű���尡 �ڵ����� ������� �ʱ⿡ �������ִ� �۾��� �������...
		//�гο��� Ű���� �̺�Ʈ�� ����ǵ��� ����.
		this.requestFocus();
		this.setFocusable(true);
		
	}
	//�г� �ȿ� �޼ҵ�
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);//��ġ �ٲٰ� �̹����� �ٽ� �׸���.
	}
	
	
}


public class CarGame extends JFrame{
	public CarGame() {
		//��ü ����
		
		//������ �ʱ�ȭ
		this.setTitle("�ڵ��� ����");
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//��Ȯ�ϰ� �����ư����� ����. ȭ�鿡�� ��������� �޸𸮿��� �������x
		
		//������Ʈ ����
		add(new Mypanel()); //JFrame�� ����� container. ���� ��Ƴ��� ����.
		
		//������Ʈ ���
		
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new CarGame();
	}
}
