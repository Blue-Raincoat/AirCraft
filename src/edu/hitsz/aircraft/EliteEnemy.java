package edu.hitsz.aircraft;

import edu.hitsz.bullet.BaseBullet;
import edu.hitsz.bullet.EnemyBullet;
import edu.hitsz.prop.*;
import org.apache.commons.lang3.ObjectUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class EliteEnemy extends AbstractEnemy{
    private int shootNum = 1;

    /**
     * 子弹伤害
     */
    private int power = 30;

    /**
     * 子弹射击方向 (向上发射：1，向下发射：-1)
     */
    private int direction = 1;
    public EliteEnemy(int locationX, int locationY, int speedX, int speedY, int hp) {
        super(locationX, locationY, speedX, speedY, hp);
    }
    public PropBloodFactory propBloodFactory = new PropBloodFactory();
    public PropBombFactory propBombFactory = new PropBombFactory();
    public PropBulletFactory propBulletFactory = new PropBulletFactory();
    @Override
    public AbstractProp DropProp(int locationX,int locationY) {
        long t = System.currentTimeMillis();
        Random numList = new Random(t);
        int num =  numList.nextInt(100) ;
        if(num<=29){
            return (propBloodFactory.createProp(locationX, locationY));
        }
        else if(num>29&&num<=59){
            return (propBulletFactory.createProp(locationX, locationY));
        }
        else if(num>59&&num<=89){
            return (propBombFactory.createProp(locationX, locationY));
        }
        else return null;
    }

    @Override
    public List<BaseBullet> shoot() {
        List<BaseBullet> res = new LinkedList<>();
        int x = this.getLocationX();
        int y = this.getLocationY() + direction*2;
        int speedX = 0;
        int speedY = this.getSpeedY() + direction*5;
        BaseBullet bullet;
        for(int i=0; i<shootNum; i++){
            // 子弹发射位置相对飞机位置向前偏移
            // 多个子弹横向分散
            bullet = new EnemyBullet(x + (i*2 - shootNum + 1)*10, y, speedX, speedY, power);
            res.add(bullet);
        }
        return res;
    }
}
