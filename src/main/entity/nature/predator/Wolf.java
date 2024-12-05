package main.entity.nature.predator;

import main.entity.nature.herbivore.*;

public class Wolf extends Predator {

   public Wolf (){
        initChanceToEat();
        setWeight(50);
        setMaxSpeed(3);
        setMaxSatiety(8);
        setActualSatiety(8);
    }

    private void initChanceToEat(){
         chanceToEat.put(Horse.class, 10);
         chanceToEat.put(Deer.class, 15);
         chanceToEat.put(Rabbit.class, 60);
         chanceToEat.put(Mouse.class, 80);
         chanceToEat.put(Goat.class, 60);
         chanceToEat.put(Sheep.class, 70);
         chanceToEat.put(Hog.class, 15);
         chanceToEat.put(Buffalo.class, 10);
         chanceToEat.put(Duck.class, 40);
    }
}
