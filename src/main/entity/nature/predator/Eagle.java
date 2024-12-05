package main.entity.nature.predator;

import main.entity.nature.herbivore.Duck;
import main.entity.nature.herbivore.Mouse;
import main.entity.nature.herbivore.Rabbit;

public class Eagle extends Predator {

    public Eagle(){
        initChanceToEat();
        super.setWeight(6);
        super.setMaxSpeed(3);
        super.setMaxSatiety(1);
    }

    private void initChanceToEat(){
//        chanceToEat.put(new Fox(), 10);
//        chanceToEat.put(new Rabbit(), 90);
//        chanceToEat.put(new Mouse(), 90);
//        chanceToEat.put(new Duck(), 80);
    }
}
