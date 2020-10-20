package homeWork5.task2;

public class CPUFactory extends ComputerElementFactory {
    @Override
    public ComputerElement createComputerElement(String param) {
        return new CPU(param);
    }
}
