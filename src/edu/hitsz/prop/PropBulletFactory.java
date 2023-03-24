package edu.hitsz.prop;

public class PropBulletFactory {
    public AbstractProp createProp(int locationX,int locationY) {
        return new PropBullet(
                locationX,
                locationY,
                0,
                10
        );
    }
}
