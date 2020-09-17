package homeWork3.task2;

public class Dog extends Animal {
private boolean isYelp;
    private String food;
    private String location;

    @Override
    public void eat() {
        System.out.println("Собака кушает " + food);
    }

    @Override
    public void makeNoise() {
        if (isYelp) {
            System.out.println("Собака сейчас лает");
        }
    }

    public Dog(){
        this.isYelp = false;
        this.food = "Мясо";
        this.location = "Москва";
    }
}
