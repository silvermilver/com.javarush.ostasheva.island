package main.fabrik;

import main.entity.nature.Animal;
import main.entity.nature.AnimalType;
import main.entity.nature.herbivore.*;
import main.entity.nature.predator.*;

public class AnimalFactory {

    public static Animal createEntity(AnimalType entityType) {
        Animal entity = switch (entityType) {
            case BUFFALO -> new Buffalo();
            case BEAR -> new Bear();
            case HORSE -> new Horse();
            case DEER -> new Deer();
            case HOG -> new Hog();
            case SHEEP -> new Sheep();
            case GOAT -> new Goat();
            case WOLF -> new Wolf();
            case BOA -> new Boa();
            case FOX -> new Fox();
            case EAGLE -> new Eagle();
            case RABBIT -> new Rabbit();
            case DUCK -> new Duck();
            case MOUSE -> new Mouse();
            case CATERPILLAR -> new Caterpillar();
        };
//        if (entity instanceof Animal) {
//            YamlConfigLoader.loadAnimalFieldsConfig((Animal) entity);
//            ((Animal) entity).setStarvation(((Animal) entity).getMaxFood()/2);
//        }
        return entity;
    }

}
