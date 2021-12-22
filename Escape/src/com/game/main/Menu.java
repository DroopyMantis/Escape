package com.game.main;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import static com.game.main.Game.HEIGHT;
import static com.game.main.Game.WIDTH;

public class Menu extends MouseAdapter {

    private Game game;
    private Handler handler;
    private HUD hud;
    private Random r = new Random();

    public Menu(Game game, Handler handler, HUD hud){
        this.game = game;
        this.hud = hud;
        this.handler = handler;
    }

    public void mousePressed(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();

        if(game.gameState == Game.STATE.Menu){
            //Play button
            if(mouseOver(mx, my, 307,175,400,100)){
                Game.gameState = Game.STATE.Game;
                handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
                handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));

                hud.setLevel(1);
                hud.setScore(0);
            }

            //Help button
            if(mouseOver(mx, my, 307,300,400,100)) {
                Game.gameState = Game.STATE.Help;
            }

            //Quit button
            if(mouseOver(mx, my, 307,425,400,100)){
                Game.gameState = Game.STATE.Game;
                System.exit(1);
            }
        }else if(Game.gameState == Game.STATE.Help){

            //Back button in help
            if(mouseOver(mx, my,307,500,400,100)){
                Game.gameState = Game.STATE.Menu;
                return;
            }
        }else if(Game.gameState == Game.STATE.Death){
            //Play Again button
            if(mouseOver(mx, my,307,500,400,100)){
                Game.gameState = Game.STATE.Game;
                handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
                handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));

                hud.setLevel(1);
                hud.setScore(0);
            }

            //Menu button
            if(mouseOver(mx, my, 307,625,400,100)){
                Game.gameState = Game.STATE.Menu;
                return;
            }

        } else if(Game.gameState == Game.STATE.Victory) {
            //Play Again button
            if(mouseOver(mx, my,307,500,400,100)){
                Game.gameState = Game.STATE.Game;
                handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
                handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));

                hud.setLevel(1);
                hud.setScore(0);
            }

            //Menu button
            if(mouseOver(mx, my, 307,625,400,100)){
                Game.gameState = Game.STATE.Menu;
                return;
            }
        }
    }


    public void mouseReleased(MouseEvent e){

    }

    private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
        if(mx > x && mx < x + width){
            if(my > y && my < y + height){
                return true;
            }else return false;
        }else return false;
    }

    public void tick(){

    }

    public void render(Graphics g){
        if(game.gameState == Game.STATE.Menu){
            Font fnt = new Font("arial", 1, 100);
            Font fnt2 = new Font("arial", 1, 75);

            g.setFont(fnt);
            g.setColor(Color.cyan);
            g.drawString("Escape", 337, 100);

            g.setFont(fnt2);
            g.setColor(Color.white);
            g.drawString("Play", 442, 245);

            g.setFont(fnt2);
            g.setColor(Color.white);
            g.drawString("Help", 442, 370);

            g.setFont(fnt2);
            g.setColor(Color.white);
            g.drawString("Quit", 442, 495);

            g.setColor(Color.white);
            g.drawRect(307,175,400,100);

            g.setColor(Color.white);
            g.drawRect(307,300,400,100);

            g.setColor(Color.white);
            g.drawRect(307,425,400,100);
        }else if(game.gameState == Game.STATE.Help){
            Font fnt2 = new Font("arial", 1, 75);
            Font fnt3 = new Font("arial", 1, 25);

            g.setFont(fnt3);
            g.setColor(Color.white);
            g.drawString("Use W,A,S,D to move Up, Left, Right, Down.", 100, 100);

            g.setFont(fnt3);
            g.setColor(Color.white);
            g.drawString("Press SPACE to pause.", 100, 140);

            g.setFont(fnt3);
            g.setColor(Color.white);
            g.drawString("Press ESC to quit.", 100, 180);

            g.setFont(fnt3);
            g.setColor(Color.white);
            g.drawString("You control the white box.", 100, 220);

            g.setFont(fnt3);
            g.setColor(Color.white);
            g.drawString("Avoid the colored enemies.", 100, 260);

            g.setFont(fnt3);
            g.setColor(Color.white);
            g.drawString("Defeat all 4 bosses to escape!", 100, 300);

            g.setFont(fnt2);
            g.setColor(Color.white);
            g.drawString("Back", 427, 575);

            g.setColor(Color.white);
            g.drawRect(307,500,400,100);
        }else if(game.gameState == Game.STATE.Death){
        Font fnt3 = new Font("arial", 1, 150);
        Font fnt2 = new Font("arial", 1, 75);
        Font fnt4 = new Font("arial", 1, 50);

        g.setFont(fnt3);
        g.setColor(Color.red);
        g.drawString("Game Over", 122, 150);

        g.setFont(fnt4);
        g.setColor(Color.white);
        g.drawString("You ended with a score of: " + hud.getScore(), 122, 300);

        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("Play Again", 322, 550);

        g.setFont(fnt2);
        g.setColor(Color.white);
        g.drawString("Menu", 417, 680);

        g.setColor(Color.white);
        g.drawRect(307,480,400,100);

        g.setColor(Color.white);
        g.drawRect(307,605,400,100);
    }else if(game.gameState == Game.STATE.Victory){
            Font fnt3 = new Font("arial", 1, 150);
            Font fnt2 = new Font("arial", 1, 75);
            Font fnt4 = new Font("arial", 1, 50);

            g.setFont(fnt3);
            g.setColor(Color.green);
            g.drawString("You Win", 222, 150);

            g.setFont(fnt4);
            g.setColor(Color.white);
            g.drawString("Congratulations!", 307, 300);

            g.setFont(fnt2);
            g.setColor(Color.white);
            g.drawString("Play Again", 322, 520);

            g.setFont(fnt2);
            g.setColor(Color.white);
            g.drawString("Menu", 417, 650);

            g.setColor(Color.white);
            g.drawRect(307,450,400,100);

            g.setColor(Color.white);
            g.drawRect(307,575,400,100);
        }
    }
}
