package com.game.main;

import java.awt.*;
import java.util.Random;

public class BossCProj extends GameObject {

    private Handler handler;
    Random r  = new Random();

    public BossCProj(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = -6;
        velY = (r.nextInt(7 - -7) + -7);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT - 90) velY *= -1;
        if(x <= 240) velX *= -1;

        if(x >= Game.WIDTH || x <= 0 || y >= Game.HEIGHT) handler.removeObject(this);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect((int)x, (int)y, 16, 48);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 16, 48);
    }
}

