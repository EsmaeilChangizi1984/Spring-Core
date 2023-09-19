package com.springBean.SpringBeanScope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class sportConfig {
    @Bean
    public Coach swiCoach() {
        return new SwimCoach();
    }
}
