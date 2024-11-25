package nature.animals.predators;

import nature.animals.Animals;
import nature.animals.herbivores.Caterpillar;
import nature.animals.herbivores.Duck;
import nature.animals.herbivores.Mouse;
import nature.animals.herbivores.Rabbit;

import java.util.Map;

public class Fox extends Predators {

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
