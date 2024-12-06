package main.entity.nature.herbivore;

public class Buffalo extends Herbivore {

    public Buffalo() {
        setWeight(700);
        setMaxSpeed(3);
        setMaxSatiety(50);
        setActualSatiety(getMaxSatiety()/2);
    }
}
