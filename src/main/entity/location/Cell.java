package main.entity.location;

import main.entity.nature.Animal;
import main.entity.nature.Plant;
import main.entity.nature.herbivore.*;
import main.entity.nature.predator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static main.util.Rnd.random;

public class Cell {

    private int x, y;
    public Island island;
    public Plant plant;
    private List<Animal> animalList = new ArrayList<>();
    private List<Animal> childList = new ArrayList<>();
    private ConcurrentHashMap<Class<? extends Predator>, List<Predator>> predators = initPredatorsMap();
    private ConcurrentHashMap<Class<? extends Herbivore>, List<Herbivore>> herbivores = initHerbivoresMap();

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        initializeNature();
    }

    public void initializeNature(){
        createPredator(5);
        createHerbivore(10);
        createPlant();
        setAnimalList();
    }

    private ConcurrentHashMap<Class<? extends Predator>, List<Predator>> initPredatorsMap() {
        this.predators = new ConcurrentHashMap<>();
        predators.put(Bear.class, new ArrayList<Predator>());
        predators.put(Wolf.class, new ArrayList<Predator>());
        predators.put(Boa.class, new ArrayList<Predator>());
        predators.put(Fox.class, new ArrayList<Predator>());
        predators.put(Eagle.class, new ArrayList<Predator>());
        return predators;
    }

    private ConcurrentHashMap<Class<? extends Herbivore>, List<Herbivore>> initHerbivoresMap() {
        this.herbivores = new ConcurrentHashMap<>();
        herbivores.put(Buffalo.class, new ArrayList<Herbivore>());
        herbivores.put(Horse.class, new ArrayList<Herbivore>());
        herbivores.put(Deer.class, new ArrayList<Herbivore>());
        herbivores.put(Hog.class, new ArrayList<Herbivore>());
        herbivores.put(Sheep.class, new ArrayList<Herbivore>());
        herbivores.put(Goat.class, new ArrayList<Herbivore>());
        herbivores.put(Rabbit.class, new ArrayList<Herbivore>());
        herbivores.put(Duck.class, new ArrayList<Herbivore>());
        herbivores.put(Mouse.class, new ArrayList<Herbivore>());
        herbivores.put(Caterpillar.class, new ArrayList<Herbivore>());
        return herbivores;
    }

    public void createPlant() {
        plant = new Plant();
        plant.weight = 100;
    }

    public ConcurrentHashMap<Class<? extends Predator>, List<Predator>> getPredators() {
        return predators;
    }

    public ConcurrentHashMap<Class<? extends Herbivore>, List<Herbivore>> getHerbivores() {
        return herbivores;
    }

    public List<Animal> getChildList() {
        return childList;
    }

    public void createPredator(int number) {
        for(int i = 0; i < number; i++){
            int rnd = random(1, 6);
            Predator predator = switch (rnd) {
                case 1 -> new Bear();
                case 2 -> new Wolf();
                case 3 -> new Boa();
                case 4 -> new Eagle();
                case 5 -> new Fox();
                default -> throw new IllegalStateException("Unexpected predator number: " + rnd);
            };
                predator.setCell(this);
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
            int rnd = random(1, 11);
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
                herbivore.setCell(this);
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

    public Plant getPlant() {
        return this.plant;
    }

    public List<Animal> getAllAnimals(){
        return this.animalList;
    }

    public void updateAnimals(){
        this.animalList = getAllAnimals().stream().filter(a -> !a.isDied).toList();
        this.animalList = Stream.concat(
                getAllAnimals().stream(), getChildList().stream()).parallel()
                .collect(Collectors.toList());
    }

    private List<Animal> setAnimalList(){
        predators.values().stream().forEach(l -> animalList.addAll(l));
        herbivores.values().stream().forEach(l -> animalList.addAll(l));
        return animalList;
    }
}
