package homeWork3.task3;

public class Aspirant extends Student {
    private boolean isHaveScientificWork;

    @Override
    public int getScholarship() {
        if (averageMark == 5.0) {
            return 200;
        } else {
            return 180;
        }
    }

    public Aspirant() {
        this.firstName = "default_firstName";
        this.lastName = "default_lastName";
        this.averageMark = 5.0;
        this.isHaveScientificWork = true;
    }

    public Aspirant(String firstName, String lastName, double averageMark) {
        super(firstName, lastName, averageMark);
    }
}