package designPattern.decorators.example1;

/**
 * 抽象基础修饰
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class DataSourceDecorator implements DataSource {

    private final DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
