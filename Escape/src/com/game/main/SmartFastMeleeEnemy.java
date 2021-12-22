package com.game.main;

import java.awt.*;

public class SmartFastMeleeEnemy extends GameObject {

    private Handler handler;
    private GameObject player;

    public SmartFastMeleeEnemy(float x, float y, ID id, Handler handler) {
        super(x, y, id);

        this.handler = handler;

        for(int i = 0; i < handler.object.size(); i++){
            if(handler.object.get(i).getId() == ID.Player) player = handler.object.get(i);
        }


    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        float diffX = x - player.getX() - 8;
        float diffY = y - player.getY() - 8;
        float distance = (float) Math.sqrt((x-player.getX())*(x-player.getX()) + (y-player.getY())*(y-player.getY()));

        velX = (4 * ((float) ((-1.0/distance) * diffX))) - ((float) ((-1.0/distance) * diffX) / 2);
        velY = (4 * ((float) ((-1.0/distance) * diffY))) - ((float) ((-1.0/distance) * diffX) / 2);

        if(y <= 0 || y >= Game.HEIGHT - 48) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.cyan);
        g.fillRect((int)x, (int)y, 24, 24);
    }

    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 24, 24);
    }
}
