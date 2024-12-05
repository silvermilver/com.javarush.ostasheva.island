package main.fabrik;

import main.entity.nature.Animal;
import main.entity.nature.AnimalType;

import java.util.HashMap;
import java.util.Map;

public class CloneEntityFactory {
    public static Map<AnimalType, Animal> typeEntityMap = new HashMap<>();

    static {
        fillTheMap();
    }

    public static void fillTheMap() {
        for (AnimalType animalType : AnimalType.values()) {
            Animal prototype = AnimalFactory.createEntity(animalType);
            typeEntityMap.put(animalType, prototype);
        }
    }

    public static Animal createAnimalWithClone(AnimalType animalType) {
        Animal prototype = (Animal) typeEntityMap.get(animalType);
        Animal clone;
        try {
            clone = (Animal) prototype.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
