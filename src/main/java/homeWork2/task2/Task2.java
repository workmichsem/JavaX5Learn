package homeWork2.task2;

import java.util.Scanner;

public class Task2 {

    public static int inputValueFromScreen() {
        int inputNumber = 0;
        System.out.println("Введите положитльное целое трехзначное число");
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

    public static int calculateSum() {
        int a = inputValueFromScreen();
        int b = a;
        int outputNumber = 0;
        int i = 0;
        if (a < 0) {
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
        }
        while (b != 0) {
            outputNumber += b % 10;
            b /= 10;
            i++;
        }
        if (i == 3) {
            return outputNumber;
        } else {
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
            return outputNumber;
        }
    }

    public static void outputOnScreen() {
        System.out.println("Сумма цифр в введенном числе: " + calculateSum());
}
}