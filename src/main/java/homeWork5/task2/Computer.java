package homeWork5.task2;

public class Computer {
    ComputerElementFactory cPUElementFactory = new CPUFactory();
    ComputerElement cPUObj = cPUElementFactory.createComputerElement();
    ComputerElementFactory graphicsCardElementFactory = new GraphicsCardFactory();
    ComputerElement graphicsCardObj = graphicsCardElementFactory.createComputerElement();
    ComputerElementFactory monitorElementFactory = new MonitorFactory();
    ComputerElement monitorObj = monitorElementFactory.createComputerElement();
    ComputerElementFactory rAMElementFactory = new RAMFactory();
    ComputerElement rAMObj = rAMElementFactory.createComputerElement();
    ComputerElementFactory storageDeviceElementFactory = new StorageDeviceFactory();
    ComputerElement storageDevice = storageDeviceElementFactory.createComputerElement();

    public void outputComputerInfo() {
        cPUObj.getInfo();
        graphicsCardObj.getInfo();
        monitorObj.getInfo();
        rAMObj.getInfo();
        storageDevice.getInfo();
    }
}