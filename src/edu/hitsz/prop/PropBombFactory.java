package edu.hitsz.prop;

public class PropBombFactory implements PropFactory{
    public AbstractProp createProp(int locationX,int locationY) {
        return new PropBomb(
                locationX,
                locationY,
                0,
                10
        );
    }
}
