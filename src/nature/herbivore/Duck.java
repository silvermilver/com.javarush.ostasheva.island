package nature.herbivore;

public class Duck extends Herbivore {

    public Duck(){
        chanceToEat.put(new Caterpillar(), 90);
        super.setWeight(1);
        super.setMaxSpeed(4);
    }
}
