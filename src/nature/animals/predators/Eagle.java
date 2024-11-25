package nature.animals.predators;

import nature.animals.herbivores.*;

public class Eagle extends Predators {

    public Eagle(){
        initChanceToEat();
        super.setWeight(6);
        super.setMaxSpeed(3);
        super.setMaxSatiety(1);
    }

    private void initChanceToEat(){
        chanceToEat.put(new Fox(), 10);
        chanceToEat.put(new Rabbit(), 90);
        chanceToEat.put(new Mouse(), 90);
        chanceToEat.put(new Duck(), 80);
    }
}
