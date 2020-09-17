package homeWork2.task1;

import java.util.Scanner;

public class Task1 {
    private static String inputNumber = null;
    private static int outputNumber;


    public static void inputValueFromScreen(){
        System.out.println("Введите целое число в диапазоне от -2147483648 до 2147483647");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static boolean typeChek(){
        try {
            Integer.parseInt(inputNumber);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void calculateLastNumber(){
        if(typeChek()){
            outputNumber = Integer.parseInt(inputNumber)%10;
            outputNumber = Math.abs(outputNumber);
        }
        else{
            System.out.println("Введенное значение не является числом или значение вне диапазона. Программа будет прервана.");
            System.exit(0);
        }
    }

    public static void outputOnScreen(){
        System.out.println("Последняя цифра в введенном числе: " + outputNumber);

    }
}

