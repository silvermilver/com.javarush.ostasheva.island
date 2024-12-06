package main.entity.nature.herbivore;

public class Rabbit extends Herbivore {

    public Rabbit() {
        setWeight(2);
        setMaxSpeed(2);
        setMaxSatiety(0.45);
        setActualSatiety(getMaxSatiety()/2);
    }
}
