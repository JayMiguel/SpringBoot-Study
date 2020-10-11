package com.miguel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 配置了lazyInit=true后，bean只有在第一次被调用时初始化，而不是预先初始化在容器中。
@ComponentScan(basePackages = "com.miguel.*", lazyInit = true)
@Configuration
public class AppConfig {


}
