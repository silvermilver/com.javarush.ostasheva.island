package main.app;

import main.entity.location.Island;
import main.entity.location.Cell;
import main.entity.nature.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class IslandApplication {

    private static final int NUM_THREADS = 4;
    static ScheduledExecutorService executorService = Executors.newScheduledThreadPool(NUM_THREADS);

    public static void main(String[] args) throws InterruptedException {
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

        CountDownLatch latch = new CountDownLatch(NUM_THREADS);
        List<Callable<Void>> tasks = new ArrayList<>();
        for (int day = 1; day <= 5; day++) {
            tasks.clear();
            for (int i = 0; i < island.getWidth(); i++) {
                for (int j = 0; j < island.getHeight(); j++) {
                    Cell cell = island.getCells()[i][j];
                    tasks.add(() -> {
                        taskForCell(cell, island);
                        return null;
                    });
                    latch.countDown();
                }
            }
            executorService.invokeAll(tasks);
            latch.await();
            island.printStatistic(day);
        }
        shutdownExecutor();
    }

    private static void taskForCell(Cell cell, Island island) {
        cell.getPlant().reproduce();
        for (Animal animal : cell.getAllAnimals()) {
            animal.reduceActualSatiety();
            animal.eat(cell);
            animal.reproduce(cell);
            animal.move(cell, island);
        }
        cell.updateAnimals();
    }

    private static void shutdownExecutor() {
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }
    }
}