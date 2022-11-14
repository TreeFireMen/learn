package designPattern.builder;

/**
 * 通用的产品构造
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-11
 */
public interface Builder {

    void reset();

    void buildStepA();

    void buildStepB();

    void buildStepC();

    Product getResult();
}
