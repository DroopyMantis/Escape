package com.game.main;

import java.awt.*;

public class HUD {

    public static int HEALTH = 100;

    private int greenValue = 255;

    private int score = 0;
    private int level = 1;

    public void tick()
    {
        HEALTH = (int) Game.restraint(HEALTH, 0, 100);
        greenValue = (int) Game.restraint(greenValue, 0, 255);

        greenValue =    HEALTH * 2;

        score++;
    }

    public void render(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(10,10, 100, 16);
        g.setColor(new Color(110, greenValue, 0));
        g.fillRect(10,10, HEALTH, 16);
        g.setColor(Color.white);
        g.drawRect(10,10,100,16);

        g.drawString("Score: " + score, 10 ,48);
        g.drawString("Level: " + level, 10 ,64);
    }

    public void setScore(int score){
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }
}
