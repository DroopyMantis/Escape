package com.game.main;

import java.awt.*;

public class BigMeleeEnemy3 extends GameObject {
    private Handler handler;

    public BigMeleeEnemy3(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 15;
        velY = 3;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT - 102) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 72) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect((int)x, (int)y, 64, 64);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 64, 64);
    }
}