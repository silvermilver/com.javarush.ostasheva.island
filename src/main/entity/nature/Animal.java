package main.entity.nature;

import main.entity.location.Cell;
import main.entity.nature.predator.Predator;
import main.entity.nature.predator.Wolf;
import main.fabrik.CloneEntityFactory;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static main.util.Rnd.random;

abstract public class Animal extends Nature {

    public Cell cell;
    private int maxSpeed;
    private double maxSatiety;
    private double actualSatiety;
    public boolean isDied = false;

    private double weight;

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }

    public void setWeight(double newWeight) {
        weight = newWeight;
    }

    public double getWeight() {
        return weight;
    }

    protected Map<Class<? extends Nature>, Integer> chanceToEat;

    abstract public void worker();
    abstract public void move();
    abstract public void chooseDirection();

    public void die() {
        this.isDied = true;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void eat(List<Animal> cellAnimals, Plant plant){
        Set<Class<? extends Nature>> canToEatSet = chanceToEat.keySet();
        List<Animal> canToEatList = cellAnimals
                .stream()
                .filter(a -> !a.isDied)
                .filter(a -> canToEatSet.contains(a.getClass()))
                .toList();

        if(canToEatList.size() > 0){
            Animal potentialFood;
            if(canToEatList.size() == 1){
                potentialFood = canToEatList.get(0);
            } else {
                potentialFood = canToEatList.get(random(0, canToEatList.size() - 1));
            }
            int chance = chanceToEat.get(potentialFood.getClass());
            int rand = random(0, 100);
            if (rand < chance) {
                this.addActualSatiety(potentialFood.getWeight());
                potentialFood.isDied = true;
                potentialFood.die();
            }
        }
        if (canToEatSet.contains(Plant.class) && plant.getWeight() > 0) {
            double food = plant.getWeight() - this.maxSatiety > 0 ? this.maxSatiety : plant.getWeight();
            this.addActualSatiety(food);
            plant.setWeight(plant.getWeight() - food);
        }
    }

    public void reproduce(List<Animal> cellAnimals){
        if(cellAnimals.stream().anyMatch(a -> a.getClass().equals(this.getClass()))){
            Animal child = CloneEntityFactory.createAnimalByClass(this.getClass());
            Cell cell = this.getCell();
            if(child == null){
                child.setCell(cell);
            }
            child.setCell(cell);
            List<Animal> childList = cell.getChildList();
            childList.add(child);
        }
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

    public void setActualSatiety(double actualSatiety) {
        this.actualSatiety = actualSatiety;
    }

    public void addActualSatiety(double addSatiety) {
        double newSatiety = actualSatiety + addSatiety;
        this.actualSatiety = newSatiety > maxSatiety ? maxSatiety : newSatiety;
    }

    public void reduceActualSatiety(){
        setActualSatiety(this.actualSatiety - maxSatiety/6);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
