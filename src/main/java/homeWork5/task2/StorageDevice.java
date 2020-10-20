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

    public StorageDevice(String param) {
        if (param == "QR34") {
            this.manufacturer = "Kingston";
            this.memorySize = "1024";
            this.storageType = "ROM";
            this.forms = "3.5'";
        }
        if (param == "334GR") {
            this.manufacturer = "QUMO";
            this.memorySize = "2048";
            this.storageType = "ROM";
            this.forms = "2.5'";
        }
    }
}