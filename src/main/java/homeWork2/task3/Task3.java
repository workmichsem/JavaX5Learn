package homeWork2.task3;

import java.util.Scanner;

public class Task3 {
    private static String inputNumber = null;
    private static int outputNumber;
    private static int parseNumber;

    public static void inputValueFromScreen(){
        System.out.println("Введите целое число в диапазоне от -2147483648 до 2147483646");
        Scanner scanner = new Scanner(System.in);
        inputNumber = scanner.nextLine();
    }

    public static boolean сhekValue(){
        try {
            parseNumber = Integer.parseInt(inputNumber);
            if (parseNumber > 2147483646){
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
                System.out.println("Введенное значение больше 0, будет прибавлена еденица");
                outputNumber = parseNumber + 1;
            } else if (parseNumber < 0){
                System.out.println("Введенное значение меньше нуля. Программа будет прервана");
                System.exit(0);
            } else if (parseNumber == 0){
                System.out.println("Введенное значение равно нулю. Программа будет прервана");
                System.exit(0);
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
