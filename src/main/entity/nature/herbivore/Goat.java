package main.entity.nature.herbivore;

public class Goat extends Herbivore {

    public Goat() {
        setWeight(60);
        setMaxSpeed(3);
        setMaxSatiety(10);
        setActualSatiety(getMaxSatiety()/2);
    }
}
