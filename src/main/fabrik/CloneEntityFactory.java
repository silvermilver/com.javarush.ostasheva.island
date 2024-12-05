package main.fabrik;

import main.entity.nature.Animal;
import main.entity.nature.herbivore.*;
import main.entity.nature.predator.*;

import java.util.HashMap;
import java.util.Map;

public class CloneEntityFactory {
//    public static Map<AnimalType, Animal> typeEntityMap = new HashMap<>();
    public static Map<Class<? extends Animal>, Animal> animalClassesMap = new HashMap<>();

    static {
//        fillTheMap();
        fillAnimalClassesMap();
    }

//    public static void fillTheMap() {
//        for (AnimalType animalType : AnimalType.values()) {
//            Animal prototype = AnimalFactory.createEntity(animalType);
//            typeEntityMap.put(animalType, prototype);
//        }
//    }

    public static void fillAnimalClassesMap() {
        animalClassesMap.put(Bear.class, new Bear());
        animalClassesMap.put(Wolf.class, new Wolf());
        animalClassesMap.put(Boa.class, new Boa());
        animalClassesMap.put(Fox.class, new Fox());
        animalClassesMap.put(Eagle.class, new Eagle());
        animalClassesMap.put(Buffalo.class, new Buffalo());
        animalClassesMap.put(Horse.class, new Horse());
        animalClassesMap.put(Deer.class, new Deer());
        animalClassesMap.put(Hog.class, new Hog());
        animalClassesMap.put(Sheep.class, new Sheep());
        animalClassesMap.put(Rabbit.class, new Rabbit());
        animalClassesMap.put(Goat.class, new Goat());
        animalClassesMap.put(Duck.class, new Duck());
        animalClassesMap.put(Mouse.class, new Mouse());
        animalClassesMap.put(Caterpillar.class, new Caterpillar());
    }

//
//    public static Animal createAnimalWithClone(AnimalType animalType) {
//        Animal prototype = (Animal) typeEntityMap.get(animalType);
//        Animal clone;
//        try {
//            clone = (Animal) prototype.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
//        return clone;
//    }

    public static Animal createAnimalByClass(Class<? extends Animal> animalClass) {
        Animal prototype = (Animal) animalClassesMap.get(animalClass);
//        if (prototype instanceof Animal) {
//            YamlConfigLoader.loadAnimalFieldsConfig((Animal) entity);
//            ((Animal) entity).setStarvation(((Animal) entity).getMaxFood()/2);
//        }
//        Animal clone;
//        try {
//            clone = (Animal) prototype.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new RuntimeException(e);
//        }
        return prototype;
    }
}
