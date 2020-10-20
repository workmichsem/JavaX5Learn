package homeWork5.task2;

public class GraphicsCard implements ComputerElement {
    private String manufacturer;
    private String memoryType;
    private String sizeMemory;
    private String cooling;

    @Override
    public void getInfo() {
        System.out.println("Информация о процессоре:");
        System.out.println(manufacturer);
        System.out.println(memoryType);
        System.out.println(sizeMemory);
        System.out.println(cooling);
        System.out.println("-----------------------------");
    }

    public GraphicsCard() {
        this.manufacturer = "default manufacturer";
        this.memoryType = "default memoryType";
        this.sizeMemory = "default sizeMemory";
        this.cooling = "default cooling";
    }

    public GraphicsCard(String param) {
        if (param=="930M"){
            this.manufacturer = "NVidia";
            this.memoryType = "RAM";
            this.sizeMemory = "2";
            this.cooling = "fan";
        }
        if (param=="RX350"){
            this.manufacturer = "Radeon";
            this.memoryType = "RAM";
            this.sizeMemory = "4";
            this.cooling = "water";
        }
    }
}