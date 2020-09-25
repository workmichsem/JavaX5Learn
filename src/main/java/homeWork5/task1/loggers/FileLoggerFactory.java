package homeWork5.task1.loggers;

public class FileLoggerFactory extends LogFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
