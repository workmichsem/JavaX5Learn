package homeWork5.task2;

import java.util.Scanner;

public class MainTask2 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.outputComputerInfo();

        OutputStrategy outputStrategy = null;
        System.out.println("Выберите тип вывода");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        switch (OutputType.valueOf(line)){
            case ALL:
                outputStrategy = new OutputAll();
                break;
            case MEMORY:
                outputStrategy = new OutputMemory();
                break;
            case PROCESSORS:
                outputStrategy = new OutputProcessors();
                break;
        }
        outputStrategy.output();
    }
}