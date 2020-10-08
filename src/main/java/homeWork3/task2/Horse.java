package homeWork3.task2;

public class Horse extends Animal {
    public boolean islaugh;

    @Override
    public void eat() {
        System.out.println("Лошадь кушает " + food);
    }

    @Override
    public void makeNoise() {
        if (islaugh) {
            System.out.println("Лошадь сейчас ржет");
        }
    }

    public Horse() {
        this.islaugh = false;
        this.food = "Сено";
        this.location = "Самара";
    }

    public Horse(String food, String location) {
        this.food = food;
        this.location = location;
    }
}
