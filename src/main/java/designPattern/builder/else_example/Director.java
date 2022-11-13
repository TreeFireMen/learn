package designPattern.builder.else_example;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer buildComputer(String display, String board) {
        builder.buildBoard(board);
        builder.buildDisplay(display);
        builder.buildOs();
        return builder.build();
    }
}
