package com.springBean.SpringBeanScope;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Tennis is a fun sport!";
    }

}
