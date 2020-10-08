package homeWork3.task2;

public class Cat extends Animal {
    public boolean isMeow;

    @Override
    public void eat() {
        System.out.println("Кошка кушает " + food);
    }

    @Override
    public void makeNoise() {
        if (isMeow) {
            System.out.println("Кошка сейчас мяукает");
        }
    }

    public Cat() {
        this.isMeow = false;
        this.food = "Рыба";
        this.location = "Казань";
    }

    public Cat(String food, String location) {
        this.food = food;
        this.location = location;
    }
}
