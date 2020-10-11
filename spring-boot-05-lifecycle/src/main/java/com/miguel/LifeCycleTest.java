package com.miguel;

import com.miguel.config.AppConfig;
import com.miguel.pojo.BusinessPerson;
import com.miguel.pojo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean(BusinessPerson.class);
        person.service();
    }
}
