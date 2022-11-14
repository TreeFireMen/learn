package designPattern.chainOfResponsibility.example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class ErrorLogger extends AbstractLogger{


  public ErrorLogger(int level) {
    super(level);
  }


  @Override
  void write(String message) {
    System.out.println("error :: " + message);
  }
}
