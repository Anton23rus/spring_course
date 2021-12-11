package com.bbraun.spring.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.bbraun.spring.spring_introduction")
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
