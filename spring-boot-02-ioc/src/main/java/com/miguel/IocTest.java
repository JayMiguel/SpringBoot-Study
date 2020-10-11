package com.miguel;

import com.miguel.config.AppConfig;
import com.miguel.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
