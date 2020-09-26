package homeWork5.task2;

public class StorageDevice implements ComputerElement {
    private String manufacturer;
    private String memorySize;
    private String storageType;
    private String forms;

    @Override
    public void getInfo() {
        System.out.println("Информация о процессоре:");
        System.out.println(manufacturer);
        System.out.println(memorySize);
        System.out.println(storageType);
        System.out.println(forms);
        System.out.println("-----------------------------");
    }

    public StorageDevice() {
        this.manufacturer = "default manufacturer";
        this.memorySize = "default memorySize";
        this.storageType = "default storageType";
        this.forms = "default forms";
    }
}