package com.miguel.config;

import com.miguel.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="user")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setName("Miguel");
        user.setNote("note_1");
        return user;
    }

}
