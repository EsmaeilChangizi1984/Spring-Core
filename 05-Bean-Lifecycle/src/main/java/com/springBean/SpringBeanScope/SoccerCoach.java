package com.springBean.SpringBeanScope;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class SoccerCoach implements Coach {

    // define init method
    @PostConstruct
    public void postContructMethod() {
        System.out.println("In post construction method : " + getClass().getSimpleName());
    }

    // define destroy method
    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("In pre destroy Method : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkOut() {
        return "Soccer is a unique World.";
    }

}
