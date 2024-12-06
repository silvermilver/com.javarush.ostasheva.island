package main.entity.nature.predator;

import main.entity.nature.herbivore.Caterpillar;
import main.entity.nature.herbivore.Mouse;
import main.entity.nature.herbivore.Duck;
import main.entity.nature.herbivore.Rabbit;

public class Fox extends Predator {

    public Fox (){
        initChanceToEat();
        setWeight(8);
        setMaxSpeed(2);
        setMaxSatiety(2);
        setActualSatiety(getMaxSatiety()/2);
    }

    private void initChanceToEat(){
        chanceToEat.put(Rabbit.class, 70);
        chanceToEat.put(Mouse.class, 90);
        chanceToEat.put(Duck.class, 60);
        chanceToEat.put(Caterpillar.class, 40);
    }
}
