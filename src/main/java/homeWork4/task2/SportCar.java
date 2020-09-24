package homeWork4.task2;

public class SportCar extends Car {

    private double maxSpeed;

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void printInfo() {
        System.out.println(model);
        System.out.println(carClass);
        System.out.println(engine.manufacturer);
        System.out.println(engine.power);
        System.out.println(maxSpeed);
    }

    public SportCar() {
        this.model = "default модель";
        this.carClass = "default класс";
        this.maxSpeed = 200.0;
    }
}