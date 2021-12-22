package com.game.main;

import javax.swing.tree.FixedHeightLayoutCache;
import java.util.Random;

public class Spawn {

    private HUD hud;
    private Handler handler;
    private int scoreCount = 0;
    private Random r = new Random();

    public Spawn(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void tick() {
        scoreCount++;
        if (hud.getLevel() < 20) {
            if (scoreCount >= 250) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);

                if (hud.getLevel() == 2) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 3) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 4) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 5) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 6) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 7) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 8) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 9) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 10) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 11) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 12) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 13) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 14) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 15) {
                    handler.addObject(new SmartMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.SmartMeleeEnemy, handler));
                } else if (hud.getLevel() == 16) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 17) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 18) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 19) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 20) {
                    handler.clearEnemies();
                    handler.addObject(new BossA((Game.WIDTH / 2) - 48, -120, ID.BossA, handler));
                }
            }
        } else if (hud.getLevel() < 21) {
            if (scoreCount >= 1500) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);
                HUD.HEALTH = 100;
                handler.clearEnemies();
            }
        } else if (hud.getLevel() < 37) {
            if (scoreCount >= 250) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);

                if (hud.getLevel() == 22) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 23) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 24) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 25) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 26) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 27) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 28) {
                    handler.addObject(new BigMeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy2, handler));
                } else if (hud.getLevel() == 29) {
                    handler.addObject(new BigMeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy2, handler));
                } else if (hud.getLevel() == 30) {
                    handler.addObject(new SmartMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.SmartMeleeEnemy, handler));
                } else if (hud.getLevel() == 31) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 32) {
                    handler.addObject(new MeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy2, handler));
                } else if (hud.getLevel() == 33) {
                    handler.addObject(new BigMeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy2, handler));
                } else if (hud.getLevel() == 34) {
                    handler.addObject(new BigMeleeEnemy2(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy2, handler));
                } else if (hud.getLevel() == 37) {
                    handler.clearEnemies();
                    handler.addObject(new BossBLeft(-96, (Game.HEIGHT / 2) - 96, ID.BossBLeft, handler));
                    handler.addObject(new BossBRight(Game.WIDTH - 16, (Game.HEIGHT / 2) - 96, ID.BossBRight, handler));
                }
            }
        } else if (hud.getLevel() < 38) {
            if (scoreCount >= 1500) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);
                HUD.HEALTH = 100;
                handler.clearEnemies();
            }
        } else if (hud.getLevel() < 55) {
            if (scoreCount >= 250) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);
                if (hud.getLevel() == 39) {
                    handler.addObject(new TerrainX(-196, 100, ID.TerrainX, handler));
                    handler.addObject(new TerrainY(100, -196, ID.TerrainY, handler));
                } else if (hud.getLevel() == 40) {
                    handler.addObject(new TerrainX(Game.WIDTH + 196, 300, ID.TerrainX, handler));
                    handler.addObject(new TerrainY(300, Game.HEIGHT + 196, ID.TerrainY, handler));
                } else if (hud.getLevel() == 41) {
                    handler.addObject(new TerrainX(-196, 500, ID.TerrainX, handler));
                    handler.addObject(new TerrainY(500, -196, ID.TerrainY, handler));
                } else if (hud.getLevel() == 42) {
                    handler.addObject(new TerrainY(700, Game.HEIGHT + 196, ID.TerrainY, handler));
                } else if (hud.getLevel() == 43) {
                    handler.addObject(new TerrainY(900, -196, ID.TerrainY, handler));
                } else if (hud.getLevel() == 44) {
                } else if (hud.getLevel() == 45) {
                    handler.addObject(new SmartFastMeleeEnemy(r.nextInt(100), r.nextInt(100), ID.SmartFastMeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 46) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 47) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 48) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 49) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 50) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 51) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 52) {
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                    handler.addObject(new BigMeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy, handler));
                } else if (hud.getLevel() == 53) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 54) {
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                    handler.addObject(new MeleeEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.MeleeEnemy, handler));
                } else if (hud.getLevel() == 55) {
                    handler.clearEnemies();
                    handler.addObject(new BossC(Game.WIDTH - 16, (Game.HEIGHT / 2) - 96, ID.BossC, handler));
                    handler.addObject(new TerrainC(-300, 0, ID.TerrainC, handler));
                    handler.addObject(new TerrainCX(-196, 0, ID.TerrainX, handler));
                    handler.addObject(new TerrainCX(Game.WIDTH + 196, 672, ID.TerrainX, handler));
                }
            }
        } else if (hud.getLevel() < 56) {
            if (scoreCount >= 1500) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);
                HUD.HEALTH = 100;
                handler.clearEnemies();
            }
        }else if (hud.getLevel() < 75) {
            if (scoreCount >= 250) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);

                if (hud.getLevel() == 57) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 58) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 59) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() ==  60) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 61) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 62) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 63) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 64) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 65) {
                    handler.addObject(new BigMeleeEnemy3(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy3, handler));
                } else if (hud.getLevel() == 66) {
                    handler.addObject(new BigMeleeEnemy3(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy3, handler));
                } else if (hud.getLevel() == 67) {
                    handler.addObject(new SmartFastMeleeEnemy(r.nextInt(100), r.nextInt(100), ID.SmartFastMeleeEnemy, handler));
                } else if (hud.getLevel() == 68) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 69) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 70) {
                    handler.addObject(new BigMeleeEnemy3(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy3, handler));
                } else if (hud.getLevel() == 71) {
                    handler.addObject(new BigMeleeEnemy3(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.BigMeleeEnemy3, handler));
                } else if (hud.getLevel() == 72) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 73) {
                    handler.addObject(new RangedEnemy(r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.RangedEnemy, handler));
                } else if (hud.getLevel() == 74) {
                    handler.clearEnemies();
                } else if (hud.getLevel() == 75) {
                    handler.clearEnemies();
                    handler.addObject(new Dropper(0, -100, ID.MeleeEnemy, handler));
                    handler.addObject(new Dropper(250, -100, ID.MeleeEnemy, handler));
                    handler.addObject(new Dropper(568, -100, ID.MeleeEnemy, handler));
                    handler.addObject(new Dropper(798, -100, ID.MeleeEnemy, handler));
                    handler.addObject(new Dropper(1106, -100, ID.MeleeEnemy, handler));
                    handler.addObject(new BossD((Game.WIDTH / 2) - 48, -120, ID.BossD, handler));
                }
            }
        } else if (hud.getLevel() < 76) {
            if (scoreCount >= 2000) {
                scoreCount = 0;
                hud.setLevel(hud.getLevel() + 1);
                HUD.HEALTH = 100;
                handler.clearEnemies();
                Game.gameState = Game.STATE.Victory;
            }
        }
    }
}
