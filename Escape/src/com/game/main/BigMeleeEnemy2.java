package com.game.main;

import java.awt.*;

public class BigMeleeEnemy2 extends GameObject {
    private Handler handler;

    public BigMeleeEnemy2(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 7;
        velY = 3;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT - 82) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 64) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect((int)x, (int)y, 48, 48);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 48, 48);
    }
}