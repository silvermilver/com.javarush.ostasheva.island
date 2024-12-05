package main.entity.location;

import java.util.TreeMap;

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
        TreeMap<String, Integer> totalCount = new TreeMap<>();

//        for (HerbivoreType herbivore : HerbivoreType.values()) {
//            totalCount.put(herbivore.getPicture(), 0);
//        }
//        for (PredatorType predator : PredatorType.values()) {
//            totalCount.put(predator.getPicture(), 0);
//        }
//        totalCount.put(Plant.getPicture(), 0);

        for (int i = 0; i < island.cells.length; i++) {
            for (int j = 0; j < island.cells[i].length; j++) {
                Cell cell = island.cells[i][j];
                cell.toString();
//                cell.getHerbivores().forEach((type, list) ->
//                        totalCount.put(type.getPicture(), totalCount.get(type.getPicture()) + list.size())
//                );
//
//                cell.getPredators().forEach((type, list) ->
//                        totalCount.put(type.getPicture(), totalCount.get(type.getPicture()) + list.size())
//                );
//
//                totalCount.put(Plant.getPicture(), totalCount.get(Plant.getPicture()) + cell.getPlants().size());
            }
        }

//        totalCount.forEach((picture, count) -> System.out.print(picture + "=" + count + " "));
//        System.out.println();

    }

    public void printCells() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                System.out.println(cells[i][j]);
            }
        }
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
