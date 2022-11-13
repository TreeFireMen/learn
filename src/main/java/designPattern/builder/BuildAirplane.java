package designPattern.builder;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-11
 */
public class BuildAirplane implements Builder {

    Product product = new Product();


    @Override
    public void reset() {
        product.reset();
    }

    @Override
    public void buildStepA() {
        System.out.println(("步骤一:准备造飞机"));
        product.setName("飞机");
    }

    @Override
    public void buildStepB() {
        System.out.println(("步骤二：买飞机需要的钱"));
        product.setPrice(115555522.0);
    }

    @Override
    public void buildStepC() {
        System.out.println(("步骤三：飞机是哪个公司的"));
        product.setOwner("南方航空");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
