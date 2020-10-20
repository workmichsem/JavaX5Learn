package homeWork5.task2;

public class RAMFactory extends ComputerElementFactory {
    @Override
    public ComputerElement createComputerElement(String param) {
        return new RAM(param);
    }
}
