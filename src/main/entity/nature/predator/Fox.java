package main.entity.nature.predator;

import main.entity.nature.herbivore.Caterpillar;
import main.entity.nature.herbivore.Mouse;
import main.entity.nature.herbivore.Duck;
import main.entity.nature.herbivore.Rabbit;

public class Fox extends Predator {

    public Fox (){
        initChanceToEat();
        super.setWeight(8);
        super.setMaxSpeed(2);
        super.setMaxSatiety(2);
    }

    private void initChanceToEat(){
//        chanceToEat.put(new Rabbit(), 70);
//        chanceToEat.put(new Mouse(), 90);
//        chanceToEat.put(new Duck(), 60);
//        chanceToEat.put(new Caterpillar(), 40);
    }
}
