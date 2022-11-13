package designPattern.builder.other;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);
        System.out.println(builder.getResult());

        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructCityCar(manualBuilder);
        System.out.println(manualBuilder.getResult());
    }
}
