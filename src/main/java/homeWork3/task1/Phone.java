package homeWork3.task1;

public class Phone {
    private String number = "default number";
    private String model = "default model";
    private String weight = "default weight";

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public void printPhoneInfo() {
        System.out.println(number);
        System.out.println(model);
        System.out.println(weight);
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + " с номера " + callerNumber);
    }

    public void getNumber() {
        System.out.println(number);
    }

    public void sendMessage(String...inputNumber) {
        for (int i=0; i<inputNumber.length; i++) {
            System.out.println(inputNumber[i]);
        }
    }

}