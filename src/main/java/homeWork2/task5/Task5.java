package homeWork2.task5;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    private static String[] inputNumber = new String[3];

    public static void inputValueFromScreen() {
        System.out.println("Введите целое число в диапазоне от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            inputNumber[i] = scanner.nextLine();
        }
    }

    public static int[] сhekValue() {
        int[] parseNumber = new int[3];
        try {
            for (int i = 0; i < inputNumber.length; i++) {
                parseNumber[i] = Integer.parseInt(inputNumber[i]);
                if (parseNumber[i] > Integer.MAX_VALUE || parseNumber[i] < Integer.MIN_VALUE) {
                    System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
                    System.exit(0);
                }
            }
            return parseNumber;
        } catch (NumberFormatException e) {
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
            return parseNumber;
        }
    }

    public static int[] numberProcessing() {
        int[] arr = сhekValue();
        Arrays.sort(arr);
        return arr;
    }

    public static void outputOnScreen() {
        System.out.println("Наименьшее число: " + numberProcessing()[0]);
    }
}
