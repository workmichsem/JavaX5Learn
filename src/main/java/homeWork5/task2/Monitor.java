package homeWork5.task2;

public class Monitor implements ComputerElement {
    private String diagonal;
    private String resolution;
    private String matrixType;
    private String manufacturer;

    @Override
    public void getInfo() {
        System.out.println("Информация о мониторе:");
        System.out.println(diagonal);
        System.out.println(resolution);
        System.out.println(matrixType);
        System.out.println(manufacturer);
        System.out.println("-----------------------------");
    }

    public Monitor() {
        this.diagonal = "default diagonal";
        this.resolution = "default resolution";
        this.matrixType = "default matrixType";
        this.manufacturer = "default manufacturer";
    }
}