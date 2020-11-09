package homeWork4.task1;

public class Triangle implements Shape {
    public double a;
    public double b;

    @Override
    public String square() {
        return String.valueOf(a * b / 2);
    }

    public Triangle() {

    }

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
