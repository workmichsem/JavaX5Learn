package homeWork4.task1;

public class Circle implements Shape {

    @Override
    public String square(double a, double b) {
        if (a == 3.14) {
            return String.valueOf(a * b * b);
        }
        return null;
    }
}
