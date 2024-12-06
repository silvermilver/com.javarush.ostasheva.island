package main.entity.nature.herbivore;

public class Sheep extends Herbivore {

    public Sheep() {
        setWeight(70);
        setMaxSpeed(3);
        setMaxSatiety(15);
        setActualSatiety(getMaxSatiety()/2);
    }
}
