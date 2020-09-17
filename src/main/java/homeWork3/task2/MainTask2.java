package homeWork3.task2;


public class MainTask2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Horse()};
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(animals[0]);
        for (int i = 0; i > animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}