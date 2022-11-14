package designPattern.factory.abstractFactory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red");
    }
}
