package edu.hitsz.prop;
import edu.hitsz.aircraft.HeroAircraft;

public class PropBlood extends AbstractProp {
    @Override
    public AbstractProp DropProp(int locationX, int locationY) {
        return null;
    }
    public PropBlood(int locationX, int locationY, int speedX, int speedY) {
        super(locationX, locationY, speedX, speedY);
    }

    @Override
    public void activate(AbstractProp propBlood, HeroAircraft heroAircraft){
        if(heroAircraft.crash(propBlood)){
            heroAircraft.increaseHp(50);
        }
    }
}
