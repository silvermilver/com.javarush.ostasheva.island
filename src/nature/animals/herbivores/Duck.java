package nature.animals.herbivores;

public class Duck extends Herbivores {

    public Duck(){
        chanceToEat.put(new Caterpillar(), 90);
        super.setWeight(1);
        super.setMaxSpeed(4);
    }
}
