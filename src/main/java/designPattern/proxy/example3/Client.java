package designPattern.proxy.example3;

/**
 * 静态代理
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-07
 */
public class Client {
    public static void main(String[] args) {
        CurdProxy curdProxy = new CurdProxy();
        CurdServiceImpl curdService = new CurdServiceImpl();
        curdProxy.setCurdServiceImpl(curdService);
        curdProxy.add();
    }
}
