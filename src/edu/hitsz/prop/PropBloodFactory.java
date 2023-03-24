package edu.hitsz.prop;

public class PropBloodFactory implements PropFactory{
    @Override
    public AbstractProp createProp(int locationX,int locationY) {
        return new PropBlood(
                locationX,
                locationY,
                0,
                10
        );
    }
}
