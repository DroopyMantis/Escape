package com.game.main;

import java.awt.*;
import java.util.Random;

public class DropperProj extends GameObject {

    private Handler handler;
    Random r  = new Random();

    public DropperProj(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;


        velX = 0;
        velY = 7;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(x < 0 || x > Game.WIDTH || y >= Game.HEIGHT + 192) handler.removeObject(this);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect((int)x, (int)y, 2, 64);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 2, 64);
    }
}
