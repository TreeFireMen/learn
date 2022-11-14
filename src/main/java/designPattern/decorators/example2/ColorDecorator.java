package designPattern.decorators.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class ColorDecorator extends ShapeDecorator {


    public ColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        System.out.println("red--");
        super.draw();
    }
}
