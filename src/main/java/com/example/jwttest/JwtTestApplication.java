package com.example.jwttest;

import com.example.jwttest.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtTestApplication.class, args);
    }

}
