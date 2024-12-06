package main.entity.nature.predator;

import main.entity.nature.Animal;

import java.util.HashMap;

public abstract class Predator extends Animal {

    public Predator() {
        this.chanceToEat = new HashMap<>();
    }
}
