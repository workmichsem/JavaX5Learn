package homeWork5.task1;

import homeWork5.task1.loggers.*;

public class Calculator {

    public static Logger[] startsLoggers() {
        LogFactory[] logFactories = {new ConsoleLoggerFactory(), new DbLoggerFactory(), new FileLoggerFactory()};
        Logger[] loggers = {logFactories[0].createLogger(), logFactories[1].createLogger(), logFactories[2].createLogger()};
        return loggers;
    }

    public static double multiplication(double a, double b) {
        double output = 0.0;
        Logger[] loggers = startsLoggers();
        loggers[0].log("Начата операция умножения");
        loggers[1].log("Начата операция умножения");
        loggers[2].log("Начата операция умножения");
        output = a * b;
        loggers[0].log("Операция умножения завершена. Результат:" + output);
        loggers[1].log("Операция умножения завершена. Результат:" + output);
        loggers[2].log("Операция умножения завершена. Результат:" + output);
        return output;
    }

    public static double division(double a, double b) {
        double output = 0.0;
        Logger[] loggers = startsLoggers();
        loggers[0].log("Начата операция деления");
        loggers[1].log("Начата операция деления");
        loggers[2].log("Начата операция деления");
        output = a / b;
        loggers[0].log("Операция деления завершена. Результат:" + output);
        loggers[1].log("Операция деления завершена. Результат:" + output);
        loggers[2].log("Операция деления завершена. Результат:" + output);
        return output;
    }

    public static double addition(double a, double b) {
        double output = 0.0;
        Logger[] loggers = startsLoggers();
        loggers[0].log("Начата операция сложения");
        loggers[1].log("Начата операция сложения");
        loggers[2].log("Начата операция сложения");
        output = a + b;
        loggers[0].log("Операция сложения завершена. Результат:" + output);
        loggers[1].log("Операция сложения завершена. Результат:" + output);
        loggers[2].log("Операция сложения завершена. Результат:" + output);
        return output;
    }

    public static double subtraction(double a, double b) {
        double output = 0.0;
        Logger[] loggers = startsLoggers();
        loggers[0].log("Начата операция вычитания");
        loggers[1].log("Начата операция вычитания");
        loggers[2].log("Начата операция вычитания");
        output = a - b;
        loggers[0].log("Операция вычитания завершена. Результат:" + output);
        loggers[1].log("Операция вычитания завершена. Результат:" + output);
        loggers[2].log("Операция вычитания завершена. Результат:" + output);
        return output;
    }
}