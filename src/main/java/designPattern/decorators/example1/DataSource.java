package designPattern.decorators.example1;

/**
 * 定义了读取和写入的功能
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
