package designPattern.strategy.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-28
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
