package nature.animals.herbivore;


public class Mouse extends Herbivore {

    public Mouse(){
        chanceToEat.put(new Caterpillar(), 90);
        super.setWeight(0.05);
        super.setMaxSpeed(1);
    }


}
