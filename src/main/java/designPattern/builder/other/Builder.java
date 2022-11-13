package designPattern.builder.other;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public interface Builder {


  void setCarType(CarType carType);

  void setSeats(Integer num);

  void setEngine(String name);

  void setTripComputer(String name);

  void setGps(String name);

  enum CarType {
    CITY_CAR("城市汽车"), SPORTS_CAR("运动型汽车"), SUV("越野型汽车");

    private String carName;

    CarType(String carName) {
      this.carName = carName;
    }
    public String getCarName() {
      return carName;
    }
  }
}
