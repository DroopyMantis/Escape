package com.game.main;

import java.awt.*;

public class TerrainY extends GameObject {
    private Handler handler;

    public TerrainY(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 0;
        velY = 4;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        //if(y <= 0 || y >= Game.HEIGHT - 72) velY *= -1;
        if(y <= (Game.HEIGHT * (1.0 / 2.0)) * - 1 || y >= Game.HEIGHT + (Game.HEIGHT * (1.0 / 2.0))) velY *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect((int)x, (int)y, 96, 192);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 96, 192);
    }
}