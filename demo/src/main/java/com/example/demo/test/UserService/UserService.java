package com.example.demo.test.UserService;

import org.springframework.aop.framework.AopContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-23
 */
@Component
public class UserService {
    @Async
    public void method1(){
        System.out.println("method1 " + Thread.currentThread().getName());
    }

    public void method2(){
        System.out.println(this.getClass().getName());
        this.method1();
        System.out.println("method2 " + Thread.currentThread().getName());
    }

}
