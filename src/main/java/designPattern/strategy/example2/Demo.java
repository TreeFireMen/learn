package designPattern.strategy.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-28
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        int result = context.getResult(1, 23);
        System.out.println(result);
    }
}
