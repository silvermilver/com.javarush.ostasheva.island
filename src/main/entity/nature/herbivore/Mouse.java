package main.entity.nature.herbivore;


public class Mouse extends Herbivore {

    public Mouse(){
        chanceToEat.put(Caterpillar.class, 90);
        setWeight(0.05);
        setMaxSpeed(1);
        setMaxSatiety(0.01);
        setActualSatiety(getMaxSatiety()/2);
    }
}
