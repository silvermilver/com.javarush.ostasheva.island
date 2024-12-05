package main.entity.nature.predator;

import main.entity.location.Cell;
import main.entity.nature.herbivore.*;

public class Bear extends Predator {

    public Bear() {
        initChanceToEat();
        super.setWeight(500);
        super.setMaxSpeed(2);
        super.setMaxSatiety(80);
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
