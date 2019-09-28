package com.example.demo.configuration;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.sql.SQLOutput;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DbConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String devDatabaseConnection() {
        System.out.println("DEV!!!!---Started Db connection ---- H2");
        System.out.println(driverClassName);
        return "Db connection ---- H2";
    }

    @Profile("prod")
    @Bean
    public String prodDatabaseConnection() {
        System.out.println("PROD(!!!!)----Started Oracle connection ----");
        System.out.println(driverClassName);
        return "Oracle connection ---- H2";
    }
}
