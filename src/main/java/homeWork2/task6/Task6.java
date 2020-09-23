package homeWork2.task6;

import java.util.Scanner;

public class Task6 {

    public static int inputValueFromScreen() {
        int inputNumber = 0;
        System.out.println("Введите целое число в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        try {
            inputNumber = scanner.nextInt();
            return inputNumber;
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
            return inputNumber;
        }
    }

    public static int сhekValue() {
        int parseNumber = inputValueFromScreen();
        try {
            if (parseNumber > Integer.MAX_VALUE || parseNumber < Integer.MIN_VALUE) {
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

    public static void numberProcessing() {
        if (сhekValue() > 0) {
            System.out.println("число положительное");
        } else if (сhekValue() < 0) {
            System.out.println("число отрицательное");
        } else if (сhekValue() == 0) {
            System.out.println("Введенное значение равно нулю.");
        } else if (сhekValue() % 2 == 0) {
            System.out.println("Введенное значение четное");
        } else {
            System.out.println("Введенное значение не четное");
        }
    }
}