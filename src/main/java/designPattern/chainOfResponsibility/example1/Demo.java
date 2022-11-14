package designPattern.chainOfResponsibility.example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class Demo {
    public static void main(String[] args) {
        AbstractLogger chainOfLoggers = getChainOfLoggers();
        chainOfLoggers.logMessage(AbstractLogger.INFO, "this is an info");
//        chainOfLoggers.logMessage(AbstractLogger.DEBUG, "this is a debug level info");
//        chainOfLoggers.logMessage(AbstractLogger.ERROR, "this is a error info");
    }

    private static AbstractLogger getChainOfLoggers() {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
