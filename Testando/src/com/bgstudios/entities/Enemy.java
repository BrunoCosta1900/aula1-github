package com.bgstudios.entities;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import com.bgstudios.main.Game;
import com.bgstudios.main.Sound;
import com.bgstudios.world.Camera;
//import com.bgstudios.world.Camera;
import com.bgstudios.world.World;

public class Enemy extends Entity {

	public boolean right, up, left, down;
	public int right_dir = 0, left_dir = 1;
	public int dir = right_dir;

	private double speed = 0.4;

	private int maskx = 8, masky = 8, maskw = 5, maskh = 10;

	private int frames = 0, maxFrames = 7, index = 0, maxIndex = 3;

	private BufferedImage[] sprites;
	private BufferedImage[] rightEnemy;
	private BufferedImage[] leftEnemy;

	private int life = 100;

	private boolean isDamaged = false;
	private int damageFrames = 10, damageCurrent = 0;

	public Enemy(int x, int y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);

		rightEnemy = new BufferedImage[4];
		leftEnemy = new BufferedImage[4];
		for (int i = 0; i < 4; i++) {
			rightEnemy[i] = Game.spritesheet.getSprite(0 + (i * 16), 128, 16, 16);
		}

		for (int i = 0; i < 4; i++) {
			leftEnemy[i] = Game.spritesheet.getSprite(0 + (i * 16), 144, 16, 16);
		}

	}

	public void tick() {

		if (right) {
			dir = right_dir;
		}

		else if (left) {
			dir = left_dir;
		}

		/*
		 * maskx = 8; masky = 8; maskw = 10; maskh = 10;
		 */

		if (this.isColiddingWithPlayer() == false) {
			if ((int) x < Game.player.getX() && World.isFree((int) (x + speed), this.getY())
					&& !isColidding((int) (x + speed), this.getY())) {
				x += speed;
			} else if ((int) x > Game.player.getX() && World.isFree((int) (x - speed), this.getY())
					&& !isColidding((int) (x - speed), this.getY())) {
				x -= speed;
			}

			if ((int) y < Game.player.getY() && World.isFree(this.getX(), (int) (y + speed))
					&& !isColidding(this.getX(), (int) (y + speed))) {
				y += speed;
			} else if ((int) y > Game.player.getY() && World.isFree(this.getX(), (int) (y - speed))
					&& !isColidding(this.getX(), (int) (y - speed))) {
				y -= speed;
			}
		} else {
			// Estamos colidindo.
			if (Game.rand.nextInt(100) < 40) {
				Sound.Hurt32Effect.play();
				Game.player.life -= Game.rand.nextInt(3);
				Game.player.isDamaged = true;

			}
			System.out.println("Vida: " + Game.player.life);
		}

		frames++;
		if (frames == maxFrames) {
			frames = 0;
			index++;
			if (index > maxIndex)
				index = 0;
		}
		collidingBullet();

		if (life <= 0) {
			destroySelf();
			return;
		}

		if (isDamaged) {
			this.damageCurrent++;
			if (this.damageCurrent == this.damageFrames) {
				this.damageCurrent = 0;
				this.isDamaged = false;
			}
		}

	}

	public void destroySelf() {
		Game.enemies.remove(this);
		Game.entities.remove(this);
	}

	public void collidingBullet() {
		for (int i = 0; i < Game.bullets.size(); i++) {
			Entity e = Game.bullets.get(i);
			if (e instanceof BulletShoot) {
				if (Entity.isColidding(this, e)) {
					isDamaged = true;
					life -= 20;
					Game.bullets.remove(i);
					return;
				}
			}
		}

	}

	public boolean isColiddingWithPlayer() {
		Rectangle enemyCurrent = new Rectangle(this.getX() + maskx, this.getY() + masky, maskw, maskh);
		Rectangle player = new Rectangle(Game.player.getX(), Game.player.getY(), 16, 16);

		return enemyCurrent.intersects(player);

	}

	public boolean isColidding(int xnext, int ynext) {
		Rectangle enemyCurrent = new Rectangle(xnext + maskx, ynext + masky, maskw, maskh);
		for (int i = 0; i < Game.enemies.size(); i++) {
			Enemy e = Game.enemies.get(i);
			if (e == this)
				continue;
			Rectangle targetEnemy = new Rectangle(e.getX() + maskx, e.getY() + masky, maskw, maskh);
			if (enemyCurrent.intersects(targetEnemy)) {
				return true;
			}

		}

		return false;
	}

	public void render(Graphics g) {

		if (dir == right_dir) {
			g.drawImage(rightEnemy[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
			if (!isDamaged)
				g.drawImage(rightEnemy[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
			else
				g.drawImage(Entity.ENEMY_FEEDBACK, this.getX() - Camera.x, this.getY() - Camera.y, null);

		} else if (dir == left_dir) {
			g.drawImage(leftEnemy[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
			if (!isDamaged)
				g.drawImage(leftEnemy[index], this.getX() - Camera.x, this.getY() - Camera.y, null);
			else
				g.drawImage(Entity.ENEMY_FEEDBACK, this.getX() - Camera.x, this.getY() - Camera.y, null);

		}
		if (this.getX() > Game.player.getX()) {
			dir = left_dir;
		} else {
			if (this.getX() < Game.player.getX()) {
				dir = right_dir;

			}

			// g.fillRect(this.getX() + maskx - Camera.x, this.getY() + masky - Camera.y,
			// maskw, maskh);
		}
	}
}
