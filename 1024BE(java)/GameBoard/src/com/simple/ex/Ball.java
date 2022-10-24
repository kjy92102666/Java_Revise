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
	
	
	// 추가할 객체가 하나 더 있다.
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
			if(x+xspeed < 0)	//첫번쨰 경계체크
				xspeed = 1;
			
			//공크기 반영 -2, Radious공의 직경.
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
				xspeed = -xspeed;	//-는 진행방향. 충돌시 반대방향으로 가도록...
			}
			
		}

		private boolean collision() {	//라켓과 공의 충돌
			return game.racquet1.getBounds().intersects(getBounds())
					|| game.racquet2.getBounds().intersects(getBounds());
		} 
		// 라켓의 getBounds   , 공의 getBounds
		
		public void draw(Graphics2D g) {
			g.setColor(color);
			g.fillOval(x, y, 2 * RADIUS, 2 * RADIUS);
		}
	
		public Rectangle getBounds() {	//자바에서 지원하는 클래스를 쓴거.
			return new Rectangle(x, y, 2 * RADIUS, 2 * RADIUS);
		}
	
}
