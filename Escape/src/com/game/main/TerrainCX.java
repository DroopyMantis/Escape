package com.game.main;

import java.awt.*;

public class TerrainCX extends GameObject {
    private Handler handler;

    public TerrainCX(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 12;
        velY = 0;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        //if(y <= 0 || y >= Game.HEIGHT - 72) velY *= -1;
        if(x <= (Game.WIDTH * (1.0 / 2.0)) * - 1 || x >= Game.WIDTH + (Game.WIDTH * (1.0 / 2.0))) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect((int)x, (int)y, 192, 96);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 192, 96);
    }
}
