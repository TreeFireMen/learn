package designPattern.builder.else_example;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class MacBook extends Computer {

    protected MacBook() {
    }

    @Override
    public void setOs() {
        os = "M12";
    }
}
