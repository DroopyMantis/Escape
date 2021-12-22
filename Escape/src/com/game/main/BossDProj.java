package com.game.main;

import com.game.main.Game;
import com.game.main.GameObject;
import com.game.main.Handler;
import com.game.main.ID;

import java.awt.*;
import java.util.Random;

public class BossDProj extends GameObject {

    private Handler handler;
    Random r  = new Random();

    public BossDProj(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = (r.nextInt(7 - -7) + -7);
        velY = 7;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        //if(y <= 0 || y >= Game.HEIGHT - 48) velY *= -1;
        //if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;

        if(y >= Game.HEIGHT) handler.removeObject(this);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect((int)x, (int)y, 64, 2);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 64, 2);
    }
}