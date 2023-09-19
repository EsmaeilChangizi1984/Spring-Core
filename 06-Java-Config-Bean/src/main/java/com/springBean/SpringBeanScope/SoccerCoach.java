package com.springBean.SpringBeanScope;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Soccer is a unique World.";
    }

}
