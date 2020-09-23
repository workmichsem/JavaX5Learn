package homeWork3.task3;

public class Student {
    protected String firstName;
    protected String lastName;
    protected double averageMark;

    public int getScholarship() {
        if (averageMark == 5.0) {
            return 100;
        } else {
            return 80;
        }
    }

    public Student() {
        this.firstName = "default_firstName";
        this.lastName = "default_lastName";
        this.averageMark = 5.0;
    }

    public Student(double averageMark) {
        this.firstName = "default_firstName";
        this.lastName = "default_lastName";
        this.averageMark = averageMark;
    }
}