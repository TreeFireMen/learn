package designPattern.strategy.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-28
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int i, int i2) {
        return strategy.doOperation(i, i2);
    }
}
