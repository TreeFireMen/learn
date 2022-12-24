package com.example.demo;

import com.example.demo.test.UserService.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext application = SpringApplication.run(DemoApplication.class, args);
        UserService bean = application.getBean(UserService.class);
//        bean.method1();
        bean.method2();
        bean.method1();
    }

}
