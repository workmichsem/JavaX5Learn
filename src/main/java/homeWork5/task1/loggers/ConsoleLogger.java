package homeWork5.task1.loggers;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Log into console - " + message);
    }
}
