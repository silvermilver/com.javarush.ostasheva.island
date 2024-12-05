package main.settings;

import main.entity.nature.Animal;
import main.entity.nature.herbivore.*;
import main.entity.nature.predator.*;

public enum HerbivoreType {
    HORSE("🐎"),
    DEER("🦌"),
    HOG("🐗"),
    SHEEP("🐑"),
    GOAT("🐐"),
    BUFFALO("🐃"),
    RABBIT("🐇"),
    DUCK("🦆"),
    MOUSE("🐁"),
    CATERPILLAR("🐛");

    private final String picture;

    HerbivoreType(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public static boolean isHerbivore(String name) {
        try {
            valueOf(name.toUpperCase());
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

//    public static String getPictureByClass(Class<? extends Herbivore> herbClass){
//        String picture = switch (herbClass) {
//            case Buffalo.class -> BUFFALO.picture;
//            case Horse.class -> HORSE.picture;
//            case Deer.class -> DEER.picture;
//            case Hog.class -> HOG.picture;
//            case Sheep.class -> SHEEP.picture;
//            case Goat.class -> GOAT.picture;
//            case Rabbit.class -> RABBIT.picture;
//            case Duck.class -> DUCK.picture;
//            case Mouse.class -> MOUSE.picture;
//            case Caterpillar.class -> CATERPILLAR.picture;
//        };
//        return picture;
//    }
}
