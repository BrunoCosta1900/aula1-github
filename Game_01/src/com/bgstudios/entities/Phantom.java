package com.bgstudios.entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.bgstudios.main.Game;
import com.bgstudios.world.Camera;
import com.bgstudios.world.World;

public class Phantom extends Entity{
	
	private double speed = 0.3;
	
private int maskx = 8, masky = 8, maskw = 5, maskh = 5;
	
	private int frames = 0, maxFrames = 7, index = 0, maxIndex = 1;
	
	private BufferedImage [] sprites;
	
	private boolean isDamaged = false;
	private int damageFrames = 10, damageCurrent = 0;
	
	private int life = 300;
	

	public Phantom(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, null);
		sprites = new BufferedImage[1];
		sprites[0] = Game.spritesheet.getSprite(7*16, 16, 16, 16);
	}

	
	public void tick() {
		if(Game.rand.nextInt(100) < 70) {
		
	/*
		maskx = 8; 
		masky = 8;
		maskw = 3;
		maskh = 3;
	*/
		
		if(isColiddingWithPlayer() == false) {
		if((int)x < Game.player.getX() && !isColidding((int)(x+speed), this.getY())) {
			
			x+=speed;
		}
		else if((int)x > Game.player.getX() && !isColidding((int)(x-speed), this.getY())) {
			x-=speed;
		}
	
	
		if((int)y < Game.player.getY() && !isColidding(this.getX(), (int)(y+speed))) {
			y+=speed;
	}
		else if ((int)y > Game.player.getY() && !isColidding(this.getX(), (int)(y-speed))) {
			y-=speed;
			
			}
			}else {
				//Estamos colidindo
				if(Game.rand.nextInt(100) < 90) {
					Game.player.life -= Game.rand.nextInt(3);
					Game.player.isDamaged = true;
					if(Game.player.life <= 0) {
						//Game Over!
						//System.exit(1);
					}
					System.out.println("Vida: " + Game.player.life);
				}
			}
		
		}
		collidingBullet();
		
		if(life <=0) {
			destroySelf();
			return;
		}
		
		if(isDamaged) {
			this.damageCurrent++;
			if(this.damageCurrent == this.damageFrames) {
				this.damageCurrent = 0;
				this.isDamaged = false;
				
			}
		}
		
		
	}
	
	public void destroySelf() {
		Game.phantom.remove(this);
		Game.entities.remove(this);
	}
	
	public void collidingBullet() {
		for(int i = 0; i < Game.bullets.size(); i++) {
			Entity e = Game.bullets.get(i);
			if(e instanceof BulletShoot) {
				if(Bullet.isColidding(this,e)) {
					isDamaged = true;
					life-=5;
					Game.bullets.remove(i);
					return;
				}
			}
		}
		
	}
	
	public boolean isColiddingWithPlayer() {
		Rectangle bossCurrent = new Rectangle(this.getX() + maskx, this.getY() + masky, maskw, maskh);
		Rectangle player = new Rectangle(Game.player.getX(),Game.player.getY(), 16, 16);
		
		return bossCurrent.intersects(player);
	}
	
	public boolean isColidding(int xnext, int ynext) {
		Rectangle bossCurrent = new Rectangle(xnext + maskx, ynext + masky, maskw, maskh);
	
		for(int i = 0; i < Game.phantom.size(); i++) {
			Phantom e = Game.phantom.get(i);
			if(e == this)
				continue;
			Rectangle targetBoss = new Rectangle(e.getX() + maskx, e.getY() + masky, maskw, maskh);
			if(bossCurrent.intersects(targetBoss)) {
				return true;
			}
		}
		
		return false;
	}
	
	public void render(Graphics g) {
		if(!isDamaged)
		g.drawImage(sprites[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
	else
		g.drawImage(Entity.BOSS_FEEDBACK, this.getX() - Camera.x, this.getY() - Camera.y, null);
		//g.fillRect(this.getX() + maskx - Camera.x, this.getY() + masky - Camera.y, maskw, maskh);
		}
	}



