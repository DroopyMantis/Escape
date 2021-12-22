package com.game.main;

import java.awt.*;
import java.util.Random;

public class BossBLeftProj extends GameObject {

    private Handler handler;
    Random r  = new Random();

    public BossBLeftProj(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 10;
        velY = (r.nextInt(5 - -5) + -5);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        //if(y <= 0 || y >= Game.HEIGHT - 48) velY *= -1;
        //if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;

        if(x >= Game.WIDTH || x < 0) handler.removeObject(this);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect((int)x, (int)y, 24, 24);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 24, 24);
    }
}