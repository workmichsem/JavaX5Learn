package homeWork5.task1.loggers;

public class DbLoggerFactory extends LogFactory {
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
