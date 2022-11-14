package designPattern.builder.other;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public class ManualBuilder implements Builder {

    private CarType carType;
    private Integer seatNum;
    private String engine;
    private String computerName;
    private String gps;

    // 方法是为属性服务的


    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(Integer num) {
        this.seatNum = num;
    }

    @Override
    public void setEngine(String name) {
        this.engine = name;
    }

    @Override
    public void setTripComputer(String name) {
        this.computerName = name;
    }

    @Override
    public void setGps(String name) {
        this.gps = name;
    }

    public Manual getResult() {
        return new Manual(carType, seatNum, engine, computerName, gps);
    }
}
