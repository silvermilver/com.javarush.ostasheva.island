package main.entity.nature.herbivore;

public class Horse extends Herbivore {

    public Horse() {
        setWeight(400);
        setMaxSpeed(4);
        setMaxSatiety(60);
        setActualSatiety(getMaxSatiety()/2);
    }
}
