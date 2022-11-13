package designPattern.factory.abstractFactory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class ColorFactory implements AbstractFactory{

    public Color getColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();
        }
        return null;
    }
}
