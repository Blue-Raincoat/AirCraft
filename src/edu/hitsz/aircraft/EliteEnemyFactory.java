package edu.hitsz.aircraft;

import edu.hitsz.application.ImageManager;
import edu.hitsz.application.Main;

public class EliteEnemyFactory implements EnemyFactory{
    @Override
    public AbstractEnemy createEnemy() {
        return new EliteEnemy((int) (Math.random() * (Main.WINDOW_WIDTH - ImageManager.ELITE_ENEMY_IMAGE.getWidth())),
                (int) (Math.random() * Main.WINDOW_HEIGHT * 0.05),
                0,
                10,
                30);
    }
}
