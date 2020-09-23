package homeWork3.task2;

public class Veterinarian {

    public void treatAnimal(Animal animal) {
        System.out.println("Локация животного - " + animal.getLocation());
        System.out.println("Животное кушает - " + animal.getFood());
    }
}
