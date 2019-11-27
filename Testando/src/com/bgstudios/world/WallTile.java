package com.bgstudios.world;

import java.awt.image.BufferedImage;

import com.bgstudios.entities.BulletShoot;
import com.bgstudios.entities.Entity;
import com.bgstudios.main.Game;

public class WallTile extends Tile {

	public WallTile(int x, int y, BufferedImage sprite) {
		super(x, y, sprite);

	}

	
	public void collidingBullet() {
		for (int i = 0; i < Game.bullets.size(); i++) {
			Entity e = Game.bullets.get(i);
			if (e instanceof BulletShoot) {
				if (Entity.isColidding(this, e)) {
				
					Game.bullets.remove(i);
					return;
				}
			}
		}

	}
}
