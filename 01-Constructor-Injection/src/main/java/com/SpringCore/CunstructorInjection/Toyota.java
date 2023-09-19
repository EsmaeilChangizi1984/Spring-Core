package com.SpringCore.CunstructorInjection;

import org.springframework.stereotype.Component;

@Component
public class Toyota implements Car {
    @Override
    public String getSpeed() {
        return "Toyota Speed is 200 K/M! ";
    }

}
