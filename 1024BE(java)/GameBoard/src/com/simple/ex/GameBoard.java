package com.simple.ex;

//오락실탁구게임.
/*
 * 보드객체2개, 라켓객체 2개, 공객체 1개
 * 
 * */

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;

	import javax.swing.JFrame;
	import javax.swing.JPanel;

	public class GameBoard extends JPanel implements KeyListener {
		Ball ball;
		//Ball ball1;
		Racquet racquet1;
		Racquet racquet2;
		

		public GameBoard() {
			ball = new Ball(this, Color.red);
			//ball1 = new Ball(this,Color.CYAN);
			this.setBackground(Color.green);
			racquet1 = new Racquet(this, 10, 150, Color.blue);		//왼쪽라켓
			racquet2 = new Racquet(this, 560, 150, Color.yellow);	//오른라켓
			setFocusable(true);
			addKeyListener(this);
		}

		@Override
		public void keyTyped(KeyEvent e) {
		}

		@Override
		public void keyReleased(KeyEvent e) {
			racquet1.keyReleased(e);	//keyReleased를 매개변수 e와 함께 racquet1로 전달.
			racquet2.keyReleased(e);
		}

		@Override
		public void keyPressed(KeyEvent e) {
			racquet1.keyPressed(e);
			racquet2.keyPressed(e);
		}

		//각 객체를 move함.
		private void move() {
			ball.move();
			//ball1.move();
			racquet1.move();
			racquet2.move();
		}
		
		
		//여기서 라켓2개를 다 그린다. 공도
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			ball.draw(g2d);
			racquet1.draw(g2d);
			racquet2.draw(g2d);
		}

		public static void main(String[] args) {

			JFrame frame = new JFrame("Pong Game");
			frame.setSize(600, 400);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			GameBoard game = new GameBoard();
			frame.add(game);
			frame.setResizable(false);
			frame.setVisible(true);

			while (true) {
				game.move();
				game.repaint();
				try {
					Thread.sleep(5);		//잠깐 cpu가 쉰다~
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

}
