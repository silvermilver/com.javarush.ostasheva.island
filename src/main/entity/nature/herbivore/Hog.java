package main.entity.nature.herbivore;

public class Hog extends Herbivore {

    public Hog(){
        chanceToEat.put(Mouse.class, 50);
        chanceToEat.put(Caterpillar.class, 90);
        setWeight(400);
        setMaxSpeed(2);
        setMaxSatiety(50);
        setActualSatiety(getMaxSatiety()/2);
    }
}
