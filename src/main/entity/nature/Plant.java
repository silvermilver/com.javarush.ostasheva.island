package main.entity.nature;

public class Plant extends Nature {

    public double weight = 0;
    public double maxWeight = 100;

    public void addWeight(double addWeight) {
        this.weight = (weight + addWeight) > maxWeight ? maxWeight : (weight + addWeight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void reproduce() {
        addWeight(100);
    }
}
