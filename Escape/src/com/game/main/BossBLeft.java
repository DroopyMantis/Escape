package com.game.main;

import java.awt.*;
import java.util.Random;

public class BossBLeft extends GameObject {

    private Handler handler;
    Random r = new Random();

    private int timer = 60;
    private int timer2 = 50;

    public BossBLeft(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 2;
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
        if(timer <= 0)
        {
            timer2--;
        }
        if(timer2 <= 0){
            if(velY == 0) velY = 10;
            int spawn = r.nextInt(15);
            if(spawn == 0) handler.addObject(new BossBLeftProj((int)x + 48, (int)y + 48, ID.BossBLeftProj, handler));

        }



        if(y <= 0 || y >= Game.HEIGHT - 144) velY *= -1;
        //if(x <= 0 || x >= Game.WIDTH - 74) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect((int)x, (int)y, 96, 96);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 96, 96);
    }
}
