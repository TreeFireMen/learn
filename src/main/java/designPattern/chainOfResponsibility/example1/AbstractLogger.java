package designPattern.chainOfResponsibility.example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public abstract class AbstractLogger {

    public static Integer INFO = 1;
    public static Integer DEBUG = 2;
    public static Integer ERROR = 3;

    protected int level;

    // 责任链中的下一个元素
    private AbstractLogger nextLogger;


    public AbstractLogger(int level) {
        this.level = level;
    }

    void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    abstract void write(String message);
}
