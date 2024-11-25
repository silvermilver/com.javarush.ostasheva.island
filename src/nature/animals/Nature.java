package nature.animals;

public abstract class Nature {

    private double weight;

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public void addWeight(double addWeight) {
        weight = weight + addWeight;
    }

    public double getWeight() {
        return weight;
    }
}
