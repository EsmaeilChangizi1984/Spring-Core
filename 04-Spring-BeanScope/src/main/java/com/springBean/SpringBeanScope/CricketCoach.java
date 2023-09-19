package com.springBean.SpringBeanScope;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Runinh is the mother of all Sports.";

    }

}
