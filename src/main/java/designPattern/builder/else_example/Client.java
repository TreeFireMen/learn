package designPattern.builder.else_example;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class Client {
    public static void main(String[] args) {
        MacBookBuilder macBookBuilder = new MacBookBuilder();
        Director director = new Director(macBookBuilder);
        Computer computer = director.buildComputer("显示器", "主板");
        System.out.println(computer);
    }
}
