package main.app;

import main.entity.location.Island;
import main.entity.location.Cell;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IslandApplication {

    public static int time = 0;

    public static void main(String[] args) {
        System.out.println("Давайте создадим остров! Введите размеры для запуска эмуляции.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ширина(х): ");
//        int width = scanner.nextInt();
        int width = 2;
        System.out.print("Высота(у): ");
//        int height = scanner.nextInt();
        int height = 2;
        Island island = Island.getIsland(width, height);

        System.out.println("Начинаем симуляцию...");

//        ExecutorService mainPool = Executors.newFixedThreadPool(3);
        for (int day = 1; day <= 5; day++) {
            for (int i = 0; i < island.getWidth(); i++) {
                for (int j = 0; j < island.getHeight(); j++) {
                    Cell cell = island.getCells()[i][j];
//                    mainPool.execute(cell);
                    cell.run();
                }
            }
            island.printStatistic(day);
        }

    }
}