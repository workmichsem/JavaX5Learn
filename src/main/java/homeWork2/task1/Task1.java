package homeWork2.task1;

import java.util.Scanner;

public class Task1 {
    private static String inputNumber = null;

    public static void inputValueFromScreen() {
        System.out.println("Введите целое число в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static int parseValue() {
        int parseToIntNumber = 0;
        try {
            parseToIntNumber = Integer.parseInt(inputNumber);
            return parseToIntNumber;
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не является числом или значение вне диапазона. Программа будет прервана.");
            System.exit(0);
            return parseToIntNumber;
        }
    }

    public static int calculateLastNumber() {
        int outputNumber = 0;
        outputNumber = parseValue() % 10;
        outputNumber = Math.abs(outputNumber);
        return outputNumber;
    }

    public static void outputOnScreen() {
        System.out.println("Последняя цифра в введенном числе: " + calculateLastNumber());
    }
}

