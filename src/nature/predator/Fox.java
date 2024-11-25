package nature.predator;

import nature.herbivore.Caterpillar;
import nature.herbivore.Duck;
import nature.herbivore.Mouse;
import nature.herbivore.Rabbit;

public class Fox extends Predator {

    public Fox (){
        initChanceToEat();
        super.setWeight(8);
        super.setMaxSpeed(2);
        super.setMaxSatiety(2);
    }

    private void initChanceToEat(){
        chanceToEat.put(new Rabbit(), 70);
        chanceToEat.put(new Mouse(), 90);
        chanceToEat.put(new Duck(), 60);
        chanceToEat.put(new Caterpillar(), 40);
    }
}
