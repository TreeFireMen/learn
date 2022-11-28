package designPattern.strategy.example1;

/**
 * 通用的支付方法接口
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-28
 */
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
