package designPattern.builder;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public class Client {
  public static void main(String[] args) {
    Director director = new Director();
    Product product = director.makeAirPlane();
    System.out.println(product);
  }
}
