package main.entity.nature.predator;

import main.entity.nature.herbivore.Duck;
import main.entity.nature.herbivore.Mouse;
import main.entity.nature.herbivore.Rabbit;


public class Boa extends Predator {

    public Boa () {
        initChanceToEat();
        setWeight(15);
        setMaxSpeed(1);
        setMaxSatiety(3);
        setActualSatiety(getMaxSatiety()/2);
    }

    private void initChanceToEat() {
        chanceToEat.put(Fox.class, 15);
        chanceToEat.put(Rabbit.class, 20);
        chanceToEat.put(Mouse.class, 40);
        chanceToEat.put(Duck.class, 10);
    }
}
