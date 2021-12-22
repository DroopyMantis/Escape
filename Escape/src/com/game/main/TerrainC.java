package com.game.main;

import java.awt.*;
import java.util.Random;

public class TerrainC extends GameObject {

    private Handler handler;
    Random r = new Random();

    private int timer = 60;

    public TerrainC(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 4;
        velY = 0;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(timer <= 0)
        {
            velX = 0;
        }
        else{
            timer--;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect((int)x, (int)y, 300, 1000);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 300, 1000);
    }
}