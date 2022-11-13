package designPattern.builder;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-11
 */
public class BuildToothBrush implements Builder {

    Product product = new Product();

    private static final Logger logger = LoggerFactory.getLogger(BuildToothBrush.class);

    @Override
    public void reset() {
        product.reset();
    }

    @Override
    public void buildStepA() {
        logger.debug("步骤一:取一个名字");
        product.setName("牙刷");
    }

    @Override
    public void buildStepB() {
        logger.debug("步骤二：为牙刷取定价格");
        product.setPrice(11.0);
    }

    @Override
    public void buildStepC() {
        logger.debug("步骤三：牙刷是立白集团的");
        product.setOwner("立白集团");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
