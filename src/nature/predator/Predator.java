package nature.predator;

import nature.Animal;

import java.util.HashMap;
import java.util.Map;

public abstract class Predator extends Animal {

    protected Map<Animal, Integer> chanceToEat;

    public Predator(){
        this.chanceToEat = new HashMap<>();
    }

    @Override
    public void worker() {

    }

    @Override
    public void eat() {

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
