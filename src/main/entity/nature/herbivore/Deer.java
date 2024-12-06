package main.entity.nature.herbivore;

public class Deer extends Herbivore {

    public Deer() {
        setWeight(300);
        setMaxSpeed(4);
        setMaxSatiety(50);
        setActualSatiety(getMaxSatiety()/2);
    }
}
