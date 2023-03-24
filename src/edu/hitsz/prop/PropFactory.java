package edu.hitsz.prop;

import edu.hitsz.aircraft.AbstractEnemy;

public interface PropFactory {
    public abstract AbstractProp createProp(int locationX,int locationY);
}
