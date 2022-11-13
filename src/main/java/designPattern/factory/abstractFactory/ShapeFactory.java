package designPattern.factory.abstractFactory;


/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class ShapeFactory implements AbstractFactory {
    public Shape getShape(String name) {
        if (name.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (name.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

}
