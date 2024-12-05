package main.entity.nature.herbivore;

import main.entity.nature.Animal;
import main.entity.nature.Plant;

import java.util.HashMap;

public abstract class Herbivore extends Animal {

    public Herbivore(){
        this.chanceToEat = new HashMap<>();
        this.chanceToEat.put(Plant.class, 100);
    }

    @Override
    public void worker() {

    }

    @Override
    public void move() {

    }

    @Override
    public void chooseDirection() {

    }

    @Override
    public void reproduce() {

    }

    @Override
    public void die() {

    }
}
