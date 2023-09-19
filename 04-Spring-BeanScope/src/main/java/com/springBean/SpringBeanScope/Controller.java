package com.springBean.SpringBeanScope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Coach myCoach;
    private Coach anotherCoach;

    @Autowired
    public Controller(@Qualifier("soccerCoach") Coach theCoach,
            @Qualifier("soccerCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/dailyWorkOut")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkOut();
    }

    @GetMapping("/check")
    public String checkBeanScope() {
        return "Are the coach and another coach refering to same bean  ? :" + (anotherCoach == myCoach);
    }

}
