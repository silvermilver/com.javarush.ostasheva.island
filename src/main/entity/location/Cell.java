package main.entity.location;

import main.entity.nature.Animal;
import main.entity.nature.Plant;
import main.entity.nature.herbivore.*;
import main.entity.nature.predator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import static main.util.Rnd.random;

public class Cell implements Runnable {

    private int x, y;


    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        initializeNature();
    }

    private List<Animal> animalList = new ArrayList<>();
    private ConcurrentHashMap<Class<? extends Predator>, List<Predator>> predators = new ConcurrentHashMap<>();
    private ConcurrentHashMap<Class<? extends Herbivore>, List<Herbivore>> herbivores = new ConcurrentHashMap<>();


    public void initializeNature(){
        createPredator(5);
        createHerbivore(10);
        createPlant();
        setAnimalList();
    }

    public void createPlant() {
        plant = new Plant();
        plant.weight = 100;
    }

    public void createPredator(int number) {
        for(int i = 0; i < number; i++){
            int rnd = random(1, 5);
            Predator predator = switch (rnd) {
                case 1 -> new Bear();
                case 2 -> new Wolf();
                case 3 -> new Boa();
                case 4 -> new Fox();
                case 5 -> new Eagle();
                default -> throw new IllegalStateException("Unexpected predator number: " + rnd);
            };
                List<Predator> predatorList = predators.get(predator.getClass());
                if(predatorList == null){
                    predatorList = new ArrayList<>();
                }
                predatorList.add(predator);
                predators.put(predator.getClass(), predatorList);
        }
    }

    public void createHerbivore(int number) {
        for(int i = 0; i < number; i++){
            int rnd = random(1, 10);
            Herbivore herbivore = switch (rnd) {
                case 1 -> new Buffalo();
                case 2 -> new Horse();
                case 3 -> new Deer();
                case 4 -> new Hog();
                case 5 -> new Sheep();
                case 6 -> new Goat();
                case 7 -> new Rabbit();
                case 8 -> new Duck();
                case 9 -> new Mouse();
                case 10 -> new Caterpillar();
                default -> throw new IllegalStateException("Unexpected herbivore number: " + rnd);
            };
                List<Herbivore> herbivoreList = herbivores.get(herbivore.getClass());
                if(herbivoreList == null){
                    herbivoreList = new ArrayList<>();
                }
                herbivoreList.add(herbivore);
                herbivores.put(herbivore.getClass(), herbivoreList);
            }
    }

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
    List<Herbivore> caterpillarList = new ArrayList<>();
    List<Herbivore> deerList = new ArrayList<>();
    List<Herbivore> duckList = new ArrayList<>();
    List<Herbivore> goatList = new ArrayList<>();
    List<Herbivore> hogList = new ArrayList<>();
    List<Herbivore> horseList = new ArrayList<>();
    List<Herbivore> mouseList = new ArrayList<>();
    List<Herbivore> rabbitList = new ArrayList<>();
    List<Herbivore> sheepList = new ArrayList<>();
    List<Predator> buffaloList = new ArrayList<>();
    List<Predator> bearList = new ArrayList<>();
    List<Predator> boaList = new ArrayList<>();
    List<Predator> eagleList = new ArrayList<>();
    List<Predator> foxList = new ArrayList<>();
    List<Predator> wolfList = new ArrayList<>();

    @Override
    public void run() {
        List<Animal> animals = getAllAnimals();
        plant.reproduce();
        animals.forEach(Animal::reduceActualSatiety);
        animals.forEach(e -> e.eat(animals, plant));
        animals.forEach(e->e.reproduce(animals));
//        animals.forEach(e->e.move(map));
        updateAnimals();

    }

    public Plant getPlant() {
        return this.plant;
    }

    public List<Animal> getAllAnimals(){
        return this.animalList;
    }

    private void updateAnimals(){
        this.animalList = getAllAnimals().stream().filter(a -> !a.isDied).toList();
    }

    private List<Animal> setAnimalList(){
        predators.values().stream().forEach(l -> animalList.addAll(l));
        herbivores.values().stream().forEach(l -> animalList.addAll(l));
        return animalList;
    }

    @Override
    public String toString() {
        return "main.service.entity.nature.Cell{" +
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
