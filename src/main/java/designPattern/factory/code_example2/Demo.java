package designPattern.factory.code_example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class Demo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

    }
}
