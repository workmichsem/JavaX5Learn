package homeWork5.task2;

public class GraphicsCardFactory extends ComputerElementFactory {
    @Override
    public ComputerElement createComputerElement() {
        return new GraphicsCard();
    }
}
