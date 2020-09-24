package homeWork4.task2;

public class Engine {
    protected int power;
    protected String manufacturer;

    public Engine() {
        this.power = 100;
        this.manufacturer = "default производитель";
    }

    public Engine(int power, String manufacturer) {
        this.power = power;
        this.manufacturer = manufacturer;
    }
}
