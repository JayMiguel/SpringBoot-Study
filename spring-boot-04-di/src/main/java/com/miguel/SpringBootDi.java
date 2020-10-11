package com.miguel;

import com.miguel.pojo.BusinessPerson;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDi {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDi.class, args);
        BusinessPerson person = context.getBean(BusinessPerson.class);
        person.service();
    }
}
