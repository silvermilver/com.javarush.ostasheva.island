package main.entity.nature.herbivore;


public class Mouse extends Herbivore {

    public Mouse(){
        chanceToEat.put(Caterpillar.class, 90);
        super.setWeight(0.05);
        super.setMaxSpeed(1);
    }


}
