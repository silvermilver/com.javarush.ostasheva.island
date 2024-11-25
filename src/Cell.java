import nature.animals.Plant;
import nature.animals.herbivore.Duck;
import nature.animals.herbivore.Herbivore;
import nature.animals.predator.Predator;
import nature.animals.predator.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Cell {

    public static int MAX_PLANT = 200;
    public static int MAX_BUFFALO = 10;
    public static int MAX_CATERPILLAR = 1000;
    public static int MAX_DEER = 20;
    public static int MAX_DUCK = 200;
    public static int MAX_GOAT = 140;
    public static int MAX_HOG = 50;
    public static int MAX_HORSE = 20;
    public static int MAX_MOUSE = 500;
    public static int MAX_RABBIT = 150;
    public static int MAX_SHEEP = 140;
    public static int MAX_BEAR = 5;
    public static int MAX_BOA = 30;
    public static int MAX_EAGLE = 20;
    public static int MAX_FOX = 30;
    public static int MAX_WOLF = 30;

    Plant plant;
    List<Plant> plantList = new ArrayList<>();
    List<Predator> buffaloList = new ArrayList<>();
    List<Herbivore> caterpillarList = new ArrayList<>();
    List<Herbivore> deerList = new ArrayList<>();
    List<Herbivore> duckList = new ArrayList<>();
    List<Herbivore> goatList = new ArrayList<>();
    List<Herbivore> hogList = new ArrayList<>();
    List<Herbivore> horseList = new ArrayList<>();
    List<Herbivore> mouseList = new ArrayList<>();
    List<Herbivore> rabbitList = new ArrayList<>();
    List<Herbivore> sheepList = new ArrayList<>();
    List<Predator> bearList = new ArrayList<>();
    List<Predator> boaList = new ArrayList<>();
    List<Predator> eagleList = new ArrayList<>();
    List<Predator> foxList = new ArrayList<>();
    List<Predator> wolfList = new ArrayList<>();


    public void createPlant() {
        plant = new Plant();
        plant.weight = 100;
    }

    public void createPredator(int number) {
        for(int i = 0; i < number; i++){
            Predator predator = new Wolf();
            if(wolfList.size() < MAX_WOLF){
                wolfList.add(predator);
            }
        }
    }

    public void createHerbivores(int number) {
        for(int i = 0; i < number; i++){
            Herbivore herbivore = new Duck();
            if(duckList.size() < MAX_DUCK){
                duckList.add(herbivore);
            }
        }
    }

    @Override
    public String toString() {
        return "Cell{" +
                " \uD83C\uDF31 plant=" + plant.weight +
                ", \uD83D\uDC03 buffaloList=" + buffaloList.size() +
                ", \uD83D\uDC1BcaterpillarList=" + caterpillarList.size() +
                ", \uD83E\uDD8C deerList=" + deerList.size() +
                ", \uD83E\uDD86 duckList=" + duckList.size() +
                ", \uD83D\uDC10 goatList=" + goatList.size() +
                ", \uD83D\uDC17 hogList=" + hogList.size() +
                ", \uD83D\uDC0E horseList=" + horseList.size() +
                ", \uD83D\uDC01 mouseList=" + mouseList.size() +
                ", \uD83D\uDC07 rabbitList=" + rabbitList.size() +
                ", \uD83D\uDC11 sheepList=" + sheepList.size() +
                ", \uD83D\uDC3B bearList=" + bearList.size() +
                ", \uD83D\uDC0D boaList=" + boaList.size() +
                ", \uD83E\uDD85 eagleList=" + eagleList.size() +
                ", \uD83E\uDD8A foxList=" + foxList.size() +
                ", \uD83D\uDC3A wolfList=" + wolfList.size() +
                '}';
    }
}
