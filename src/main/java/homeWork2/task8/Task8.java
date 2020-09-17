package homeWork2.task8;

import java.util.Arrays;

public class Task8 {
    private static int[] arr = new int[] {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};

    public static void maxValue(){
        Arrays.sort(arr);
        System.out.println("Максимальное значение массива: " + arr[arr.length - 1]);
    }

    public static void sumPositiveElements(){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                answer = answer + arr[i];
            }
        }
        System.out.println("Сумма положительных элементов массива: " + answer);
    }

    public static void sumEvenNegativeElements(){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0 && arr[i]%2 == 0){
                answer = answer + arr[i];
            }
        }
        System.out.println("Сумма четных отрицательных элементов массива: " + answer);
    }

    public static void countPositiveElements(){
        int answer = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 0){
                answer++;
            }
        }
        System.out.println("Количество положительных элементов массива: " + answer);
    }

    public static void maxAverageNegativeElements(){
        int answer = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0){
                answer = answer + arr[i];
                count++;
            }
        }
        answer = answer / count;
        System.out.println("Среднее арифметическое отрицательных элементов массива: " + answer);
    }
}