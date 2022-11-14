package designPattern.builder.else_example;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public abstract class Builder {
    //设置主机
    abstract void buildBoard(String board);

    //设置显示器
    abstract void buildDisplay(String display);

    //设置系统
    abstract void buildOs();

    //创建computer
    abstract Computer build();
}
