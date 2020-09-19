package homeWork2.task7;

import java.util.Scanner;

public class Task7 {
    private static String inputNumber = null;

    public static void inputValueFromScreen() {
        System.out.println("Введите целое трехзначное положительное число");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static int сhekValue() {
        int parseNumber = 0;
        try {
            parseNumber = Integer.parseInt(inputNumber);
            if (parseNumber > Integer.MAX_VALUE || parseNumber < Integer.MIN_VALUE || inputNumber.length() != 3) {
                System.out.println("Произошла ошибка. Программа будет прервана.");
                System.exit(0);
            }
            return parseNumber;
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
            return parseNumber;
        }
    }

    public static void numberProcessing() {
        double minutes = 10;
        double costMoscow = 4.15;
        double costRostov = 1.98;
        double costKrasnodar = 2.69;
        double costKirov = 5.00;
        double outputNumber = 0;
        switch (сhekValue()) {
            case 905:
                outputNumber = minutes * costMoscow;
                outputOnScreen("Москва", outputNumber);
                break;
            case 194:
                outputNumber = minutes * costRostov;
                outputOnScreen("Ростов", outputNumber);
                break;
            case 491:
                outputNumber = minutes * costKrasnodar;
                outputOnScreen("Краснодар", outputNumber);
                break;
            case 800:
                outputNumber = minutes * costKirov;
                outputOnScreen("Киров", outputNumber);
                break;
            default:
                System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
                break;
        }
    }

    public static void outputOnScreen(String city, double outVal) {
        System.out.println("Выбран код города " + city + ". Стоимость 10 минут разговора: " + outVal);
    }
}
