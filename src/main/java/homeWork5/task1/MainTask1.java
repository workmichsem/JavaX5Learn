package homeWork5.task1;

import homeWork5.task1.loggers.*;

public class MainTask1 {
    public static void main(String[] args) {
        LogFactory[] logFactories = {new ConsoleLoggerFactory(), new DbLoggerFactory(), new FileLoggerFactory()};
        Logger[] loggers = {logFactories[0].createLogger(), logFactories[1].createLogger(), logFactories[2].createLogger()};

        Calculator.multiplication(1.1, 1.2, loggers);
        Calculator.addition(2.4, 5.6, loggers);
        Calculator.division(4.6, 7.2, loggers);
        Calculator.subtraction(4.2, 5.1, loggers);
    }
}
