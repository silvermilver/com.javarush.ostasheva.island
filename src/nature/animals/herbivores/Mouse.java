package nature.animals.herbivores;


public class Mouse extends Herbivores {

    public Mouse(){
        chanceToEat.put(new Caterpillar(), 90);
        super.setWeight(0.05);
        super.setMaxSpeed(1);
    }


}
