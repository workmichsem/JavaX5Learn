package homeWork2.task7;

import java.util.Scanner;

public class Task7 {
    private static String inputNumber = null;
    private static double outputNumber;
    private static int parseNumber;
    private static double minutes = 10;
    private static double costMoscow = 4.15;
    private static double costRostov = 1.98;
    private static double costKrasnodar = 2.69;
    private static double costKirov = 5.00;

    public static void inputValueFromScreen(){
        System.out.println("Введите целое трехзначное положительное число");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static boolean сhekValue(){
        try {
            parseNumber = Integer.parseInt(inputNumber);
            if (parseNumber > 2147483647 || parseNumber < -2147483648 || inputNumber.length() != 3){
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void numberProcessing() {
        if (сhekValue()) {
            switch (parseNumber) {
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
        } else {
            System.out.println("Произошла ошибка. Программа будет прервана.");
            System.exit(0);
        }
    }

    public static void outputOnScreen(String city, double outVal){
        System.out.println("Выбран код города " + city + ". Стоимость 10 минут разговора: " + outVal);
    }
}
