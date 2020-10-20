package homeWork5.task2;

public class StorageDeviceFactory extends ComputerElementFactory {
    @Override
    public ComputerElement createComputerElement(String param) {
        return new StorageDevice(param);
    }
}
