package com.miguel;

import com.miguel.config.AppConfig;
import com.miguel.pojo.BusinessPerson;
import com.miguel.pojo.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class LifeCycleTest {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LifeCycleTest.class, args);
        Person person = context.getBean(BusinessPerson.class);
        person.service();
    }

}
