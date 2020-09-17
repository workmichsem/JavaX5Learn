package homeWork2.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    private static String[] inputNumber = new String[3];
    private static int outputNumber;
    private static int[] parseNumber = new int[3];

    public static void inputValueFromScreen(){
        System.out.println("Введите три целых числа в диапазоне от -2147483648 до 2147483646");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            inputNumber[i] = scanner.nextLine();
        }
    }

    public static boolean сhekValue(){
        try {
            for (int i = 0; i < inputNumber.length; i++){
                parseNumber[i] = Integer.parseInt(inputNumber[i]);
                if (parseNumber[i] > 2147483647 || parseNumber[i] < -2147483648){
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void numberProcessing(){
        if(сhekValue()){
            Arrays.sort(parseNumber);
        }
        else{
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
        }
    }

    public static void outputOnScreen(){
        System.out.println("Наименьшее число: " + parseNumber[0]);
    }
}
