package homeWork5.task1.loggers;

public class ConsoleLoggerFactory extends LogFactory {
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
