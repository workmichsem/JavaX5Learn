package homeWork5.task2;

public class RAM implements ComputerElement {
    private String manufacturer;
    private String memorySize;
    private String frequency;
    private String memoryType;

    @Override
    public void getInfo() {
        System.out.println("Информация о процессоре:");
        System.out.println(manufacturer);
        System.out.println(memorySize);
        System.out.println(frequency);
        System.out.println(memoryType);
        System.out.println("-----------------------------");
    }

    public RAM() {
        this.manufacturer = "default manufacturer";
        this.memorySize = "default memorySize";
        this.frequency = "default frequency";
        this.memoryType = "default memoryType";
    }
}