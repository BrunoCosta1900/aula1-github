package com.bgstudios.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.bgstudios.main.Game;
import com.bgstudios.world.Camera;
import com.bgstudios.world.World;

public class BulletShoot extends Entity {

	private double dx;
	private double dy;
	private double spd = 4;

	public boolean right, up, left, down;
	public int right_dir = 0, left_dir = 1;
	public int dir = right_dir;

	private int life = 30, curLife = 0;

	public BulletShoot(int x, int y, int width, int height, BufferedImage sprite, double dx, double dy) {
		super(x, y, width, height, sprite);

		this.dx = dx;
		this.dy = dy;

	}

	public void tick() {
		x += dx * spd;
		y += dy * spd;
		curLife++;
		if (curLife == life) {
			Game.bullets.remove(this);
			return;
		}
	}

	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	public void render(Graphics g) {

		if (dx < 0) {
			g.drawImage(BulletShoot_LEFT, this.getX() - Camera.x, this.getY() - Camera.y, null);
		} else {
			g.drawImage(BulletShoot_RIGHT, this.getX() - Camera.x, this.getY() - Camera.y, null);
		}

		// g.fillOval(this.getX() - Camera.x, this.getY() - Camera.y, 3, 3);

	}
}
