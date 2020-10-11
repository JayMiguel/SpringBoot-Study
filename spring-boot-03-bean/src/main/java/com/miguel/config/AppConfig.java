package com.miguel.config;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;

@SpringBootApplication
@ComponentScan(basePackages = "com.miguel.*", excludeFilters = {@Filter(classes = Service.class)})
public class AppConfig {

    public static void main(String[] args) throws Exception{
        ApplicationContext context = SpringApplication.run(AppConfig.class, args);
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        System.out.println(dataSource);
    }

    @Bean("dataSource")
    public DataSource getDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/springboot");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
