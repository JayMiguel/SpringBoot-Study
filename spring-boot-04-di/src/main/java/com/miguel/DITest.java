package com.miguel;

import com.miguel.config.AppConfig;
import com.miguel.pojo.BusinessPerson;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DITest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BusinessPerson person = context.getBean(BusinessPerson.class);
        person.service();
    }
}
