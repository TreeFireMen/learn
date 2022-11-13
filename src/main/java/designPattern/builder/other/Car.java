package designPattern.builder.other;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public class Car {
    private Builder.CarType carType;
    private Integer seatNum;
    private String engine;
    private String computerName;
    private String gps;

    public Car(Builder.CarType carType, Integer seatNum, String engine, String computerName, String gps) {
        this.carType = carType;
        this.seatNum = seatNum;
        this.engine = engine;
        this.computerName = computerName;
        this.gps = gps;
    }

    public Builder.CarType getCarType() {
        return carType;
    }

    public void setCarType(Builder.CarType carType) {
        this.carType = carType;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType.getCarName() +
                ", seatNum=" + seatNum +
                ", engine='" + engine + '\'' +
                ", computerName='" + computerName + '\'' +
                ", gps='" + gps + '\'' +
                '}';
    }
}
