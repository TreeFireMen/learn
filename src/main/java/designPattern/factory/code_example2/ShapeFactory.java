package designPattern.factory.code_example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class ShapeFactory {

    Shape getShape(String name) {
        if (name.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (name.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }

}
