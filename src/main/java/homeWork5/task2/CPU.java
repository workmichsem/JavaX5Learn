package homeWork5.task2;

public class CPU implements ComputerElement {
    private String clockFrequency;
    private String numberOfCores;
    private String cache;
    private String memory;
    private String name;
    private String manufacturer;

    @Override
    public void getInfo() {
        System.out.println("Информация о процессоре:");
        System.out.println(clockFrequency);
        System.out.println(numberOfCores);
        System.out.println(cache);
        System.out.println(memory);
        System.out.println(name);
        System.out.println(manufacturer);
        System.out.println("-----------------------------");
    }

    public CPU() {
        this.clockFrequency = "default clockFrequency";
        this.numberOfCores = "default numberOfCores";
        this.cache = "default cache";
        this.memory = "default memory";
        this.name = "default name";
        this.manufacturer = "default manufacturer";
    }

    public CPU(String param) {
        if (param == "i5-5300U") {
            this.clockFrequency = "2";
            this.numberOfCores = "4";
            this.cache = "6";
            this.memory = "32";
            this.name = param;
            this.manufacturer = "Intel";
        }
        if (param == "i7-9900K") {
            this.clockFrequency = "2";
            this.numberOfCores = "8";
            this.cache = "12";
            this.memory = "128";
            this.name = param;
            this.manufacturer = "Intel";
        }
    }
}
