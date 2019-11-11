package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DbConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Profile("dev")
    @Bean
    public String devDatabaseConnection() {
        System.out.println("DEV!!!!---Started Db connection ---- H2");
        System.out.println(driverClassName);
        System.out.println(url);
        System.out.println(username);
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
