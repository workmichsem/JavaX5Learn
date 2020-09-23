package homeWork3.task3;


public class MainTask3 {
    public static void main(String[] args) {
        Student student = new Student();
        if (student instanceof Aspirant) {
            Aspirant aspirant = (Aspirant) student;
        }
        Student[] students = new Student[]{new Student(5.0), new Aspirant(4.9)};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getScholarship());
        }
    }
}