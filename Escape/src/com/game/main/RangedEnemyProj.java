package com.game.main;

import java.awt.*;
import java.util.Random;

public class RangedEnemyProj extends GameObject {

    private Handler handler;
    Random r  = new Random();

    public RangedEnemyProj(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;


        velX = (r.nextInt(7 - -7) + -7);
        velY = (r.nextInt(7 - -7) + -7);
        if(velX == 0 || velY == 0){
            velX = 6;
        }
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(y >= Game.HEIGHT || y <= 0 || x <= 0 || x >= Game.WIDTH) handler.removeObject(this);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, 16, 16);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 16, 16);
    }
}