package homeWork4.task1;

public class MainTask1 {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Triangle(3.14,5);
        shape[1] = new Circle(3.14,5);
        shape[2] = new Rectangle(3.14,5);
        for (Shape sh : shape) {
            System.out.println("Площадь фигуры: " + sh.square());
        }
    }
}