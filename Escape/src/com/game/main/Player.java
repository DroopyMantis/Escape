package com.game.main;

import java.awt.*;

public class Player extends GameObject{


    private final Handler handler;

    public Player(float x, float y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;


    }

    @Override
    public void tick() {
        x+= velX;
        y+= velY;

        x = Game.restraint((int)x, 0, Game.WIDTH - 48);
        y = Game.restraint((int)y, 0, Game.HEIGHT - 72);

        collision();
    }

    private void collision() {
        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.MeleeEnemy || tempObject.getId() == ID.BigMeleeEnemy || tempObject.getId() == ID.MeleeEnemy2 || tempObject.getId() == ID.BigMeleeEnemy2 || tempObject.getId() == ID.RangedEnemyProj) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    HUD.HEALTH -= 2;
                }
            }else if(tempObject.getId() == ID.BossAProj || tempObject.getId() == ID.SmartMeleeEnemy  || tempObject.getId() == ID.SmartFastMeleeEnemy || tempObject.getId() == ID.TerrainX || tempObject.getId() == ID.TerrainY){
                if (getBounds().intersects(tempObject.getBounds())) {
                    HUD.HEALTH -= 1;
                }
            }else if(tempObject.getId() == ID.BossA || tempObject.getId() == ID.BossD|| tempObject.getId() == ID.BossBLeft || tempObject.getId() == ID.BossBRight || tempObject.getId() == ID.BossC || tempObject.getId() == ID.TerrainC){
                if (getBounds().intersects(tempObject.getBounds())) {
                    HUD.HEALTH -= 100;
                }
            } else if(tempObject.getId() == ID.BossBLeftProj || tempObject.getId() == ID.BossBRightProj || tempObject.getId() == ID.RangedEnemy || tempObject.getId() == ID.DropperProj || tempObject.getId() == ID.BossDProj) {
                    if (getBounds().intersects(tempObject.getBounds())) {
                        HUD.HEALTH -= 8;
                    }
                } else if(tempObject.getId() == ID.BossCProj || tempObject.getId() == ID.TerrainCX || tempObject.getId() == ID.BigMeleeEnemy3) {
                if (getBounds().intersects(tempObject.getBounds())) {
                    HUD.HEALTH -= 4;
                }
            }
        }
    }

    @Override
    public void render(Graphics g) {

        g.setColor(Color.white);
        g.fillRect((int)x, (int)y, 32, 32);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle((int)x, (int)y, 32, 32);
    }

}
