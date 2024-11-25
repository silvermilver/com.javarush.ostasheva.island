package nature.predator;

import nature.herbivore.Duck;
import nature.herbivore.Mouse;
import nature.herbivore.Rabbit;


public class Boa extends Predator {

    public Boa () {
        initChanceToEat();
        super.setWeight(15);
        super.setMaxSpeed(1);
        super.setMaxSatiety(3);
    }

    private void initChanceToEat() {
        chanceToEat.put(new Fox(), 15);
        chanceToEat.put(new Rabbit(), 20);
        chanceToEat.put(new Mouse(), 40);
        chanceToEat.put(new Duck(), 10);
    }
}
