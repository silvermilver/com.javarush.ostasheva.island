package nature.animals.predators;

import nature.animals.Animals;
import nature.animals.herbivores.Caterpillar;
import nature.animals.herbivores.Duck;
import nature.animals.herbivores.Mouse;
import nature.animals.herbivores.Rabbit;


public class Boa extends Predators {

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
