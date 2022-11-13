package designPattern.builder;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-11
 */
public class Director {

    public Product makeToothBrush() {
        BuildToothBrush builder = new BuildToothBrush();
        builder.buildStepA();
        builder.buildStepB();
        builder.buildStepC();
        return builder.getResult();
    }

    public Product makeAirPlane() {
        BuildAirplane builder = new BuildAirplane();
        builder.buildStepA();
        builder.buildStepB();
        builder.buildStepC();
        return builder.getResult();
    }

}
