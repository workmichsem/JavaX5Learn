package homeWork5.task1;

import homeWork5.task1.loggers.*;

public class Calculator {
    Logger logger;

    public double multiplication(double a, double b) {
        double output = 0.0;
        logger.log("Начата операция умножения");
        output = a * b;
        logger.log("Операция умножения завершена. Результат:" + output);
        return output;
    }

    public double division(double a, double b) {
        double output = 0.0;
        logger.log("Начата операция деления");
        output = a / b;
        logger.log("Операция деления завершена. Результат:" + output);
        return output;
    }

    public double addition(double a, double b) {
        double output = 0.0;
        logger.log("Начата операция сложения");
        output = a + b;
        logger.log("Операция сложения завершена. Результат:" + output);
        return output;
    }

    public double subtraction(double a, double b) {
        double output = 0.0;
        logger.log("Начата операция вычитания");
        output = a - b;
        logger.log("Операция вычитания завершена. Результат:" + output);
        return output;
    }

    public Calculator(Logger logger) {
        this.logger = logger;
    }

    public Calculator() {

    }
}