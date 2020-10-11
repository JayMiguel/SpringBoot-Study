package com.miguel.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BusinessPerson implements Person {

    // 因为有不止一个Animal类型的bean，容器会无法确定要注入哪个.
    // @Autowired
    // private Animal animal = null;

    // 容器会先根据类型判断，再根据属性名判断，最终确认注入的bean
    // 但是修改变量名是比较憋屈的做法
    // @Autowired
    // private Animal dog = null;

    // @Autowired与@Qualifier相结合，让容器根据类型和名称来寻找bean，就能消除歧义性了。
    @Autowired
    @Qualifier("dog")
    private Animal animal = null;

    @Override
    public void service() {
        this.animal.use();
        // this.dog.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
        // this.dog = animal;
    }
}
