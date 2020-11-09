package homeWork4.task1;

public class Rectangle implements Shape {
    public double a;
    public double b;

    @Override
    public String square() {
        return String.valueOf(a * b);
    }

    public Rectangle() {

    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

}
