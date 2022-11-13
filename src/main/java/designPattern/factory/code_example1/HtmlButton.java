package designPattern.factory.code_example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
