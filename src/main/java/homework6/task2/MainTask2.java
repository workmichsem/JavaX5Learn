package homework6.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1.0);
        Apple apple2 = new Apple(1.0);
        Orange orange1 = new Orange(1.5);
        Orange orange2 = new Orange(1.5);

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
    public static double getBoxWeight(Box box) {
        box.getWeight();
//        if (box instanceof Apple) {
//            System.out.println(data.length * appleCost);
//            return data.length * appleCost;
//        } else if (data[0] instanceof Orange) {
//            System.out.println(data.length * orangeCost);
//            return data.length * orangeCost;
//        }
        return 0;
    }
}


//        double appleCost = 1.0; -
//        не должно храниться в коробке.
//        Коробка о весе фруктов знать не должна.
//        Соответственно коробка так же не должна data[0] instanceof Apple опередлять
//        тип фруктов, которые в ней.
