package homeWork4.task2;

public abstract class Car {
    protected String model;
    protected String carClass;
    protected Engine engine = new Engine();

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}