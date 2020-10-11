package com.miguel.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {

    // 因为有不止一个Animal类型的bean，容器会无法确定要注入哪个.
    // @Autowired
    // private Animal animal = null;

    // 容器会先根据类型判断，再根据属性名判断，最终确认注入的bean
    @Autowired
    private Animal dog = null;

    @Override
    public void service() {
        // this.animal.use();
        this.dog.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        // this.animal = animal;
        this.dog = animal;
    }
}
