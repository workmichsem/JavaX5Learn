package homeWork5.task2;

public class Computer {

    ComputerElementFactory cPUElementFactory = new CPUFactory();
    ComputerElement cPUObj;
    ComputerElementFactory graphicsCardElementFactory = new GraphicsCardFactory();
    ComputerElement graphicsCardObj;
    ComputerElementFactory monitorElementFactory = new MonitorFactory();
    ComputerElement monitorObj;
    ComputerElementFactory rAMElementFactory = new RAMFactory();
    ComputerElement rAMObj;
    ComputerElementFactory storageDeviceElementFactory = new StorageDeviceFactory();
    ComputerElement storageDeviceObj;

    public void outputComputerInfo() {
        cPUObj.getInfo();
        graphicsCardObj.getInfo();
        monitorObj.getInfo();
        rAMObj.getInfo();
        storageDeviceObj.getInfo();
    }

    public Computer(String cPU, String graphicsCard, String monitor, String ram, String storageDevice) {
        cPUObj = cPUElementFactory.createComputerElement(cPU);
        graphicsCardObj = graphicsCardElementFactory.createComputerElement(graphicsCard);
        monitorObj = monitorElementFactory.createComputerElement(monitor);
        rAMObj = rAMElementFactory.createComputerElement(ram);
        storageDeviceObj = storageDeviceElementFactory.createComputerElement(storageDevice);
    }
}