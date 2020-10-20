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

    public RAM(String param) {
        if (param == "250R8") {
            this.manufacturer = "Intel";
            this.memorySize = "8";
            this.frequency = "1667";
            this.memoryType = "RAM";
        }
        if (param == "R44R16") {
            this.manufacturer = "Kingston";
            this.memorySize = "16";
            this.frequency = "2444";
            this.memoryType = "RAM";
        }
    }
}