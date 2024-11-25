package nature.animals.predators;

import nature.animals.Animals;
import nature.animals.herbivores.*;

import java.util.Map;

public class Wolf extends Predators {

   public Wolf (){
        initChanceToEat();
        super.setWeight(50);
        super.setMaxSpeed(3);
        super.setMaxSatiety(8);
    }

    private void initChanceToEat(){
         chanceToEat.put(new Horse(), 10);
         chanceToEat.put(new Deer(), 15);
         chanceToEat.put(new Rabbit(), 60);
         chanceToEat.put(new Mouse(), 80);
         chanceToEat.put(new Goat(), 60);
         chanceToEat.put(new Sheep(), 70);
         chanceToEat.put(new Hog(), 15);
         chanceToEat.put(new Buffalo(), 10);
         chanceToEat.put(new Duck(), 40);
    }
}
