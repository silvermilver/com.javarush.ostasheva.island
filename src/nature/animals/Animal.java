package nature.animals;

abstract public class Animal extends Nature {

    private int maxSpeed;
    private double maxSatiety;
    double actualSatiety;

    abstract public void worker();
    abstract public void eat();
    abstract public void move();
    abstract public void chooseDirection();
    abstract public void reproduce();
    abstract public void die();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(double maxSatiety) {
        this.maxSatiety = maxSatiety;
    }
}
