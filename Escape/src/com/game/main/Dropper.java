package com.game.main;

import java.awt.*;
import java.util.Random;

public class Dropper extends GameObject {

    private Handler handler;
    Random r = new Random();

    public Dropper(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 100;
        velY = 0;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;


            int spawn = r.nextInt(13);
            if(spawn == 0) handler.addObject(new DropperProj((int)x + 1, (int)y + 1, ID.DropperProj, handler));



        //if(y <= 0 || y >= Game.HEIGHT - 48) velY *= -1;
        if(x <= - 96 || x >= Game.WIDTH + 96) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, 96, 96);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 96, 96);
    }
}