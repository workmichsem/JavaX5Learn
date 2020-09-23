package homeWork3.task2;


public class MainTask2 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat("еда для кота", "место, где живет кот"),
                new Dog("еда для собаки", "место, где живет собака"),
                new Horse("еда для лошади", "место, где живет лошадь")};
        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal(animals[0]);
        for (int i = 0; i > animals.length; i++) {
            veterinarian.treatAnimal(animals[i]);
        }
    }
}