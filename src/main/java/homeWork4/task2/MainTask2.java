package homeWork4.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        SportCar sportCar = new SportCar();
        lorry.start();
        lorry.stop();
        lorry.printInfo();
        sportCar.start();
        sportCar.stop();
        sportCar.printInfo();
    }
}