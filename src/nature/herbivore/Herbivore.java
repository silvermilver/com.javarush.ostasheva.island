package nature.herbivore;

import nature.Animal;
import nature.Nature;
import nature.Plant;

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
