package homeWork3.task1;


public class MainTask1 {
    public static void main(String[] args) {
        Phone ex1 = new Phone("+79991478521", "модель 1", "100");
        Phone ex2 = new Phone("+79991478522", "модель 2", "200");
        Phone ex3 = new Phone("+79991478523", "модель 3", "300");

        ex1.printPhoneInfo();
        ex2.printPhoneInfo();
        ex3.printPhoneInfo();

        ex1.receiveCall("Александр");
        ex1.getNumber();
        ex2.receiveCall("Петр");
        ex2.getNumber();
        ex3.receiveCall("Сергей");
        ex3.getNumber();

        ex1.receiveCall("Александр", "+74956587431");
        ex2.receiveCall("Петр", "+74956587432");
        ex3.receiveCall("Сергей", "+74956587433");

        ex1.sendMessage("+749554732021","+749554732022","+749554732023","+749554732024","+749554732025",
                "+749554732026");
    }
}
