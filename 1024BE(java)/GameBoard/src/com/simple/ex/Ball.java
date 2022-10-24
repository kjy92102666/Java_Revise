package com.simple.ex;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.Random;

public class Ball {
	private static final int RADIUS = 20;
	int x=0;
	int y=0;
	int xspeed = 1;
	int yspeed = 1;
	Color color;
	
	Random randomNum1 = new Random();
	
	
	// �߰��� ��ü�� �ϳ� �� �ִ�.
	private GameBoard game;
	
		public Ball(GameBoard game, Color color, int x) {
			//
			this.game = game;
			this.color = color;
			this.x = x;
			
		}
		
		public Ball(GameBoard game, Color color) {
			//
			this.game = game;
			this.color = color;
			
		}
	
		public void move() {
			if(x+xspeed < 0)	//ù���� ���üũ
				xspeed = 1;
			
			//��ũ�� �ݿ� -2, Radious���� ����.
			if(x + xspeed < 0) 
				yspeed = 1;
			if(x+xspeed > game.getWidth() -2 * RADIUS) 
				xspeed = -1;
			if(y + yspeed < 0) 
				yspeed = 1;
			if(y + yspeed > game.getHeight() -2 * RADIUS)
				yspeed = -1;
			
//			randomNum1.setSeed(System.currentTimeMillis());
//		    int ran = randomNum1.nextInt(200) + 1;
			
			x = x + xspeed;
			
			y = y + yspeed;
		    
			
			
			if(collision()) {
				xspeed = -xspeed;	//-�� �������. �浹�� �ݴ�������� ������...
			}
			
		}

		private boolean collision() {	//���ϰ� ���� �浹
			return game.racquet1.getBounds().intersects(getBounds())
					|| game.racquet2.getBounds().intersects(getBounds());
		} 
		// ������ getBounds   , ���� getBounds
		
		public void draw(Graphics2D g) {
			g.setColor(color);
			g.fillOval(x, y, 2 * RADIUS, 2 * RADIUS);
		}
	
		public Rectangle getBounds() {	//�ڹٿ��� �����ϴ� Ŭ������ ����.
			return new Rectangle(x, y, 2 * RADIUS, 2 * RADIUS);
		}
	
}
