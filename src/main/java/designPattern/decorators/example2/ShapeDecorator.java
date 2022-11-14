package designPattern.decorators.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class ShapeDecorator implements Shape {

    private final Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
