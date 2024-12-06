package main.entity.nature.predator;

import main.entity.nature.Animal;

import java.util.HashMap;

public abstract class Predator extends Animal {

    public Predator() {
        this.chanceToEat = new HashMap<>();
    }

    @Override
    public void worker() {

    }

    @Override
    public void chooseDirection() {

    }

    @Override
    public void reproduce() {

    }
}
