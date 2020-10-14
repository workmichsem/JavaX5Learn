package homework6.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Apple apple1 = new Apple("Белое");
        Apple apple2 = new Apple("Красное");
        Orange orange1 = new Orange("Турецкий");
        Orange orange2 = new Orange("Абхазский");

        Box<Apple> boxApple = new Box<Apple>();
        boxApple.add(apple1);
        boxApple.add(apple2);
        boxApple.getWeight();

        Box<Orange> boxOrange = new Box<Orange>();
        boxOrange.add(orange1);
        boxOrange.add(orange2);
        boxOrange.getWeight();

        Box.compare(boxApple,boxOrange);
    }
}