package com.luv2code.Spring;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Soccer is a unique World.";
    }

}
