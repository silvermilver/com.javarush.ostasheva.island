package main.entity.location;

import main.entity.nature.Nature;
import main.entity.nature.Plant;
import main.entity.nature.herbivore.*;
import main.entity.nature.predator.*;
import java.util.concurrent.ConcurrentHashMap;

public class Island {

    private static Island island;
    private int width;
    private int height;
    private Cell[][] cells;

    public Island(int x, int y) {
        this.width = x;
        this.height = y;
        this.cells = new Cell[x][y];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Cell cell = new Cell(i, j);
                cells[i][j] = cell;
            }
        }
        System.out.println("Остров создан! Размер: " + width + "x" + height);
    }

    public static Island getIsland(int width, int height) {
        if (island == null) {
            island = new Island(width, height);
        }
        return island;
    }

    public  void printStatistic(int day){
        System.out.print("День " + day + " итого:  ");
        ConcurrentHashMap<Class<? extends Nature>, Integer> totalCount = initTotalAnimalMaps();
        double plantWeight = 0;
        for (int i = 0; i < island.cells.length; i++) {
            for (int j = 0; j < island.cells[i].length; j++) {
                Cell cell = island.cells[i][j];
                cell.getHerbivores().forEach((clazz, list) ->
                        totalCount.put(clazz, totalCount.get(clazz) + list.size())
                );
                cell.getPredators().forEach((clazz, list) ->
                        totalCount.put(clazz, totalCount.get(clazz) + list.size())
                );
                plantWeight = plantWeight + cell.getPlant().getWeight();
            }
        }
        totalCount.forEach((clazz, count) -> System.out.print(clazz + "=" + count + " "));
        System.out.print(Plant.class + "=" + plantWeight + " ");
        System.out.println();

    }

    private ConcurrentHashMap<Class<? extends Nature>, Integer> initTotalAnimalMaps() {
        ConcurrentHashMap<Class<? extends Nature>, Integer>  totalCount = new ConcurrentHashMap<>();
        totalCount.put(Buffalo.class, 0);
        totalCount.put(Horse.class, 0);
        totalCount.put(Deer.class, 0);
        totalCount.put(Hog.class, 0);
        totalCount.put(Sheep.class, 0);
        totalCount.put(Goat.class, 0);
        totalCount.put(Rabbit.class, 0);
        totalCount.put(Duck.class, 0);
        totalCount.put(Mouse.class, 0);
        totalCount.put(Caterpillar.class, 0);
        totalCount.put(Fox.class, 0);
        totalCount.put(Bear.class, 0);
        totalCount.put(Boa.class, 0);
        totalCount.put(Wolf.class, 0);
        totalCount.put(Eagle.class, 0);
        totalCount.put(Plant.class, 0);
        return totalCount;
    }

    public Cell[][] getCells() {
        return cells;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

}
