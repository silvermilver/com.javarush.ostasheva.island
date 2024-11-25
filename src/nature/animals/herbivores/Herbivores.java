package nature.animals.herbivores;

import nature.animals.Animals;
import nature.animals.Nature;
import nature.animals.Plant;

import java.util.HashMap;
import java.util.Map;

public abstract class Herbivores extends Animals {

    public Herbivores(){
        this.chanceToEat = new HashMap<>();
        this.chanceToEat.put(new Plant(), 100);
    }

    protected Map<Nature, Integer> chanceToEat;

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
