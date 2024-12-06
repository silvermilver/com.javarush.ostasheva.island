package main.entity.nature.predator;

import main.entity.nature.herbivore.*;

public class Bear extends Predator {

    public Bear() {
        initChanceToEat();
        setWeight(500);
        setMaxSpeed(2);
        setMaxSatiety(80);
        setActualSatiety(getMaxSatiety()/2);
    }

    private void initChanceToEat(){
        chanceToEat.put(Boa.class, 80);
        chanceToEat.put(Horse.class, 40);
        chanceToEat.put(Deer.class, 80);
        chanceToEat.put(Rabbit.class, 80);
        chanceToEat.put(Mouse.class, 90);
        chanceToEat.put(Sheep.class, 70);
        chanceToEat.put(Goat.class, 70);
        chanceToEat.put(Hog.class, 50);
        chanceToEat.put(Buffalo.class, 20);
        chanceToEat.put(Duck.class, 10);
    }
}
