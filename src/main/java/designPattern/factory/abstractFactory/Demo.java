package designPattern.factory.abstractFactory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class Demo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducer.getFactory("colorFactory");
        Color red = colorFactory.getColor("red");
        red.fill();
    }
}
