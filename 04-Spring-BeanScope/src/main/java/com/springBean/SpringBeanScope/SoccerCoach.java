package com.springBean.SpringBeanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SoccerCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Soccer is a unique World.";
    }

}
