package com.game.main;

import java.awt.*;
import java.util.Random;

public class RangedEnemy extends GameObject {

    private Handler handler;
    Random r = new Random();

    public RangedEnemy(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        velX = 3;
        velY = 3;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        int spawn = r.nextInt(30);
        if(spawn == 0) handler.addObject(new RangedEnemyProj((int)x + 16, (int)y + 16, ID.RangedEnemyProj, handler));


        if(y <= 0 || y >= Game.HEIGHT - 72) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 48) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect((int)x, (int)y, 32, 32);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 32, 32);
    }
}