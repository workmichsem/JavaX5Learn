package homeWork2.task6;

import java.util.Scanner;

public class Task6 {
    private static String inputNumber = null;
    private static int parseNumber;

    public static void inputValueFromScreen(){
        System.out.println("Введите целое число в диапазоне от -2147483646 до 2147483646");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static boolean сhekValue(){
        try {
            parseNumber = Integer.parseInt(inputNumber);
            if (parseNumber > 2147483646 || parseNumber < -2147483646){
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void numberProcessing(){
        if(сhekValue()){
            if (parseNumber > 0){
                System.out.println("число положительное");
            } else if (parseNumber < 0){
                System.out.println("число отрицательное");
            } else if (parseNumber == 0){
                System.out.println("Введенное значение равно нулю.");
            }
        }
        else{
            System.out.println("Введенное значение не соответствует условиям. Программа будет прервана.");
            System.exit(0);
        }
    }
}
