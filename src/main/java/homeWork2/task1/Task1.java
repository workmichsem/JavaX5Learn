package homeWork2.task1;

import java.util.Scanner;

public class Task1 {

    public static int inputValueFromScreen() {
        int inputNumber = 0;
        System.out.println("Введите целое число в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        try {
            inputNumber = scanner.nextInt();
            return inputNumber;
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не является числом или значение вне диапазона. Программа будет прервана.");
            System.exit(0);
            return inputNumber;
        }
    }

    public static int calculateLastNumber() {
        int outputNumber = 0;
        outputNumber = inputValueFromScreen() % 10;
        outputNumber = Math.abs(outputNumber);
        return outputNumber;
    }

    public static void outputOnScreenLastNumber() {
        System.out.println("Последняя цифра в введенном числе: " + calculateLastNumber());
    }
}

