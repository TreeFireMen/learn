package designPattern.factory.abstractFactory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public interface AbstractFactory {

    default Color getColor(String color) {
        System.out.println("is not my duty");
        return null;
    }

    default Shape getShape(String shape) {
        System.out.println("is not my duty");
        return null;
    }
}
