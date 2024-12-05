package main.service;

import main.entity.location.Cell;
import main.entity.nature.Animal;
import main.entity.nature.Nature;

public class Task {

    private final Nature nature;
    private final Cell cell;

    public Task(Nature nature, Cell cell) {
        this.nature = nature;
        this.cell = cell;
    }

    public void doTask() {
        if (nature instanceof Animal animal) {
//            animal.eat();
            animal.reproduce();
//            animal.move(cell);
        } else {
            nature.reproduce();
        }
    }
}
