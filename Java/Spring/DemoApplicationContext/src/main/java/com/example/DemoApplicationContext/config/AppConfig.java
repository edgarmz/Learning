package com.example.DemoApplicationContext.config;

import com.example.DemoApplicationContext.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {

    @Bean
    public Student student(){
        return  new Student("Edgar",32);

    }
}
