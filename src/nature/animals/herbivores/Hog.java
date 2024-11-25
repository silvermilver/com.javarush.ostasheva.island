package nature.animals.herbivores;

public class Hog extends Herbivores {

    public Hog(){
        chanceToEat.put(new Mouse(), 50);
        chanceToEat.put(new Caterpillar(), 90);
        super.setWeight(400);
        super.setMaxSpeed(2);
    }
}
