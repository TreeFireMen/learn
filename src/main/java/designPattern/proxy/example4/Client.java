package designPattern.proxy.example4;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-07
 */
public class Client {
    public static void main(String[] args) {
        CurdServiceInvocationHandler handler = new CurdServiceInvocationHandler();
        // 设置一个真实的代理角色
        CurdServiceImpl curdService = new CurdServiceImpl();
        handler.setCurdService(curdService);
        // 动态 生成代理类
        CurdService proxy = (CurdService) Proxy.newProxyInstance(CurdServiceInvocationHandler.class.getClassLoader(),
                curdService.getClass().getInterfaces(), handler);
        proxy.add();
    }
}
