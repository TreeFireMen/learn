package designPattern.builder.other;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public class Manual {
    private Builder.CarType carType;
    private Integer seatNum;
    private String engine;
    private String computerName;
    private String gps;

    public Manual(Builder.CarType carType, Integer seatNum, String engine, String computerName, String gps) {
        this.carType = carType;
        this.seatNum = seatNum;
        this.engine = engine;
        this.computerName = computerName;
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "this is a car Manual" +
                "car Type is " + carType.toString() +
                ", car has seat Num is " + seatNum +
                ", car use engine is '" + engine + '\'' +
                ", car use computerName is'" + computerName + '\'' +
                ", car use gps is '" + gps + '\'' +
                '.';
    }
}
