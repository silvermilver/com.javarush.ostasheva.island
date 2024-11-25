public class Main {

    public static int time = 0;

    public static void main(String[] args) {
        System.out.println("Start!");

        Cell cell = init();
        for(int i = 0; i < 5; i++){
            cell.plant.weight += 20;
            getStatistic(cell);
        }
    }

public static Cell init(){
    Cell cell = new Cell();
    cell.createPlant();
    cell.createPredator(5);
    cell.createHerbivores(10);
    return cell;
}

    public static void getStatistic(Cell cell) {
        time++;
        System.out.println("Day " + time + ". In system are:");
        System.out.println(cell.toString());
    }

}