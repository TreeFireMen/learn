package designPattern.builder.other;

/**
 * 构建 CITY_CAR, SPORTS_CAR, SUV 类型的车
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public class Director {


    /**
     * 主管控制着构建的顺序，主管不知道最终产品的类型
     * 最终结果将从生成器对象中获得，只有生成器自己知道
     */

    public void constructSportsCar(Builder builder) {
        builder.setCarType(Builder.CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine("八缸引擎");
        builder.setGps("GPS");
        builder.setTripComputer("apple");
    }


    public void constructCityCar(Builder builder) {
        builder.setCarType(Builder.CarType.CITY_CAR);
        builder.setSeats(4);
        builder.setEngine("4缸引擎");
        builder.setGps("GPS-plus");
        builder.setTripComputer("apple-M1");
    }

    public void constructSuv(Builder builder) {
        builder.setCarType(Builder.CarType.SUV);
        builder.setSeats(6);
        builder.setEngine("12缸引擎");
        builder.setGps("GPS-plus");
        builder.setTripComputer("apple-M2");
    }


}
