package homeWork2.task2;

import java.util.Scanner;

public class Task2 {
    private static String inputNumber = null;
    private static int outputNumber;
    private static int parseNumber;
    static int[] arrNum = new int[3];

    public static void inputValueFromScreen(){
        System.out.println("Введите положитльное целое трехзначное число");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static boolean сhekValue(){
        try {
            parseNumber = Integer.parseInt(inputNumber);
            if (inputNumber.length() > 3 || parseNumber < 0){
                return false;
            }
            for (int i = 0; i < inputNumber.length(); i++){
                arrNum[i] = Integer.parseInt(String.valueOf(inputNumber.charAt(i)));
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void calculateSum(){
        if(сhekValue()){
            outputNumber = 0;
            for (int i = 0; i < arrNum.length; i++){
                outputNumber = outputNumber + arrNum[i];
            }
        }
        else{
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
        }
    }

    public static void outputOnScreen(){
        System.out.println("Сумма цифр в введенном числе: " + outputNumber);

    }
}
