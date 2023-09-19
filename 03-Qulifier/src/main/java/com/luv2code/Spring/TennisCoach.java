package com.luv2code.Spring;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkOut() {
        return "Tennis is a fun sport!";
    }

}
