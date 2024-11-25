package nature.animals.predators;

import nature.animals.Animals;
import nature.animals.Plant;

import java.util.HashMap;
import java.util.Map;

public abstract class Predators extends Animals {

    protected Map<Animals, Integer> chanceToEat;

    public Predators(){
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
