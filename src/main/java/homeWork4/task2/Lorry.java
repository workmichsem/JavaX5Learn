package homeWork4.task2;

public class Lorry extends Car {

    private double carrying;

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(model);
        System.out.println(carClass);
        System.out.println(engine.manufacturer);
        System.out.println(engine.power);
        System.out.println(carrying);
    }

    public Lorry() {
        this.model = "default модель";
        this.carClass = "default класс";
        this.carrying = 5.0;
    }
}