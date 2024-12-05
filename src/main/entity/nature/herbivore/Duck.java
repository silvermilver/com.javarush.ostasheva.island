package main.entity.nature.herbivore;

public class Duck extends Herbivore {

    public Duck(){
        chanceToEat.put(Caterpillar.class, 90);
        setWeight(1);
        setMaxSpeed(4);
        setMaxSatiety(0.15);
        setActualSatiety(0.15);
    }
}
