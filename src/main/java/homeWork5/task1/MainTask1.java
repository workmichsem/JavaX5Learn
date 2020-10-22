package homeWork5.task1;

import homeWork5.task1.loggers.*;

public class MainTask1 {
    public static void main(String[] args) {
        LogFactory logFactory;
        switch (LoggerType.valueOf("CONSOLE")) {
            case FILE:
                logFactory = new FileLoggerFactory();
                break;
            case CONSOLE:
                logFactory = new ConsoleLoggerFactory();
                break;
            case DB:
                logFactory = new DbLoggerFactory();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + LoggerType.valueOf("CONSOLE"));
        }
        Logger logger = logFactory.createLogger();

        Calculator calculator = new Calculator(logger);
        calculator.multiplication(1.1, 1.2);
        calculator.addition(2.4, 5.6);
        calculator.division(4.6, 7.2);
        calculator.subtraction(4.2, 5.1);
    }
}