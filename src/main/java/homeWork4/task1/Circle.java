package homeWork4.task1;

public class Circle implements Shape {
    public double a;
    public double b;

    @Override
    public String square() {
        if (a == 3.14) {
            return String.valueOf(a * b * b);
        }
        return null;
    }

    public Circle() {

    }

    public Circle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
