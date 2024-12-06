package main.entity.nature.predator;

import main.entity.nature.herbivore.Duck;
import main.entity.nature.herbivore.Mouse;
import main.entity.nature.herbivore.Rabbit;

public class Eagle extends Predator {

    public Eagle(){
        initChanceToEat();
        setWeight(6);
        setMaxSpeed(3);
        setMaxSatiety(1);
        setActualSatiety(getMaxSatiety()/2);
    }

    private void initChanceToEat(){
        chanceToEat.put(Fox.class, 10);
        chanceToEat.put(Rabbit.class, 90);
        chanceToEat.put(Mouse.class, 90);
        chanceToEat.put(Duck.class, 80);
    }
}
