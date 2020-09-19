package homeWork2.task3;

import java.util.Scanner;

public class Task3 {
    private static String inputNumber = null;

    public static void inputValueFromScreen() {
        System.out.println("Введите целое число в диапазоне от " + Integer.MIN_VALUE + " до " + (Integer.MAX_VALUE - 1));
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static int сhekValue() {
        int parseNumber = 0;
        try {
            parseNumber = Integer.parseInt(inputNumber);
            if (parseNumber > (Integer.MAX_VALUE - 1)) {
                System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
                System.exit(0);
            }
            return parseNumber;
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
            return parseNumber;
        }
    }

    public static int numberProcessing() {
        int outputNumber = 0;
        if (сhekValue() > 0) {
            outputNumber = сhekValue() + 1;
        } else if (сhekValue() < 0) {
            System.out.println("Введенное значение меньше нуля. Программа будет прервана");
            System.exit(0);
        } else if (сhekValue() == 0) {
            System.out.println("Введенное значение равно нулю. Программа будет прервана");
            System.exit(0);
        }
        return outputNumber;
    }

    public static void outputOnScreen() {
        System.out.println("Полученное число: " + numberProcessing());
    }
}