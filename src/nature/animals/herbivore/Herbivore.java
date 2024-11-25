package nature.animals.herbivore;

import nature.animals.Animal;
import nature.animals.Nature;
import nature.animals.Plant;

import java.util.HashMap;
import java.util.Map;

public abstract class Herbivore extends Animal {

    public Herbivore(){
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
