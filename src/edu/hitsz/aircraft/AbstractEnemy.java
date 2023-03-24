package edu.hitsz.aircraft;

import edu.hitsz.application.Main;
import edu.hitsz.prop.AbstractProp;

import java.util.LinkedList;
import java.util.List;


public abstract class AbstractEnemy extends AbstractAircraft {

    public AbstractEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }

    @Override
    public void forward() {
        super.forward();
        // 判定 y 轴向下飞行出界
        if (locationY >= Main.WINDOW_HEIGHT ) {
            vanish();
        }
    }
    public abstract AbstractProp DropProp(int locationX,int locationY);
}