package designPattern.decorators.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("a square");
    }
}
