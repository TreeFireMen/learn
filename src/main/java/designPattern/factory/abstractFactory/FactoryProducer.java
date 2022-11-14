package designPattern.factory.abstractFactory;

/**
 * 静态方法属于类 而不属于对象
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class FactoryProducer {

    static AbstractFactory getFactory(String name) {
        if (name.equalsIgnoreCase("ShapeFactory")) {
            return new ShapeFactory();
        }
        if (name.equalsIgnoreCase("ColorFactory")) {
            return new ColorFactory();
        }
        return null;
    }
}
