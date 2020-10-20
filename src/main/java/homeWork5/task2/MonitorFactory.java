package homeWork5.task2;

public class MonitorFactory extends ComputerElementFactory {
    @Override
    public ComputerElement createComputerElement(String param) {
        return new Monitor(param);
    }
}
