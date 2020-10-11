package com.miguel.config;

import com.miguel.pojo.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

@SpringBootApplication
@ComponentScan(basePackages = "com.miguel.*", excludeFilters = {@Filter(classes = Service.class)})
public class AppConfig {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        System.out.println(user.getUserName());
    }

}
