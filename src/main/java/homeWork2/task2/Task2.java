package homeWork2.task2;

import java.util.Scanner;

public class Task2 {
    private static String inputNumber = null;

    public static void inputValueFromScreen() {
        System.out.println("Введите положитльное целое трехзначное число");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static int[] parseValue() {
        int[] arrNum = new int[3];
        try {
            if (inputNumber.length() == 3) {
                for (int i = 0; i < inputNumber.length(); i++) {
                    arrNum[i] = Integer.parseInt(String.valueOf(inputNumber.charAt(i)));
                }
                return arrNum;
            } else {
                System.out.println("Введенное значение не соответствует по количеству символов. Программа будет прервана.");
                System.exit(0);
                return arrNum;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
            return arrNum;
        }
    }

    public static int calculateSum() {
        int outputNumber = 0;
        parseValue();
        for (int i = 0; i < parseValue().length; i++) {
            outputNumber = outputNumber + parseValue()[i];
        }
        return outputNumber;
    }

    public static void outputOnScreen() {
        System.out.println("Сумма цифр в введенном числе: " + calculateSum());
    }
}