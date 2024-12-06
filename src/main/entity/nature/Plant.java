package main.entity.nature;

public class Plant extends Nature {

    public double weight = 0;
    public double maxWeight = 100;

    private static final String picture = "🌱";

    public void addWeight(double addWeight) {
        this.weight = (weight + addWeight) > maxWeight ? maxWeight : (weight + addWeight);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static String getPicture() {
        return picture;
    }

    public void reproduce() {
        addWeight(100);
    }
}
