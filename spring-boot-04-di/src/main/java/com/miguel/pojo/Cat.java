package com.miguel.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary标注的bean具有优先注入权，
// 意思是当有多个bean都满足注入要求时，优先注入这个bean，
// 但是，当其他bean也有标注@Primary时，同样存在歧义
@Primary
@Component
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("猫【" + Cat.class.getSimpleName() + "】是抓老鼠的。");
    }
}
