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
}
