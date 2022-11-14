package designPattern.decorators.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle();
        ColorDecorator colorDecorator = new ColorDecorator(circle);
        colorDecorator.draw();
    }
}
