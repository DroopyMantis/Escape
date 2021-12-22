package com.game.main;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.io.Serial;
import java.util.Random;

public class Game extends Canvas implements Runnable{
	
	@Serial
	private static final long serialVersionUID = 5538278689012942637L;
		
	public static final int WIDTH = 1024, HEIGHT = WIDTH / 12 * 9;
		
	private Thread thread;
	private boolean running = false;

	public static boolean paused = false;

	private Random r;
	private Handler handler;
	private HUD hud;
	private Spawn spawner;
	private Menu menu;

	public enum STATE {
		Menu,
		Game,
		Help,
		Death,
		Shop,
		Victory;
	}

	public static STATE gameState = STATE.Menu;
		
	public Game() {
		handler = new Handler();

		new Window(WIDTH, HEIGHT, "Escape", this);

		hud = new HUD();
		spawner = new Spawn(handler, hud);
		menu = new Menu(this, handler, hud);
		r = new Random();

		this.addKeyListener(new KeyInput(handler, this));
		this.addMouseListener(menu);

		if(gameState == STATE.Game){
			handler.addObject(new Player(WIDTH/2-32, HEIGHT/2-32, ID.Player, handler));
			handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
		}
	}

	public synchronized void start() {
		thread = new Thread(this);	
		thread.start();
		running = true;
	}
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		this.requestFocus();
	long lastTime = System.nanoTime();
	double amountOfTicks = 60.0;
	double ns = 1000000000 / amountOfTicks;
	double delta = 0;
	long timer = System.currentTimeMillis();
	int frames = 0;
	while(running) {
		long now = System.nanoTime();
		delta += (now - lastTime) / ns;
		lastTime = now;
		while(delta >= 1) {
			tick();
			delta--;
		}
		if(running)
			render();
		frames++;
		
		if(System.currentTimeMillis() - timer > 1000) {
			timer += 1000;
			System.out.println("FPS: " + frames);
			frames = 0;
		}
	}
	stop();
	}
	
	private void tick() {

		//GodMode
		//HUD.HEALTH = 100;

		if(gameState == STATE.Victory){
			handler.tick();
			menu.tick();
			handler.clearEnemies();
			handler.clearAll();
		}

		if(gameState == STATE.Game){
			if(!paused){
				hud.tick();
				spawner.tick();
				handler.tick();

				if(HUD.HEALTH <= 0){
					HUD.HEALTH = 100;
					hud.setLevel(1);
					gameState = STATE.Death;
					handler.clearAll();
				}
			}
		}else if(gameState == STATE.Menu || gameState == STATE.Death){
			handler.tick();
			menu.tick();
		}
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if(bs == null){
			this.createBufferStrategy(3);
			return;
		}

		Graphics g = bs.getDrawGraphics();

		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);



		if(paused){
			handler.render(g);
			g.drawString("PAUSED", 600, 300);
		}

		if(gameState == STATE.Game){
			handler.render(g);
			hud.render(g);
		} else if(gameState == STATE.Menu || gameState == STATE.Help || gameState == STATE.Death || gameState == STATE.Victory){
			handler.render(g);
			menu = new Menu(this, handler, hud);
			menu.render(g);
		}

		g.dispose();
		bs.show();
	}

	public static float restraint(float var, float min, float max)
	{
		if(var >= max)
		{
			return var = max;
		}
		else if(var <= min)
		{
				return var = min;
		}
		return var;
	}
	
	public static void main(String args[]) {
		new Game();
	}
		
}


