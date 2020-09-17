package homeWork3.task2;

public class Horse extends Animal {
    private boolean islaugh;
    private String food;
    private String location;

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

    public Horse(){
        this.islaugh = false;
        this.food = "Сено";
        this.location = "Самара";
    }
}
