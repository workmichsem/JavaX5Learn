package homeWork3.task2;

public class Animal {
    protected String food;
    protected String location;
    private boolean isSleep;
    private boolean isNoise;
    private boolean isEat;

    public void makeNoise() {
        if (isNoise && !isSleep) {
            System.out.println("Это животное кричит");
        } else {
            System.out.println("Это животное молчит");
        }
    }

    public void eat() {
        if (isEat && !isSleep) {
            System.out.println("Это животное кушает");
        } else {
            System.out.println("Это животное не ест");
        }
    }

    public void sleep() {
        if (isSleep) {
            System.out.println("Это животное спит");
        } else {
            System.out.println("Это животное бодрствует");
        }
    }

    public Animal() {
        this.food = "defaul food";
        this.location = "default location";
        this.isSleep = false;
        this.isNoise = false;
        this.isEat = false;
    }

    public Animal(String food, String location, boolean isSleep, boolean isNoise, boolean isEat) {
        this.food = food;
        this.location = location;
        this.isSleep = isSleep;
        this.isNoise = isNoise;
        this.isEat = isEat;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}