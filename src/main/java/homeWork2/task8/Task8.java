package homeWork2.task8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task8 {
    public static void maxValue(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Максимальное значение массива: " + arr[arr.length - 1]);
    }

    public static void sumPositiveElements(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                answer = answer + arr[i];
            }
        }
        System.out.println("Сумма положительных элементов массива: " + answer);
    }

    public static void sumEvenNegativeElements(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0 && arr[i] % 2 == 0) {
                answer = answer + arr[i];
            }
        }
        System.out.println("Сумма четных отрицательных элементов массива: " + answer);
    }

    public static void countPositiveElements(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                answer++;
            }
        }
        System.out.println("Количество положительных элементов массива: " + answer);
    }

    public static void maxAverageNegativeElements(int[] arr) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                answer = answer + arr[i];
                count++;
            }
        }
        answer = answer / count;
        System.out.println("Среднее арифметическое отрицательных элементов массива: " + answer);
    }

    public static void arithmeticMeanInteger(int[] arr) {
        double answer = 0;
        if (arr.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            answer = sum / arr.length;
        }
        System.out.println("Среднее арифметическое элементов массива: " + answer);
    }
}
