package designPattern.proxy.example4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-07
 */
public class CurdServiceInvocationHandler implements InvocationHandler {

    // 被代理的接口
    private CurdService curdService;

    // 只需要一个接口，而不需要具体的实现类
    public void setCurdService(CurdService curdService) {
        this.curdService = curdService;
    }

//    public Object getProxy() {
//        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
//                curdService.getClass().getInterfaces(), this);
//    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("log 日志信息.....");
        return method.invoke(curdService, args);
    }
}
