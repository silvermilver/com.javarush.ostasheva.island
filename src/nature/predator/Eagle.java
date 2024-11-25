package nature.predator;

import nature.animals.herbivore.*;
import nature.herbivore.Duck;
import nature.herbivore.Mouse;
import nature.herbivore.Rabbit;

public class Eagle extends Predator {

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
